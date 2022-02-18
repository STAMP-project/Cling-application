import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis(36324000035L, 100, (int) (short) 0, 3840000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) ' ', (int) (byte) -1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = islamicChronology17.millis();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology17.era();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology17.hourOfDay();
        boolean boolean22 = islamicChronology0.equals((java.lang.Object) islamicChronology17);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = islamicChronology0.get(readablePeriod23, (-476688868L));
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        java.lang.String str11 = islamicChronology0.toString();
        org.joda.time.DurationField durationField12 = islamicChronology0.seconds();
        org.joda.time.Chronology chronology13 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology13.getDateTimeMillis((int) (byte) 100, (int) (byte) 1, (int) (short) 100, 3840000, 0, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.set(readablePartial5, (-40936320000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) 'a', (int) (short) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology0.getZone();
        int int13 = dateTimeZone11.getOffset(35L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        int int6 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str11 = dateTimeZone7.getID();
        long long13 = dateTimeZone7.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999999L) + "'", long10 == (-35999999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000000L + "'", long13 == 36000000L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod12, (-4888702989L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePartial4, 101L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology3.weekOfWeekyear();
        java.lang.Class<?> wildcardClass14 = islamicChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str2 = islamicChronology1.toString();
        long long6 = islamicChronology1.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology1.halfdayOfDay();
        java.lang.String str8 = islamicChronology1.toString();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = islamicChronology1.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType9);
        org.joda.time.DurationField durationField11 = islamicChronology10.minutes();
        java.lang.Class<?> wildcardClass12 = islamicChronology10.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(islamicChronology1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IslamicChronology[UTC]" + "'", str2, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1819L + "'", long6 == 1819L);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(leapYearPatternType9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.Class<?> wildcardClass7 = dateTimeField6.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) (byte) 1, (int) ' ', (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray10 = new int[] { ' ', (byte) -1, 1, (byte) 1, (short) 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial4, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, -1, 1, 1, 100]");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, 14459968L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology6 = chronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray19 = new int[] { 4, 3840000, '#', 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-84478968L) + "'", long12 == (-84478968L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[4, 3840000, 35, 100, 0]");
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getName((long) (short) -1, locale7);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
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
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology13 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology13.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        long long19 = dateTimeZone16.getMillisKeepLocal(dateTimeZone17, (long) (byte) -1);
        org.joda.time.Chronology chronology20 = islamicChronology13.withZone(dateTimeZone17);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone17, (-80689900L));
        org.joda.time.ReadableInstant readableInstant23 = null;
        int int24 = dateTimeZone17.getOffset(readableInstant23);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField26 = islamicChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology25.hourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = islamicChronology25.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = islamicChronology25.millisOfDay();
        org.joda.time.DurationField durationField31 = islamicChronology25.seconds();
        boolean boolean32 = dateTimeZone17.equals((java.lang.Object) islamicChronology25);
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology25.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-80689900L) + "'", long22 == (-80689900L));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField13 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray18 = new int[] { ' ', (short) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial14, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 1, 0]");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = islamicChronology0.millis();
        org.joda.time.DurationField durationField12 = islamicChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = islamicChronology0.get(readablePeriod3, (-35999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, 5297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        long long11 = dateTimeZone7.convertLocalToUTC((-518388999L), false, (-41554321066532L));
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518388999L) + "'", long11 == (-518388999L));
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray14 = new int[] { (-1), (byte) -1, 3840000, ' ', (-1) };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 3840000, 32, -1]");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (-42228871L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getOffsetFromLocal((long) (short) 10);
        long long6 = dateTimeZone2.nextTransition(3L);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3L + "'", long6 == 3L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone3 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, 187200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (-3599990001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
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
        org.joda.time.DateTimeField dateTimeField16 = chronology15.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+01:04" + "'", str14, "+01:04");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePartial14, (-42228871L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-84478968L) + "'", long12 == (-84478968L));
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology3.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology3.getDateTimeMillis((int) (byte) 100, (int) (byte) 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod5, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
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
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, 115200032L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(durationField10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = islamicChronology3.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis(0L, (int) (short) 1, 36000000, 115200000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        long long11 = islamicChronology0.add(0L, 1010L, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (byte) 100, (int) ' ', (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10100L + "'", long11 == 10100L);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.secondOfDay();
        java.lang.Class<?> wildcardClass12 = dateTimeField11.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        int int7 = dateTimeZone1.getOffset(3600000001L);
        int int9 = dateTimeZone1.getStandardOffset(14459968L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone1.getShortName(0L, locale11);
        long long15 = dateTimeZone1.convertLocalToUTC((-3491990200L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-3491990200L) + "'", long15 == (-3491990200L));
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-844789680L), 475260000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.secondOfDay();
        java.lang.String str13 = islamicChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.ReadableInstant readableInstant7 = null;
        int int8 = dateTimeZone6.getOffset(readableInstant7);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone6.getOffset(readableInstant9);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        int int13 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis((long) (short) 100, (int) (byte) 1, 0, (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
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
        // The following exception was thrown during execution in test generation
        try {
            long long28 = islamicChronology12.getDateTimeMillis(115200032L, 3840000, (int) (byte) 100, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { 10, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial11, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 1]");
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(100L, (int) '#', (int) (short) 10, 3840000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        long long8 = islamicChronology3.add(0L, (long) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology3.getDateTimeMillis((-1), (int) (byte) 1, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(4, 1, (int) (byte) 100, (int) '4', (int) (byte) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, (-42228871L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(0, 3840000, 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1010L, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (byte) -1, (int) (short) 100, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1010L + "'", long9 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        java.lang.String str9 = dateTimeZone1.getName((long) 0);
        java.lang.String str10 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.adjustOffset((long) (short) 100, true);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology14.getDateTimeMillis((int) (short) 1, (int) '4', (int) (short) 10, (int) (short) 0, 115200000, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(islamicChronology14);
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
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
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.era();
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology0.set(readablePartial16, (-41571691199999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        long long7 = islamicChronology0.add((-518398999L), (long) 100, 100);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, (-208693526399990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-518388999L) + "'", long7 == (-518388999L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod11, (-208693526399990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-42245279999968L) + "'", long8 == (-42245279999968L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField12 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis(36000000, (int) (byte) 1, 187200000, (int) (byte) 100, (int) (byte) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
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
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = islamicChronology0.set(readablePartial3, (long) 3840000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
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
        org.joda.time.DurationField durationField11 = islamicChronology3.centuries();
        int int12 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField13 = islamicChronology3.seconds();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        long long17 = islamicChronology3.add(readablePeriod14, 14460100L, (-1));
        org.joda.time.DurationField durationField18 = islamicChronology3.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 14460100L + "'", long17 == 14460100L);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        long long15 = islamicChronology8.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.weekOfWeekyear();
        boolean boolean18 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.DurationField durationField19 = islamicChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.set(readablePartial20, 36000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology3.getDateTimeMillis(100, 115200000, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(3840000, (int) (short) 100, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((int) (byte) -1, 1, 1, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod7, 1819L, (-844789680L));
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
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology11 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        boolean boolean16 = dateTimeZone13.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone17 = dateTimeZone13.toTimeZone();
        org.joda.time.LocalDateTime localDateTime18 = null;
        boolean boolean19 = dateTimeZone13.isLocalDateTimeGap(localDateTime18);
        boolean boolean20 = dateTimeZone13.isFixed();
        java.util.TimeZone timeZone21 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.Chronology chronology25 = islamicChronology0.withZone(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = islamicChronology0.getDateTimeMillis((long) 187200000, 10, 4, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(timeZone21);
        org.junit.Assert.assertEquals(timeZone21.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        long long7 = islamicChronology0.add(10L, 0L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) -1, (int) ' ', (int) (short) 100, 10, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-3491990200L), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis(36000000, 36000000, 100, (int) (byte) 1, (int) (short) 10, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-3491990200L) + "'", long13 == (-3491990200L));
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField9 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(115200000L, (int) '#', (int) 'a', 115200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(36324000035L, (int) (short) -1, (int) (short) 1, 36000000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (byte) 1, 3840000, 187200000, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology3.get(readablePartial8, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
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
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology3.set(readablePartial14, (-4888702990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (-3599990001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-41554321066532L), (-42228871L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.monthOfYear();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.set(readablePartial17, 3139L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) 'a', 10, (int) (short) 0, (int) (byte) -1, (int) (short) 10, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePartial13, 5297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray15 = new int[] { 0, 36000000, 'a', '#', '4' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial9, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0, 36000000, 97, 35, 52]");
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(4, 10, (int) 'a', 0, (int) (byte) 0, (int) (short) -1, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-518398999L), 3840000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField20 = chronology19.minutes();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = islamicChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology3.getZone();
        org.joda.time.Chronology chronology13 = islamicChronology3.withUTC();
        long long17 = chronology13.add((long) (byte) 100, (-125999648371L), (-1));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 125999648471L + "'", long17 == 125999648471L);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.era();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) dateTimeField6);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 10);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone6);
        int int12 = dateTimeZone6.getOffset(35L);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone6.isLocalDateTimeGap(localDateTime13);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology9.getZone();
        java.lang.String str13 = islamicChronology9.toString();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology9.get(readablePartial14, 561600099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyear();
        org.joda.time.Chronology chronology11 = islamicChronology9.withUTC();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology9.get(readablePartial12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray14 = null;
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.monthOfYear();
        org.joda.time.DurationField durationField13 = islamicChronology3.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology4.halfdays();
        org.joda.time.DurationField durationField7 = islamicChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology4.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology4.get(readablePeriod9, (-208693526399990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        int int11 = dateTimeZone7.getStandardOffset(10L);
        int int13 = dateTimeZone7.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType14);
        java.lang.String str17 = dateTimeZone7.getNameKey(32L);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone7);
        int int20 = dateTimeZone7.getStandardOffset((long) ' ');
        java.lang.String str22 = dateTimeZone7.getNameKey((-35999999L));
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "UTC" + "'", str22, "UTC");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray18 = new int[] { (short) 10, (byte) 100, 187200000, 'a', 1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial12, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10, 100, 187200000, 97, 1]");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        long long13 = islamicChronology0.add(1664L, (-3599990001L), (int) '#');
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray16 = new int[] { 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial14, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-125999648371L) + "'", long13 == (-125999648371L));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType12 = islamicChronology3.getLeapYearPatternType();
        org.joda.time.DurationField durationField13 = islamicChronology3.weeks();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(leapYearPatternType12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (long) ' ', 36000000);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((-41572483199966L), (int) 'a', (int) (byte) 0, (int) (short) -1, 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, (-51838899900L), 36324000035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-518398999L), 3840000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField20 = chronology19.minutes();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = chronology19.get(readablePeriod21, (-59719564684799965L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology0.getDateTimeMillis(180601022L, 100, (int) (short) 10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3840000);
        java.lang.Class<?> wildcardClass2 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        int int5 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField8 = islamicChronology3.millis();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology3.get(readablePeriod9, (-82789990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
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
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-41572483199965L) + "'", long19 == (-41572483199965L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        java.lang.String str9 = chronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("+00:00");
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName((-80689900L), locale13);
        org.joda.time.Chronology chronology15 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology15.get(readablePeriod17, (long) (byte) -1, 5731512287551200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[+10:00]" + "'", str9, "IslamicChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = chronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePartial7, 35L);
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
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
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
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType11 = islamicChronology3.getLeapYearPatternType();
        org.joda.time.DurationField durationField12 = islamicChronology3.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(leapYearPatternType11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
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
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology0.get(readablePartial15, 99L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[+10:00]" + "'", str1, "IslamicChronology[+10:00]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (long) ' ', 36000000);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((int) (short) 0, (int) (short) 0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        org.joda.time.Chronology chronology9 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray18 = new int[] { ' ', 36000000, (-1), 187200000, 187200000, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial11, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32, 36000000, -1, 187200000, 187200000, 10]");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.millisOfSecond();
        org.joda.time.DurationField durationField6 = islamicChronology4.halfdays();
        org.joda.time.DurationField durationField7 = islamicChronology4.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology4.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology4.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology4.set(readablePartial10, 561600099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(187200035L, 187200000, (int) (byte) 10, 3840000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 10100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        long long16 = dateTimeZone10.previousTransition((long) (-1));
        long long18 = dateTimeZone10.nextTransition(36000000L);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(4, 36000000, 187200000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
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
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        java.lang.String str4 = islamicChronology0.toString();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) (byte) 1, (int) (byte) 1, (int) (byte) 0, 115200000, (-1), 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[+10:00]" + "'", str4, "IslamicChronology[+10:00]");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[+10:00]" + "'", str5, "IslamicChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod5, (-42406761599990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.era();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray12 = new int[] { (short) -1, (-1), 36000000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial8, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, -1, 36000000]");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, (-440688868L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 3840000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[+10:00]" + "'", str9, "IslamicChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getName((-80689900L), locale3);
        long long6 = dateTimeZone1.previousTransition((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone12 = islamicChronology10.getZone();
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone12.getName(0L, locale14);
        long long17 = dateTimeZone1.getMillisKeepLocal(dateTimeZone12, 36000000L);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 0, 0);
        org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField22 = islamicChronology21.hours();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology21.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology21.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology21.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20, leapYearPatternType25);
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12, leapYearPatternType25);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = islamicChronology27.getDateTimeMillis((int) (short) 1, (-1), (int) (byte) -1, (int) (byte) -1, (int) (short) 0, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000000L + "'", long6 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 36000000L + "'", long17 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(islamicChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(leapYearPatternType25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(islamicChronology27);
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, (-42228871L), 359999989L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[+10:00]" + "'", str8, "IslamicChronology[+10:00]");
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        java.lang.String str8 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((long) 1, 4, (int) (short) 1, 0, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[+10:00]" + "'", str7, "IslamicChronology[+10:00]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[+10:00]" + "'", str8, "IslamicChronology[+10:00]");
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-84478968L), (int) (byte) 0);
        long long15 = islamicChronology0.add(36000000L, 52L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis(4, 1, (int) (byte) 0, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-84478968L) + "'", long11 == (-84478968L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36000000L + "'", long15 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, 1664L, 561600099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        java.lang.String str9 = chronology8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forID("+00:00");
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone11.getName((-80689900L), locale13);
        org.joda.time.Chronology chronology15 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DurationField durationField17 = chronology15.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[+10:00]" + "'", str9, "IslamicChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = islamicChronology0.hours();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 115200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DurationField durationField2 = islamicChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray10 = new int[] { 10, 4, 0, 4, 10, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial3, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10, 4, 0, 4, 10, -1]");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(10);
        long long3 = dateTimeZone1.previousTransition(57840389L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 57840389L + "'", long3 == 57840389L);
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod12, (-518388999L), (-84478968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        java.lang.String str11 = dateTimeZone10.getID();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        int int3 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long8 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((long) '4', (int) '#', (int) '#', 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-41572483199965L) + "'", long8 == (-41572483199965L));
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.yearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod4, (-82789990L), (-518388999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-35999999L), (int) (short) 0);
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999999L) + "'", long13 == (-35999999L));
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.set(readablePartial5, (-324599000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 187200000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology3.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology3.minutes();
        org.joda.time.Chronology chronology8 = islamicChronology3.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str14 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis((long) (byte) 10, (int) (short) 100, 36000000, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-71939899L) + "'", long11 == (-71939899L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IslamicChronology[-00:00:00.001]" + "'", str14, "IslamicChronology[-00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        long long9 = dateTimeZone2.adjustOffset(0L, true);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.DurationField durationField14 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology10.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType17 = islamicChronology10.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType17);
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology18.set(readablePartial19, 180601022L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(leapYearPatternType17);
        org.junit.Assert.assertNotNull(islamicChronology18);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (byte) 1, 4, (int) (short) 100, 3840000, 187200000, (int) (byte) 100, 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(4L, (int) '#', (int) (short) -1, 3840000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis(3564000001L, (int) (short) 1, (-1), (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (-518398999L), 3840000);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int16 = dateTimeZone14.getOffsetFromLocal((long) (short) 10);
        org.joda.time.LocalDateTime localDateTime17 = null;
        boolean boolean18 = dateTimeZone14.isLocalDateTimeGap(localDateTime17);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = islamicChronology0.add(0L, (-41571691200001L), 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -41571691200001 * 187200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36000000 + "'", int16 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weeks();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(99L, (int) (short) 10, 0, 0, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) '#', (int) '#', (int) (short) 0, (int) (byte) 1, 0, 3840000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DurationField durationField9 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, 3139L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[-00:00:00.001]" + "'", str8, "IslamicChronology[-00:00:00.001]");
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone1.getOffset(readableInstant6);
        long long11 = dateTimeZone1.convertLocalToUTC((long) (short) -1, false, (long) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology6.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone14);
        long long18 = dateTimeZone14.adjustOffset(57840389L, false);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 57840389L + "'", long18 == 57840389L);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean11 = dateTimeZone9.equals((java.lang.Object) (-1.0d));
        int int13 = dateTimeZone9.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime14);
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology18.millis();
        boolean boolean23 = islamicChronology18.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType25 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9, leapYearPatternType25);
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology26.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        long long31 = islamicChronology26.add(readablePeriod28, (-4888702989L), (int) 'a');
        org.joda.time.ReadablePartial readablePartial32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray34 = islamicChronology26.get(readablePartial32, (-51838899900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(leapYearPatternType25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-4888702989L) + "'", long31 == (-4888702989L));
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.getDateTimeMillis((-880789680L), 0, (int) '4', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, 10L, 100);
        org.joda.time.DurationField durationField14 = islamicChronology0.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.convertUTCToLocal(1010L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(3600000001L, locale9);
        java.lang.String str11 = dateTimeZone1.toString();
        long long13 = dateTimeZone1.nextTransition((long) 36000000);
        java.lang.String str15 = dateTimeZone1.getNameKey(3840000L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1010L + "'", long7 == 1010L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000000L + "'", long13 == 36000000L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getName((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology8.halfdays();
        org.joda.time.Chronology chronology11 = islamicChronology8.withUTC();
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) islamicChronology8);
        int int13 = islamicChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.dayOfYear();
        org.joda.time.DurationField durationField15 = islamicChronology8.years();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = islamicChronology8.get(readablePeriod16, 36324000035L, 180601022L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.hourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, (-518389009L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 5297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 52L, (int) (short) 0);
        java.lang.String str10 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[UTC]" + "'", str10, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forID("+00:00");
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-80689900L), (-1), (int) ' ', (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod7, (-518389009L), (long) 3840000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfWeek();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(36000000L, 3840000, 4, (int) (byte) 1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((int) (short) 0, 4, (int) (short) -1, (int) (byte) 0, (int) (short) 0, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.getDateTimeMillis((int) (byte) 10, (int) (byte) 1, 0, (int) ' ', 3840000, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((-1), (int) (byte) -1, 4, 36000000, (int) (short) 1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
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
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-84478968L) + "'", long12 == (-84478968L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = dateTimeZone10.getOffset(readableInstant13);
        long long16 = dateTimeZone10.previousTransition((long) (-1));
        long long18 = dateTimeZone10.nextTransition(36000000L);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField21 = islamicChronology0.halfdays();
        java.lang.Class<?> wildcardClass22 = durationField21.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        long long9 = islamicChronology3.add(119040031L, 10L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 119040131L + "'", long9 == 119040131L);
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology9.get(readablePeriod11, 101L, (-84472104L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology3.get(readablePartial12, 10100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField6 = islamicChronology5.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology5.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology5.weekyears();
        org.joda.time.Chronology chronology9 = islamicChronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        boolean boolean11 = islamicChronology0.equals((java.lang.Object) durationField10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod13, 14459968L, 561600099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
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
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePartial13, 5731512287587200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000001L + "'", long11 == 3600000001L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        int int17 = islamicChronology14.getMinimumDaysInFirstWeek();
        long long22 = islamicChronology14.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField24 = islamicChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset(1L);
        long long35 = dateTimeZone28.adjustOffset((long) (short) 1, false);
        int int37 = dateTimeZone28.getStandardOffset(32L);
        org.joda.time.Chronology chronology38 = islamicChronology14.withZone(dateTimeZone28);
        long long41 = dateTimeZone28.adjustOffset((long) 115200000, false);
        org.joda.time.Chronology chronology42 = islamicChronology0.withZone(dateTimeZone28);
        long long44 = dateTimeZone28.previousTransition(100L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-41572483199965L) + "'", long22 == (-41572483199965L));
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 115200000L + "'", long41 == 115200000L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        boolean boolean12 = dateTimeZone7.isStandardOffset((-42406761599990L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray17 = new int[] { (byte) 100, (byte) -1, 'a', 'a', 115200000, '4' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial10, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, -1, 97, 97, 115200000, 52]");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = islamicChronology0.add(readablePeriod16, (-440688868L), (int) (short) 10);
        org.joda.time.DurationField durationField20 = islamicChronology0.millis();
        java.lang.Class<?> wildcardClass21 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-440688868L) + "'", long19 == (-440688868L));
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis((-36000000L), (int) (byte) 10, 187200000, 100, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str1, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePartial6, (-21539900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, (-175993307604000001L));
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
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(0, 0, (int) (byte) 1, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str6, "IslamicChronology[+00:00:00.001]");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = islamicChronology0.add(readablePeriod10, (-35999999L), (int) (short) 0);
        org.joda.time.DurationField durationField14 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.set(readablePartial15, (-40936320000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-35999999L) + "'", long13 == (-35999999L));
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.months();
        org.joda.time.DurationField durationField5 = islamicChronology0.years();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePartial7, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.secondOfMinute();
        org.joda.time.DurationField durationField6 = islamicChronology4.seconds();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, 0L);
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
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod12, (-41572483199965L), (-324599000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1010L, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        boolean boolean14 = dateTimeZone11.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone15 = dateTimeZone11.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        long long18 = dateTimeZone16.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = islamicChronology0.get(readablePartial20, (-51838899900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1010L + "'", long9 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 36000000L + "'", long18 == 36000000L);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, 3600000001L, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis((int) (short) -1, 115200000, (int) (short) 1, (-1), 10, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000001L + "'", long11 == 3600000001L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (-41571691199999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod11, (-41571691200000L), 14460099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(125999648471L, (int) (short) 100, (int) (short) -1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField13 = islamicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = islamicChronology12.weekyears();
        org.joda.time.Chronology chronology16 = islamicChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology12.getZone();
        int int21 = dateTimeZone19.getStandardOffset(10L);
        org.joda.time.Chronology chronology22 = islamicChronology9.withZone(dateTimeZone19);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.dayOfYear();
        org.joda.time.DurationField durationField26 = islamicChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) (-1.0d));
        int int33 = dateTimeZone29.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime34);
        int int37 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology38 = islamicChronology23.withZone(dateTimeZone29);
        int int40 = dateTimeZone29.getOffsetFromLocal(11L);
        long long42 = dateTimeZone19.getMillisKeepLocal(dateTimeZone29, 1000L);
        org.joda.time.Chronology chronology43 = islamicChronology0.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField44 = chronology43.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1000L + "'", long42 == 1000L);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationField44);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-42245279999969L), 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, 115200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
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
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long2 = dateTimeZone0.nextTransition(561600099L);
        java.lang.Class<?> wildcardClass3 = dateTimeZone0.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 561600099L + "'", long2 == 561600099L);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (long) (byte) 10, 3139L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        long long12 = islamicChronology0.add(1819L, (long) (byte) 1, 0);
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePartial13, 130260099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1819L + "'", long12 == 1819L);
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        int int7 = dateTimeZone5.getOffset((-880789680L));
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology11.clockhourOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology11.hours();
        org.joda.time.DurationField durationField14 = islamicChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology11.hourOfHalfday();
        org.joda.time.DurationField durationField18 = islamicChronology11.centuries();
        boolean boolean19 = dateTimeZone5.equals((java.lang.Object) durationField18);
        long long21 = dateTimeZone5.convertUTCToLocal(35L);
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField23 = islamicChronology22.weeks();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology22.yearOfEra();
        org.joda.time.DurationField durationField25 = islamicChronology22.weekyears();
        org.joda.time.DateTimeField dateTimeField26 = islamicChronology22.era();
        org.joda.time.DurationField durationField27 = islamicChronology22.seconds();
        org.joda.time.chrono.IslamicChronology islamicChronology28 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField29 = islamicChronology28.weeks();
        org.joda.time.Chronology chronology30 = islamicChronology28.withUTC();
        org.joda.time.DurationField durationField31 = islamicChronology28.halfdays();
        org.joda.time.DateTimeField dateTimeField32 = islamicChronology28.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str35 = dateTimeZone34.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology36 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34);
        int int38 = dateTimeZone34.getStandardOffset(10L);
        int int40 = dateTimeZone34.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType41 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology42 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone34, leapYearPatternType41);
        org.joda.time.Chronology chronology43 = islamicChronology28.withZone(dateTimeZone34);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        long long47 = islamicChronology28.add(readablePeriod44, (-440688868L), (int) (short) 10);
        org.joda.time.DurationField durationField48 = islamicChronology28.millis();
        org.joda.time.DateTimeField dateTimeField49 = islamicChronology28.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = islamicChronology28.minuteOfDay();
        boolean boolean51 = islamicChronology22.equals((java.lang.Object) dateTimeField50);
        boolean boolean52 = dateTimeZone5.equals((java.lang.Object) boolean51);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(islamicChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "UTC" + "'", str35, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType41);
        org.junit.Assert.assertNotNull(islamicChronology42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-440688868L) + "'", long47 == (-440688868L));
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone6.getOffset(readableInstant9);
        long long12 = dateTimeZone6.convertUTCToLocal(14460100L);
        org.joda.time.Chronology chronology13 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        java.lang.String str16 = dateTimeZone6.getNameKey((long) 0);
        java.lang.String str17 = dateTimeZone6.getID();
        java.lang.Class<?> wildcardClass18 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 14460100L + "'", long12 == 14460100L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) (short) -1, 10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(4, 3840000, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField14 = islamicChronology0.months();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, 42406761605288L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) ' ', (int) (short) 0);
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((int) (short) 100, 0, 1, (int) ' ', (int) (short) 10, 187200000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology11.getZone();
        java.lang.String str16 = dateTimeZone14.getShortName((long) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000001L + "'", long10 == 3600000001L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (short) 10, 187200000, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod6, (-21539900L), (-82789990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.set(readablePartial13, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-42245279999968L) + "'", long8 == (-42245279999968L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, (-208693526399990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(leapYearPatternType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        long long9 = islamicChronology0.add((-80689900L), (-35999900L), (int) (byte) 10);
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DurationField durationField12 = islamicChronology10.eras();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology10.year();
        boolean boolean15 = islamicChronology0.equals((java.lang.Object) islamicChronology10);
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology10.set(readablePartial16, 5731512287551200000L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-440688900L) + "'", long9 == (-440688900L));
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        long long9 = dateTimeZone6.nextTransition(3L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getShortName((-84478968L), locale11);
        java.lang.String str14 = dateTimeZone6.getNameKey(475260000L);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 359999989L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long9 = dateTimeZone7.previousTransition((long) 36000000);
        long long11 = dateTimeZone7.convertUTCToLocal(101L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 36000000L + "'", long9 == 36000000L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 101L + "'", long11 == 101L);
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfHour();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology0.getLeapYearPatternType();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(leapYearPatternType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        int int9 = dateTimeZone7.getStandardOffset(10L);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime10);
        java.util.TimeZone timeZone12 = dateTimeZone7.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(3139L, (int) (byte) 1, 115200000, (int) (byte) -1, 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        java.lang.String str5 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(187200000, (int) (byte) 1, (int) (byte) 1, 1, 115200000, 36000000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str5, "IslamicChronology[+00:00:00.001]");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        long long14 = islamicChronology0.add(10L, (long) (short) -1, (int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField16 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology0.getDateTimeMillis((int) (short) 100, 187200000, (int) (short) -1, 100, (int) (short) 100, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = chronology2.getDateTimeMillis(115200000, (int) (byte) 100, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        long long11 = islamicChronology0.add(10L, (-50399000L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField13 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-4888702990L) + "'", long11 == (-4888702990L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-41572483199966L), 119040031L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        java.lang.String str11 = dateTimeZone1.getNameKey(32L);
        java.util.Locale locale13 = null;
        java.lang.String str14 = dateTimeZone1.getName((-440688900L), locale13);
        long long17 = dateTimeZone1.adjustOffset(52L, true);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.getDateTimeMillis((int) (short) -1, (int) 'a', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        int int11 = dateTimeZone7.getStandardOffset(10L);
        int int13 = dateTimeZone7.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7, leapYearPatternType14);
        java.lang.String str17 = dateTimeZone7.getNameKey(32L);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField20 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) (short) -1, (int) (short) 10, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone16.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone16.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = islamicChronology0.withZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = chronology23.getDateTimeMillis(0, (int) 'a', 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField9 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.year();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.set(readablePartial11, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
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
        long long12 = dateTimeZone5.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology16.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType21 = islamicChronology16.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology22 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType21);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeZone5.getName(1L, locale24);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(leapYearPatternType21);
        org.junit.Assert.assertNotNull(islamicChronology22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+00:00" + "'", str25, "+00:00");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.set(readablePartial12, (-30289900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField11 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod13, (-518389009L), 475260000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray13 = new int[] { (short) 0, (byte) -1, 1, 4 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 1, 4]");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        long long8 = dateTimeZone5.getMillisKeepLocal(dateTimeZone6, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = dateTimeZone6.getOffset(readableInstant9);
        long long12 = dateTimeZone6.convertUTCToLocal(14460100L);
        org.joda.time.Chronology chronology13 = islamicChronology0.withZone(dateTimeZone6);
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology14.weekyear();
        long long20 = islamicChronology14.add((long) 187200000, 0L, 4);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = islamicChronology14.getDateTimeMillis(187200000, 115200000, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 14460100L + "'", long12 == 14460100L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 187200000L + "'", long20 == 187200000L);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekyear();
        long long18 = islamicChronology0.add(1L, (long) 187200000, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1872000001L + "'", long18 == 1872000001L);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone7.getShortName(38100000L, locale9);
        java.lang.String str12 = dateTimeZone7.getNameKey((-4888702989L));
        java.lang.Class<?> wildcardClass13 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology4.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology4.getDateTimeMillis(36000000, (int) '4', 100, (int) ' ', 1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod5, 3601004L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = islamicChronology0.get(readablePeriod2, 1664L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (-4888702989L), (-2044528502394613L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) (byte) 1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.getDateTimeMillis((int) (short) 1, 0, (int) (byte) 100, 4, (int) (byte) -1, 4, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-42245279999968L) + "'", long8 == (-42245279999968L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
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
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        long long21 = islamicChronology0.add(readablePeriod18, 32L, 4);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = islamicChronology0.get(readablePeriod22, (-41571691200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 32L + "'", long21 == 32L);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, 5731512287551200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (short) 1, 187200000, (int) (short) -1, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) ' ', (int) (byte) 1, 4, 4, (int) (short) -1, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (-173400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
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
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology3.add(readablePeriod9, (long) 0, (int) '4');
        org.joda.time.Chronology chronology13 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology3.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology3.get(readablePartial15, 42406761605387L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology3.getDateTimeMillis(100, (-1), (int) (byte) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str5 = dateTimeZone1.getName((long) 100);
        int int7 = dateTimeZone1.getStandardOffset((long) (-1));
        java.lang.String str9 = dateTimeZone1.getNameKey(99L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology3.getDateTimeMillis((int) (short) 0, 115200000, (int) (short) 10, (-1), (int) '4', (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) (short) 1, (int) (short) -1, (int) (short) -1, (int) (short) 1, (int) (byte) 1, (int) (short) -1, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        long long10 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 10, 4, (int) (short) 0, (int) (short) 0, 1);
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.era();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField13 = islamicChronology0.eras();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePartial14, 31878L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-41571691199999L) + "'", long10 == (-41571691199999L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone3 = islamicChronology0.getZone();
        boolean boolean5 = dateTimeZone3.equals((java.lang.Object) (-41571691200000L));
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray10 = new int[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (short) 100, (int) 'a', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField11 = islamicChronology0.weeks();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.millis();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology6.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = islamicChronology6.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology6.getZone();
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField17 = islamicChronology16.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology16.yearOfEra();
        org.joda.time.DurationField durationField19 = islamicChronology16.weekyears();
        org.joda.time.Chronology chronology20 = islamicChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology16.hourOfDay();
        org.joda.time.DurationField durationField23 = islamicChronology16.hours();
        boolean boolean24 = dateTimeZone14.equals((java.lang.Object) durationField23);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        java.lang.String str8 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) 'a', (int) (byte) 100, 3840000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[UTC]" + "'", str5, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str14 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis(0L, (int) (short) 100, 0, (int) (byte) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IslamicChronology[UTC]" + "'", str14, "IslamicChronology[UTC]");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.Chronology chronology14 = islamicChronology3.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str17 = dateTimeZone16.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.clockhourOfDay();
        org.joda.time.DurationField durationField20 = islamicChronology18.hours();
        org.joda.time.DurationField durationField21 = islamicChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.dayOfYear();
        org.joda.time.DurationField durationField23 = islamicChronology18.minutes();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.millisOfSecond();
        org.joda.time.DurationField durationField25 = islamicChronology18.halfdays();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType26 = islamicChronology18.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology27 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType26);
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology27.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = islamicChronology27.getDateTimeMillis(187238489L, 0, (int) (short) 10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(leapYearPatternType26);
        org.junit.Assert.assertNotNull(islamicChronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = islamicChronology0.get(readablePeriod1, (long) (short) 10, (-3491990200L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str14 = islamicChronology0.toString();
        org.joda.time.DurationField durationField15 = islamicChronology0.years();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis(115200000, (int) (byte) -1, 115200000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "IslamicChronology[UTC]" + "'", str14, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, (-415721800702990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
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
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, (-41572483199966L), (-208693526399990L));
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IslamicChronology[-00:00:00.001]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IslamicChronology[-00:00:00.001]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        int int17 = islamicChronology14.getMinimumDaysInFirstWeek();
        long long22 = islamicChronology14.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField24 = islamicChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset(1L);
        long long35 = dateTimeZone28.adjustOffset((long) (short) 1, false);
        int int37 = dateTimeZone28.getStandardOffset(32L);
        org.joda.time.Chronology chronology38 = islamicChronology14.withZone(dateTimeZone28);
        long long41 = dateTimeZone28.adjustOffset((long) 115200000, false);
        org.joda.time.Chronology chronology42 = islamicChronology0.withZone(dateTimeZone28);
        java.lang.String str43 = dateTimeZone28.getID();
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str46 = dateTimeZone45.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology47 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45);
        int int49 = dateTimeZone45.getStandardOffset(10L);
        int int51 = dateTimeZone45.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType52 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology53 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone45, leapYearPatternType52);
        org.joda.time.chrono.IslamicChronology islamicChronology54 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28, leapYearPatternType52);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-41572483199965L) + "'", long22 == (-41572483199965L));
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 115200000L + "'", long41 == 115200000L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "UTC" + "'", str43, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "UTC" + "'", str46, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType52);
        org.junit.Assert.assertNotNull(islamicChronology53);
        org.junit.Assert.assertNotNull(islamicChronology54);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.centuryOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        long long12 = dateTimeZone7.nextTransition(3840000L);
        java.lang.Class<?> wildcardClass13 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3840000L + "'", long12 == 3840000L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str11 = dateTimeZone7.getID();
        long long13 = dateTimeZone7.nextTransition((long) 36000000);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone7);
        java.lang.String str15 = dateTimeZone7.getID();
        java.lang.String str17 = dateTimeZone7.getNameKey((-35999999L));
        java.lang.String str19 = dateTimeZone7.getName(3564000001L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999999L) + "'", long10 == (-35999999L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+10:00" + "'", str11, "+10:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 36000000L + "'", long13 == 36000000L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        int int7 = dateTimeZone5.getStandardOffset(1664L);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology7.minutes();
        org.joda.time.DurationField durationField11 = islamicChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology7.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology7.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean18 = dateTimeZone16.equals((java.lang.Object) (-1.0d));
        int int20 = dateTimeZone16.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime21 = null;
        boolean boolean22 = dateTimeZone16.isLocalDateTimeGap(localDateTime21);
        org.joda.time.Chronology chronology23 = islamicChronology7.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.IslamicChronology islamicChronology25 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField26 = islamicChronology25.weeks();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology25.yearOfEra();
        org.joda.time.DurationField durationField28 = islamicChronology25.millis();
        boolean boolean30 = islamicChronology25.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField31 = islamicChronology25.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType32 = islamicChronology25.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology33 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone16, leapYearPatternType32);
        org.joda.time.chrono.IslamicChronology islamicChronology34 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone3, leapYearPatternType32);
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology34.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = islamicChronology34.get(readablePeriod36, 5297L, (-440688900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(islamicChronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(leapYearPatternType32);
        org.junit.Assert.assertNotNull(islamicChronology33);
        org.junit.Assert.assertNotNull(islamicChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.Chronology chronology14 = islamicChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology10.getZone();
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone15);
        org.joda.time.DurationField durationField17 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.getDateTimeMillis(1, 4, (int) (byte) 1, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        java.util.Locale locale10 = null;
        java.lang.String str11 = dateTimeZone8.getName(5731512287551200000L, locale10);
        java.lang.String str12 = dateTimeZone8.getID();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long21 = dateTimeZone18.convertLocalToUTC((long) (short) 100, true);
        java.util.Locale locale23 = null;
        java.lang.String str24 = dateTimeZone18.getName(14460100L, locale23);
        org.joda.time.Chronology chronology25 = islamicChronology15.withZone(dateTimeZone18);
        org.joda.time.chrono.IslamicChronology islamicChronology26 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone27 = islamicChronology26.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = islamicChronology26.getDateTimeMillis((int) (byte) 0, 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999900L) + "'", long21 == (-35999900L));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(islamicChronology26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod4, 115200000L, (-50399000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getOffsetFromLocal(32L);
        long long8 = dateTimeZone1.convertLocalToUTC(1819L, false);
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField10 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfEra();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology9.hourOfDay();
        java.lang.String str13 = islamicChronology9.toString();
        org.joda.time.Chronology chronology14 = islamicChronology9.withUTC();
        boolean boolean15 = dateTimeZone1.equals((java.lang.Object) chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.weekyearOfCentury();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1819L + "'", long8 == 1819L);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.centuryOfEra();
        java.lang.Class<?> wildcardClass4 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField5 = islamicChronology4.halfdays();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology4.get(readablePeriod6, (-36000000L), (-80689901L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        long long12 = dateTimeZone8.convertLocalToUTC((long) (short) 10, true, (long) ' ');
        java.lang.Class<?> wildcardClass13 = dateTimeZone8.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (-3491990200L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField11 = islamicChronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.yearOfEra();
        org.joda.time.DurationField durationField13 = islamicChronology10.weekyears();
        org.joda.time.Chronology chronology14 = islamicChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology10.getZone();
        org.joda.time.Chronology chronology16 = islamicChronology0.withZone(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = islamicChronology0.get(readablePeriod18, (-42245279999969L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime14 = null;
        boolean boolean15 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, (long) 0);
        org.joda.time.Chronology chronology20 = islamicChronology0.withZone(dateTimeZone17);
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = islamicChronology0.get(readablePartial23, (-35999000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 36000001L + "'", long19 == 36000001L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = islamicChronology0.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        boolean boolean11 = dateTimeZone8.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone12 = dateTimeZone8.toTimeZone();
        long long14 = dateTimeZone8.convertUTCToLocal(1010L);
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone8.getShortName(3600000001L, locale16);
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = islamicChronology0.getDateTimeMillis((-1), (int) (byte) -1, 3840000, 187200000, 36000000, 3840000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1010L + "'", long14 == 1010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod11, (-41572483199965L), 36324000035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.era();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) dateTimeField6);
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (-844789680L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IslamicChronology[+10:00]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IslamicChronology[+10:00]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        java.lang.Class<?> wildcardClass8 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[UTC]" + "'", str5, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray15 = new int[] { 4200000, 1, 'a', '#', 4, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[4200000, 1, 97, 35, 4, -1]");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
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
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) '#', (int) 'a', (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.years();
        long long8 = islamicChronology0.getDateTimeMillis(10, (int) (short) 1, (int) (byte) 10, (int) ' ');
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology0.getDateTimeMillis(1, (int) (short) -1, (int) (short) 0, (int) (byte) -1, 100, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-42245279999968L) + "'", long8 == (-42245279999968L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getName((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.secondOfMinute();
        org.joda.time.DurationField durationField10 = islamicChronology8.halfdays();
        org.joda.time.Chronology chronology11 = islamicChronology8.withUTC();
        boolean boolean12 = dateTimeZone1.equals((java.lang.Object) islamicChronology8);
        int int13 = islamicChronology8.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone14 = islamicChronology8.getZone();
        java.lang.Class<?> wildcardClass15 = dateTimeZone14.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.millisOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology3.eras();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, (-42245279999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
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
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(36000000, 36000000, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
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
        long long15 = islamicChronology3.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField16 = islamicChronology3.millis();
        org.joda.time.DateTimeZone dateTimeZone17 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology3.era();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = islamicChronology3.getDateTimeMillis((int) '4', 4, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36324000035L + "'", long15 == 36324000035L);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        long long3 = dateTimeZone1.previousTransition(10L);
        java.lang.String str5 = dateTimeZone1.getNameKey(14460099L);
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone1.getShortName((-324599000L), locale7);
        java.lang.String str9 = dateTimeZone1.getID();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 10L + "'", long3 == 10L);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-00:00:00.001" + "'", str8, "-00:00:00.001");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-00:00:00.001" + "'", str9, "-00:00:00.001");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.getDateTimeMillis(36000000, 3840000, (-1), (int) 'a', (int) (byte) 1, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        long long7 = dateTimeZone1.adjustOffset((-880789680L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-880789680L) + "'", long7 == (-880789680L));
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
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
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.secondOfMinute();
        org.joda.time.DurationField durationField13 = islamicChronology3.weeks();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray17 = new int[] { ' ', (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial14, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32, 1]");
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.set(readablePartial12, (-476688868L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DurationField durationField11 = islamicChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.getDateTimeMillis(0, (int) (short) 0, 100, 4200000, 100, (int) (short) 10, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis(187200000, (int) (short) 1, 115200000, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology3.getDateTimeMillis((-80689899L), 4200000, (int) (byte) 0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField14 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.getDateTimeMillis((int) ' ', 187200000, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, 1010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DurationField durationField2 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.weekyearOfCentury();
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod14, (-3839000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField11 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        org.joda.time.LocalDateTime localDateTime2 = null;
        boolean boolean3 = dateTimeZone1.isLocalDateTimeGap(localDateTime2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean7 = dateTimeZone5.equals((java.lang.Object) (-1.0d));
        int int9 = dateTimeZone5.getOffset((long) '4');
        java.lang.String str11 = dateTimeZone5.getName(14460100L);
        long long14 = dateTimeZone5.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType18 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology19 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone17, leapYearPatternType18);
        org.joda.time.chrono.IslamicChronology islamicChronology20 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone5, leapYearPatternType18);
        long long22 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 1664L);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology24.weekyearOfCentury();
        org.joda.time.DurationField durationField26 = islamicChronology24.eras();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        boolean boolean30 = dateTimeZone28.isFixed();
        java.lang.String str31 = dateTimeZone28.getID();
        org.joda.time.Chronology chronology32 = islamicChronology24.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology33 = islamicChronology23.withZone(dateTimeZone28);
        long long35 = dateTimeZone28.previousTransition(35L);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str38 = dateTimeZone37.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology39 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology39.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = islamicChronology39.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology39.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology39.yearOfEra();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType44 = islamicChronology39.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology45 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone28, leapYearPatternType44);
        org.joda.time.chrono.IslamicChronology islamicChronology46 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType44);
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology46.monthOfYear();
        org.joda.time.ReadablePartial readablePartial48 = null;
        int[] intArray55 = new int[] { 187200000, 36000000, (short) 1, (short) 0, (short) 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology46.validate(readablePartial48, intArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 132L + "'", long14 == 132L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(leapYearPatternType18);
        org.junit.Assert.assertNotNull(islamicChronology19);
        org.junit.Assert.assertNotNull(islamicChronology20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1665L + "'", long22 == 1665L);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(islamicChronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "UTC" + "'", str31, "UTC");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 35L + "'", long35 == 35L);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "UTC" + "'", str38, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(leapYearPatternType44);
        org.junit.Assert.assertNotNull(islamicChronology45);
        org.junit.Assert.assertNotNull(islamicChronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[187200000, 36000000, 1, 0, 1, 35]");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        int int12 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(4);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = chronology2.days();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, 2304000036L, 359999990L);
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
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology14.weekyear();
        org.joda.time.DateTimeZone dateTimeZone16 = islamicChronology14.getZone();
        int int17 = islamicChronology14.getMinimumDaysInFirstWeek();
        long long22 = islamicChronology14.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField24 = islamicChronology23.weeks();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.yearOfEra();
        org.joda.time.DurationField durationField26 = islamicChronology23.weekyears();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str29 = dateTimeZone28.toString();
        org.joda.time.Chronology chronology30 = islamicChronology23.withZone(dateTimeZone28);
        int int32 = dateTimeZone28.getOffset(1L);
        long long35 = dateTimeZone28.adjustOffset((long) (short) 1, false);
        int int37 = dateTimeZone28.getStandardOffset(32L);
        org.joda.time.Chronology chronology38 = islamicChronology14.withZone(dateTimeZone28);
        long long41 = dateTimeZone28.adjustOffset((long) 115200000, false);
        org.joda.time.Chronology chronology42 = islamicChronology0.withZone(dateTimeZone28);
        org.joda.time.DurationField durationField43 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField44 = islamicChronology0.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-41572483199965L) + "'", long22 == (-41572483199965L));
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "UTC" + "'", str29, "UTC");
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1L + "'", long35 == 1L);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 115200000L + "'", long41 == 115200000L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology3.get(readablePartial7, (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, 101L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str7 = dateTimeZone1.getName(14460100L);
        long long10 = dateTimeZone1.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType14);
        boolean boolean17 = dateTimeZone1.isFixed();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology18.hourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = islamicChronology18.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField23 = islamicChronology18.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology18.dayOfYear();
        boolean boolean25 = dateTimeZone1.equals((java.lang.Object) islamicChronology18);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = islamicChronology18.getDateTimeMillis((-1), (int) '#', (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology3.getDateTimeMillis(36000000, (int) (short) -1, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        boolean boolean9 = dateTimeZone6.isStandardOffset((long) (byte) 10);
        org.joda.time.Chronology chronology10 = islamicChronology0.withZone(dateTimeZone6);
        java.lang.String str11 = chronology10.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.weeks();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.getDateTimeMillis(10, (int) (short) 0, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str1, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology0.add(readablePeriod9, 1L, 1);
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray15 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10]");
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (-35999965L), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35999965L) + "'", long8 == (-35999965L));
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-518389009L), 0, 100, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) '4', 0, 100, (int) (short) 10, (int) (short) -1, (int) (short) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.era();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean8 = dateTimeZone1.isFixed();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime10 = null;
        boolean boolean11 = dateTimeZone1.isLocalDateTimeGap(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (-844789680L), (int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-844789680L) + "'", long9 == (-844789680L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.months();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, (-21539900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+52:00\" is malformed at \"52:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        long long18 = dateTimeZone15.getMillisKeepLocal(dateTimeZone16, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime19 = null;
        boolean boolean20 = dateTimeZone16.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadableInstant readableInstant21 = null;
        int int22 = dateTimeZone16.getOffset(readableInstant21);
        org.joda.time.Chronology chronology23 = islamicChronology0.withZone(dateTimeZone16);
        org.joda.time.DateTimeField dateTimeField24 = chronology23.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod5, (-476688868L), (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.millisOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        long long11 = dateTimeZone4.previousTransition(11L);
        long long14 = dateTimeZone4.convertLocalToUTC((-166287427189005L), true);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 11L + "'", long11 == 11L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-166287427189005L) + "'", long14 == (-166287427189005L));
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.set(readablePartial5, (-4888702989L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str6 = dateTimeZone5.toString();
        org.joda.time.Chronology chronology7 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = dateTimeZone5.getOffset(1L);
        long long12 = dateTimeZone5.adjustOffset((long) (short) 1, false);
        int int14 = dateTimeZone5.getStandardOffset(32L);
        org.joda.time.LocalDateTime localDateTime15 = null;
        boolean boolean16 = dateTimeZone5.isLocalDateTimeGap(localDateTime15);
        int int18 = dateTimeZone5.getOffsetFromLocal(119040032L);
        java.lang.String str20 = dateTimeZone5.getNameKey((-42406765439990L));
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "UTC" + "'", str20, "UTC");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        java.lang.String str10 = islamicChronology0.toString();
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        java.lang.String str13 = chronology12.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[UTC]" + "'", str10, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        java.lang.String str11 = islamicChronology0.toString();
        org.joda.time.DurationField durationField12 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod13, 5731512287587200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(115200000, (int) '#', (int) (byte) 0, (int) (short) -1, (int) (byte) 1, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        long long15 = islamicChronology8.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.weekOfWeekyear();
        boolean boolean18 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = islamicChronology8.getDateTimeMillis((int) (byte) 10, 115200000, (int) (byte) 100, (int) (short) -1, (int) (short) 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology7.weekyears();
        org.joda.time.Chronology chronology11 = islamicChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology7.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology7.hourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone15 = islamicChronology7.getZone();
        long long17 = dateTimeZone15.convertUTCToLocal(3600000001L);
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology18.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.dayOfYear();
        org.joda.time.DurationField durationField21 = islamicChronology18.minutes();
        org.joda.time.DurationField durationField22 = islamicChronology18.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.weekyear();
        org.joda.time.DateTimeZone dateTimeZone25 = islamicChronology23.getZone();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int30 = dateTimeZone28.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology31 = islamicChronology23.withZone(dateTimeZone28);
        org.joda.time.Chronology chronology32 = islamicChronology18.withZone(dateTimeZone28);
        long long34 = dateTimeZone15.getMillisKeepLocal(dateTimeZone28, (-844789680L));
        java.util.Locale locale36 = null;
        java.lang.String str37 = dateTimeZone15.getShortName((-440688900L), locale36);
        org.joda.time.chrono.IslamicChronology islamicChronology38 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField39 = islamicChronology38.weeks();
        org.joda.time.DateTimeField dateTimeField40 = islamicChronology38.yearOfEra();
        org.joda.time.DurationField durationField41 = islamicChronology38.millis();
        org.joda.time.DateTimeField dateTimeField42 = islamicChronology38.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField43 = islamicChronology38.halfdayOfDay();
        org.joda.time.DurationField durationField44 = islamicChronology38.centuries();
        org.joda.time.DurationField durationField45 = islamicChronology38.weeks();
        org.joda.time.DurationField durationField46 = islamicChronology38.weekyears();
        org.joda.time.DateTimeField dateTimeField47 = islamicChronology38.dayOfWeek();
        org.joda.time.DurationField durationField48 = islamicChronology38.millis();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long54 = dateTimeZone51.convertLocalToUTC((long) (short) 100, true);
        org.joda.time.Chronology chronology55 = islamicChronology38.withZone(dateTimeZone51);
        long long57 = dateTimeZone15.getMillisKeepLocal(dateTimeZone51, (long) 0);
        org.joda.time.Chronology chronology58 = islamicChronology0.withZone(dateTimeZone51);
        org.joda.time.DateTimeField dateTimeField59 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial60 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long62 = islamicChronology0.set(readablePartial60, (-3599990001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3600000001L + "'", long17 == 3600000001L);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 36000000 + "'", int30 == 36000000);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-880789680L) + "'", long34 == (-880789680L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertNotNull(islamicChronology38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-35999900L) + "'", long54 == (-35999900L));
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-36000000L) + "'", long57 == (-36000000L));
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(dateTimeField59);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, (-42406797599990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        long long9 = dateTimeZone6.nextTransition(3L);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone6.getShortName((-84478968L), locale11);
        java.lang.String str14 = dateTimeZone6.getNameKey(475260000L);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone6);
        java.lang.Class<?> wildcardClass16 = chronology15.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 3L + "'", long9 == 3L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = chronology6.years();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology6.get(readablePeriod9, 0L, 3600000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
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
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray19 = new int[] { (short) 10, 'a', 187200000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial15, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-208693526399990L) + "'", long14 == (-208693526399990L));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 97, 187200000]");
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
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
        long long12 = dateTimeZone5.previousTransition(35L);
        java.lang.String str14 = dateTimeZone5.getName((long) (short) 100);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.dayOfWeek();
        org.joda.time.chrono.IslamicChronology islamicChronology12 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField13 = islamicChronology12.weeks();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology12.yearOfEra();
        org.joda.time.DurationField durationField15 = islamicChronology12.weekyears();
        org.joda.time.Chronology chronology16 = islamicChronology12.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology12.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology12.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone19 = islamicChronology12.getZone();
        int int21 = dateTimeZone19.getStandardOffset(10L);
        org.joda.time.Chronology chronology22 = islamicChronology9.withZone(dateTimeZone19);
        org.joda.time.chrono.IslamicChronology islamicChronology23 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = islamicChronology23.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = islamicChronology23.dayOfYear();
        org.joda.time.DurationField durationField26 = islamicChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology23.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean31 = dateTimeZone29.equals((java.lang.Object) (-1.0d));
        int int33 = dateTimeZone29.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime34 = null;
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime34);
        int int37 = dateTimeZone29.getStandardOffset((long) 100);
        org.joda.time.Chronology chronology38 = islamicChronology23.withZone(dateTimeZone29);
        int int40 = dateTimeZone29.getOffsetFromLocal(11L);
        long long42 = dateTimeZone19.getMillisKeepLocal(dateTimeZone29, 1000L);
        org.joda.time.Chronology chronology43 = islamicChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField44 = chronology43.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(islamicChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1000L + "'", long42 == 1000L);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.chrono.IslamicChronology islamicChronology1 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology1.year();
        long long12 = islamicChronology1.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology1.era();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = islamicChronology1.getLeapYearPatternType();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone0, leapYearPatternType14);
        org.joda.time.ReadablePartial readablePartial16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology15.set(readablePartial16, 187200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(islamicChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 14460100L + "'", long12 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DurationField durationField9 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(4200000, (-1), (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, 180601022L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
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
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology16.dayOfWeek();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(leapYearPatternType15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(100);
        org.joda.time.Chronology chronology14 = islamicChronology3.withZone(dateTimeZone13);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology3.get(readablePeriod15, (long) 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1010L + "'", long11 == 1010L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        int int3 = dateTimeZone1.getOffset(readableInstant2);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
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
        org.joda.time.DurationField durationField11 = islamicChronology3.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology3.getDateTimeMillis((int) '#', 36000000, (int) (byte) 10, (int) (byte) 100, 4200000, 3840000, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
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
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray20 = new int[] { (short) 0, 115200000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial17, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 115200000]");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType4 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(leapYearPatternType4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.set(readablePartial10, 2304000036L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, 1L, 4);
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        long long14 = dateTimeZone11.getMillisKeepLocal(dateTimeZone12, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant15 = null;
        int int16 = dateTimeZone12.getOffset(readableInstant15);
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField18 = islamicChronology17.weeks();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology17.yearOfEra();
        org.joda.time.DurationField durationField20 = islamicChronology17.weekyears();
        org.joda.time.DurationField durationField21 = islamicChronology17.weeks();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        long long25 = islamicChronology17.add(readablePeriod22, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField26 = islamicChronology17.months();
        org.joda.time.DateTimeField dateTimeField27 = islamicChronology17.secondOfMinute();
        org.joda.time.DurationField durationField28 = islamicChronology17.hours();
        boolean boolean29 = dateTimeZone12.equals((java.lang.Object) islamicChronology17);
        org.joda.time.Chronology chronology30 = chronology10.withZone(dateTimeZone12);
        org.joda.time.Chronology chronology31 = chronology10.withUTC();
        org.joda.time.DateTimeField dateTimeField32 = chronology10.hourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 3L + "'", long25 == 3L);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-844789680L), (int) (short) -1, (int) (short) -1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        java.lang.String str8 = islamicChronology0.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology3.add(readablePeriod8, 0L, (int) (byte) 100);
        java.lang.String str12 = islamicChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "IslamicChronology[UTC]" + "'", str12, "IslamicChronology[UTC]");
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.secondOfDay();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology3.get(readablePartial11, 1819L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.lang.String str6 = dateTimeZone1.getShortName((-518389009L));
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone1.getShortName(1L, locale8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        long long12 = dateTimeZone1.getMillisKeepLocal(dateTimeZone10, (-125999648371L));
        boolean boolean13 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-125999648371L) + "'", long12 == (-125999648371L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.hours();
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.set(readablePartial10, (-35999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.DurationField durationField10 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(leapYearPatternType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology3.get(readablePeriod7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        int int11 = dateTimeZone4.getStandardOffset(14459968L);
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = dateTimeZone4.getOffset(readableInstant12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = islamicChronology0.add(readablePeriod9, 1L, 1);
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray14 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial13, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology10.getDateTimeMillis(0, 4200000, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (byte) 1, 4, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DurationField durationField8 = islamicChronology3.millis();
        org.joda.time.DurationField durationField9 = islamicChronology3.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        java.lang.String str10 = islamicChronology0.toString();
        org.joda.time.DurationField durationField11 = islamicChronology0.days();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.set(readablePartial13, 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IslamicChronology[UTC]" + "'", str10, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        long long11 = islamicChronology0.add(99L, 3L, 187200000);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.getDateTimeMillis((int) (byte) 1, 100, 0, 0, (int) (byte) 0, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 561600099L + "'", long11 == 561600099L);
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology10.dayOfYear();
        org.joda.time.DurationField durationField13 = islamicChronology10.minutes();
        org.joda.time.DurationField durationField14 = islamicChronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology10.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology10.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean21 = dateTimeZone19.equals((java.lang.Object) (-1.0d));
        int int23 = dateTimeZone19.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime24 = null;
        boolean boolean25 = dateTimeZone19.isLocalDateTimeGap(localDateTime24);
        org.joda.time.Chronology chronology26 = islamicChronology10.withZone(dateTimeZone19);
        org.joda.time.Chronology chronology27 = islamicChronology0.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField28 = chronology27.centuryOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(leapYearPatternType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, (-51838899900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) (short) 10);
        long long6 = dateTimeZone2.convertLocalToUTC((long) 187200000, false, 2304000036L);
        long long9 = dateTimeZone2.adjustOffset((-35999999L), false);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-173400000L) + "'", long6 == (-173400000L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-35999999L) + "'", long9 == (-35999999L));
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        long long14 = islamicChronology0.add((-518389009L), (-41571727199999L), 4);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.clockhourOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-166287427189005L) + "'", long14 == (-166287427189005L));
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial5, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((-41571691200000L), 0, (int) (byte) 100, (int) (byte) 0, 4200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
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
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology9.get(readablePeriod14, (-41571691200001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36000000L + "'", long8 == 36000000L);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        java.lang.String str4 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str7 = dateTimeZone6.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6);
        int int10 = dateTimeZone6.getStandardOffset(10L);
        int int12 = dateTimeZone6.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType13 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone6, leapYearPatternType13);
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType13);
        int int17 = dateTimeZone1.getStandardOffset(38100000L);
        long long20 = dateTimeZone1.convertLocalToUTC(14460101L, true);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone1.getName((long) (byte) 10, locale22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(leapYearPatternType13);
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 14460101L + "'", long20 == 14460101L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology3.getDateTimeMillis(3840000, 0, (int) (byte) 1, (int) (byte) 100, (int) (byte) 10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology5.get(readablePeriod6, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(islamicChronology5);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        long long12 = islamicChronology0.getDateTimeMillis((-35999999L), (int) (short) 0, (int) ' ', (int) (short) 1, (int) ' ');
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DurationField durationField14 = islamicChronology0.years();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.set(readablePartial15, 115200032L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-84478968L) + "'", long12 == (-84478968L));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.year();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, (long) (short) -1, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        long long15 = islamicChronology8.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology8.yearOfEra();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.weekOfWeekyear();
        boolean boolean18 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.DurationField durationField19 = islamicChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.set(readablePartial20, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (short) 0, 0, (int) (short) 0, 4, 3840000, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((-42223075199990L), (int) (short) 100, (int) (short) -1, (-1), 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
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
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str16 = dateTimeZone15.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology17 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology17.clockhourOfDay();
        org.joda.time.DurationField durationField19 = islamicChronology17.hours();
        java.lang.String str20 = islamicChronology17.toString();
        org.joda.time.DurationField durationField21 = islamicChronology17.months();
        int int22 = islamicChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        long long26 = islamicChronology17.add(readablePeriod23, (long) 0, (int) '4');
        org.joda.time.Chronology chronology27 = islamicChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField28 = islamicChronology17.hourOfHalfday();
        boolean boolean29 = islamicChronology0.equals((java.lang.Object) dateTimeField28);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "IslamicChronology[UTC]" + "'", str20, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray21 = new int[] { ' ', '#', (short) 100, 3840000, 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial14, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 187203139L + "'", long9 == 187203139L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[32, 35, 100, 3840000, 1, 10]");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, 3600000001L, (int) (short) 10);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.set(readablePartial12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000001L + "'", long11 == 3600000001L);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.secondOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone10 = islamicChronology3.getZone();
        long long13 = dateTimeZone10.convertLocalToUTC((-2044528502394613L), false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-2044528502394613L) + "'", long13 == (-2044528502394613L));
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod6, (-4888702990L), (-21539900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        long long4 = dateTimeZone1.nextTransition((-41571691200001L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-41571691200001L) + "'", long4 == (-41571691200001L));
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, (-4884862990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = islamicChronology3.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology3.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray19 = new int[] { ' ', (short) 0, (byte) -1, (byte) -1, 36000000, 36000000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial12, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 0, -1, -1, 36000000, 36000000]");
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(99L, (int) 'a', 3840000, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
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
        org.joda.time.DurationField durationField22 = islamicChronology3.years();
        // The following exception was thrown during execution in test generation
        try {
            long long27 = islamicChronology3.getDateTimeMillis(3840000, (int) (short) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(islamicChronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getOffsetFromLocal(32L);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime7 = null;
        boolean boolean8 = dateTimeZone1.isLocalDateTimeGap(localDateTime7);
        long long11 = dateTimeZone1.convertLocalToUTC(32L, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekOfWeekyear();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod12, 0L, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        java.lang.Object obj8 = null;
        boolean boolean9 = islamicChronology0.equals(obj8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((long) 4200000, 10, 187200000, 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray17 = new int[] { 36000000, (-1), '#', (byte) 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial11, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[36000000, -1, 35, 0, 0]");
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, (-41571691200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField14 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone0.isLocalDateTimeGap(localDateTime4);
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = dateTimeZone0.getOffset(readableInstant6);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
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
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType19 = islamicChronology16.getLeapYearPatternType();
        org.joda.time.DurationField durationField20 = islamicChronology16.weekyears();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "UTC" + "'", str6, "UTC");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(leapYearPatternType15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(leapYearPatternType19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.hourOfDay();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField12 = islamicChronology0.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
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
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.secondOfMinute();
        java.lang.String str13 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray19 = new int[] { (short) 1, 4, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial15, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IslamicChronology[UTC]" + "'", str13, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 4, 10]");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, (-42245279999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getName((long) (short) -1, locale7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        long long13 = dateTimeZone5.convertLocalToUTC(0L, false, (long) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+00:00" + "'", str8, "+00:00");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        long long14 = islamicChronology0.add(10L, (long) (short) -1, (int) (short) 10);
        org.joda.time.DurationField durationField15 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray18 = new int[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial16, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = dateTimeZone1.getOffset(readableInstant3);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-35999900L), locale6);
        java.lang.String str9 = dateTimeZone1.getShortName(99L);
        boolean boolean10 = dateTimeZone1.isFixed();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) (-1), (int) (short) 0);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod11, (long) 115200000, (-51838899900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }
}
