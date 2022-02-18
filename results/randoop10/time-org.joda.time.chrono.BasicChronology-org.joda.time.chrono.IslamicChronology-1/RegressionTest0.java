import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        java.lang.Class<?> wildcardClass2 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = islamicChronology0.set(readablePartial1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.getDateTimeMillis((int) '#', 100, 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = islamicChronology0.set(readablePartial2, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = org.joda.time.chrono.IslamicChronology.AH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        java.lang.Class<?> wildcardClass4 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = islamicChronology0.get(readablePeriod3, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((long) (byte) 10, (int) (short) 0, (int) (byte) 100, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, (long) 0);
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology3.get(readablePeriod6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis((int) (byte) 100, (-1), 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis((int) (byte) -1, (int) (short) 100, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology3.get(readablePeriod7, 1819L, (long) (byte) 10);
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
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.ReadablePartial readablePartial2 = null;
        int[] intArray9 = new int[] { ' ', (byte) 1, '#', (short) 100, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial2, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 1, 35, 100, -1, -1]");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.getDateTimeMillis((int) '4', 0, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (long) (short) 100);
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
            long long13 = islamicChronology0.getDateTimeMillis(0, 100, (-1), 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = chronology2.yearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) '#', (int) (short) 100, (int) (byte) -1, 0, (int) (short) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[Etc/UTC]" + "'", str1, "IslamicChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(3L, (int) (byte) 1, (-1), (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
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
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.getDateTimeMillis((int) (byte) 0, 36000000, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePartial4, (long) (byte) 100);
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
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, 10L);
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
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 10, 36000000, (int) (byte) 10, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, (-35999900L));
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
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = islamicChronology0.set(readablePartial3, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology3.get(readablePartial6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, (long) 100);
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
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology3.set(readablePartial6, 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(4, (int) (byte) 100, 10, (int) (byte) 100, 0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology3.get(readablePartial9, (long) (byte) 0);
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
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(36000000, (int) (byte) 10, (int) (short) 0, (int) (short) 0, (int) (byte) 1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
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
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray5 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial4, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial9, intArray10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology2.getDateTimeMillis((int) '4', 4, (-1), 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod6, (-80689900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (short) 10, (int) (byte) 10, (int) (byte) 0, 10);
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
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology3.get(readablePeriod6, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.centuries();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, 1819L);
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
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) (short) 0, 0, 4, 100, 0, 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((int) (short) 100, 1, 4, 36000000, (int) (byte) 0, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        java.lang.String str4 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((long) (short) -1, 0, (int) (short) 100, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IslamicChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IslamicChronology[Etc/UTC]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, (long) 4);
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
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePeriod3, 1L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray13 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial12, intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[]");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = islamicChronology0.get(readablePeriod3, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray11 = new int[] { (short) 100, (short) 1, (byte) 0, 4, 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 0, 4, 1, 0]");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(0, (int) (byte) 1, (int) ' ', 0, 0, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long4 = islamicChronology0.set(readablePartial2, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        long long9 = dateTimeZone6.getMillisKeepLocal(dateTimeZone7, (long) (byte) -1);
        org.joda.time.Chronology chronology10 = islamicChronology3.withZone(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology3.getDateTimeMillis((int) (byte) 1, (int) (byte) 1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,30]");
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
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, 3600000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, (long) 4, (long) (short) -1);
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
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((-1), (int) '#', (int) (short) 10, (int) (short) 10, (int) (short) 0, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        long long6 = islamicChronology0.add((long) 10, (long) 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(0, 100, (int) (short) 1, (int) (short) 1, (int) (byte) 1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
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
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod5, (long) (short) 0, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IslamicChronology[UTC]" + "'", str3, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (short) -1, 100, (int) (short) 100, (int) (short) 1, (int) (short) 0, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
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
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod5, (long) '#');
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
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis(4, (int) '#', (int) (short) 100, (int) (short) 10, 1, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
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
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
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
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((int) (byte) -1, (int) (short) 1, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
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
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
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
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, 3600000001L);
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
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        java.lang.String str5 = dateTimeZone1.getShortName((-35999999L));
        long long7 = dateTimeZone1.nextTransition(1L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.getDateTimeMillis(3600000001L, (int) 'a', 1, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField5 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, (long) (byte) 100);
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
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        java.lang.Class<?> wildcardClass7 = durationField6.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray7 = new int[] { (-1), (short) 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial3, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 10]");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology3.get(readablePartial6, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod4, 100L, (long) 10);
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
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DurationField durationField4 = islamicChronology0.eras();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod5, (long) 4, (-35999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
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
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) (short) 1, (int) (short) 10, 36000000, (int) '#', 4, (int) '#', (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
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
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
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
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, (long) (short) -1);
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
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 0L);
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
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology10 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(0, 1, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
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
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology3.getDateTimeMillis((int) 'a', 0, (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.set(readablePartial8, 3L);
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
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) 36000000, (int) (short) 1);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.set(readablePartial12, (long) '4');
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        java.lang.Class<?> wildcardClass3 = dateTimeField2.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology3.get(readablePeriod9, 0L);
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
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((long) 36000000, 0, (int) (byte) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray13 = new int[] { (short) 10, (-1), (byte) 10, ' ', 4, 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial6, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, -1, 10, 32, 4, 100]");
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-1), (int) (short) 10, (int) (byte) 0, (int) 'a', 1, 100, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = islamicChronology0.add(readablePeriod4, 1819L, (int) 'a');
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1819L + "'", long7 == 1819L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, (long) 4);
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
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(1010L, (int) ' ', (int) (byte) 10, 4, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((long) 10, locale4);
        java.lang.String str7 = dateTimeZone1.getName((long) (short) -1);
        java.lang.String str8 = dateTimeZone1.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(0, (int) ' ', (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) 'a', 0, (int) 'a', 36000000, (int) ' ', 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) '#', (int) 'a', (int) (short) 100, (int) (short) 10, (int) ' ', (int) (byte) 100, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
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
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray12 = new int[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial10, intArray12);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100]");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.getDateTimeMillis(0, 0, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((long) 4, 100, 1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IslamicChronology[UTC]" + "'", str3, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((-1), 100, (int) (short) 10, (int) ' ', 0, 1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) ' ', (int) (short) 100, 0, (-1), 0, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
            long long14 = islamicChronology0.getDateTimeMillis((long) (byte) 100, (int) (byte) 100, 1, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (long) 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (long) 'a');
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
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(4, (-1), (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, (long) 4);
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
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = chronology2.getDateTimeMillis(32L, (int) (byte) 100, (-1), 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray16 = new int[] { (byte) 0, (byte) 0, (short) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial11, intArray16);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000001L + "'", long10 == 3600000001L);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 0, -1, 35]");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        int int5 = dateTimeZone1.getStandardOffset(10L);
        int int7 = dateTimeZone1.getOffset((-35999900L));
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType8);
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.weekyear();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology9.get(readablePartial12, (long) (byte) 1);
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
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(3L, (int) '#', (int) (byte) 10, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, 36000000L);
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
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (long) 'a');
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
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) '#', (int) (byte) 0, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((long) ' ', (int) (byte) -1, 10, 1, (int) (short) 0);
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
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        long long13 = islamicChronology3.add(187203139L, 1010L, (int) '#');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 187238489L + "'", long13 == 187238489L);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePeriod4, 132L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) '#', (-1), 1, 4, (int) ' ', (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        java.lang.String str8 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (short) 100, (int) (byte) 1, (int) (byte) 0, 100, (int) (short) 0, 1, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DurationField durationField8 = islamicChronology3.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis((-1L), (int) (short) 0, 10, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
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
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, 100L);
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
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        long long8 = dateTimeZone2.previousTransition((long) (-1));
        java.lang.Class<?> wildcardClass9 = dateTimeZone2.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis((int) (short) -1, (int) (byte) 1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis(3600000001L, (-1), (int) (short) 0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
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
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, (long) (short) 10);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.weekyearOfCentury();
        java.lang.Class<?> wildcardClass6 = chronology4.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((-35999900L), (int) (short) 100, (int) (short) 1, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        java.lang.Class<?> wildcardClass6 = dateTimeField5.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (byte) 100, 36000000, 0, 100, (int) (short) 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.year();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, (-84478968L));
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
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray10 = new int[] { ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial7, intArray10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 35]");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod5, 0L);
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
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(100, (int) (short) 0, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(1, (int) (byte) 100, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis(10L, 0, (int) 'a', (int) ' ', 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType5 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((long) (short) 100, (int) (short) -1, 4, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(leapYearPatternType5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod6, (long) '#');
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
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IslamicChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IslamicChronology[UTC]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean6 = dateTimeZone4.isFixed();
        java.lang.String str7 = dateTimeZone4.getID();
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone4);
        java.lang.String str9 = dateTimeZone4.toString();
        java.lang.Class<?> wildcardClass10 = dateTimeZone4.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DurationField durationField2 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, 1010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (short) 100, 0, 4, (int) (short) 10, (int) (short) 100, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((long) (byte) 10, 36000000, (int) (short) 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.year();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis(4, 0, (int) (short) 1, (int) (short) 10, (int) (byte) 100, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
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
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (long) (short) 1);
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
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.weeks();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray15 = new int[] { (-1), (byte) 100, 100, (short) 1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial9, intArray15);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 100, 100, 1, 100]");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, (long) 100, (long) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
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
        java.lang.String str16 = islamicChronology15.toString();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IslamicChronology[UTC]" + "'", str16, "IslamicChronology[UTC]");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology3.getDateTimeMillis((int) '4', (int) (byte) -1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePartial14, (long) (short) -1);
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
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460099L + "'", long11 == 14460099L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField9 = islamicChronology0.months();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, (-440688868L));
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
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
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
        // The following exception was thrown during execution in test generation
        try {
            long long22 = islamicChronology0.getDateTimeMillis(0L, 1, 0, (int) (short) -1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str10 = dateTimeZone9.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology11 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone9);
        long long14 = dateTimeZone9.convertLocalToUTC(1819L, true);
        org.joda.time.Chronology chronology15 = islamicChronology0.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField16 = chronology15.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTC" + "'", str10, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1819L + "'", long14 == 1819L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
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
        int int19 = dateTimeZone1.getOffsetFromLocal(14460100L);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.IslamicChronology islamicChronology21 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, (long) (short) 10);
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
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((long) (short) 1, (int) (short) -1, (int) (byte) 1, 1, (int) '4');
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
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.getDateTimeMillis((int) '#', (int) (byte) -1, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        long long11 = islamicChronology3.add((long) (byte) 10, (long) (short) 10, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.secondOfDay();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray19 = new int[] { 10, 100, ' ', 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial13, intArray19);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 32, 100, 0]");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology3.getDateTimeMillis((int) '4', (int) (byte) 100, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray11 = new int[] { '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray11);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 0]");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.era();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((-11L), (int) (short) 100, (int) 'a', (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.weeks();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.yearOfEra();
        org.joda.time.DurationField durationField10 = islamicChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology7.year();
        org.joda.time.DurationField durationField12 = islamicChronology7.seconds();
        boolean boolean13 = dateTimeZone3.equals((java.lang.Object) islamicChronology7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology7.get(readablePeriod14, 187238489L, (long) '#');
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, (-1L));
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
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((long) 'a', (int) (short) 100, (int) (short) 0, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) 1);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray13 = new int[] { 10, 0, (byte) 10, 10, 1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial7, intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[10, 0, 10, 10, 1]");
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology3.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.getDateTimeMillis((int) '#', 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
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
        java.util.Locale locale16 = null;
        java.lang.String str17 = dateTimeZone5.getName((long) (short) 1, locale16);
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
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) (short) 100, 0, (int) (short) 0, (int) (short) 0, 0, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
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
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 1);
        java.lang.String str3 = dateTimeZone1.getName((long) (byte) -1);
        java.lang.String str4 = dateTimeZone1.toString();
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getName((-35999900L), locale6);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "+00:00:00.001" + "'", str3, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00:00.001" + "'", str4, "+00:00:00.001");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00:00.001" + "'", str7, "+00:00:00.001");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (long) (short) -1);
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
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        int int3 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray7 = new int[] { (short) 1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial4, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[1, 97]");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        int int3 = islamicChronology0.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) (byte) -1, (int) (byte) 100, (int) (byte) 0, (int) '4', 1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology3.add(readablePeriod7, (-440688868L), (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-440688868L) + "'", long10 == (-440688868L));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (short) 100, (int) '4', 10, (int) ' ', 10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IslamicChronology[UTC]" + "'", str3, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) '4', (int) (short) 10, (int) (byte) -1, (int) ' ', (int) ' ', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
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
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) ' ', (int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 1010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 32L + "'", long6 == 32L);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, 187238489L);
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis((int) (short) 0, (int) '#', 1, (int) '#', 115200000, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = chronology2.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology2.get(readablePeriod6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, (long) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((long) 100, 10, 10, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = chronology2.get(readablePartial3, (-80689900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
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
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = islamicChronology3.get(readablePeriod14, 3L, (long) (short) 100);
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
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
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
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = islamicChronology0.get(readablePartial17, (-440688900L));
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
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) 'a', (-1), (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod5, 132L, (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getShortName((long) 10, locale4);
        java.lang.String str7 = dateTimeZone1.getName((long) (short) -1);
        int int9 = dateTimeZone1.getOffset(3600000001L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) ' ', (-1), (int) (short) 10, 100, 4, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
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
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis((int) (short) 100, (int) (byte) 100, (int) (short) 100, 0, 10, (int) (short) 10, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod6, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (byte) -1, (-1), (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
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
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
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
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology16.secondOfMinute();
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
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) (byte) 1, 36000000, 1, (int) (byte) 100, (int) '4', 1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) '#', (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(10100L, 4, (-1), (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePartial5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, (long) (short) 1);
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
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
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
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = islamicChronology0.get(readablePeriod17, (-80689901L), 0L);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-84478968L) + "'", long11 == (-84478968L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 36000000L + "'", long15 == 36000000L);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        long long10 = islamicChronology0.add((-440688900L), 10L, 0);
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.set(readablePartial11, (long) (short) 0);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-440688900L) + "'", long10 == (-440688900L));
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(100, 115200000, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for monthOfYear must be in the range [1,12]");
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
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = islamicChronology0.get(readablePartial21, (long) 1);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-440688868L) + "'", long19 == (-440688868L));
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePeriod9, 11L, (-518398999L));
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
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
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology15.getDateTimeMillis((long) ' ', 10, 0, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        long long11 = islamicChronology0.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        long long21 = dateTimeZone18.getMillisKeepLocal(dateTimeZone19, (long) (byte) -1);
        org.joda.time.Chronology chronology22 = islamicChronology15.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField23 = islamicChronology15.minutes();
        long long27 = islamicChronology15.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField28 = islamicChronology15.millis();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology30 = islamicChronology0.withZone(dateTimeZone29);
        org.joda.time.ReadablePartial readablePartial31 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long33 = islamicChronology0.set(readablePartial31, (-11L));
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10100L + "'", long11 == 10100L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 36324000035L + "'", long27 == 36324000035L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DurationField durationField12 = islamicChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod13, 132L, 32L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(0, 10, (int) (short) 10, (int) (byte) 100, 36000000, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((-50399000L), (int) (byte) -1, (int) (byte) 1, (int) '4', (int) (byte) 10);
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
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod13, (long) 10);
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
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) (byte) -1, 115200000, (int) '#', 115200000, (int) (short) 10, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
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
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone15.getName((long) 10, locale18);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePartial6, 36000000L);
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
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(187200035L, (int) (byte) 100, (int) (byte) 0, 115200000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod7, 52L, (long) (short) 1);
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
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.months();
        java.lang.Class<?> wildcardClass5 = durationField4.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
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
        org.joda.time.DurationField durationField12 = islamicChronology0.millis();
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
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        int int7 = dateTimeZone5.getOffsetFromLocal((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        long long4 = dateTimeZone1.nextTransition(3L);
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone1.getShortName((-84478968L), locale6);
        long long10 = dateTimeZone1.convertLocalToUTC((long) 10, false);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 3L + "'", long4 == 3L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.secondOfMinute();
        org.joda.time.DurationField durationField11 = islamicChronology0.weeks();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.set(readablePartial12, (-440688868L));
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        int int9 = dateTimeZone1.getOffsetFromLocal(187203139L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
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
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfHalfday();
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
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(36000000, (int) (byte) 0, 0, (int) '#', (int) (short) 1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
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
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) '#', (-1));
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 35L + "'", long8 == 35L);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = islamicChronology0.add(readablePeriod3, (long) (byte) 100, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.era();
        org.joda.time.DurationField durationField8 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.year();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray8 = new int[] { (short) -1, (-1), 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial4, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, -1, 10]");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = islamicChronology0.set(readablePartial3, 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.set(readablePartial5, 10L);
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
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = islamicChronology0.getDateTimeMillis((int) (short) -1, (int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        java.lang.String str4 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IslamicChronology[UTC]" + "'", str4, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (byte) 100, (int) (byte) 1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.set(readablePartial11, (-50399000L));
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
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology0.get(readablePeriod12, 32L, (-3599990001L));
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
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
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = islamicChronology0.get(readablePeriod2, (-440688868L), (-84478968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
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
        org.joda.time.DateTimeField dateTimeField20 = chronology19.minuteOfDay();
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
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str7 = dateTimeZone1.getName(14460100L);
        long long9 = dateTimeZone1.nextTransition((-35999999L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-35999999L) + "'", long9 == (-35999999L));
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField10 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int4 = dateTimeZone2.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = dateTimeZone2.getOffset(readableInstant5);
        long long8 = dateTimeZone2.previousTransition((long) (-1));
        long long10 = dateTimeZone2.nextTransition(36000000L);
        int int12 = dateTimeZone2.getOffset((-40936320000000L));
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36000000 + "'", int6 == 36000000);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology3.get(readablePeriod11, 42406761605287L);
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
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
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
        java.lang.String str11 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray19 = new int[] { ' ', ' ', (short) 1, (byte) 0, 4, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial12, intArray19);
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
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[UTC]" + "'", str11, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32, 32, 1, 0, 4, 97]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology3.getDateTimeMillis((int) (byte) -1, (int) (byte) 10, (int) (short) 10, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (byte) 10, 0, 4, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
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
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfHour();
        org.joda.time.DurationField durationField6 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, 36000000L);
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
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
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
        org.joda.time.DurationField durationField12 = islamicChronology3.eras();
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
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology3.get(readablePeriod8, 0L);
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
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField14 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.yearOfEra();
        java.lang.Class<?> wildcardClass17 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689900L) + "'", long11 == (-80689900L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
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
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone12.getShortName((long) 10, locale15);
        java.lang.String str18 = dateTimeZone12.getName((long) (short) -1);
        org.joda.time.Chronology chronology19 = islamicChronology0.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = islamicChronology0.getDateTimeMillis((-41571691199999L), 0, (int) (short) 1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        org.joda.time.chrono.IslamicChronology islamicChronology6 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField7 = islamicChronology6.weeks();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology6.yearOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology6.weekyears();
        org.joda.time.DurationField durationField10 = islamicChronology6.weeks();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = islamicChronology6.add(readablePeriod11, 3L, (int) (byte) 100);
        org.joda.time.DurationField durationField15 = islamicChronology6.months();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology6.secondOfMinute();
        org.joda.time.DurationField durationField17 = islamicChronology6.hours();
        boolean boolean18 = dateTimeZone1.equals((java.lang.Object) islamicChronology6);
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long21 = islamicChronology6.set(readablePartial19, 1010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(islamicChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
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
            long long14 = islamicChronology0.set(readablePartial12, 0L);
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
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        long long7 = islamicChronology0.add((long) 'a', (long) '#', (int) (byte) 1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 132L + "'", long7 == 132L);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 475260000L);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.dayOfWeek();
        java.lang.Class<?> wildcardClass9 = islamicChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis((-440688868L), 100, 10, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePeriod3, (-518398999L), (-41571691200000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) 'a', (int) (byte) 10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
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
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(99L, (int) 'a', (-1), 3840000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
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
            long long13 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) 'a', (int) (byte) 0, (int) (short) 10);
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
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeZone dateTimeZone4 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        long long7 = dateTimeZone4.previousTransition((long) 0);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod5, (-84478968L), 187238489L);
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
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.010' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.Chronology chronology7 = chronology6.withUTC();
        java.lang.String str8 = chronology6.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[UTC]" + "'", str8, "IslamicChronology[UTC]");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
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
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray16 = new int[] { (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial14, intArray16);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.eras();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
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
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, 0L);
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis(3840000, (int) (byte) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePartial8, 14460100L);
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
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(3840000, (int) (byte) 0, 3840000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
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
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, 4L);
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
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology3.getDateTimeMillis((long) 36000000, (int) (short) 1, (int) (short) 1, 115200000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for secondOfMinute must be in the range [0,59]");
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
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        org.joda.time.LocalDateTime localDateTime3 = null;
        boolean boolean4 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime localDateTime5 = null;
        boolean boolean6 = dateTimeZone2.isLocalDateTimeGap(localDateTime5);
        long long9 = dateTimeZone2.adjustOffset(0L, true);
        int int11 = dateTimeZone2.getOffset((long) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36000000 + "'", int11 == 36000000);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.yearOfCentury();
        java.lang.String str7 = islamicChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField8 = islamicChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, 475260000L);
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
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        int int12 = dateTimeZone8.getStandardOffset(10L);
        int int14 = dateTimeZone8.getOffset((-35999900L));
        java.lang.String str16 = dateTimeZone8.getName((long) 0);
        java.lang.String str17 = dateTimeZone8.toString();
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone8);
        org.joda.time.DurationField durationField19 = chronology18.weekyears();
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray24 = new int[] { (byte) 1, (byte) 100, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology18.validate(readablePartial20, intArray24);
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 100, 1]");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology3.get(readablePartial5, (-41571691200000L));
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
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("IslamicChronology[+00:00:00.001]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'IslamicChronology[+00:00:00.001]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) (short) 10, 3840000, (int) 'a', (int) (byte) 1, 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology0.getDateTimeMillis((int) (short) 100, 0, (int) (short) 10, (int) '#', (int) '#', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (-476688868L));
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
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
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
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
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
        org.joda.time.DurationField durationField11 = islamicChronology0.years();
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
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.add(38100000L, (-41554321066532L), 115200000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -41554321066532 * 115200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType8 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.Chronology chronology9 = islamicChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod10, 1L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(leapYearPatternType8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.era();
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
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField5 = islamicChronology0.centuries();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = islamicChronology0.get(readablePeriod6, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.millis();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 38100000L);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) ' ', 100);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DurationField durationField8 = islamicChronology3.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology3.getDateTimeMillis(100, 36000000, (int) (short) 10, (int) (short) 0, (int) '4', (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.centuries();
        org.joda.time.DurationField durationField7 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField10 = islamicChronology0.millis();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod11, (-84472104L), 115200000L);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, (-880789680L));
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
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = islamicChronology0.get(readablePeriod3, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField8 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.set(readablePartial9, (-80689901L));
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
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology13 = islamicChronology5.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone10);
        java.lang.String str16 = dateTimeZone10.getName((long) 3840000);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str5 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(187203139L, (int) (byte) 0, (int) (byte) 0, 4, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[UTC]" + "'", str5, "IslamicChronology[UTC]");
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod6, 32L, (-3599990001L));
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
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (-3599990001L));
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
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.halfdayOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str5 = dateTimeZone4.toString();
        boolean boolean7 = dateTimeZone4.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone8 = dateTimeZone4.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        long long13 = dateTimeZone10.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long19 = dateTimeZone16.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str20 = dateTimeZone16.getID();
        boolean boolean22 = dateTimeZone16.isStandardOffset(187200035L);
        int int24 = dateTimeZone16.getOffset((long) (short) 1);
        boolean boolean25 = dateTimeZone10.equals((java.lang.Object) (short) 1);
        boolean boolean26 = dateTimeZone2.equals((java.lang.Object) boolean25);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999999L) + "'", long19 == (-35999999L));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+10:00" + "'", str20, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 36000000 + "'", int24 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.set(readablePartial5, (long) 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long8 = dateTimeZone6.nextTransition((long) 36000000);
        java.lang.Object obj9 = null;
        boolean boolean10 = dateTimeZone6.equals(obj9);
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone6.getShortName((long) '#', locale12);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36000000L + "'", long8 == 36000000L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = islamicChronology0.days();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, 5297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((long) (short) 100, (int) (short) 1, (int) (byte) 100, 3840000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray11 = new int[] { 3840000, 36000000, ' ', (short) 0, 1, 36000000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[3840000, 36000000, 32, 0, 1, 36000000]");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.getDateTimeMillis((-1), (int) (short) -1, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePartial11, 14460100L);
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
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray13 = new int[] { '#', (byte) 0, 36000000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial9, intArray13);
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[35, 0, 36000000]");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology3.get(readablePeriod8, 359999989L);
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
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        int int3 = islamicChronology0.getMinimumDaysInFirstWeek();
        long long8 = islamicChronology0.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (int) '#');
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField10 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str15 = dateTimeZone14.toString();
        org.joda.time.Chronology chronology16 = islamicChronology9.withZone(dateTimeZone14);
        int int18 = dateTimeZone14.getOffset(1L);
        long long21 = dateTimeZone14.adjustOffset((long) (short) 1, false);
        int int23 = dateTimeZone14.getStandardOffset(32L);
        org.joda.time.Chronology chronology24 = islamicChronology0.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = chronology24.get(readablePeriod25, 475260000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-41572483199965L) + "'", long8 == (-41572483199965L));
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "UTC" + "'", str15, "UTC");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21 == 1L);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        java.lang.Class<?> wildcardClass8 = dateTimeZone7.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.001");
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+00:00:00.001' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, 475260000L);
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
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField10 = islamicChronology3.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
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
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology3.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = islamicChronology3.get(readablePartial20, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DurationField durationField10 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.dayOfMonth();
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
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology3.hours();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.era();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.getDateTimeMillis((int) '#', 100, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
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
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis(115200000, 36000000, 36000000, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
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
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        long long7 = dateTimeZone1.convertUTCToLocal(1010L);
        java.util.Locale locale9 = null;
        java.lang.String str10 = dateTimeZone1.getShortName(3600000001L, locale9);
        java.lang.String str11 = dateTimeZone1.toString();
        java.lang.String str13 = dateTimeZone1.getNameKey((-80689900L));
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1010L + "'", long7 == 1010L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTC" + "'", str11, "UTC");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.era();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePartial4, 36000000L);
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
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+00:00:00.010");
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
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
        org.joda.time.DateTimeField dateTimeField21 = islamicChronology0.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial22 = null;
        int[] intArray25 = new int[] { 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial22, intArray25);
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-440688868L) + "'", long19 == (-440688868L));
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 0]");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) (short) -1, 100, 100, (int) (byte) 0, (int) (byte) 0, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
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
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.set(readablePartial12, (-3599990001L));
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
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) -1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
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
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = islamicChronology0.get(readablePartial19, 1664L);
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1010L + "'", long14 == 1010L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) ' ', (int) (short) 10, 3840000, (int) (byte) 0, (int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, 359999989L);
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
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        long long11 = dateTimeZone8.adjustOffset(115200032L, true);
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 115200032L + "'", long11 == 115200032L);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfDay();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField9 = islamicChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(36000000, (int) ' ', (int) '4', 3840000);
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology3.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray20 = new int[] { (byte) 0, (short) 100, 1, (byte) -1, '4', '4' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial13, intArray20);
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
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000001L + "'", long10 == 3600000001L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, 100, 1, -1, 52, 52]");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePartial9, 1000L);
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
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (short) 1, (int) (byte) 10, 0, (int) (short) 1, 0, 36000000, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis(4, 0, 0, (int) '4', 3840000, 4, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology3.get(readablePeriod11, 35L);
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
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str8 = dateTimeZone7.toString();
        boolean boolean10 = dateTimeZone7.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        long long14 = dateTimeZone12.nextTransition((long) 36000000);
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeZone12.equals(obj15);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        long long20 = dateTimeZone12.adjustOffset((long) (byte) 100, true);
        org.joda.time.Chronology chronology21 = islamicChronology3.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology21.getDateTimeMillis((long) 10, 3840000, (int) '#', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 36000000L + "'", long14 == 36000000L);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray10 = new int[] { (byte) 0, 1, (byte) 10, (byte) 1, (byte) 100, 36000000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial3, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 10, 1, 100, 36000000]");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        int int4 = islamicChronology0.getMinimumDaysInFirstWeek();
        java.lang.String str5 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod8, (long) ' ', (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "IslamicChronology[UTC]" + "'", str5, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology5 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology5.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology5.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int12 = dateTimeZone10.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology13 = islamicChronology5.withZone(dateTimeZone10);
        org.joda.time.Chronology chronology14 = islamicChronology0.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.yearOfEra();
        java.lang.Class<?> wildcardClass16 = dateTimeField15.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(islamicChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36000000 + "'", int12 == 36000000);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
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
        java.lang.String str14 = dateTimeZone7.getName((-880789680L));
        int int16 = dateTimeZone7.getStandardOffset(11L);
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, (long) (byte) 1);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        long long7 = islamicChronology0.add((long) (short) 1, 0L, 4);
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField9 = islamicChronology8.weeks();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField11 = islamicChronology8.millis();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology8.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.halfdayOfDay();
        org.joda.time.DurationField durationField14 = islamicChronology8.centuries();
        org.joda.time.DurationField durationField15 = islamicChronology8.weeks();
        org.joda.time.DurationField durationField16 = islamicChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology8.hourOfHalfday();
        org.joda.time.DurationField durationField18 = islamicChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology8.dayOfMonth();
        boolean boolean20 = islamicChronology0.equals((java.lang.Object) islamicChronology8);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = islamicChronology0.get(readablePeriod21, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
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
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.dayOfMonth();
        org.joda.time.Chronology chronology12 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology12.getDateTimeMillis(36000000, (int) (byte) 10, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,29]");
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DurationField durationField2 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology0.getDateTimeMillis((int) '4', 0, 4, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((int) '4', 0, (int) (byte) 0, (int) (short) -1, 4, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.millis();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        int int8 = islamicChronology0.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(14460099L, (int) (byte) -1, 0, 36000000, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.monthOfYear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.set(readablePartial8, (-42406761599990L));
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
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        long long11 = islamicChronology0.getDateTimeMillis((-35999900L), 1, (int) '#', 10, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.yearOfCentury();
        org.joda.time.DurationField durationField13 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField14 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology0.yearOfEra();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray18 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial17, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str1, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-80689901L) + "'", long11 == (-80689901L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = islamicChronology0.get(readablePeriod2, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        long long7 = islamicChronology0.add(100L, (-1L), (int) 'a');
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) (short) 10, (int) (short) 0, 0, (int) (byte) 10, (int) (byte) 100, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str7 = dateTimeZone1.getName(14460100L);
        long long10 = dateTimeZone1.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType14);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = islamicChronology16.getDateTimeMillis((int) (byte) -1, (int) (short) 100, 4, 1, (int) ' ', (int) (byte) 1, 10);
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
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        java.lang.String str11 = islamicChronology0.toString();
        org.joda.time.DurationField durationField12 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis((int) ' ', 0, 4, (int) (short) 10, (int) (byte) -1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str1, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str11, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
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
            long long15 = islamicChronology0.set(readablePartial13, 14460101L);
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
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        long long7 = islamicChronology0.add((long) 'a', (long) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(0L, (int) (short) 1, (int) (short) -1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 132L + "'", long7 == 132L);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (long) (short) 1);
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
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((-1), 10, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
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
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod10, 115200000L, 475260000L);
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
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis(0, (int) (byte) 0, (int) (byte) 100, (int) '#', (int) 'a', 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
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
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
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
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology3.get(readablePeriod11, (long) 1, (-42406765439990L));
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
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) 'a', 100, (int) (byte) -1, (int) 'a', (int) ' ', (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType3);
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = islamicChronology4.set(readablePartial5, 14460101L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
        org.junit.Assert.assertNotNull(islamicChronology4);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
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
        org.joda.time.DurationField durationField15 = islamicChronology3.hours();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial16, intArray17);
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
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
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
        org.joda.time.DurationField durationField13 = chronology12.days();
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
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = islamicChronology0.get(readablePeriod9, (-3491990200L));
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
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.minuteOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField5 = islamicChronology0.halfdays();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, 0L);
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
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        org.joda.time.DurationField durationField8 = islamicChronology3.millis();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray13 = new int[] { (short) -1, '4', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial9, intArray13);
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 52, 100]");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        org.joda.time.DurationField durationField9 = islamicChronology3.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology3.getDateTimeMillis(115200000, 10, (int) (byte) 100, (int) (short) 10, 100, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518399000L) + "'", long11 == (-518399000L));
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray13 = new int[] { 36000000, 0, (short) -1, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial8, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[36000000, 0, -1, 97]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
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
            int[] intArray15 = islamicChronology0.get(readablePeriod12, (-1L), (-476688868L));
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
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField6 = islamicChronology3.months();
        org.joda.time.DurationField durationField7 = islamicChronology3.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) '#', 0, (int) ' ', 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for millisOfDay must be in the range [0,86399999]");
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
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) 1);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, (-324599000L));
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.ReadableInstant readableInstant4 = null;
        int int5 = dateTimeZone1.getOffset(readableInstant4);
        long long7 = dateTimeZone1.convertUTCToLocal(14460100L);
        long long9 = dateTimeZone1.nextTransition((long) (short) 100);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 14460100L + "'", long7 == 14460100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) '#', (int) (short) -1, (int) (byte) 0, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) (byte) 1, (int) (byte) 100, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
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
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-1), (int) (byte) 0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
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
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
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
        int int15 = dateTimeZone4.getStandardOffset((-880789680L));
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis(0, (int) (short) -1, (int) (short) 100, 36000000, (int) (short) 0, (int) ' ', 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone5.isLocalDateTimeGap(localDateTime9);
        long long13 = dateTimeZone5.convertLocalToUTC(3600000001L, false);
        java.lang.Class<?> wildcardClass14 = dateTimeZone5.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3564000001L + "'", long13 == 3564000001L);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = islamicChronology0.get(readablePeriod4, (-11L), (-1L));
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
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.set(readablePartial7, (long) 3840000);
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
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((long) 3840000, 10, (-1), (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        java.lang.Class<?> wildcardClass8 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((-1L), (int) (short) 10, (int) (short) 0, 3840000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for secondOfMinute must be in the range [0,59]");
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
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) (byte) 100, (int) ' ', 0, (int) (short) 0, 0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.years();
        org.joda.time.DurationField durationField8 = islamicChronology3.years();
        org.joda.time.DurationField durationField9 = islamicChronology3.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology3.getDateTimeMillis((int) (byte) -1, (int) (byte) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
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
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod13, 38100000L, (-440688868L));
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
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        java.lang.String str7 = islamicChronology0.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(187200000, 100, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IslamicChronology[UTC]" + "'", str1, "IslamicChronology[UTC]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 1819L + "'", long5 == 1819L);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IslamicChronology[UTC]" + "'", str7, "IslamicChronology[UTC]");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(100, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekyear();
        java.lang.Class<?> wildcardClass11 = islamicChronology0.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField10 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePartial12, (-41571691200000L));
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.secondOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.years();
        org.joda.time.DurationField durationField7 = islamicChronology0.seconds();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = islamicChronology0.get(readablePeriod8, 0L);
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
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(115200000, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
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
        long long15 = islamicChronology0.getDateTimeMillis((-80689901L), (int) (byte) 10, (int) (short) 0, 1, (int) (byte) 0);
        org.joda.time.DurationField durationField16 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField17 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField18 = islamicChronology0.weekOfWeekyear();
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
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-50399000L) + "'", long15 == (-50399000L));
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
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
        org.joda.time.Chronology chronology13 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology13.getDateTimeMillis(0, (int) (byte) 0, 1, (int) (byte) 10, (int) (byte) -1, (int) (byte) 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType7 = islamicChronology0.getLeapYearPatternType();
        java.lang.String str8 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.minuteOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, (-84472104L));
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
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "IslamicChronology[+00:00:00.001]" + "'", str8, "IslamicChronology[+00:00:00.001]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) ' ', 10);
        long long4 = dateTimeZone2.convertUTCToLocal(14460099L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 130260099L + "'", long4 == 130260099L);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray18 = new int[] { 100, (byte) -1, (short) 1, ' ', 187200000 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology0.validate(readablePartial12, intArray18);
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
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[100, -1, 1, 32, 187200000]");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology0.millis();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.halfdays();
        long long11 = islamicChronology0.add(0L, 1010L, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str14 = dateTimeZone13.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology15.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.getDefault();
        long long21 = dateTimeZone18.getMillisKeepLocal(dateTimeZone19, (long) (byte) -1);
        org.joda.time.Chronology chronology22 = islamicChronology15.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField23 = islamicChronology15.minutes();
        long long27 = islamicChronology15.add((-35999965L), 1010L, 36000000);
        org.joda.time.DurationField durationField28 = islamicChronology15.millis();
        org.joda.time.DateTimeZone dateTimeZone29 = islamicChronology15.getZone();
        org.joda.time.Chronology chronology30 = islamicChronology0.withZone(dateTimeZone29);
        org.joda.time.chrono.IslamicChronology islamicChronology31 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField32 = islamicChronology31.weeks();
        org.joda.time.DateTimeField dateTimeField33 = islamicChronology31.yearOfEra();
        org.joda.time.DurationField durationField34 = islamicChronology31.weekyears();
        org.joda.time.DateTimeField dateTimeField35 = islamicChronology31.era();
        org.joda.time.DurationField durationField36 = islamicChronology31.seconds();
        org.joda.time.DateTimeZone dateTimeZone37 = islamicChronology31.getZone();
        org.joda.time.DurationField durationField38 = islamicChronology31.minutes();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int43 = dateTimeZone41.getStandardOffset((long) (short) 100);
        org.joda.time.ReadableInstant readableInstant44 = null;
        int int45 = dateTimeZone41.getOffset(readableInstant44);
        long long47 = dateTimeZone41.previousTransition((long) (-1));
        long long49 = dateTimeZone41.nextTransition(36000000L);
        org.joda.time.Chronology chronology50 = islamicChronology31.withZone(dateTimeZone41);
        org.joda.time.Chronology chronology51 = islamicChronology0.withZone(dateTimeZone41);
        org.joda.time.ReadablePartial readablePartial52 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long54 = islamicChronology0.set(readablePartial52, (-440688868L));
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10100L + "'", long11 == 10100L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "UTC" + "'", str14, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 36324000035L + "'", long27 == 36324000035L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(islamicChronology31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 36000000 + "'", int43 == 36000000);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 36000000 + "'", int45 == 36000000);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 36000000L + "'", long49 == 36000000L);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long10 = dateTimeZone7.adjustOffset((long) '4', true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        long long16 = dateTimeZone13.convertLocalToUTC((long) (byte) 1, true);
        java.lang.String str17 = dateTimeZone13.getID();
        boolean boolean19 = dateTimeZone13.isStandardOffset(187200035L);
        int int21 = dateTimeZone13.getOffset((long) (short) 1);
        boolean boolean22 = dateTimeZone7.equals((java.lang.Object) (short) 1);
        long long26 = dateTimeZone7.convertLocalToUTC((long) 1, true, (long) (byte) 0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999999L) + "'", long16 == (-35999999L));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+10:00" + "'", str17, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36000000 + "'", int21 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, (long) 10, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = islamicChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(36000000, (int) '#', 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
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
            int[] intArray22 = chronology19.get(readablePartial20, 1664L);
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
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = islamicChronology0.get(readablePartial10, 42406761605287L);
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.hourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology3.set(readablePartial8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfMonth();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType4 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        java.lang.String str6 = islamicChronology0.toString();
        org.joda.time.DurationField durationField7 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(leapYearPatternType4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "IslamicChronology[UTC]" + "'", str6, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = islamicChronology0.add(readablePeriod8, (long) 36000000, (int) (short) 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.months();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = islamicChronology0.getDateTimeMillis(0, (int) (byte) -1, (int) (short) 1, 100);
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
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 36000000L + "'", long11 == 36000000L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField4 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology7 = islamicChronology0.withUTC();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.hourOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray10 = new int[] { 115200000, 0 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial7, intArray10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[115200000, 0]");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
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
        long long19 = dateTimeZone7.convertLocalToUTC((-440688868L), false, (-41571691199999L));
        java.lang.Class<?> wildcardClass20 = dateTimeZone7.getClass();
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
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-476688868L) + "'", long19 == (-476688868L));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = islamicChronology0.set(readablePartial8, 187238489L);
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
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
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
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology3.centuryOfEra();
        java.lang.Class<?> wildcardClass17 = dateTimeField16.getClass();
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
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField8 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (long) ' ', 36000000);
        org.joda.time.DurationField durationField10 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = islamicChronology0.getDateTimeMillis((-1), (-1), 1, 187200000, 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for hourOfDay must be in the range [0,23]");
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
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = islamicChronology0.eras();
        java.lang.String str3 = islamicChronology0.toString();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = islamicChronology0.set(readablePartial4, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IslamicChronology[UTC]" + "'", str3, "IslamicChronology[UTC]");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
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
        org.joda.time.DurationField durationField10 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.clockhourOfDay();
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
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePeriod4, (-35999900L));
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
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis(187200000, 4, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.hourOfDay();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        java.lang.String str9 = dateTimeZone7.getName(1010L);
        boolean boolean11 = dateTimeZone7.isStandardOffset((-41571691200000L));
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = islamicChronology0.get(readablePeriod13, (-42406765439990L), 132L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+52:00" + "'", str9, "+52:00");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.set(readablePartial6, 115200000L);
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
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.centuryOfEra();
        org.joda.time.DurationField durationField9 = islamicChronology0.eras();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.centuryOfEra();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = islamicChronology0.getDateTimeMillis((-41571691200001L), (int) (short) 1, (int) (byte) 100, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfEra();
        org.joda.time.DurationField durationField5 = islamicChronology3.weekyears();
        org.joda.time.DurationField durationField6 = islamicChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology3.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology3.getDateTimeMillis(0, 36000000, 115200000, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology8.dayOfYear();
        org.joda.time.DurationField durationField11 = islamicChronology8.minutes();
        org.joda.time.DurationField durationField12 = islamicChronology8.halfdays();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology8.yearOfEra();
        org.joda.time.DurationField durationField16 = islamicChronology8.seconds();
        org.joda.time.DurationField durationField17 = islamicChronology8.halfdays();
        org.joda.time.chrono.IslamicChronology islamicChronology18 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField19 = islamicChronology18.weeks();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology18.yearOfEra();
        org.joda.time.DurationField durationField21 = islamicChronology18.weekyears();
        org.joda.time.Chronology chronology22 = islamicChronology18.withUTC();
        org.joda.time.DateTimeZone dateTimeZone23 = islamicChronology18.getZone();
        org.joda.time.Chronology chronology24 = islamicChronology8.withZone(dateTimeZone23);
        org.joda.time.Chronology chronology25 = islamicChronology0.withZone(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = chronology25.getDateTimeMillis(0L, (int) ' ', 0, 36000000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(islamicChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = islamicChronology0.getDateTimeMillis((int) (byte) 0, (int) (short) 0, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.minuteOfDay();
        long long6 = islamicChronology0.add(32L, (-440688900L), 1);
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(4, (int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        boolean boolean3 = dateTimeZone1.equals((java.lang.Object) (-1.0d));
        int int5 = dateTimeZone1.getOffset((long) '4');
        java.lang.String str7 = dateTimeZone1.getName(14460100L);
        long long10 = dateTimeZone1.adjustOffset(132L, true);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType14 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology15 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone13, leapYearPatternType14);
        org.joda.time.chrono.IslamicChronology islamicChronology16 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1, leapYearPatternType14);
        long long18 = dateTimeZone1.nextTransition((long) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 132L + "'", long10 == 132L);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(leapYearPatternType14);
        org.junit.Assert.assertNotNull(islamicChronology15);
        org.junit.Assert.assertNotNull(islamicChronology16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
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
        org.joda.time.DateTimeField dateTimeField15 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField16 = islamicChronology0.eras();
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
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.year();
        long long11 = islamicChronology0.getDateTimeMillis((long) (short) 0, 4, (int) (byte) 1, 0, 100);
        org.joda.time.DateTimeField dateTimeField12 = islamicChronology0.era();
        java.lang.Class<?> wildcardClass13 = dateTimeField12.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 14460100L + "'", long11 == 14460100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField3 = islamicChronology0.days();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
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
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = islamicChronology0.get(readablePeriod20, 14460099L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-440688868L) + "'", long6 == (-440688868L));
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(islamicChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36000000 + "'", int15 == 36000000);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        long long9 = islamicChronology0.add(187200035L, (long) ' ', (int) 'a');
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField11 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField12 = islamicChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis((int) (byte) 100, 3840000, 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(187200000, 3840000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 3840000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField10 = islamicChronology0.days();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(115200000, (int) (short) 0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
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
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        boolean boolean4 = dateTimeZone1.isStandardOffset((long) (byte) 10);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        long long10 = dateTimeZone7.adjustOffset((long) '4', true);
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        boolean boolean13 = dateTimeZone7.isStandardOffset((-35999965L));
        boolean boolean15 = dateTimeZone7.isStandardOffset(132L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.monthOfYear();
        org.joda.time.DurationField durationField7 = islamicChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.getDateTimeMillis(0, (int) (short) 1, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
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
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone2 = islamicChronology0.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (short) 0);
        int int7 = dateTimeZone5.getStandardOffset((long) (short) 100);
        org.joda.time.Chronology chronology8 = islamicChronology0.withZone(dateTimeZone5);
        int int9 = islamicChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(10, (-1), (-1), 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36000000 + "'", int7 == 36000000);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        org.joda.time.chrono.IslamicChronology islamicChronology9 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField10 = islamicChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = islamicChronology9.yearOfEra();
        org.joda.time.DurationField durationField12 = islamicChronology9.millis();
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology9.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField15 = islamicChronology9.years();
        org.joda.time.DateTimeField dateTimeField16 = islamicChronology9.era();
        org.joda.time.DateTimeField dateTimeField17 = islamicChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        java.util.Locale locale22 = null;
        java.lang.String str23 = dateTimeZone20.getShortName((-35999900L), locale22);
        org.joda.time.Chronology chronology24 = islamicChronology9.withZone(dateTimeZone20);
        long long26 = dateTimeZone8.getMillisKeepLocal(dateTimeZone20, (-42406761599990L));
        boolean boolean27 = dateTimeZone20.isFixed();
        java.lang.String str28 = dateTimeZone20.toString();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(islamicChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+01:04" + "'", str23, "+01:04");
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-42406765439990L) + "'", long26 == (-42406765439990L));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+01:04" + "'", str28, "+01:04");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod12, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField6 = islamicChronology0.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = islamicChronology0.getDateTimeMillis((int) (byte) 1, (int) '4', 1, 115200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 115200000 for millisOfDay must be in the range [0,86399999]");
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
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str4 = dateTimeZone3.toString();
        boolean boolean5 = dateTimeZone3.isFixed();
        org.joda.time.Chronology chronology6 = islamicChronology0.withZone(dateTimeZone3);
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone8 = islamicChronology0.getZone();
        long long12 = islamicChronology0.add((-84478968L), 132L, (int) '4');
        org.joda.time.DurationField durationField13 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.weekyearOfCentury();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTC" + "'", str4, "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-84472104L) + "'", long12 == (-84472104L));
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.centuryOfEra();
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
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
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
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology17.get(readablePeriod18, 1010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
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
        org.joda.time.DurationField durationField12 = islamicChronology0.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.dayOfMonth();
        org.joda.time.Chronology chronology8 = islamicChronology0.withUTC();
        java.lang.String str9 = islamicChronology0.toString();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "IslamicChronology[UTC]" + "'", str9, "IslamicChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.hourOfHalfday();
        org.joda.time.Chronology chronology5 = islamicChronology0.withUTC();
        org.joda.time.Chronology chronology6 = islamicChronology0.withUTC();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray9 = new int[] { (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            chronology6.validate(readablePartial7, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        long long7 = islamicChronology0.add(10L, 0L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.centuryOfEra();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.DurationField durationField6 = islamicChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeZone dateTimeZone6 = islamicChronology0.getZone();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology0.getDateTimeMillis(0, 4, (int) (byte) 1, (int) (byte) 1, (int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfCentury();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = islamicChronology0.set(readablePartial3, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        int int12 = dateTimeZone8.getStandardOffset(10L);
        int int14 = dateTimeZone8.getOffset((-35999900L));
        java.lang.String str16 = dateTimeZone8.getName((long) 0);
        java.lang.String str17 = dateTimeZone8.toString();
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField19 = islamicChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField20 = islamicChronology0.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = islamicChronology0.set(readablePartial21, (long) 4);
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
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
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
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = islamicChronology14.get(readablePeriod21, (-40936320000000L), (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
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
        java.lang.Class<?> wildcardClass16 = islamicChronology0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = islamicChronology0.getDateTimeMillis(0, (int) '#', 0, 3840000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year must be in the range [1,292271022]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = islamicChronology0.get(readablePeriod7, (-59719564684799965L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        java.lang.String str6 = islamicChronology3.toString();
        org.joda.time.DurationField durationField7 = islamicChronology3.months();
        int int8 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField9 = islamicChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology3.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray12 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial11, intArray12);
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
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DurationField durationField4 = islamicChronology0.weeks();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = islamicChronology0.add(readablePeriod5, 3L, (int) (byte) 100);
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = islamicChronology0.get(readablePeriod11, (-50399000L), (long) (byte) 10);
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
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        long long11 = islamicChronology0.getDateTimeMillis((-440688900L), 0, (int) (byte) 0, (int) (short) 1, 1);
        org.joda.time.DurationField durationField12 = islamicChronology0.years();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-518398999L) + "'", long11 == (-518398999L));
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.Chronology chronology2 = islamicChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField3 = islamicChronology0.dayOfWeek();
        org.joda.time.DurationField durationField4 = islamicChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = islamicChronology0.add(readablePeriod6, (-35999965L), 0);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = islamicChronology0.set(readablePartial10, 130260099L);
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
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-35999965L) + "'", long9 == (-35999965L));
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.era();
        org.joda.time.chrono.IslamicChronology islamicChronology7 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField8 = islamicChronology7.hours();
        org.joda.time.DateTimeField dateTimeField9 = islamicChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = islamicChronology7.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str13 = dateTimeZone12.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology14 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology15 = islamicChronology7.withZone(dateTimeZone12);
        long long18 = dateTimeZone12.convertLocalToUTC((-41554321066532L), true);
        org.joda.time.Chronology chronology19 = islamicChronology3.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = islamicChronology3.get(readablePeriod20, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(islamicChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-41554321066532L) + "'", long18 == (-41554321066532L));
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField8 = islamicChronology0.centuries();
        long long12 = islamicChronology0.add((long) (byte) -1, (long) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = islamicChronology0.getDateTimeMillis(187200000, 1, 3840000, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for dayOfMonth must be in the range [1,30]");
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
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-11L) + "'", long12 == (-11L));
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("+01:04");
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName(0L, locale3);
        java.util.TimeZone timeZone5 = dateTimeZone1.toTimeZone();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+01:04" + "'", str4, "+01:04");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "GMT+01:04");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
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
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = islamicChronology3.get(readablePartial13, (-1L));
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
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.DurationField durationField7 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology0.millisOfSecond();
        org.joda.time.DurationField durationField9 = islamicChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = islamicChronology0.get(readablePeriod10, 0L, (-11L));
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
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
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
            long long15 = islamicChronology0.getDateTimeMillis(0, (int) (byte) 0, 187200000, (int) (short) 1, 0, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
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
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.Chronology chronology4 = islamicChronology0.withUTC();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology0.getZone();
        boolean boolean7 = islamicChronology0.equals((java.lang.Object) 1);
        org.joda.time.DurationField durationField8 = islamicChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = islamicChronology0.getDateTimeMillis((int) '4', (int) (byte) -1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.hours();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.halfdayOfDay();
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = islamicChronology0.getLeapYearPatternType();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = islamicChronology0.get(readablePeriod4, (long) 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.dayOfYear();
        org.joda.time.DurationField durationField3 = islamicChronology0.minutes();
        org.joda.time.DurationField durationField4 = islamicChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str9 = dateTimeZone8.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology10 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone8);
        int int12 = dateTimeZone8.getStandardOffset(10L);
        int int14 = dateTimeZone8.getOffset((-35999900L));
        java.lang.String str16 = dateTimeZone8.getName((long) 0);
        java.lang.String str17 = dateTimeZone8.toString();
        org.joda.time.Chronology chronology18 = islamicChronology0.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField19 = chronology18.clockhourOfHalfday();
        org.joda.time.DurationField durationField20 = chronology18.halfdays();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "UTC" + "'", str17, "UTC");
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology0.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.weekyear();
        org.joda.time.DurationField durationField7 = islamicChronology0.days();
        org.joda.time.DurationField durationField8 = islamicChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = islamicChronology0.getDateTimeMillis((int) 'a', 36000000, (int) (byte) 10, 0, (int) '4', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
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
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = islamicChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray9 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial7, intArray9);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.yearOfCentury();
        int int5 = islamicChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray12 = new int[] { (short) 10, 'a', 100, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            islamicChronology3.validate(readablePartial6, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10, 97, 100, 1, 1]");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        long long3 = dateTimeZone0.getMillisKeepLocal(dateTimeZone1, (long) (byte) -1);
        org.joda.time.LocalDateTime localDateTime4 = null;
        boolean boolean5 = dateTimeZone1.isLocalDateTimeGap(localDateTime4);
        long long8 = dateTimeZone1.adjustOffset((-59719564684799965L), false);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-59719564684799965L) + "'", long8 == (-59719564684799965L));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology0.era();
        org.joda.time.DurationField durationField5 = islamicChronology0.seconds();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone7 = islamicChronology0.getZone();
        java.lang.String str9 = dateTimeZone7.getNameKey(0L);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str12 = dateTimeZone11.toString();
        long long14 = dateTimeZone11.nextTransition(3L);
        long long16 = dateTimeZone7.getMillisKeepLocal(dateTimeZone11, 14460100L);
        java.lang.Class<?> wildcardClass17 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTC" + "'", str9, "UTC");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 3L + "'", long14 == 3L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 14460100L + "'", long16 == 14460100L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField5 = islamicChronology3.hours();
        org.joda.time.DurationField durationField6 = islamicChronology3.weekyears();
        long long10 = islamicChronology3.add((long) 1, (long) (byte) 100, 36000000);
        org.joda.time.Chronology chronology11 = islamicChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.era();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3600000001L + "'", long10 == 3600000001L);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 4);
        org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType3 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_15_BASED;
        org.joda.time.chrono.IslamicChronology islamicChronology4 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone2, leapYearPatternType3);
        long long6 = dateTimeZone2.nextTransition(0L);
        java.lang.String str8 = dateTimeZone2.getShortName(119040032L);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(leapYearPatternType3);
        org.junit.Assert.assertNotNull(islamicChronology4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "+01:04" + "'", str8, "+01:04");
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        org.joda.time.DurationField durationField1 = islamicChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = islamicChronology0.yearOfEra();
        org.joda.time.DurationField durationField3 = islamicChronology0.millis();
        boolean boolean5 = islamicChronology0.equals((java.lang.Object) 0.0f);
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = islamicChronology0.minutes();
        org.junit.Assert.assertNotNull(islamicChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.chrono.IslamicChronology islamicChronology0 = org.joda.time.chrono.IslamicChronology.getInstance();
        java.lang.String str1 = islamicChronology0.toString();
        long long5 = islamicChronology0.add((long) (short) -1, (long) '4', (int) '#');
        org.joda.time.DurationField durationField6 = islamicChronology0.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = islamicChronology0.add(readablePeriod7, (long) 10, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Chronology chronology12 = islamicChronology0.withZone(dateTimeZone11);
        org.joda.time.DateTimeField dateTimeField13 = islamicChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = islamicChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = islamicChronology0.getDateTimeMillis((-518389009L), (int) (byte) 100, (int) (short) 100, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(0);
        java.lang.String str2 = dateTimeZone1.toString();
        org.joda.time.chrono.IslamicChronology islamicChronology3 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = islamicChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone5 = islamicChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField6 = islamicChronology3.millisOfSecond();
        org.joda.time.DurationField durationField7 = islamicChronology3.days();
        org.joda.time.DateTimeField dateTimeField8 = islamicChronology3.clockhourOfDay();
        org.joda.time.DurationField durationField9 = islamicChronology3.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = islamicChronology3.getDateTimeMillis((long) (short) 10, 3840000, (int) (short) 1, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3840000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTC" + "'", str2, "UTC");
        org.junit.Assert.assertNotNull(islamicChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }
}
