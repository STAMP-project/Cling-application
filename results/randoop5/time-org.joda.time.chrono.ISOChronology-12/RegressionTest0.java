import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        java.lang.Class<?> wildcardClass5 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePartial7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis((int) ' ', (int) (byte) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (short) -1, (int) (byte) 0, (-1), (int) (byte) 100, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology1.set(readablePartial5, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis((long) (short) 0, (int) (byte) 1, (int) '4', 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePartial8, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long3 = iSOChronology0.set(readablePartial1, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray10 = new int[] { 0, (short) 1, (byte) 10, 10, 0, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial3, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1, 10, 10, 0, 0]");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = iSOChronology1.set(readablePartial4, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.set(readablePartial7, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis(0L, (int) (short) -1, (int) ' ', (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePeriod4, 10L, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray14 = new int[] { (short) 100, 100, 100, (short) -1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 100, -1, 32]");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology5.getDateTimeMillis((long) 100, 0, (int) (short) 1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) '4', (int) '4', (int) (byte) 10, (int) (short) 0, 0, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePartial9, 1034L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = iSOChronology1.get(readablePeriod15, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = iSOChronology1.set(readablePartial3, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.set(readablePartial6, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePeriod4, (long) '4', (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod8, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = iSOChronology1.getDateTimeMillis((int) (short) 10, (int) (byte) 100, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((int) (byte) 100, (int) (byte) 0, (int) '4', (int) (byte) 100, 100, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology5.getDateTimeMillis((int) ' ', (int) (short) 0, 1, 1, (int) (short) 1, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePartial6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        java.lang.String str7 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePartial8, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis((int) '4', (int) (short) 100, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray10 = new int[] { (-1), ' ', ' ', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial5, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 32, 32, 35]");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.set(readablePartial14, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePartial6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField9 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
        org.joda.time.DurationField durationField13 = iSOChronology12.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology12.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone16 = iSOChronology12.getZone();
        org.joda.time.Chronology chronology17 = iSOChronology5.withZone(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = iSOChronology5.getDateTimeMillis((int) (short) 10, (int) (short) 1, (int) (byte) 10, 0, (int) (byte) -1, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis((long) (short) -1, (int) (short) 1, 100, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePartial4, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = iSOChronology0.getDateTimeMillis((-1), (int) ' ', (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray6 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial5, intArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[]");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePeriod4, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.years();
        java.lang.Class<?> wildcardClass4 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray10 = new int[] { 100 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100]");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = iSOChronology1.getDateTimeMillis((-1), (int) (byte) 0, (int) (byte) -1, (int) '#', (int) (short) 100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) (byte) -1, (int) (byte) -1, 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        java.lang.String str7 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePartial8, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis(0, 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        java.lang.Class<?> wildcardClass4 = durationField3.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray10 = new int[] { 1, (byte) 1, (byte) 0, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial5, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1, 0, 97]");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePartial7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis((int) ' ', (int) (short) 10, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.set(readablePartial15, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = iSOChronology1.get(readablePartial13, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis((int) (short) 1, (int) (short) 1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology6.getDateTimeMillis(0, (int) (short) -1, (int) ' ', 0, (-1), (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = iSOChronology1.get(readablePeriod19, (long) (byte) 100, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.set(readablePartial7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        java.lang.Class<?> wildcardClass5 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        java.lang.Class<?> wildcardClass9 = durationField8.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((long) 100, (int) '4', (int) 'a', 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        java.lang.Class<?> wildcardClass3 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePeriod4, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        java.lang.Class<?> wildcardClass14 = dateTimeField13.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis((int) 'a', (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray24 = new int[] { 'a', '#', 0, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial18, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[97, 35, 0, -1, -1]");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = iSOChronology15.get(readablePeriod16, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(iSOChronology15);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology0.get(readablePeriod4, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePeriod5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePeriod4, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.set(readablePartial10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField8 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis((int) (short) 1, 0, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, 1034L, (int) 'a');
        long long16 = iSOChronology1.add(1L, 0L, (int) (short) 1);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1034L + "'", long12 == 1034L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePartial5, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = iSOChronology0.getDateTimeMillis((int) (byte) -1, 0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology1.set(readablePartial17, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis(1L, (int) '4', (-1), 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.set(readablePartial15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = iSOChronology5.get(readablePeriod11, (long) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis((int) (byte) 100, (int) (short) -1, 1, (int) ' ', (int) (byte) 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        java.lang.Class<?> wildcardClass5 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        java.lang.Class<?> wildcardClass5 = dateTimeField4.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis((int) ' ', (int) (short) 100, 10, 1, (-1), (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        java.lang.Class<?> wildcardClass8 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekyearOfCentury();
        java.lang.String str3 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial4, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = iSOChronology1.getDateTimeMillis((int) (short) -1, 100, 0, (int) (byte) 1, (int) (short) 100, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField8 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((long) (byte) -1, (int) (byte) -1, 0, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) (short) 1, (int) 'a', 0, (int) (short) 1, 0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = iSOChronology1.get(readablePeriod17, (long) 'a', 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        long long7 = iSOChronology1.add((long) '4', (-1L), (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis(1034L, (int) (byte) 100, (int) '#', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53L + "'", long7 == 53L);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod6, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis(0, (int) (short) 1, 0, 0, (int) (byte) 10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePartial10, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        java.lang.Class<?> wildcardClass7 = dateTimeField6.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology0.getDateTimeMillis(100L, 1, (int) (byte) 0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePartial5, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePeriod5, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod14, 53L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        long long14 = iSOChronology1.getDateTimeMillis((long) (short) 100, (int) (short) 0, (int) '#', (int) (short) 1, (int) '#');
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.set(readablePartial15, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2101035L + "'", long14 == 2101035L);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.year();
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField8 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = iSOChronology1.getDateTimeMillis(1, (int) ' ', (int) (short) -1, (int) (short) 0, (int) ' ', (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.weekyears();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray19 = new int[] { (short) 1, (short) -1, (short) 0, 100, (byte) 100, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial12, intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, -1, 0, 100, 100, 100]");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = iSOChronology0.get(readablePeriod3, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePartial10, 2101035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = iSOChronology1.getDateTimeMillis((int) (byte) 0, 10, 0, (int) (byte) 100, 0, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            long long41 = iSOChronology1.getDateTimeMillis((int) (short) 100, (int) (short) 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePeriod9, (long) '4', 53L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        java.lang.String str8 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField4 = iSOChronology1.halfdays();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePartial5, 1034L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis((int) ' ', 10, 0, (int) '#', (int) (byte) 1, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField4 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray11 = new int[] { (byte) 0, (short) 0, 1, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial6, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 1, 10]");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        java.lang.Class<?> wildcardClass7 = dateTimeField6.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.eras();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePartial11, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray11 = new int[] { (byte) 0, (-1), 10, ' ', (short) -1, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial4, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 10, 32, -1, -1]");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((long) '#', (int) 'a', (int) (byte) 10, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.years();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField8 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        java.lang.Class<?> wildcardClass11 = durationField10.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField11 = iSOChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = iSOChronology1.get(readablePeriod12, (-1L), (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = iSOChronology1.set(readablePartial4, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.set(readablePartial6, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField9 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        java.lang.Class<?> wildcardClass7 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((int) 'a', 0, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray16 = new int[] { (byte) 100, (short) 100, (byte) 1, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial10, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[100, 100, 1, 1, -1]");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis(0, (int) (short) 10, 10, 1, (-1), 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.halfdayOfDay();
        java.lang.String str16 = iSOChronology14.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = iSOChronology14.get(readablePeriod17, 97L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology1.getDateTimeMillis(10, (int) (byte) 10, (int) '#', (int) (byte) 0, (int) (byte) 1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        java.lang.Class<?> wildcardClass6 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = iSOChronology1.get(readablePeriod2, 0L, 3670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis(97L, (int) (byte) 1, 100, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        java.lang.String str5 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str5, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField10 = iSOChronology1.halfdays();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray17 = new int[] { (byte) 1, ' ', '#', 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial11, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 32, 35, 1, 10]");
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) 'a', (int) ' ', (int) (short) 10, (int) (byte) -1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology0.getDateTimeMillis(0, (int) (byte) 1, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray11 = new int[] { '4', 0, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 0, -1]");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((int) 'a', (int) ' ', (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis((int) (byte) 0, (int) (byte) 1, (int) (byte) -1, (int) (short) -1, 100, 1, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = iSOChronology1.getDateTimeMillis(100, (int) (short) 100, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis((int) (byte) 1, (int) (short) 0, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) (short) 10, 0);
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.set(readablePartial7, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray13 = new int[] { 1, (byte) 100, '#', (byte) 100, (byte) 1, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial6, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 100, 35, 100, 1, 0]");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePeriod9, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray17 = new int[] { '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial14, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 0]");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.year();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray7 = new int[] { (short) 10, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial3, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10, 10, 0]");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField2 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology0.getDateTimeMillis(100, (int) (short) 100, (-1), (int) (byte) 0, (int) ' ', (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        long long6 = iSOChronology1.add(10L, (long) ' ', (int) ' ');
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1034L + "'", long6 == 1034L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePartial5, 53L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = iSOChronology1.get(readablePeriod15, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = iSOChronology1.get(readablePeriod16, (long) '#', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology1.months();
        org.joda.time.DurationField durationField10 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis((-2100938L), (int) (byte) -1, (int) (short) 10, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePeriod9, 1034L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        long long12 = iSOChronology1.add(3297L, (long) '#', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.millis();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePartial7, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.Chronology chronology17 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = iSOChronology1.get(readablePeriod19, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        long long12 = iSOChronology1.add((long) 'a', (long) ' ', 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = iSOChronology1.get(readablePeriod13, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        java.lang.String str6 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = iSOChronology1.add(readablePeriod17, (long) (-1), 0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray10 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePeriod7, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        long long12 = iSOChronology1.add((long) 'a', (long) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis(100, (int) ' ', (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long59 = iSOChronology1.getDateTimeMillis((long) (-1), (int) (short) -1, (int) (byte) 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.Chronology chronology8 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.set(readablePartial7, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        java.lang.Class<?> wildcardClass14 = dateTimeZone12.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        java.lang.Class<?> wildcardClass7 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod14, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray11 = new int[] { 'a', (byte) 0, 10, (short) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial5, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 0, 10, 100, -1]");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod5, 53L, 1034L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.year();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (short) 1, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePartial6, 2101035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (-2100938L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology5.getDateTimeMillis((-1), 100, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePartial9, 3670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        java.lang.Class<?> wildcardClass9 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.joda.time.DurationField durationField12 = iSOChronology1.millis();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        java.lang.Class<?> wildcardClass9 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis((int) (byte) 10, 0, 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField2 = iSOChronology0.eras();
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray8 = new int[] { (byte) -1, 1, (short) 10, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology0.validate(readablePartial3, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1, 10, 52]");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology0.getDateTimeMillis((int) ' ', 0, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, (long) (short) 10, 0);
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray12 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial11, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[]");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis((int) (short) 1, 10, (int) (byte) 10, (int) 'a', (int) (byte) 1, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.halfdayOfDay();
        java.lang.Class<?> wildcardClass9 = dateTimeField8.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.monthOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis((int) (byte) -1, (int) (byte) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology1.eras();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePeriod9, (-2100938L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod7, 10L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        long long12 = iSOChronology1.add(3297L, (long) '#', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 3297L + "'", long12 == 3297L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePeriod10, (long) (short) 10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = iSOChronology1.get(readablePartial22, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology0.get(readablePeriod6, 1L, 3297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.year();
        org.joda.time.ReadablePartial readablePartial18 = null;
        int[] intArray23 = new int[] { (byte) 100, (short) 0, (short) 0, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial18, intArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 0, 0, 1]");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePeriod8, 9753L, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray7 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial6, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[]");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePartial8, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        long long6 = iSOChronology1.add(10L, (long) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((int) (short) -1, 10, (int) (byte) 0, (int) (byte) 1, (int) (byte) 0, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1034L + "'", long6 == 1034L);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = iSOChronology0.years();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { (short) 10, 100 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology0.validate(readablePartial11, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 100]");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.hours();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray5 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial4, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField11 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology1.getDateTimeMillis((long) (short) 10, 100, (int) (byte) 100, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DurationField durationField13 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePeriod10, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((int) '#', (int) (short) 1, (int) (short) 0, (int) '#', 10, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField4 = iSOChronology1.seconds();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod5, (-1L), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((int) ' ', (int) (short) 0, (int) (short) 0, 0, (int) '#', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology9.seconds();
        org.joda.time.DurationField durationField12 = iSOChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology9.millis();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology9.centuryOfEra();
        boolean boolean20 = iSOChronology1.equals((java.lang.Object) iSOChronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = iSOChronology9.getDateTimeMillis(1, (int) '4', (int) '4', 0, 0, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePeriod6, (long) 0, 3297L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        java.lang.String str8 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.set(readablePartial9, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfCentury();
        java.lang.Class<?> wildcardClass4 = iSOChronology0.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology1.set(readablePartial5, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.DurationField durationField9 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.set(readablePartial14, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.joda.time.DurationField durationField12 = iSOChronology1.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology1.getDateTimeMillis((long) '4', (int) (byte) 100, (int) (short) -1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.hourOfHalfday();
        java.lang.Class<?> wildcardClass5 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial21 = null;
        int[] intArray24 = new int[] { (byte) 0, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial21, intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0]");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField9 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis(53L, 100, (int) (byte) -1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis(100, (int) (byte) 100, (int) (byte) 0, 100, (int) '4', (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { 'a', ' ', (short) 100, '4', (short) 0, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[97, 32, 100, 52, 0, 32]");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology15.era();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.era();
        java.lang.String str20 = iSOChronology15.toString();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology15.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology23 = iSOChronology1.withZone(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = iSOChronology1.getDateTimeMillis((long) 10, 100, (int) (byte) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField4 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((long) (byte) 1, (int) '#', (int) (short) 100, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        java.lang.Class<?> wildcardClass8 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePartial5, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        long long9 = iSOChronology1.add(1L, (-2100938L), (int) (byte) -1);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 2100939L + "'", long9 == 2100939L);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField17 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.halfdayOfDay();
        org.joda.time.DurationField durationField25 = iSOChronology23.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfDay();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField14 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField15 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.ReadablePartial readablePartial2 = null;
        int[] intArray5 = new int[] { (-1), '4' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial2, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 52]");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.millis();
        org.joda.time.DurationField durationField7 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        java.lang.Class<?> wildcardClass20 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = iSOChronology23.get(readablePeriod25, 3297L, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology0.add(readablePeriod4, (long) (-1), (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray14 = new int[] { (short) 100, (short) -1, 'a', '#', (short) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial7, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, -1, 97, 35, 0, 100]");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((long) (short) 10, (int) (short) -1, (int) '4', (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.Chronology chronology7 = iSOChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology9.seconds();
        org.joda.time.DurationField durationField12 = iSOChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology9.millis();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology9.centuryOfEra();
        boolean boolean20 = iSOChronology1.equals((java.lang.Object) iSOChronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = iSOChronology9.getDateTimeMillis(3670320L, (int) (short) 100, (-1), (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePartial8, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = iSOChronology1.get(readablePeriod18, (long) (-1), (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) (short) 0, 0, 1, (int) (byte) -1, (int) (short) -1, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DurationField durationField7 = iSOChronology5.minutes();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology5.set(readablePartial8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.Chronology chronology7 = iSOChronology5.withUTC();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology5.get(readablePartial8, 3670000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        java.lang.String str8 = iSOChronology1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis(0, 1, (-1), (int) (short) 0, (int) (short) 10, 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str8, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        java.lang.String str18 = iSOChronology17.toString();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology17.add(readablePeriod19, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = iSOChronology17.getZone();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        long long27 = iSOChronology17.add(readablePeriod24, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField28 = iSOChronology17.hours();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology17.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology17.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology17.year();
        boolean boolean32 = iSOChronology1.equals((java.lang.Object) iSOChronology17);
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str18, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        long long10 = iSOChronology1.getDateTimeMillis((-1), 10, (int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis(0, (int) '4', 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62174390399903L) + "'", long10 == (-62174390399903L));
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfDay();
        java.lang.String str5 = iSOChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology0.get(readablePeriod6, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str5, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology1.set(readablePartial5, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = iSOChronology1.get(readablePeriod37, (long) 1, 3670320L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField11 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField12 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis((int) (short) -1, 100, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = iSOChronology1.get(readablePeriod11, (long) ' ', (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis((int) ' ', 1, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        long long7 = iSOChronology1.add((long) '4', (-1L), (-1));
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53L + "'", long7 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology1.get(readablePeriod5, 3670320L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod6, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.years();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((int) (byte) 0, (int) 'a', 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.dayOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology11.getZone();
        org.joda.time.Chronology chronology15 = iSOChronology3.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology3.weekOfWeekyear();
        java.lang.String str17 = iSOChronology3.toString();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = iSOChronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology20.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        java.lang.String str26 = iSOChronology25.toString();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = iSOChronology25.add(readablePeriod27, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology25.getZone();
        org.joda.time.Chronology chronology32 = iSOChronology20.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology33 = iSOChronology3.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = iSOChronology0.withZone(dateTimeZone31);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = iSOChronology0.get(readablePeriod35, (long) '#', 11417L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str26, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray13 = new int[] { (short) 1, '4', 100, 'a', 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial7, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 52, 100, 97, 10]");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        java.lang.String str7 = iSOChronology6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology6.add(readablePeriod8, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology6.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.ReadablePartial readablePartial15 = null;
        int[] intArray18 = new int[] { (byte) -1, '4' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology14.validate(readablePartial15, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 52]");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology1.add(readablePeriod7, 3670000L, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.getDateTimeMillis((-1), (int) (byte) -1, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 3670000L + "'", long10 == 3670000L);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.weeks();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray9 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[]");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology5.get(readablePeriod11, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        org.joda.time.Chronology chronology8 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = iSOChronology1.getDateTimeMillis((int) '#', (int) (byte) 0, (int) ' ', (int) (byte) 1, (int) (short) 0, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        java.lang.Class<?> wildcardClass6 = dateTimeField5.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology6.get(readablePartial8, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial10, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.hours();
        org.joda.time.DurationField durationField6 = iSOChronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((int) (short) 10, (int) 'a', 0, (int) (short) 100, 1, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.yearOfEra();
        org.joda.time.DurationField durationField9 = iSOChronology0.hours();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = iSOChronology1.get(readablePartial13, 9753L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.set(readablePartial7, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = iSOChronology1.weeks();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray14 = new int[] { (byte) 10, 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial11, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10, 10]");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField11 = iSOChronology1.years();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        java.lang.String str14 = iSOChronology13.toString();
        boolean boolean15 = iSOChronology1.equals((java.lang.Object) str14);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = iSOChronology1.getDateTimeMillis((int) (byte) 10, (int) (short) -1, (int) (short) 10, (int) (byte) -1, (int) (byte) 0, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology1.get(readablePeriod10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = iSOChronology1.getDateTimeMillis((int) (byte) 100, (int) '4', 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        java.lang.String str24 = iSOChronology23.toString();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = iSOChronology23.add(readablePeriod25, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology23.getZone();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = iSOChronology23.add(readablePeriod30, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology23.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.era();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology37.era();
        java.lang.String str42 = iSOChronology37.toString();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology37.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology37.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology23.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = iSOChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology48.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone52);
        java.lang.String str54 = iSOChronology53.toString();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = iSOChronology53.add(readablePeriod55, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = iSOChronology53.getZone();
        org.joda.time.Chronology chronology60 = iSOChronology48.withZone(dateTimeZone59);
        org.joda.time.Chronology chronology61 = iSOChronology23.withZone(dateTimeZone59);
        boolean boolean62 = iSOChronology1.equals((java.lang.Object) iSOChronology23);
        org.joda.time.DurationField durationField63 = iSOChronology23.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str24, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str42, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str54, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(durationField63);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DurationField durationField9 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis(36010010L, 100, (int) (short) 100, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        long long7 = iSOChronology1.add((long) '4', (-1L), (-1));
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53L + "'", long7 == 53L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfHalfday();
        org.joda.time.DurationField durationField9 = iSOChronology5.years();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology5.get(readablePeriod10, 10L, (-62142767999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = iSOChronology0.add(readablePeriod7, 0L, (int) (short) 0);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePeriod6, (long) 'a', 10273L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = iSOChronology1.add(readablePeriod6, 53L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 53L + "'", long9 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfWeek();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.halfdayOfDay();
        java.lang.String str16 = iSOChronology14.toString();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        long long20 = iSOChronology14.add(readablePeriod17, 100L, (int) ' ');
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long23 = iSOChronology14.set(readablePartial21, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        long long7 = iSOChronology1.add((long) '4', (-1L), (-1));
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField10 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 53L + "'", long7 == 53L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField13 = iSOChronology1.minutes();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePartial14, 3670320L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.halfdayOfDay();
        java.lang.String str16 = iSOChronology14.toString();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology14.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = iSOChronology14.years();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology14.era();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology14.yearOfCentury();
        org.joda.time.DurationField durationField22 = iSOChronology14.weeks();
        org.joda.time.DurationField durationField23 = iSOChronology14.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField11 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod13, (long) (byte) 10, 53L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.Chronology chronology15 = iSOChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = iSOChronology1.get(readablePeriod16, 3297L, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = iSOChronology1.getDateTimeMillis((int) ' ', (int) '4', 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        long long11 = iSOChronology1.add(97L, 2101035L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2100938L) + "'", long11 == (-2100938L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.centuryOfEra();
        java.lang.String str14 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = iSOChronology1.get(readablePeriod15, (long) (short) -1, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str14, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        java.lang.Class<?> wildcardClass3 = dateTimeField2.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis((int) (short) 0, (int) (short) 10, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis((-1), (int) (byte) 10, (int) (short) 0, 100, (int) '#', (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        long long10 = iSOChronology1.add((-1L), (long) (short) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial12 = null;
        int[] intArray14 = new int[] { 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial12, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[10]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis((int) (short) 10, 0, (int) (short) 10, (int) (short) -1, (int) (byte) 1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField10 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DurationField durationField13 = iSOChronology1.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = iSOChronology1.getDateTimeMillis((long) (byte) 100, (int) '#', 10, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.Chronology chronology7 = iSOChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.minuteOfHour();
        long long12 = iSOChronology5.add(2101035L, 10L, (int) (short) 100);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 2102035L + "'", long12 == 2102035L);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = iSOChronology1.get(readablePeriod12, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = iSOChronology1.get(readablePartial4, (-62142767999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology15.era();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.era();
        java.lang.String str20 = iSOChronology15.toString();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology15.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology23 = iSOChronology1.withZone(dateTimeZone22);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DurationField durationField27 = iSOChronology26.halfdays();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone30);
        java.lang.String str32 = iSOChronology31.toString();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        long long36 = iSOChronology31.add(readablePeriod33, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = iSOChronology31.getZone();
        org.joda.time.Chronology chronology38 = iSOChronology26.withZone(dateTimeZone37);
        org.joda.time.Chronology chronology39 = iSOChronology1.withZone(dateTimeZone37);
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology1.hourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str20, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str32, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField2 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology0.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.weekyear();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology0.add(readablePeriod3, (long) 'a', (-1));
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology0.add(readablePeriod8, 100L, (-1));
        java.lang.Class<?> wildcardClass12 = iSOChronology0.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.year();
        org.joda.time.DurationField durationField22 = iSOChronology1.halfdays();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis(1L, 100, 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.Chronology chronology14 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = iSOChronology1.get(readablePeriod15, (-62142767999900L), (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.years();
        java.lang.String str5 = iSOChronology1.toString();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str5, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis(10, 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfCentury();
        java.lang.Class<?> wildcardClass5 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField12 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.weekyear();
        java.lang.Class<?> wildcardClass14 = dateTimeField13.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial21 = null;
        int[] intArray28 = new int[] { 10, 0, (short) 0, (short) 1, '4', '#' };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial21, intArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[10, 0, 0, 1, 52, 35]");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField7 = iSOChronology1.months();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, 53L, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = iSOChronology1.getDateTimeMillis((int) (byte) -1, (int) (byte) -1, (int) (short) 0, (int) (short) 1, (int) ' ', 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.set(readablePartial7, 9753L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyear();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray7 = new int[] { (short) 100, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial4, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10]");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField14 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis((long) (byte) -1, (int) (byte) -1, (int) (short) -1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((-62174390399903L), 0, 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        java.lang.Class<?> wildcardClass17 = durationField16.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField6 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        long long10 = iSOChronology1.getDateTimeMillis((-1), (int) (short) 10, (int) (byte) 1, 0);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = iSOChronology1.get(readablePeriod11, 3670000L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-62175168000000L) + "'", long10 == (-62175168000000L));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.weekyearOfCentury();
        long long11 = iSOChronology1.add(97L, 2101035L, (int) (byte) -1);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.set(readablePartial12, 36010010L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2100938L) + "'", long11 == (-2100938L));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DurationField durationField15 = iSOChronology1.years();
        org.joda.time.DurationField durationField16 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Chronology chronology6 = iSOChronology1.withZone(dateTimeZone5);
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePartial7, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology6.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology14.getZone();
        org.joda.time.Chronology chronology18 = iSOChronology6.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = iSOChronology6.hours();
        org.joda.time.DurationField durationField20 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology6.secondOfDay();
        boolean boolean22 = iSOChronology0.equals((java.lang.Object) iSOChronology6);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology0.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.Chronology chronology17 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology1.getZone();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField12 = iSOChronology1.halfdays();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology1.set(readablePartial13, 9753L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        java.lang.Class<?> wildcardClass10 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField9 = iSOChronology1.centuries();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePeriod10, 1L, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.hours();
        org.joda.time.DurationField durationField54 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField56 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(dateTimeField56);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        long long8 = iSOChronology0.add(10L, (long) (byte) -1, 0);
        java.lang.String str9 = iSOChronology0.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str9, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.year();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology1.getDateTimeMillis(100L, (int) '4', 10, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology1.getDateTimeMillis(0, 0, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        long long18 = iSOChronology1.add(0L, 2101035L, (-1));
        org.joda.time.DurationField durationField19 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-2101035L) + "'", long18 == (-2101035L));
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        int[] intArray12 = new int[] { ' ', (byte) 10, '4', 100, 0 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial6, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 10, 52, 100, 0]");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField25 = iSOChronology24.months();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology24.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.hours();
        org.joda.time.DurationField durationField4 = iSOChronology1.minutes();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.centuryOfEra();
        java.lang.Class<?> wildcardClass7 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology0.add(readablePeriod4, (long) (-1), (int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology0.get(readablePeriod8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField2 = iSOChronology0.hours();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = iSOChronology0.get(readablePartial3, 2100939L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology2.dayOfYear();
        org.joda.time.DurationField durationField4 = iSOChronology2.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.millisOfSecond();
        org.joda.time.DurationField durationField7 = iSOChronology2.hours();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology2.getZone();
        org.joda.time.Chronology chronology9 = iSOChronology0.withZone(dateTimeZone8);
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = iSOChronology0.get(readablePartial10, (-62175168000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = iSOChronology1.getDateTimeMillis(0, (int) '#', (int) ' ', (int) (byte) 10, 10, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis((int) 'a', (int) '#', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology6.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfDay();
        long long12 = iSOChronology1.add(0L, (-100L), (int) (byte) 10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1000L) + "'", long12 == (-1000L));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        long long9 = iSOChronology0.add(9753L, (long) '4', (int) ' ');
        org.joda.time.DurationField durationField10 = iSOChronology0.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 11417L + "'", long9 == 11417L);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        boolean boolean6 = iSOChronology1.equals((java.lang.Object) (-1.0f));
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.era();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod6, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.weeks();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.dayOfYear();
        org.joda.time.DurationField durationField5 = iSOChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology3.dayOfYear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology11.getZone();
        org.joda.time.Chronology chronology15 = iSOChronology3.withZone(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology3.weekOfWeekyear();
        java.lang.String str17 = iSOChronology3.toString();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology3.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField21 = iSOChronology20.halfdays();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology20.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology20.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.chrono.ISOChronology iSOChronology25 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone24);
        java.lang.String str26 = iSOChronology25.toString();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        long long30 = iSOChronology25.add(readablePeriod27, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = iSOChronology25.getZone();
        org.joda.time.Chronology chronology32 = iSOChronology20.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology33 = iSOChronology3.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology34 = iSOChronology0.withZone(dateTimeZone31);
        org.joda.time.DurationField durationField35 = iSOChronology0.centuries();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(iSOChronology25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str26, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField11 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.halfdays();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray14 = new int[] { (short) 0, (byte) -1, (byte) 10, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology1.validate(readablePartial8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, -1, 10, 0, 10]");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField7 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DurationField durationField20 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        org.joda.time.DurationField durationField24 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone27);
        java.lang.String str29 = iSOChronology28.toString();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = iSOChronology28.add(readablePeriod30, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone34 = iSOChronology28.getZone();
        org.joda.time.Chronology chronology35 = iSOChronology23.withZone(dateTimeZone34);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone34);
        org.joda.time.Chronology chronology37 = iSOChronology1.withZone(dateTimeZone34);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology1.millisOfSecond();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str29, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1L) + "'", long33 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField6 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        java.lang.Class<?> wildcardClass6 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.year();
        org.joda.time.DurationField durationField22 = iSOChronology1.minutes();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = iSOChronology1.get(readablePeriod23, 2100939L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology1.getZone();
        java.lang.String str7 = iSOChronology1.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.getDateTimeMillis((int) (byte) 100, (int) (short) -1, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekyear();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField10 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology1.add(readablePeriod19, 100L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = iSOChronology1.getDateTimeMillis((-1), 0, (int) (byte) 0, (int) ' ', (int) (byte) 100, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = iSOChronology1.add(readablePeriod10, 53L, 0);
        org.joda.time.DurationField durationField14 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DurationField durationField16 = iSOChronology1.seconds();
        long long20 = iSOChronology1.add(0L, (long) (short) 100, (int) '#');
        org.joda.time.ReadablePartial readablePartial21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = iSOChronology1.get(readablePartial21, 2101035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 53L + "'", long13 == 53L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 3500L + "'", long20 == 3500L);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField6 = iSOChronology1.eras();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod7, (-62175168000000L), (-62142767999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod8, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.centuryOfEra();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology7.dayOfYear();
        org.joda.time.DurationField durationField9 = iSOChronology7.seconds();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.dayOfYear();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.dayOfYear();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = iSOChronology15.getZone();
        org.joda.time.Chronology chronology19 = iSOChronology7.withZone(dateTimeZone18);
        org.joda.time.Chronology chronology20 = iSOChronology1.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.year();
        org.joda.time.DurationField durationField22 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField23 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.years();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis((int) '#', (int) (short) 0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DurationField durationField10 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.halfdayOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology1.getDateTimeMillis((-62142767999900L), (int) (byte) 10, 10, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.Chronology chronology6 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod8, 365444L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology1.getDateTimeMillis(53L, (int) (short) 100, (int) ' ', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePeriod9, 10273L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology8.dayOfYear();
        org.joda.time.DurationField durationField10 = iSOChronology8.seconds();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology8.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.Chronology chronology20 = iSOChronology8.withZone(dateTimeZone19);
        org.joda.time.DurationField durationField21 = iSOChronology8.millis();
        org.joda.time.DurationField durationField22 = iSOChronology8.years();
        boolean boolean23 = iSOChronology1.equals((java.lang.Object) durationField22);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
        org.joda.time.DurationField durationField18 = iSOChronology17.halfdays();
        boolean boolean19 = iSOChronology1.equals((java.lang.Object) durationField18);
        org.joda.time.DurationField durationField20 = iSOChronology1.weekyears();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = iSOChronology1.get(readablePeriod21, 2102035L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField6 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.secondOfMinute();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        long long7 = iSOChronology1.add((long) (short) -1, 11417L, (int) 'a');
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1107448L + "'", long7 == 1107448L);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = iSOChronology1.get(readablePartial3, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        java.lang.String str24 = iSOChronology23.toString();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        long long28 = iSOChronology23.add(readablePeriod25, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology23.getZone();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        long long33 = iSOChronology23.add(readablePeriod30, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology23.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone36);
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology37.dayOfYear();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.era();
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology37.era();
        java.lang.String str42 = iSOChronology37.toString();
        org.joda.time.DateTimeField dateTimeField43 = iSOChronology37.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone44 = iSOChronology37.getZone();
        org.joda.time.Chronology chronology45 = iSOChronology23.withZone(dateTimeZone44);
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology23.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.DurationField durationField49 = iSOChronology48.halfdays();
        org.joda.time.DateTimeField dateTimeField50 = iSOChronology48.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField51 = iSOChronology48.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.chrono.ISOChronology iSOChronology53 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone52);
        java.lang.String str54 = iSOChronology53.toString();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        long long58 = iSOChronology53.add(readablePeriod55, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone59 = iSOChronology53.getZone();
        org.joda.time.Chronology chronology60 = iSOChronology48.withZone(dateTimeZone59);
        org.joda.time.Chronology chronology61 = iSOChronology23.withZone(dateTimeZone59);
        boolean boolean62 = iSOChronology1.equals((java.lang.Object) iSOChronology23);
        org.joda.time.ReadablePartial readablePartial63 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long65 = iSOChronology23.set(readablePartial63, 2101935L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str24, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 100L + "'", long33 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str42, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(iSOChronology53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str54, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone59);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.millis();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        java.lang.String str4 = iSOChronology1.toString();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = iSOChronology1.set(readablePartial5, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str4, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfYear();
        java.lang.Class<?> wildcardClass8 = iSOChronology0.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone8 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField7 = iSOChronology1.hours();
        org.joda.time.DurationField durationField8 = iSOChronology1.days();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology1.getDateTimeMillis(100, (int) '4', (int) (byte) 100, (int) (short) 10, (int) (short) 0, 1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        java.lang.String str7 = iSOChronology6.toString();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology6.add(readablePeriod8, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology6.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DurationField durationField15 = iSOChronology14.days();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.dayOfYear();
        org.joda.time.DurationField durationField17 = iSOChronology14.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str7, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField2 = iSOChronology0.seconds();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.dayOfYear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = iSOChronology19.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
        long long27 = iSOChronology23.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology29.dayOfYear();
        org.joda.time.DurationField durationField31 = iSOChronology29.seconds();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField33 = iSOChronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology29.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        long long40 = iSOChronology29.add(readablePeriod37, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField41 = iSOChronology29.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField42 = iSOChronology29.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone43);
        org.joda.time.DateTimeField dateTimeField45 = iSOChronology44.dayOfYear();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = iSOChronology44.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology48 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.chrono.ISOChronology iSOChronology49 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone47);
        org.joda.time.Chronology chronology50 = iSOChronology29.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology51 = iSOChronology23.withZone(dateTimeZone47);
        org.joda.time.Chronology chronology52 = iSOChronology1.withZone(dateTimeZone47);
        org.joda.time.DurationField durationField53 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField54 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField55 = iSOChronology1.minuteOfDay();
        java.lang.Class<?> wildcardClass56 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 97L + "'", long40 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(iSOChronology48);
        org.junit.Assert.assertNotNull(iSOChronology49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, 53L, (int) '#');
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.year();
        org.joda.time.DurationField durationField8 = iSOChronology1.millis();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 53L + "'", long6 == 53L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField16 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = iSOChronology1.millis();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = iSOChronology1.getDateTimeMillis((int) (short) -1, (int) (byte) -1, 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.minutes();
        org.joda.time.DurationField durationField7 = iSOChronology1.centuries();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DurationField durationField11 = iSOChronology9.seconds();
        org.joda.time.DurationField durationField12 = iSOChronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology9.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField16 = iSOChronology9.millis();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology9.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology9.centuryOfEra();
        boolean boolean20 = iSOChronology1.equals((java.lang.Object) iSOChronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long28 = iSOChronology9.getDateTimeMillis((int) '4', (int) (short) 1, (int) (byte) 1, 0, (int) (short) 0, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology25 = iSOChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.monthOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DurationField durationField2 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.getDateTimeMillis((int) (short) 100, (int) (byte) -1, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = iSOChronology1.getDateTimeMillis((int) (byte) 0, (int) '4', (int) '#', (-1), (int) (short) 1, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology1.add(readablePeriod4, (long) (short) 0, (int) (byte) 100);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology1.set(readablePartial8, (-2101035L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology1.weeks();
        org.joda.time.DurationField durationField12 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.minuteOfHour();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.halfdayOfDay();
        java.lang.String str16 = iSOChronology14.toString();
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray18 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology14.validate(readablePartial17, intArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str16, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = iSOChronology1.get(readablePartial18, 3500L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        java.lang.String str15 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.hourOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str15, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology1.halfdays();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.year();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField38 = iSOChronology1.days();
        org.joda.time.DurationField durationField39 = iSOChronology1.hours();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfYear();
        org.joda.time.Chronology chronology5 = iSOChronology1.withUTC();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePartial6, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.Chronology chronology15 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.minuteOfDay();
        org.joda.time.DurationField durationField17 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField17 = iSOChronology16.halfdays();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.centuryOfEra();
        org.joda.time.DurationField durationField20 = iSOChronology16.centuries();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology22.dayOfYear();
        org.joda.time.DurationField durationField24 = iSOChronology22.seconds();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology22.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology22.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology22.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.dayOfYear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = iSOChronology30.getZone();
        org.joda.time.Chronology chronology34 = iSOChronology22.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology35 = iSOChronology16.withZone(dateTimeZone33);
        org.joda.time.Chronology chronology36 = iSOChronology1.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = iSOChronology1.get(readablePeriod39, 97L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(iSOChronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField12 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = iSOChronology1.getDateTimeMillis(0L, (int) '4', (int) (short) 1, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        long long8 = iSOChronology0.add(10L, (long) (byte) -1, 0);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.yearOfEra();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = iSOChronology23.get(readablePeriod27, 2101935L, (-82189990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, 1034L, (int) 'a');
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1034L + "'", long12 == 1034L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        long long7 = iSOChronology1.add(100L, (-1L), 0);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = iSOChronology1.get(readablePeriod9, 2101935L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.weekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = iSOChronology6.getZone();
        org.joda.time.Chronology chronology11 = iSOChronology1.withZone(dateTimeZone10);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.minutes();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = iSOChronology0.getDateTimeMillis((int) (byte) -1, (int) (byte) 0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DurationField durationField5 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.millisOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = iSOChronology5.getDateTimeMillis((int) (short) 1, (int) '4', 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField6 = iSOChronology1.seconds();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology1.set(readablePartial10, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.minuteOfHour();
        org.joda.time.DurationField durationField4 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.hourOfHalfday();
        org.joda.time.DurationField durationField7 = iSOChronology1.months();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        java.lang.String str3 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.dayOfYear();
        org.joda.time.DurationField durationField8 = iSOChronology6.seconds();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology6.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology6.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology6.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology14.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = iSOChronology14.getZone();
        org.joda.time.Chronology chronology18 = iSOChronology6.withZone(dateTimeZone17);
        org.joda.time.DurationField durationField19 = iSOChronology6.hours();
        org.joda.time.DurationField durationField20 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology6.secondOfDay();
        boolean boolean22 = iSOChronology0.equals((java.lang.Object) iSOChronology6);
        org.joda.time.DurationField durationField23 = iSOChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = iSOChronology0.get(readablePartial24, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str3, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.yearOfCentury();
        org.joda.time.DurationField durationField6 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField7 = iSOChronology1.years();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.hours();
        org.joda.time.DurationField durationField15 = iSOChronology1.months();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = iSOChronology1.getDateTimeMillis(11417L, 0, (int) (short) -1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = iSOChronology1.add(readablePeriod5, 0L, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.yearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        long long20 = iSOChronology1.getDateTimeMillis(3297L, (int) (short) 10, (int) (short) 0, (int) (byte) 10, (int) (byte) 10);
        org.joda.time.DurationField durationField21 = iSOChronology1.centuries();
        org.joda.time.Chronology chronology22 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 36010010L + "'", long20 == 36010010L);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology0.weeks();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.clockhourOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology6.months();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.millisOfDay();
        boolean boolean10 = iSOChronology1.equals((java.lang.Object) dateTimeField9);
        org.joda.time.DurationField durationField11 = iSOChronology1.hours();
        org.joda.time.Chronology chronology12 = iSOChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = iSOChronology1.get(readablePeriod13, (long) (byte) 0, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        long long12 = iSOChronology1.add(readablePeriod9, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.dayOfYear();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = iSOChronology16.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.Chronology chronology22 = iSOChronology1.withZone(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone19);
        org.joda.time.DurationField durationField25 = iSOChronology24.months();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology24.yearOfCentury();
        java.lang.Class<?> wildcardClass27 = dateTimeField26.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 97L + "'", long12 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(iSOChronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
        org.joda.time.DurationField durationField1 = iSOChronology0.millis();
        org.joda.time.DurationField durationField2 = iSOChronology0.years();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.minuteOfHour();
        org.joda.time.DurationField durationField5 = iSOChronology0.millis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        long long9 = iSOChronology5.add((long) (short) 100, (long) (byte) 0, (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology11.dayOfYear();
        org.joda.time.DurationField durationField13 = iSOChronology11.seconds();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology11.dayOfYear();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology11.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        long long22 = iSOChronology11.add(readablePeriod19, (long) 'a', 0);
        org.joda.time.DateTimeField dateTimeField23 = iSOChronology11.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology11.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone25);
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.dayOfYear();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology26.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone29 = iSOChronology26.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology31 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.Chronology chronology32 = iSOChronology11.withZone(dateTimeZone29);
        org.joda.time.Chronology chronology33 = iSOChronology5.withZone(dateTimeZone29);
        org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField35 = iSOChronology34.dayOfYear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 97L + "'", long22 == 97L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(iSOChronology31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(iSOChronology34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyear();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology1.get(readablePeriod6, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.centuries();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.months();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.weekOfWeekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = iSOChronology1.get(readablePartial7, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.hourOfHalfday();
        org.joda.time.Chronology chronology9 = iSOChronology1.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.yearOfEra();
        long long8 = iSOChronology1.add((long) (byte) 10, (long) (byte) 0, (int) '#');
        org.joda.time.DurationField durationField9 = iSOChronology1.weekyears();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.Chronology chronology7 = iSOChronology1.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = iSOChronology1.get(readablePeriod8, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.era();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField11 = iSOChronology1.eras();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.era();
        java.lang.String str6 = iSOChronology1.toString();
        org.joda.time.DurationField durationField7 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology1.get(readablePeriod10, 3297L, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str6, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.era();
        org.joda.time.DurationField durationField7 = iSOChronology1.seconds();
        org.joda.time.DurationField durationField8 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology1.secondOfMinute();
        org.joda.time.DurationField durationField11 = iSOChronology1.days();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.monthOfYear();
        org.joda.time.DurationField durationField2 = iSOChronology0.hours();
        org.joda.time.DurationField durationField3 = iSOChronology0.hours();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = iSOChronology0.get(readablePeriod4, 1107448L, 203791084L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekyearOfCentury();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = iSOChronology1.getZone();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.yearOfEra();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfHalfday();
        org.joda.time.Chronology chronology9 = iSOChronology5.withUTC();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.Chronology chronology15 = iSOChronology1.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = iSOChronology1.getDateTimeMillis(52L, (int) (short) -1, 10, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        long long11 = iSOChronology1.add(readablePeriod8, (long) (byte) 100, (int) (short) 100);
        org.joda.time.DurationField durationField12 = iSOChronology1.hours();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology1.year();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.DurationField durationField3 = iSOChronology1.millis();
        org.joda.time.DurationField durationField4 = iSOChronology1.weeks();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.secondOfDay();
        org.joda.time.DurationField durationField6 = iSOChronology1.millis();
        java.lang.Class<?> wildcardClass7 = iSOChronology1.getClass();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.dayOfYear();
        org.joda.time.DurationField durationField3 = iSOChronology1.seconds();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology9.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology9.getZone();
        org.joda.time.Chronology chronology13 = iSOChronology1.withZone(dateTimeZone12);
        org.joda.time.DurationField durationField14 = iSOChronology1.millis();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology1.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology1.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = iSOChronology1.get(readablePeriod21, (-62175168000000L), (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
        java.lang.String str2 = iSOChronology1.toString();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        long long6 = iSOChronology1.add(readablePeriod3, (long) (byte) -1, (int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = iSOChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology1.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology1.millisOfDay();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str2, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }
}

