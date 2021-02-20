import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(100, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 1, (int) (short) 100, 100, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.Object obj0 = new java.lang.Object();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(obj0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Object");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) ' ', (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 49, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime5.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property2.setCopy("", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.lang.Class<?> wildcardClass6 = localTime5.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', (int) '#', 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(48, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        org.joda.time.DurationFieldType durationFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime18.withFieldAdded(durationFieldType19, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 56 + "'", int11 == 56);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 10.0f, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localTime1.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = localTime0.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("55");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"55\": Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField20 = localTime18.getField((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.minusHours(57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType23 = localTime21.getFieldType(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime0.plus(readablePeriod2);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(56, (int) (byte) 10, (int) '#', (int) (short) 0, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        java.lang.Class<?> wildcardClass6 = dateTimeFieldType5.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 10, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = property16.setCopy((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localTime10.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "11:53:08.000" + "'", str12, "11:53:08.000");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(3, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        long long6 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 738L + "'", long6 == 738L);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        boolean boolean14 = localTime1.isSupported(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.LocalTime localTime20 = localTime18.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) boolean14, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(6790130, 11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6790130 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        int int12 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "15" + "'", str8, "15");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        int int5 = localTime1.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 16 + "'", int5 == 16);
    }

    @Test
    @Ignore
  public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 50);
        int int2 = localTime1.getMillisOfDay();
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString("", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.minusHours(57);
        java.lang.String str23 = localTime18.toString("2");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 18 + "'", int11 == 18);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2" + "'", str23, "2");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) (short) 100, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property7 = localTime6.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(6790130, (int) (byte) 10, (-1), 49, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6790130 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.compareTo(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DurationField durationField12 = property10.getRangeDurationField();
        org.joda.time.LocalTime localTime13 = property10.withMaximumValue();
        boolean boolean14 = localTime7.isEqual((org.joda.time.ReadablePartial) localTime13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        int int8 = property2.getMaximumValueOverall();
        int int9 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes(54);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 24 + "'", int11 == 24);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.DurationField durationField12 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, (int) ' ', 57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withHourOfDay(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.plusHours(10);
        int int29 = localTime28.getHourOfDay();
        int int30 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.LocalTime localTime31 = property17.getLocalTime();
        java.lang.String str32 = localTime31.toString();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localTime31);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "01:53:25.757" + "'", str32, "01:53:25.757");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(56, (int) (byte) 1, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localTime5.toDateTimeToday(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime5.getFieldType(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        int int9 = localTime8.getSecondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localTime8.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
    }

    @Test
    @Ignore
  public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (short) 0, 11);
        boolean boolean23 = localTime0.isEqual((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime26 = localTime22.withField(dateTimeFieldType24, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(57);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime14.withPeriodAdded(readablePeriod21, (int) (short) 100);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) localTime23);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfSecond();
        boolean boolean26 = localTime6.isEqual((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        org.joda.time.LocalTime localTime32 = property29.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property29.getFieldType();
        boolean boolean34 = localTime6.isSupported(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(57);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime8.withFieldAdded(durationFieldType11, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) '4');
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Interval interval18 = property2.toInterval();
        org.joda.time.LocalTime localTime20 = property2.addCopy((int) (short) 1);
        org.joda.time.LocalTime localTime21 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) property2, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 29, dateTimeZone1);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("24");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"24\": Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        int int11 = localTime10.getHourOfDay();
        int int12 = localTime10.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime10.get(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        boolean boolean11 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    @Ignore
  public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        int int36 = localTime14.get(dateTimeFieldType32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField38 = localTime14.getField(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "33" + "'", str12, "33");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 34 + "'", int33 == 34);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 39 + "'", int36 == 39);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.plusMillis((int) (short) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        int int6 = localTime1.indexOf(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "34" + "'", str9, "34");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, (int) ' ', 57);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localTime3.getFields();
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        boolean boolean6 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime7.getFieldType(57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 57");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(56, (int) (byte) 0, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property2.compareTo((org.joda.time.ReadableInstant) dateTime17);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property2.setCopy("01:53:19.936", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:19.936\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        java.lang.String str12 = localTime11.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35" + "'", str8, "35");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:53:01.692" + "'", str12, "01:53:01.692");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localTime9.getField(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 49");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(57);
        int int9 = localTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 54 + "'", int9 == 54);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfMinute\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute(3);
        int int11 = localTime8.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(34, 31, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(6813876);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 38 + "'", int4 == 38);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6802864, 3, 18, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6802864 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("26", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("25");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"25\": Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        org.joda.time.LocalTime localTime15 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property18.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property18.getFieldType();
        org.joda.time.LocalTime.Property property24 = localTime15.property(dateTimeFieldType23);
        org.joda.time.LocalTime localTime26 = localTime8.withField(dateTimeFieldType23, 53);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField29 = localTime26.getField(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property9.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property9.getFieldType();
        org.joda.time.LocalTime.Property property15 = localTime6.property(dateTimeFieldType14);
        org.joda.time.LocalTime localTime17 = localTime6.minusHours(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localTime17.getField((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        boolean boolean16 = localTime14.equals((java.lang.Object) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime14.getValue(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 40 + "'", int11 == 40);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    @Ignore
  public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.plusHours(10);
        int int29 = localTime28.getHourOfDay();
        int int30 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = localTime28.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFieldTypeArray31, dateTimeZone32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [Lorg.joda.time.DateTimeFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
    }

    @Test
    @Ignore
  public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int8 = localTime6.getValue(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    @Ignore
  public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property2.setCopy("01:53:19.936", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:19.936\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "40" + "'", str12, "40");
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localTime7.toString(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "01:53:00.884" + "'", str9, "01:53:00.884");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localTime4.getField(6819914);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6819914");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime12.withFieldAdded(durationFieldType13, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    @Ignore
  public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localTime14.toDateTimeToday(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property2.compareTo((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str19 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "41" + "'", str19, "41");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property2.setCopy((-1606262399));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262399 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("39");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"39\": Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        boolean boolean6 = property2.isLeap();
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        int int9 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("32", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.addCopy(49);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) 10, chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(401L);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6802251, 48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6802251 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(57);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime14.withPeriodAdded(readablePeriod21, (int) (short) 100);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) localTime23);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfSecond();
        boolean boolean26 = localTime6.isEqual((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray27 = localTime24.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 44 + "'", int20 == 44);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray27);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = property11.setCopy(7);
        boolean boolean15 = property2.equals((java.lang.Object) localTime14);
        java.util.Locale locale16 = null;
        int int17 = property2.getMaximumShortTextLength(locale16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.joda.time.LocalTime localTime13 = property2.addCopy((long) 100);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumTextLength(locale14);
        org.joda.time.DateTimeField dateTimeField16 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44" + "'", str8, "44");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    @Ignore
  public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime16.getFieldTypes();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime16.withFieldAdded(durationFieldType18, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "45" + "'", str12, "45");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(53, 9, 59, 34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("42");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"42\": Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime8.toString("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.joda.time.LocalTime localTime13 = property2.addCopy((long) 100);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        java.util.Locale locale16 = null;
        int int17 = property2.getMaximumTextLength(locale16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45" + "'", str8, "45");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    @Ignore
  public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) localTime5, dateTimeZone6);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime();
        int int9 = localTime8.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        boolean boolean24 = localTime11.isSupported(dateTimeFieldType23);
        org.joda.time.LocalTime.Property property25 = localTime8.property(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime7.withField(dateTimeFieldType23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localTime2.getFields();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute(3);
        org.joda.time.LocalTime.Property property11 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = property15.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        org.joda.time.LocalTime.Property property28 = localTime19.property(dateTimeFieldType27);
        org.joda.time.LocalTime localTime30 = localTime12.withField(dateTimeFieldType27, 0);
        java.lang.Class<?> wildcardClass31 = dateTimeFieldType27.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        int int7 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    @Ignore
  public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        int int7 = localTime4.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.joda.time.LocalTime localTime13 = property2.addCopy((long) 100);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        org.joda.time.LocalTime localTime16 = property2.roundHalfFloorCopy();
        java.lang.String str17 = localTime16.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "46" + "'", str8, "46");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "01:53:47.000" + "'", str17, "01:53:47.000");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.get();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 47 + "'", int7 == 47);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(195L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property2.setCopy("", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    @Ignore
  public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 5);
        int int2 = localTime1.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    @Ignore
  public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusHours(7);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        boolean boolean13 = property10.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField14 = property10.getDurationField();
        org.joda.time.LocalTime localTime15 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime16 = property10.withMinimumValue();
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfDay(57);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        org.joda.time.LocalTime localTime25 = property21.withMinimumValue();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime();
        int int27 = localTime26.getHourOfDay();
        org.joda.time.DateTime dateTime28 = localTime26.toDateTimeToday();
        long long29 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.LocalTime localTime30 = property21.getLocalTime();
        java.lang.String str31 = property21.getAsText();
        org.joda.time.LocalTime localTime33 = property21.addCopy(6);
        org.joda.time.LocalTime localTime35 = localTime33.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.Interval interval39 = property38.toInterval();
        org.joda.time.LocalTime localTime40 = property38.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = localTime46.get(dateTimeFieldType51);
        org.joda.time.LocalTime localTime54 = localTime40.withField(dateTimeFieldType51, 1);
        int int55 = localTime33.get(dateTimeFieldType51);
        org.joda.time.LocalTime localTime57 = localTime18.withField(dateTimeFieldType51, 6);
        boolean boolean58 = localTime5.isAfter((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime60 = localTime5.withMinuteOfHour(19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1606262400L) + "'", long29 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime30);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "47" + "'", str31, "47");
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 48 + "'", int52 == 48);
        org.junit.Assert.assertNotNull(localTime54);
// flaky:         org.junit.Assert.assertTrue("'" + int55 + "' != '" + 53 + "'", int55 == 53);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(localTime60);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int[] intArray4 = localTime3.getValues();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) localTime3);
        java.lang.String str7 = localTime3.toString("17");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime3.toDateTimeToday(dateTimeZone8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 53, 48, 646]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17" + "'", str7, "17");
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '#', 6790130, 0, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        java.lang.String str5 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[secondOfMinute]" + "'", str5, "Property[secondOfMinute]");
    }

    @Test
    @Ignore
  public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.minusMinutes(49);
        java.lang.String str6 = localTime3.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Chronology chronology16 = localTime14.getChronology();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(chronology16);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(chronology16);
        org.joda.time.LocalTime localTime20 = localTime18.minusHours(25);
        boolean boolean21 = localTime3.isEqual((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.LocalTime localTime27 = localTime25.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property28 = localTime25.millisOfDay();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime();
        int int30 = localTime29.getHourOfDay();
        org.joda.time.DateTime dateTime31 = localTime29.toDateTimeToday();
        boolean boolean32 = localTime25.isAfter((org.joda.time.ReadablePartial) localTime29);
        int int33 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:53:49.609" + "'", str6, "01:53:49.609");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    @Ignore
  public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.plusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime localTime27 = localTime24.withMillisOfDay(49);
        int int28 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime27);
        int int29 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.LocalTime.Property property30 = localTime27.millisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    @Ignore
  public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime16.getFieldTypes();
        java.lang.Class<?> wildcardClass18 = dateTimeFieldTypeArray17.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "49" + "'", str12, "49");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getSecondOfMinute();
        int int2 = localTime0.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumShortTextLength(locale12);
        org.joda.time.DurationField durationField14 = property2.getDurationField();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property21.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes(57);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.now(chronology28);
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(0, (int) (byte) 0, 22, (int) '4', chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) durationField14, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "49" + "'", str8, "49");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        int int6 = property2.getMaximumValue();
        java.lang.String str7 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[secondOfMinute]" + "'", str7, "Property[secondOfMinute]");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        boolean boolean11 = localTime1.equals((java.lang.Object) localTime10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localTime10.getFieldTypes();
        org.joda.time.LocalTime localTime14 = localTime10.minusSeconds((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime10.withFieldAdded(durationFieldType15, 6819914);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 0, 0, (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property6.addCopy(49);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = property13.setCopy(7);
        org.joda.time.LocalTime localTime17 = localTime8.withFields((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(38, (int) (short) 100, 6827022, 6827022, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        long long4 = property2.remainder();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 821L + "'", long4 == 821L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    @Ignore
  public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        java.lang.String str21 = localTime19.toString("01:53:34.032");
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localTime19.toString("", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "01:53:34.032" + "'", str21, "01:53:34.032");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606262400), 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime4.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime7.getValue(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(57);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = localTime21.get(dateTimeFieldType26);
        org.joda.time.LocalTime localTime29 = localTime15.withField(dateTimeFieldType26, 1);
        org.joda.time.DurationFieldType durationFieldType30 = null;
        boolean boolean31 = localTime29.isSupported(durationFieldType30);
        org.joda.time.LocalTime localTime33 = localTime29.minusMillis(53);
        org.joda.time.LocalTime localTime35 = localTime33.plusMillis(52);
        int int36 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 51 + "'", int27 == 51);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.setCopy(3);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfSecond(39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localTime9.toString(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "01:53:03.353" + "'", str13, "01:53:03.353");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("12", locale9);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.Chronology chronology12 = localTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = localTime10.toDateTimeToday(dateTimeZone13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52" + "'", str7, "52");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        org.joda.time.Interval interval13 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(interval13);
    }

    @Test
    @Ignore
  public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        int int7 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(273L);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsText(locale6);
        boolean boolean8 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "52" + "'", str7, "52");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(26, 35, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime10 = property2.setCopy("15");
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.joda.time.DurationField durationField12 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "53" + "'", str7, "53");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    @Ignore
  public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.lang.String str5 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        int int10 = property8.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant11 = null;
        int int12 = property8.getDifference(readableInstant11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localTime14.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property8.compareTo((org.joda.time.ReadableInstant) dateTime23);
        long long25 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "secondOfMinute" + "'", str5, "secondOfMinute");
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1606262400) + "'", int12 == (-1606262400));
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1606255566L) + "'", long25 == (-1606255566L));
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(44, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        boolean boolean6 = property2.isLeap();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy(6818450);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 57, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(2);
        org.joda.time.LocalTime localTime6 = localTime4.minusHours(20);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    @Ignore
  public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1606262412L));
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    @Ignore
  public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        java.lang.String str11 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[secondOfMinute]" + "'", str11, "Property[secondOfMinute]");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property2.setCopy(6832830);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6832830 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localTime6.getField(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 33");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localTime8.getField(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    @Ignore
  public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(57);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        org.joda.time.LocalTime localTime17 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        int int19 = localTime18.getHourOfDay();
        org.joda.time.DateTime dateTime20 = localTime18.toDateTimeToday();
        long long21 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime22 = property13.getLocalTime();
        java.lang.String str23 = property13.getAsText();
        org.joda.time.LocalTime localTime25 = property13.addCopy(6);
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property35.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        int int44 = localTime38.get(dateTimeFieldType43);
        org.joda.time.LocalTime localTime46 = localTime32.withField(dateTimeFieldType43, 1);
        int int47 = localTime25.get(dateTimeFieldType43);
        org.joda.time.LocalTime localTime49 = localTime10.withField(dateTimeFieldType43, 6);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = localTime10.getValue(6806870);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6806870");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1606262400L) + "'", long21 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "54" + "'", str23, "54");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 55 + "'", int44 == 55);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(localTime49);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime8 = property2.addCopy(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withMinuteOfHour(6806870);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6806870 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606255574L), dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = null;
        boolean boolean4 = localTime2.isSupported(durationFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property6.addCopy(49);
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfSecond((int) ' ');
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 59, chronology11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 6790130, chronology11);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 30, chronology11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology11);
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime15.withFieldAdded(durationFieldType16, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 59);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        boolean boolean16 = property13.equals((java.lang.Object) false);
        org.joda.time.Interval interval17 = property13.toInterval();
        boolean boolean18 = property10.equals((java.lang.Object) interval17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("3");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    @Ignore
  public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        int int6 = localTime5.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.secondOfMinute();
        int int8 = property7.getMinimumValue();
        org.joda.time.LocalTime localTime10 = property7.addWrapFieldToCopy(37);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property7.setCopy("01:53:01.692", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:01.692\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getMillisOfSecond();
        org.joda.time.LocalTime localTime9 = localTime4.minusSeconds(7);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localTime4.toString("29", locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime4.getFieldType(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 45");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "29" + "'", str12, "29");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 21);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        java.lang.String str11 = property9.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.LocalTime localTime12 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) localTime12, dateTimeZone13);
        int int15 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = property2.setCopy(1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        int int7 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        long long3 = property2.remainder();
        java.lang.String str4 = property2.getName();
        int int5 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy(6818450);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 568L + "'", long3 == 568L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property4.getFieldType();
        org.joda.time.LocalTime localTime8 = property4.withMinimumValue();
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        boolean boolean10 = localTime1.isEqual((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.DateTime dateTime11 = localTime1.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    @Ignore
  public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        boolean boolean36 = localTime16.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property37 = localTime16.minuteOfHour();
        org.joda.time.DateTime dateTime38 = localTime16.toDateTimeToday();
        int int39 = property2.getDifference((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime40 = property2.roundHalfCeilingCopy();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property2.getAsText(locale41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.LocalTime localTime48 = property45.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        int int54 = localTime48.get(dateTimeFieldType53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime57 = localTime48.withPeriodAdded(readablePeriod55, (int) (short) 100);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) localTime57);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = localTime58.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.Interval interval63 = property62.toInterval();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        org.joda.time.LocalTime localTime65 = property62.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime(dateTimeZone66);
        org.joda.time.LocalTime.Property property68 = localTime67.secondOfMinute();
        org.joda.time.LocalTime localTime69 = property68.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property68.getFieldType();
        int int71 = localTime65.get(dateTimeFieldType70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalTime localTime74 = localTime65.withPeriodAdded(readablePeriod72, (int) (short) 100);
        org.joda.time.LocalTime localTime76 = localTime65.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime78 = localTime65.plusMillis((-1));
        org.joda.time.LocalTime localTime80 = localTime65.minusMinutes(49);
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime(dateTimeZone83);
        org.joda.time.LocalTime.Property property85 = localTime84.secondOfMinute();
        org.joda.time.Interval interval86 = property85.toInterval();
        org.joda.time.LocalTime localTime87 = property85.roundFloorCopy();
        org.joda.time.LocalTime localTime88 = property85.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.DateTime dateTime90 = localTime88.toDateTimeToday(dateTimeZone89);
        org.joda.time.DateTime dateTime91 = localTime82.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = localTime80.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime93 = localTime58.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        int int94 = property2.compareTo((org.joda.time.ReadableInstant) dateTime90);
        int int95 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 58 + "'", int33 == 58);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1606262399) + "'", int39 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "57" + "'", str42, "57");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 58 + "'", int54 == 58);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 58 + "'", int71 == 58);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(localTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 0 + "'", int95 == 0);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 31);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    @Ignore
  public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusMillis((int) (short) 0);
        int int4 = localTime3.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    @Ignore
  public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        boolean boolean10 = localTime3.isAfter((org.joda.time.ReadablePartial) localTime7);
        int[] intArray11 = localTime7.getValues();
        org.joda.time.LocalTime.Property property12 = localTime7.millisOfDay();
        int[] intArray13 = localTime7.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 53, 58, 376]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 53, 58, 376]");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(6802864, 0, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6802864 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = localTime15.get(dateTimeFieldType20);
        org.joda.time.LocalTime localTime23 = localTime9.withField(dateTimeFieldType20, 1);
        boolean boolean24 = localTime4.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property25 = localTime4.minuteOfHour();
        java.lang.String str26 = localTime4.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:53:58.000" + "'", str26, "01:53:58.000");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        int int7 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(6827022, 42, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6827022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withHourOfDay(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    @Ignore
  public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(57);
        org.joda.time.LocalTime localTime10 = localTime6.minusMillis(7);
        int int11 = localTime6.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606262400), 4, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property20.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property20.getFieldType();
        org.joda.time.LocalTime localTime26 = property20.withMaximumValue();
        org.joda.time.LocalTime localTime28 = localTime26.withSecondOfMinute(3);
        org.joda.time.LocalTime.Property property29 = localTime26.millisOfSecond();
        boolean boolean30 = localTime0.equals((java.lang.Object) property29);
        int int31 = localTime0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(31, 48, 49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        int int13 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    @Ignore
  public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        int int15 = localTime9.get(dateTimeFieldType14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, (int) (short) 100);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime();
        int int22 = localTime21.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        int int31 = localTime24.compareTo((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        boolean boolean37 = localTime24.isSupported(dateTimeFieldType36);
        org.joda.time.LocalTime.Property property38 = localTime21.property(dateTimeFieldType36);
        org.joda.time.LocalTime localTime40 = localTime21.plusMillis((int) (short) 0);
        int int41 = localTime21.getMillisOfDay();
        org.joda.time.LocalTime localTime42 = localTime20.withFields((org.joda.time.ReadablePartial) localTime21);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(6806870, 100, 45, 6823607, chronology43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6806870 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 6839417 + "'", int41 == 6839417);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        long long3 = property2.remainder();
        java.lang.String str4 = property2.getName();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsShortText(locale5);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 701L + "'", long3 == 701L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "59" + "'", str6, "59");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        int int8 = property2.getMaximumValueOverall();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 5);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localTime3.getFieldTypes();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 472L + "'", long4 == 472L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("39", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        int int18 = localTime17.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        boolean boolean33 = localTime20.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property34 = localTime17.property(dateTimeFieldType32);
        org.joda.time.LocalTime localTime36 = localTime17.plusMillis((int) (short) 0);
        int int37 = localTime17.getMillisOfDay();
        org.joda.time.LocalTime localTime38 = localTime16.withFields((org.joda.time.ReadablePartial) localTime17);
        java.lang.String str39 = localTime17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField41 = localTime17.getField(45);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 45");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6841203 + "'", int37 == 6841203);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "01:54:01.203" + "'", str39, "01:54:01.203");
    }

    @Test
    @Ignore
  public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        boolean boolean36 = localTime16.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property37 = localTime16.minuteOfHour();
        org.joda.time.DateTime dateTime38 = localTime16.toDateTimeToday();
        int int39 = property2.getDifference((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime40 = property2.roundHalfCeilingCopy();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property2.getAsText(locale41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.LocalTime localTime48 = property45.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.LocalTime localTime52 = property51.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = property51.getFieldType();
        int int54 = localTime48.get(dateTimeFieldType53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalTime localTime57 = localTime48.withPeriodAdded(readablePeriod55, (int) (short) 100);
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((java.lang.Object) localTime57);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray59 = localTime58.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.Interval interval63 = property62.toInterval();
        org.joda.time.LocalTime localTime64 = property62.roundFloorCopy();
        org.joda.time.LocalTime localTime65 = property62.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime(dateTimeZone66);
        org.joda.time.LocalTime.Property property68 = localTime67.secondOfMinute();
        org.joda.time.LocalTime localTime69 = property68.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = property68.getFieldType();
        int int71 = localTime65.get(dateTimeFieldType70);
        org.joda.time.ReadablePeriod readablePeriod72 = null;
        org.joda.time.LocalTime localTime74 = localTime65.withPeriodAdded(readablePeriod72, (int) (short) 100);
        org.joda.time.LocalTime localTime76 = localTime65.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime78 = localTime65.plusMillis((-1));
        org.joda.time.LocalTime localTime80 = localTime65.minusMinutes(49);
        org.joda.time.LocalTime localTime82 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone83 = null;
        org.joda.time.LocalTime localTime84 = new org.joda.time.LocalTime(dateTimeZone83);
        org.joda.time.LocalTime.Property property85 = localTime84.secondOfMinute();
        org.joda.time.Interval interval86 = property85.toInterval();
        org.joda.time.LocalTime localTime87 = property85.roundFloorCopy();
        org.joda.time.LocalTime localTime88 = property85.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone89 = null;
        org.joda.time.DateTime dateTime90 = localTime88.toDateTimeToday(dateTimeZone89);
        org.joda.time.DateTime dateTime91 = localTime82.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime92 = localTime80.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        org.joda.time.DateTime dateTime93 = localTime58.toDateTime((org.joda.time.ReadableInstant) dateTime90);
        int int94 = property2.compareTo((org.joda.time.ReadableInstant) dateTime90);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime96 = property2.setCopy("01:53:59.864");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:59.864\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1606262399) + "'", int39 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "1" + "'", str42, "1");
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(interval63);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
// flaky:         org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(localTime76);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(property85);
        org.junit.Assert.assertNotNull(interval86);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(localTime88);
        org.junit.Assert.assertNotNull(dateTime90);
        org.junit.Assert.assertNotNull(dateTime91);
        org.junit.Assert.assertNotNull(dateTime92);
        org.junit.Assert.assertNotNull(dateTime93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.get();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        long long12 = property10.remainder();
        boolean boolean13 = property2.equals((java.lang.Object) property10);
        java.lang.String str14 = property10.getAsString();
        org.joda.time.LocalTime localTime16 = property10.setCopy("57");
        org.joda.time.LocalTime localTime18 = localTime16.plusMinutes((-1606262399));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 420L + "'", long12 == 420L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1" + "'", str14, "1");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((-1));
        org.joda.time.LocalTime localTime20 = localTime5.minusMinutes(49);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property25.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localTime28.toDateTimeToday(dateTimeZone29);
        org.joda.time.DateTime dateTime31 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.DateTime dateTime32 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalTime localTime34 = localTime20.minusMinutes(11);
        org.joda.time.LocalTime localTime36 = localTime20.minusHours(12);
        org.joda.time.LocalTime.Property property37 = localTime36.minuteOfHour();
        java.lang.Class<?> wildcardClass38 = localTime36.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfDay(54);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        boolean boolean8 = property5.equals((java.lang.Object) false);
        int int9 = property5.getLeapAmount();
        java.lang.String str10 = property5.getAsShortText();
        java.util.Locale locale12 = null;
        org.joda.time.LocalTime localTime13 = property5.setCopy("12", locale12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime0, chronology14);
        int int16 = localTime15.getMinuteOfHour();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(20, 0, 35, 37);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime4.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime4.withPeriodAdded(readablePeriod6, 19);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property13.addCopy(49);
        org.joda.time.LocalTime localTime17 = localTime15.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime23 = property20.setCopy(7);
        org.joda.time.LocalTime localTime24 = localTime15.withFields((org.joda.time.ReadablePartial) localTime23);
        boolean boolean25 = localTime10.isAfter((org.joda.time.ReadablePartial) localTime15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = localTime13.get(dateTimeFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localTime13.isSupported(durationFieldType20);
        org.joda.time.LocalTime localTime22 = localTime7.withFields((org.joda.time.ReadablePartial) localTime13);
        java.lang.String str23 = localTime13.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "01:54:02.000" + "'", str23, "01:54:02.000");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        boolean boolean16 = localTime14.equals((java.lang.Object) (-1));
        org.joda.time.LocalTime localTime18 = localTime14.withHourOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime14.withHourOfDay((-1606262400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.DateTime dateTime16 = localTime13.toDateTimeToday();
        int int17 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime13.secondOfMinute();
        boolean boolean19 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        boolean boolean25 = property22.equals((java.lang.Object) false);
        org.joda.time.Interval interval26 = property22.toInterval();
        org.joda.time.LocalTime localTime27 = property22.roundHalfEvenCopy();
        boolean boolean28 = localTime7.isBefore((org.joda.time.ReadablePartial) localTime27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54 + "'", int17 == 54);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
// flaky:         org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(2, (int) (short) 100, 34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTime dateTime2 = localTime0.toDateTimeToday();
        int int3 = localTime0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.DateTimeField dateTimeField17 = localTime14.getField((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localTime14.getField(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 57);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumTextLength(locale5);
        int int7 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((-1));
        org.joda.time.DateTimeField dateTimeField20 = localTime5.getField((int) (byte) 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    @Ignore
  public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis(48);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime14.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
    }

    @Test
    @Ignore
  public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.plusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localTime10.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 100);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((-1606262400));
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localTime10.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(36, 24, 39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime4.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime8 = localTime4.withPeriodAdded(readablePeriod6, 19);
        int int9 = localTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime13 = localTime11.minusHours(25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime13.withHourOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        int int21 = localTime15.get(dateTimeFieldType20);
        org.joda.time.LocalTime localTime23 = localTime9.withField(dateTimeFieldType20, 1);
        boolean boolean24 = localTime4.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property25 = localTime4.minuteOfHour();
        int int26 = property25.getMaximumValue();
        org.joda.time.DurationField durationField27 = property25.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 59 + "'", int26 == 59);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.withMinuteOfHour(55);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localTime5.getFields();
        org.joda.time.LocalTime localTime10 = localTime5.withMillisOfDay(6790130);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localTime5.getFieldType(6802864);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6802864");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(999L, dateTimeZone1);
    }

    @Test
    @Ignore
  public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        boolean boolean10 = localTime3.isAfter((org.joda.time.ReadablePartial) localTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime3.withHourOfDay((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime9 = localTime7.minusMinutes(57);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(202L, chronology10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) chronology10, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime7.toDateTimeToday(dateTimeZone9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localTime5.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime5.getValue(53);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        int int7 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        int[] intArray9 = localTime8.getValues();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime8.withFieldAdded(durationFieldType10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 26, 4, 743]");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.LocalTime localTime25 = property24.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property24.getFieldType();
        int int27 = localTime21.get(dateTimeFieldType26);
        org.joda.time.LocalTime localTime29 = localTime15.withField(dateTimeFieldType26, 1);
        boolean boolean30 = localTime10.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime.Property property31 = localTime10.minuteOfHour();
        org.joda.time.DateTime dateTime32 = localTime10.toDateTimeToday();
        int int33 = property2.compareTo((org.joda.time.ReadableInstant) dateTime32);
        org.joda.time.LocalTime localTime34 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        int int9 = property2.get();
        org.joda.time.DurationField durationField10 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    @Ignore
  public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = localTime16.getFieldTypes();
        int int19 = localTime16.getValue((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime16.plus(readablePeriod20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = localTime26.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        org.joda.time.LocalTime.Property property34 = localTime26.property(dateTimeFieldType33);
        boolean boolean35 = localTime21.isSupported(dateTimeFieldType33);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = null;
        java.lang.String str37 = localTime21.toString(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "5" + "'", str12, "5");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "00:00:00.000" + "'", str37, "00:00:00.000");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.plus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localTime10.getField(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 30");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime4.getFieldTypes();
        org.joda.time.LocalTime localTime9 = localTime4.withMillisOfDay(56);
        int int10 = localTime9.size();
        int int11 = localTime9.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.Chronology chronology22 = localTime20.getChronology();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((-1L), chronology22);
        org.joda.time.LocalTime localTime26 = localTime24.plusMillis(38);
        org.joda.time.LocalTime localTime27 = localTime9.withFields((org.joda.time.ReadablePartial) localTime26);
        int int28 = localTime27.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = localTime9.withHourOfDay(0);
        int[] intArray13 = localTime12.getValues();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localTime12.toString(dateTimeFormatter14);
        org.joda.time.Chronology chronology16 = localTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(47, 17, 45, (int) (byte) 0, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 26, 6, 10]");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00:26:06.010" + "'", str15, "00:26:06.010");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property6.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(57);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(0, (int) (byte) 0, 22, (int) '4', chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField18 = localTime16.getField(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    @Ignore
  public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime();
        int int18 = localTime17.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        int int27 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        boolean boolean33 = localTime20.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property34 = localTime17.property(dateTimeFieldType32);
        org.joda.time.LocalTime localTime36 = localTime17.plusMillis((int) (short) 0);
        int int37 = localTime17.getMillisOfDay();
        org.joda.time.LocalTime localTime38 = localTime16.withFields((org.joda.time.ReadablePartial) localTime17);
        int int39 = localTime38.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 6846386 + "'", int37 == 6846386);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 386 + "'", int39 == 386);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumShortTextLength(locale12);
        java.lang.String str14 = property2.getAsShortText();
        int int15 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) int15, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "6" + "'", str8, "6");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6" + "'", str14, "6");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        java.lang.String str9 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "6" + "'", str9, "6");
    }

    @Test
    @Ignore
  public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.plusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime localTime27 = localTime24.withMillisOfDay(49);
        int int28 = localTime15.compareTo((org.joda.time.ReadablePartial) localTime27);
        int int29 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType35 = null;
        boolean boolean36 = localTime34.isSupported(durationFieldType35);
        org.joda.time.LocalTime.Property property37 = localTime34.hourOfDay();
        int int38 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(6806870);
        java.lang.String str12 = localTime8.toString("51");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "51" + "'", str12, "51");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField13 = property9.getDurationField();
        org.joda.time.LocalTime localTime14 = property9.withMinimumValue();
        boolean boolean15 = localTime4.isEqual((org.joda.time.ReadablePartial) localTime14);
        java.util.Locale locale17 = null;
        java.lang.String str18 = localTime4.toString("59", locale17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "59" + "'", str18, "59");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = localTime0.getFieldTypes();
        org.joda.time.LocalTime localTime3 = localTime0.withSecondOfMinute((int) (byte) 10);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.DateTime dateTime16 = localTime13.toDateTimeToday();
        int int17 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime13.secondOfMinute();
        boolean boolean19 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime13.withPeriodAdded(readablePeriod20, 6844446);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54 + "'", int17 == 54);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(50, 86399999, 6842781);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        int int11 = localTime4.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.LocalTime localTime13 = localTime10.withMillisOfDay(49);
        int int14 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime.Property property15 = localTime13.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime13.withFieldAdded(durationFieldType16, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    @Ignore
  public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.plusHours(10);
        int int29 = localTime28.getHourOfDay();
        int int30 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        java.lang.String str36 = property33.getName();
        org.joda.time.LocalTime localTime37 = property33.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime38 = property33.roundFloorCopy();
        int int39 = property17.compareTo((org.joda.time.ReadablePartial) localTime38);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "secondOfMinute" + "'", str36, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        boolean boolean11 = localTime1.equals((java.lang.Object) localTime10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localTime10.getFieldTypes();
        org.joda.time.LocalTime localTime14 = localTime10.minusSeconds((int) (short) 10);
        org.joda.time.LocalTime localTime16 = localTime14.minusSeconds(310);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (-1606262400), chronology10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology10);
        java.lang.Class<?> wildcardClass15 = chronology10.getClass();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6813876, 40, 46, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6813876 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfSecond(57);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property5.getFieldType();
        org.joda.time.LocalTime localTime9 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime();
        int int11 = localTime10.getHourOfDay();
        org.joda.time.DateTime dateTime12 = localTime10.toDateTimeToday();
        long long13 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.LocalTime localTime14 = property5.getLocalTime();
        java.lang.String str15 = property5.getAsText();
        org.joda.time.LocalTime localTime17 = property5.addCopy(6);
        org.joda.time.LocalTime localTime19 = localTime17.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.LocalTime localTime30 = property27.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.LocalTime localTime34 = property33.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = property33.getFieldType();
        int int36 = localTime30.get(dateTimeFieldType35);
        org.joda.time.LocalTime localTime38 = localTime24.withField(dateTimeFieldType35, 1);
        int int39 = localTime17.get(dateTimeFieldType35);
        boolean boolean40 = localTime2.isSupported(dateTimeFieldType35);
        int int41 = localTime2.size();
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1606262400L) + "'", long13 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "9" + "'", str15, "9");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(localTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 15 + "'", int39 == 15);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime7.withFieldAdded(durationFieldType9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        long long19 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DurationField durationField20 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262450L) + "'", long19 == (-1606262450L));
        org.junit.Assert.assertNull(durationField20);
    }

    @Test
    @Ignore
  public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        boolean boolean11 = localTime1.equals((java.lang.Object) localTime10);
        int[] intArray12 = localTime1.getValues();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = property15.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        int int24 = localTime18.get(dateTimeFieldType23);
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime18.withPeriodAdded(readablePeriod25, (int) (short) 100);
        org.joda.time.LocalTime localTime29 = localTime18.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime();
        int int31 = localTime30.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        int int40 = localTime33.compareTo((org.joda.time.ReadablePartial) localTime39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.LocalTime localTime44 = property43.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property43.getFieldType();
        boolean boolean46 = localTime33.isSupported(dateTimeFieldType45);
        org.joda.time.LocalTime.Property property47 = localTime30.property(dateTimeFieldType45);
        org.joda.time.LocalTime localTime49 = localTime30.plusMillis((int) (short) 0);
        int int50 = localTime30.getMillisOfDay();
        org.joda.time.LocalTime localTime51 = localTime29.withFields((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.Chronology chronology52 = localTime51.getChronology();
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) localTime1, chronology52);
        java.lang.Class<?> wildcardClass54 = chronology52.getClass();
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 54, 10, 373]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6850374 + "'", int50 == 6850374);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 11, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localTime3.getFieldType(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(20);
        int int13 = localTime12.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime10 = property2.setCopy("15");
        java.util.Locale locale11 = null;
        int int12 = property2.getMaximumShortTextLength(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        int int8 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "11" + "'", str7, "11");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((-1));
        org.joda.time.LocalTime localTime32 = localTime17.minusMinutes(49);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long45 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property2.get();
        org.joda.time.LocalTime localTime48 = property2.addCopy((long) 6823607);
        java.util.Locale locale50 = null;
        java.lang.String str51 = localTime48.toString("20", locale50);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "12" + "'", str8, "12");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1606262447L) + "'", long45 == (-1606262447L));
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 12 + "'", int46 == 12);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "20" + "'", str51, "20");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 5);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(6790130);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        org.joda.time.DurationField durationField16 = property2.getDurationField();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.MIDNIGHT;
        int int18 = localTime17.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.Interval interval22 = property21.toInterval();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property21.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        int int30 = localTime24.get(dateTimeFieldType29);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalTime localTime33 = localTime24.withPeriodAdded(readablePeriod31, (int) (short) 100);
        org.joda.time.LocalTime localTime35 = localTime24.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime37 = localTime24.plusMillis((-1));
        org.joda.time.LocalTime.Property property38 = localTime24.millisOfSecond();
        boolean boolean39 = localTime17.isEqual((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone40);
        org.joda.time.LocalTime.Property property42 = localTime41.secondOfMinute();
        org.joda.time.Interval interval43 = property42.toInterval();
        org.joda.time.LocalTime localTime44 = property42.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property42.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property42.getFieldType();
        org.joda.time.LocalTime localTime48 = property42.getLocalTime();
        int int49 = localTime48.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(dateTimeZone50);
        org.joda.time.LocalTime.Property property52 = localTime51.secondOfMinute();
        org.joda.time.LocalTime localTime53 = property52.getLocalTime();
        org.joda.time.LocalTime localTime55 = localTime53.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.LocalTime localTime58 = localTime55.withHourOfDay(0);
        boolean boolean59 = localTime48.isBefore((org.joda.time.ReadablePartial) localTime58);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.LocalTime localTime63 = property62.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = property62.getFieldType();
        boolean boolean65 = localTime58.isSupported(dateTimeFieldType64);
        int int66 = localTime24.indexOf(dateTimeFieldType64);
        int int67 = property2.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 12 + "'", int30 == 12);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(localTime48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 12 + "'", int49 == 12);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2 + "'", int66 == 2);
// flaky:         org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
    }

    @Test
    @Ignore
  public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        int int11 = localTime7.getValue(0);
        java.lang.Class<?> wildcardClass12 = localTime7.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    @Ignore
  public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime13 = localTime11.minusHours(25);
        int int14 = localTime13.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ', chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(8, 12121000, 426, 12, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12121000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.Interval interval12 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(interval12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("30", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime23 = localTime21.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property26.getFieldType();
        org.joda.time.LocalTime.Property property29 = localTime21.property(dateTimeFieldType28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        boolean boolean31 = localTime15.isSupported(dateTimeFieldType30);
        int int32 = localTime15.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 54 + "'", int32 == 54);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addCopy(49);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = property9.setCopy(7);
        org.joda.time.LocalTime localTime13 = localTime4.withFields((org.joda.time.ReadablePartial) localTime12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime4.getValue(28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 24);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) '4');
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Interval interval18 = property2.toInterval();
        org.joda.time.LocalTime localTime20 = property2.addCopy((int) (short) 1);
        org.joda.time.DateTimeField dateTimeField21 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(obj0, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime4.getFieldType(202);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 202");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 0, 11);
        java.lang.String str3 = localTime2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00:11:00.000" + "'", str3, "00:11:00.000");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = localTime5.withMinuteOfHour(37);
        org.joda.time.LocalTime localTime15 = localTime5.plusHours(2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = localTime15.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        java.lang.Class<?> wildcardClass9 = property8.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfDay(49);
        boolean boolean17 = property2.equals((java.lang.Object) localTime16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property21.addCopy(49);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfSecond((int) ' ');
        org.joda.time.Chronology chronology26 = localTime25.getChronology();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) 59, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) property2, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    @Ignore
  public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        int int17 = localTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localTime16.toDateTimeToday();
        long long19 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalTime localTime20 = property11.getLocalTime();
        java.lang.String str21 = property11.getAsText();
        org.joda.time.LocalTime localTime23 = property11.addCopy(6);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localTime25.getFieldTypes();
        int int28 = localTime25.getValue((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime30 = localTime25.plus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = localTime35.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        org.joda.time.LocalTime.Property property43 = localTime35.property(dateTimeFieldType42);
        boolean boolean44 = localTime30.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime localTime46 = localTime8.withField(dateTimeFieldType42, 52);
        int int47 = localTime46.getMillisOfSecond();
        org.joda.time.LocalTime localTime49 = localTime46.minusMillis(35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262400L) + "'", long19 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "14" + "'", str21, "14");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 515 + "'", int47 == 515);
        org.junit.Assert.assertNotNull(localTime49);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int[] intArray4 = localTime3.getValues();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) localTime3);
        java.lang.String str7 = localTime3.toString("17");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime3.getFieldType(6842781);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6842781");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 54, 14, 669]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "17" + "'", str7, "17");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((-1));
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfSecond();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        org.joda.time.LocalTime localTime21 = property19.withMinimumValue();
        java.lang.String str22 = property19.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
    }

    @Test
    @Ignore
  public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        int int20 = localTime19.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6855008 + "'", int20 == 6855008);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        boolean boolean6 = property2.isLeap();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime7.withFieldAdded(durationFieldType8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("48");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"48\": Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property8.addCopy(49);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) ' ');
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 59, chronology13);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 6790130, chronology13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 30, chronology13);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 54, chronology13);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 46, chronology13);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) "1", chronology13);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        long long13 = property2.remainder();
        boolean boolean14 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 756L + "'", long13 == 756L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("secondOfMinute", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        int int16 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.Chronology chronology17 = localTime15.getChronology();
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.now(chronology17);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) durationField7, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) '4');
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Interval interval18 = property2.toInterval();
        java.lang.String str19 = property2.toString();
        java.lang.String str20 = property2.getName();
        java.util.Locale locale22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = property2.setCopy("150", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 150 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[secondOfMinute]" + "'", str19, "Property[secondOfMinute]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("5", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.Interval interval7 = property2.toInterval();
        int int8 = property2.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.setCopy("01:53:19.936");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:19.936\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "16" + "'", str6, "16");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime7 = localTime1.withPeriodAdded(readablePeriod5, 33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        int int6 = localTime5.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        int int15 = localTime8.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        boolean boolean21 = localTime8.isSupported(dateTimeFieldType20);
        org.joda.time.LocalTime.Property property22 = localTime5.property(dateTimeFieldType20);
        org.joda.time.LocalTime localTime24 = property22.addNoWrapToCopy(33);
        java.lang.String str25 = property22.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54 + "'", int6 == 54);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "59" + "'", str25, "59");
    }

    @Test
    @Ignore
  public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.LocalTime localTime9 = localTime7.minusMillis(11);
        int int10 = localTime9.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        org.joda.time.LocalTime localTime17 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        int int19 = localTime18.getHourOfDay();
        org.joda.time.DateTime dateTime20 = localTime18.toDateTimeToday();
        long long21 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime22 = property13.getLocalTime();
        java.lang.String str23 = property13.getAsText();
        org.joda.time.LocalTime localTime25 = property13.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime32 = property28.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property28.getFieldType();
        org.joda.time.LocalTime localTime34 = property28.getLocalTime();
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = localTime34.toDateTimeToday(dateTimeZone36);
        int int38 = property13.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.LocalTime localTime39 = property13.roundCeilingCopy();
        boolean boolean40 = localTime9.equals((java.lang.Object) localTime39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 54 + "'", int10 == 54);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1606262400L) + "'", long21 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "16" + "'", str23, "16");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        int int9 = property2.get();
        java.lang.String str10 = property2.getName();
        int int11 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 16 + "'", int9 == 16);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "secondOfMinute" + "'", str10, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
    }

    @Test
    @Ignore
  public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        int int11 = localTime7.getValue(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime7.withSecondOfMinute(6844446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6844446 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("34");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"34\": Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime8 = property2.setCopy(0);
        org.joda.time.LocalTime localTime9 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute(6813876);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6813876 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = property11.setCopy(7);
        boolean boolean15 = property2.equals((java.lang.Object) localTime14);
        java.lang.String str16 = property2.getName();
        org.joda.time.DurationField durationField17 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "secondOfMinute" + "'", str16, "secondOfMinute");
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localTime2.toDateTimeToday(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        java.util.Locale locale7 = null;
        int int8 = property2.getMaximumShortTextLength(locale7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "17" + "'", str6, "17");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    @Ignore
  public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.minusMinutes((int) '4');
        org.joda.time.LocalTime.Property property19 = localTime18.hourOfDay();
        org.joda.time.LocalTime localTime21 = localTime18.minusHours(57);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime23 = localTime18.plus(readablePeriod22);
        int int24 = localTime18.getHourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = null;
        java.lang.String str26 = localTime18.toString(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:02:17.000" + "'", str26, "01:02:17.000");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        int int9 = localTime8.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.LocalTime localTime18 = localTime15.withHourOfDay(0);
        boolean boolean19 = localTime8.isBefore((org.joda.time.ReadablePartial) localTime18);
        int int20 = localTime8.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 54 + "'", int20 == 54);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((-1606262400));
        org.joda.time.LocalTime localTime12 = localTime7.plusHours((int) (short) 100);
        org.joda.time.LocalTime localTime14 = localTime7.withMillisOfDay(42);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        java.lang.String str7 = localTime6.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime6.getValue(57);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 57");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "01:54:17.032" + "'", str7, "01:54:17.032");
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) '#', 6790130);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        boolean boolean36 = localTime16.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property37 = localTime16.minuteOfHour();
        org.joda.time.DateTime dateTime38 = localTime16.toDateTimeToday();
        int int39 = property2.getDifference((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime40 = property2.roundHalfCeilingCopy();
        boolean boolean41 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 18 + "'", int33 == 18);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1606262399) + "'", int39 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    @Ignore
  public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        boolean boolean10 = localTime3.isAfter((org.joda.time.ReadablePartial) localTime7);
        int[] intArray11 = localTime7.getValues();
        org.joda.time.LocalTime.Property property12 = localTime7.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime18 = property15.withMinimumValue();
        int int19 = property15.getMinimumValue();
        int int20 = property15.getLeapAmount();
        java.util.Locale locale21 = null;
        int int22 = property15.getMaximumTextLength(locale21);
        int int23 = property15.getMinimumValueOverall();
        org.joda.time.LocalTime localTime24 = property15.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        boolean boolean30 = property27.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime32 = property27.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = localTime32.toDateTimeToday(dateTimeZone33);
        int int35 = property15.getDifference((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property12.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        java.lang.String str37 = property12.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 54, 17, 873]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1606262400) + "'", int35 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1606262400001L) + "'", long36 == (-1606262400001L));
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "6857873" + "'", str37, "6857873");
    }

    @Test
    @Ignore
  public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        java.lang.String str21 = localTime19.toString("01:53:34.032");
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.LocalTime localTime32 = localTime29.withMillisOfDay(49);
        org.joda.time.LocalTime localTime34 = localTime29.withMillisOfDay(6790130);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.roundHalfCeilingCopy();
        java.util.Locale locale41 = null;
        int int42 = property37.getMaximumTextLength(locale41);
        org.joda.time.DurationField durationField43 = property37.getDurationField();
        org.joda.time.LocalTime localTime44 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime45 = localTime29.withFields((org.joda.time.ReadablePartial) localTime44);
        int int46 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        int int48 = localTime19.indexOf(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "01:53:34.032" + "'", str21, "01:53:34.032");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime4.getFieldTypes();
        org.joda.time.LocalTime localTime9 = localTime4.withMillisOfDay(56);
        org.joda.time.LocalTime localTime11 = localTime9.minusMinutes(21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsShortText(locale6);
        org.joda.time.Interval interval8 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "18" + "'", str7, "18");
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '4');
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.DurationField durationField9 = property8.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNull(durationField9);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property3.getFieldType();
        int int9 = localTime0.get(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime0.getFieldType(6850000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6850000");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        long long3 = property2.remainder();
        java.lang.String str4 = property2.getName();
        org.joda.time.LocalTime localTime6 = property2.setCopy("33");
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 526L + "'", long3 == 526L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        int int11 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.roundHalfCeilingCopy();
        long long13 = property2.remainder();
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumTextLength(locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 649L + "'", long13 == 649L);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getMillisOfSecond();
        org.joda.time.LocalTime localTime9 = localTime4.minusSeconds(7);
        org.joda.time.LocalTime localTime11 = localTime4.withMillisOfSecond(38);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        boolean boolean13 = localTime4.isSupported(durationFieldType12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.LocalTime localTime8 = property2.addCopy((long) (byte) 1);
        java.lang.String str9 = property2.toString();
        org.joda.time.LocalTime localTime11 = property2.setCopy("9");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property2.addNoWrapToCopy(6849990);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 1, 6802864);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6802864 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.Interval interval13 = property9.toInterval();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        boolean boolean16 = property2.equals((java.lang.Object) property15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property2.getFieldType();
        org.joda.time.LocalTime localTime18 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        org.joda.time.LocalTime localTime25 = property21.withMaximumValue();
        org.joda.time.LocalTime localTime26 = property21.roundHalfFloorCopy();
        boolean boolean27 = localTime18.isEqual((org.joda.time.ReadablePartial) localTime26);
        java.lang.Class<?> wildcardClass28 = localTime18.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 0, 55);
        int int3 = localTime2.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis((int) (byte) -1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        int int18 = localTime15.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = null;
        java.lang.String str20 = localTime15.toString(dateTimeFormatter19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "01:54:20.000" + "'", str20, "01:54:20.000");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((-1606262400L), chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = localTime18.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        org.joda.time.LocalTime.Property property26 = localTime18.property(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalTime.Property property28 = localTime13.property(dateTimeFieldType27);
        org.joda.time.LocalTime localTime29 = property28.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((-1L), chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(17, 15, 45, 6806870, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6806870 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        int int7 = localTime4.getMillisOfSecond();
        org.joda.time.LocalTime localTime9 = localTime4.minusSeconds(7);
        org.joda.time.LocalTime localTime11 = localTime4.withMillisOfSecond(38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime4.withMillisOfSecond(6802864);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6802864 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.Interval interval13 = property9.toInterval();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        boolean boolean16 = property2.equals((java.lang.Object) property15);
        int int17 = property2.getMinimumValueOverall();
        org.joda.time.DurationField durationField18 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(durationField18);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 0, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.LocalTime localTime11 = localTime9.plusHours((int) 'a');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusHours(7);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) '4');
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes(100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime9.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    @Ignore
  public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime19 = property14.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTimeToday(dateTimeZone20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Interval interval23 = property2.toInterval();
        org.joda.time.DateTimeField dateTimeField24 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606262400) + "'", int22 == (-1606262400));
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.DateTime dateTime6 = localTime3.toDateTimeToday();
        int int7 = localTime3.getMinuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime3.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localTime3.isAfter(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 54 + "'", int7 == 54);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    @Ignore
  public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.LocalTime localTime16 = localTime13.plusHours(10);
        int int17 = localTime16.getHourOfDay();
        int int18 = property2.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime19 = property2.withMinimumValue();
        java.lang.String str20 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "21" + "'", str20, "21");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.lang.String str6 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "21" + "'", str6, "21");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606255574L), dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime2.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        int int17 = localTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localTime16.toDateTimeToday();
        long long19 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalTime localTime20 = property11.getLocalTime();
        java.lang.String str21 = property11.getAsText();
        org.joda.time.LocalTime localTime23 = property11.addCopy(6);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localTime25.getFieldTypes();
        int int28 = localTime25.getValue((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime30 = localTime25.plus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = localTime35.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        org.joda.time.LocalTime.Property property43 = localTime35.property(dateTimeFieldType42);
        boolean boolean44 = localTime30.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime localTime46 = localTime8.withField(dateTimeFieldType42, 52);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.LocalTime localTime52 = property49.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime(dateTimeZone53);
        org.joda.time.LocalTime.Property property55 = localTime54.secondOfMinute();
        org.joda.time.LocalTime localTime56 = property55.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property55.getFieldType();
        int int58 = localTime52.get(dateTimeFieldType57);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalTime localTime61 = localTime52.withPeriodAdded(readablePeriod59, (int) (short) 100);
        org.joda.time.LocalTime localTime62 = new org.joda.time.LocalTime((java.lang.Object) localTime61);
        org.joda.time.DateTimeField dateTimeField64 = localTime61.getField((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.LocalTime localTime68 = new org.joda.time.LocalTime(dateTimeZone67);
        org.joda.time.LocalTime.Property property69 = localTime68.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.LocalTime localTime71 = new org.joda.time.LocalTime(dateTimeZone70);
        org.joda.time.LocalTime.Property property72 = localTime71.secondOfMinute();
        org.joda.time.Interval interval73 = property72.toInterval();
        org.joda.time.LocalTime localTime74 = property72.roundFloorCopy();
        int int75 = localTime68.compareTo((org.joda.time.ReadablePartial) localTime74);
        org.joda.time.Chronology chronology76 = localTime74.getChronology();
        org.joda.time.LocalTime localTime77 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology76);
        org.joda.time.LocalTime localTime78 = org.joda.time.LocalTime.fromMillisOfDay((-1606262400L), chronology76);
        org.joda.time.DateTimeZone dateTimeZone79 = null;
        org.joda.time.LocalTime localTime80 = new org.joda.time.LocalTime(dateTimeZone79);
        org.joda.time.LocalTime.Property property81 = localTime80.secondOfMinute();
        org.joda.time.Interval interval82 = property81.toInterval();
        org.joda.time.LocalTime localTime83 = property81.roundFloorCopy();
        org.joda.time.LocalTime localTime85 = localTime83.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone86 = null;
        org.joda.time.LocalTime localTime87 = new org.joda.time.LocalTime(dateTimeZone86);
        org.joda.time.LocalTime.Property property88 = localTime87.secondOfMinute();
        org.joda.time.LocalTime localTime89 = property88.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType90 = property88.getFieldType();
        org.joda.time.LocalTime.Property property91 = localTime83.property(dateTimeFieldType90);
        org.joda.time.DateTimeFieldType dateTimeFieldType92 = property91.getFieldType();
        org.joda.time.LocalTime.Property property93 = localTime78.property(dateTimeFieldType92);
        org.joda.time.LocalTime.Property property94 = localTime61.property(dateTimeFieldType92);
        int int95 = localTime8.indexOf(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262400L) + "'", long19 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "21" + "'", str21, "21");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 22 + "'", int58 == 22);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(property69);
        org.junit.Assert.assertNotNull(property72);
        org.junit.Assert.assertNotNull(interval73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 1 + "'", int75 == 1);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(property81);
        org.junit.Assert.assertNotNull(interval82);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(localTime89);
        org.junit.Assert.assertNotNull(dateTimeFieldType90);
        org.junit.Assert.assertNotNull(property91);
        org.junit.Assert.assertNotNull(dateTimeFieldType92);
        org.junit.Assert.assertNotNull(property93);
        org.junit.Assert.assertNotNull(property94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 2 + "'", int95 == 2);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.setCopy(17);
        java.util.Locale locale7 = null;
        org.joda.time.LocalTime localTime8 = property2.setCopy("34", locale7);
        java.util.Locale locale10 = null;
        java.lang.String str11 = localTime8.toString("58", locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "58" + "'", str11, "58");
    }

    @Test
    @Ignore
  public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.plusMillis(0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime10.minus(readablePeriod14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.withMaximumValue();
        org.joda.time.LocalTime localTime23 = localTime21.withMinuteOfHour(55);
        org.joda.time.DateTimeField[] dateTimeFieldArray24 = localTime21.getFields();
        org.joda.time.LocalTime localTime26 = localTime21.withMillisOfDay(6790130);
        boolean boolean27 = localTime15.equals((java.lang.Object) 6790130);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldArray24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime8 = property2.roundFloorCopy();
        org.joda.time.DateTimeField dateTimeField9 = property2.getField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.Interval interval16 = property15.toInterval();
        org.joda.time.LocalTime localTime17 = property15.roundFloorCopy();
        int int18 = localTime11.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfDay(49);
        org.joda.time.LocalTime localTime22 = localTime17.withMillisOfDay(6790130);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.Interval interval26 = property25.toInterval();
        org.joda.time.LocalTime localTime27 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property25.roundHalfCeilingCopy();
        java.util.Locale locale29 = null;
        int int30 = property25.getMaximumTextLength(locale29);
        org.joda.time.DurationField durationField31 = property25.getDurationField();
        org.joda.time.LocalTime localTime32 = property25.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = localTime17.withFields((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter34 = null;
        java.lang.String str35 = localTime33.toString(dateTimeFormatter34);
        org.joda.time.LocalTime.Property property36 = localTime33.hourOfDay();
        boolean boolean37 = property2.equals((java.lang.Object) localTime33);
        java.util.Locale locale39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = property2.setCopy("01:53:37.086", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:37.086\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "01:54:23.000" + "'", str35, "01:54:23.000");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumShortTextLength(locale12);
        org.joda.time.DurationField durationField14 = property2.getDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property2.getFieldType();
        int int16 = property2.getMinimumValue();
        int int17 = property2.getLeapAmount();
        java.util.Locale locale18 = null;
        int int19 = property2.getMaximumShortTextLength(locale18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "23" + "'", str8, "23");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((-1));
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfSecond();
        int int20 = property19.getMinimumValueOverall();
        long long21 = property19.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 24 + "'", int11 == 24);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property4.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        int int13 = localTime7.get(dateTimeFieldType12);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime16 = localTime7.withPeriodAdded(readablePeriod14, (int) (short) 100);
        org.joda.time.LocalTime localTime18 = localTime7.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime20 = localTime7.plusMillis((-1));
        org.joda.time.LocalTime.Property property21 = localTime7.millisOfSecond();
        boolean boolean22 = localTime0.isEqual((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        int int33 = localTime26.compareTo((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.Chronology chronology34 = localTime32.getChronology();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.fromMillisOfDay((-1606262400L), chronology34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = localTime41.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        org.joda.time.LocalTime.Property property49 = localTime41.property(dateTimeFieldType48);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = property49.getFieldType();
        org.joda.time.LocalTime.Property property51 = localTime36.property(dateTimeFieldType50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = localTime0.withField(dateTimeFieldType50, 6846386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6846386 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 25 + "'", int13 == 25);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
    }

    @Test
    @Ignore
  public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((int) (short) 0, 11);
        boolean boolean23 = localTime0.isEqual((org.joda.time.ReadablePartial) localTime22);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        boolean boolean29 = property26.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField30 = property26.getDurationField();
        boolean boolean31 = localTime0.equals((java.lang.Object) durationField30);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime33 = localTime0.plus(readablePeriod32);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localTime33);
    }

    @Test
    @Ignore
  public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property2.setCopy("56", locale10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        boolean boolean36 = localTime16.isSupported(dateTimeFieldType32);
        org.joda.time.LocalTime.Property property37 = localTime16.minuteOfHour();
        org.joda.time.DateTime dateTime38 = localTime16.toDateTimeToday();
        int int39 = property2.getDifference((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime40 = property2.roundHalfCeilingCopy();
        java.util.Locale locale41 = null;
        java.lang.String str42 = property2.getAsText(locale41);
        org.joda.time.LocalTime localTime43 = property2.withMaximumValue();
        org.joda.time.LocalTime.Property property44 = localTime43.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType46 = localTime43.getFieldType(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25 + "'", int33 == 25);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1606262399) + "'", int39 == (-1606262399));
        org.junit.Assert.assertNotNull(localTime40);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "25" + "'", str42, "25");
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.Interval interval13 = property12.toInterval();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property12.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = localTime15.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        long long19 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        long long24 = property22.remainder();
        int int25 = property22.getLeapAmount();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = property22.getFieldType();
        java.lang.String str27 = property22.getName();
        boolean boolean28 = property2.equals((java.lang.Object) property22);
        org.joda.time.DateTimeField dateTimeField29 = property22.getField();
        java.lang.String str30 = property22.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262434L) + "'", long19 == (-1606262434L));
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 67L + "'", long24 == 67L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "secondOfMinute" + "'", str27, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(dateTimeField29);
// flaky:         org.junit.Assert.assertEquals("'" + str30 + "' != '" + "25" + "'", str30, "25");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 100);
        int int2 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime localTime4 = localTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = localTime9.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        org.joda.time.LocalTime.Property property17 = localTime9.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime1.withField(dateTimeFieldType16, 6842781);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6842781 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        int int8 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        org.joda.time.Interval interval10 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.Chronology chronology15 = localTime5.getChronology();
        org.joda.time.LocalTime.Property property16 = localTime5.millisOfDay();
        org.joda.time.LocalTime localTime17 = property16.roundHalfEvenCopy();
        int int18 = property16.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6865000 + "'", int18 == 6865000);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.Interval interval8 = property2.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.setCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    @Ignore
  public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 33, dateTimeZone1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = null;
        java.lang.String str4 = localTime2.toString(dateTimeFormatter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00:00:00.033" + "'", str4, "00:00:00.033");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = localTime5.withMinuteOfHour(37);
        org.joda.time.LocalTime localTime15 = localTime5.plusHours(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localTime5.getField(706);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 706");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.setCopy(3);
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfSecond(39);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 57, dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.plus(readablePeriod3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime11.withMinuteOfHour(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "27" + "'", str8, "27");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    @Ignore
  public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.DateTime dateTime16 = localTime13.toDateTimeToday();
        int int17 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime13.secondOfMinute();
        boolean boolean19 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime13);
        int int20 = localTime7.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54 + "'", int17 == 54);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime13 = property10.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime14 = localTime5.withFields((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime5.isSupported(durationFieldType15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        java.util.Locale locale13 = null;
        java.lang.String str14 = localTime11.toString("11:53:08.000", locale13);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localTime11.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "11:53:08.000" + "'", str14, "11:53:08.000");
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        boolean boolean5 = property2.equals((java.lang.Object) 911L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((-1606262400L), chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = localTime18.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        org.joda.time.LocalTime.Property property26 = localTime18.property(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalTime.Property property28 = localTime13.property(dateTimeFieldType27);
        int int29 = localTime13.size();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    @Ignore
  public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis(48);
        int int8 = localTime5.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        boolean boolean15 = localTime5.equals((java.lang.Object) localTime14);
        int[] intArray16 = localTime5.getValues();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property19.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        int int28 = localTime22.get(dateTimeFieldType27);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime31 = localTime22.withPeriodAdded(readablePeriod29, (int) (short) 100);
        org.joda.time.LocalTime localTime33 = localTime22.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime();
        int int35 = localTime34.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        int int44 = localTime37.compareTo((org.joda.time.ReadablePartial) localTime43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property47.getFieldType();
        boolean boolean50 = localTime37.isSupported(dateTimeFieldType49);
        org.joda.time.LocalTime.Property property51 = localTime34.property(dateTimeFieldType49);
        org.joda.time.LocalTime localTime53 = localTime34.plusMillis((int) (short) 0);
        int int54 = localTime34.getMillisOfDay();
        org.joda.time.LocalTime localTime55 = localTime33.withFields((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.Chronology chronology56 = localTime55.getChronology();
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime((java.lang.Object) localTime5, chronology56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime(16, 4, 6855008, 0, chronology56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6855008 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 54, 28, 887]");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 29 + "'", int28 == 29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localTime53);
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + 6868888 + "'", int54 == 6868888);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(chronology56);
    }

    @Test
    @Ignore
  public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        int int9 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.Chronology chronology10 = localTime8.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0, chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property16.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property16.getFieldType();
        org.joda.time.LocalTime localTime22 = property16.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.plus(readablePeriod23);
        int[] intArray25 = localTime24.getValues();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        int int37 = localTime31.get(dateTimeFieldType36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalTime localTime40 = localTime31.withPeriodAdded(readablePeriod38, (int) (short) 100);
        org.joda.time.LocalTime localTime42 = localTime31.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime44 = localTime31.plusMillis((-1));
        org.joda.time.LocalTime localTime46 = localTime31.minusMinutes(49);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = property49.getFieldType();
        org.joda.time.LocalTime localTime53 = property49.withMinimumValue();
        org.joda.time.LocalTime localTime54 = new org.joda.time.LocalTime();
        int int55 = localTime54.getHourOfDay();
        org.joda.time.DateTime dateTime56 = localTime54.toDateTimeToday();
        long long57 = property49.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.LocalTime localTime58 = property49.getLocalTime();
        java.lang.String str59 = property49.getAsText();
        org.joda.time.LocalTime localTime61 = property49.addCopy(6);
        org.joda.time.LocalTime localTime63 = localTime61.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime.Property property66 = localTime65.secondOfMinute();
        org.joda.time.Interval interval67 = property66.toInterval();
        org.joda.time.LocalTime localTime68 = property66.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime73 = property71.roundFloorCopy();
        org.joda.time.LocalTime localTime74 = property71.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime(dateTimeZone75);
        org.joda.time.LocalTime.Property property77 = localTime76.secondOfMinute();
        org.joda.time.LocalTime localTime78 = property77.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property77.getFieldType();
        int int80 = localTime74.get(dateTimeFieldType79);
        org.joda.time.LocalTime localTime82 = localTime68.withField(dateTimeFieldType79, 1);
        int int83 = localTime61.get(dateTimeFieldType79);
        int int84 = localTime31.get(dateTimeFieldType79);
        int int85 = localTime24.get(dateTimeFieldType79);
        boolean boolean86 = localTime13.isSupported(dateTimeFieldType79);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(intArray25);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[1, 54, 28, 949]");
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 29 + "'", int37 == 29);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1606262400L) + "'", long57 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "28" + "'", str59, "28");
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 29 + "'", int80 == 29);
        org.junit.Assert.assertNotNull(localTime82);
// flaky:         org.junit.Assert.assertTrue("'" + int83 + "' != '" + 34 + "'", int83 == 34);
// flaky:         org.junit.Assert.assertTrue("'" + int84 + "' != '" + 29 + "'", int84 == 29);
// flaky:         org.junit.Assert.assertTrue("'" + int85 + "' != '" + 28 + "'", int85 == 28);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(6790130);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        org.joda.time.LocalTime localTime16 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    @Ignore
  public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        int int11 = property9.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property9.getDifference(readableInstant12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = localTime21.toDateTimeToday(dateTimeZone22);
        org.joda.time.DateTime dateTime24 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property9.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean26 = property2.equals((java.lang.Object) int25);
        org.joda.time.LocalTime localTime27 = property2.getLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 29 + "'", int4 == 29);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1606262400) + "'", int13 == (-1606262400));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = null;
        java.lang.String str3 = localTime1.toString(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00:00:00.097" + "'", str3, "00:00:00.097");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime8.getFieldType(6842781);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6842781");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    @Ignore
  public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        int int36 = localTime14.get(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        int int48 = localTime42.get(dateTimeFieldType47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime51 = localTime42.withPeriodAdded(readablePeriod49, (int) (short) 100);
        org.joda.time.LocalTime localTime53 = localTime42.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime55 = localTime42.minusMinutes((int) '4');
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.Interval interval59 = property58.toInterval();
        org.joda.time.LocalTime localTime60 = property58.roundFloorCopy();
        org.joda.time.LocalTime localTime62 = property58.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property58.getFieldType();
        int int64 = localTime55.indexOf(dateTimeFieldType63);
        org.joda.time.LocalTime localTime66 = localTime14.withField(dateTimeFieldType63, 20);
        org.joda.time.LocalTime localTime68 = localTime14.withSecondOfMinute(38);
        org.joda.time.LocalTime localTime70 = localTime14.minusMillis((-1));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "30" + "'", str12, "30");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 30 + "'", int33 == 30);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 36 + "'", int36 == 36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 30 + "'", int48 == 30);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime70);
    }

    @Test
    @Ignore
  public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime19 = property14.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTimeToday(dateTimeZone20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
        int int23 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606262400) + "'", int22 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30 + "'", int23 == 30);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 6823607);
        int int2 = localTime1.getMillisOfDay();
        int int3 = localTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6823607 + "'", int2 == 6823607);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 607 + "'", int3 == 607);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "48");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"48\": Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localTime4.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime4.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localTime4.getField((-1606262399));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606262399");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(52, 6846831, (int) ' ', 6790130);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(28);
        int int8 = localTime7.size();
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localTime7.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        org.joda.time.LocalTime localTime19 = localTime15.plusSeconds(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = null;
        java.lang.String str21 = localTime15.toString(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "01:54:32.000" + "'", str21, "01:54:32.000");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.withMaximumValue();
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((int) '4');
        int int17 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.Interval interval18 = property2.toInterval();
        java.lang.String str19 = property2.toString();
        java.lang.String str20 = property2.getName();
        int int21 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[secondOfMinute]" + "'", str19, "Property[secondOfMinute]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "secondOfMinute" + "'", str20, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime4.property(dateTimeFieldType15);
        java.util.Locale locale19 = null;
        java.lang.String str20 = localTime4.toString("01:53:19.936", locale19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        int int37 = localTime31.get(dateTimeFieldType36);
        org.joda.time.LocalTime localTime39 = localTime25.withField(dateTimeFieldType36, 1);
        org.joda.time.DurationFieldType durationFieldType40 = null;
        boolean boolean41 = localTime39.isSupported(durationFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime(dateTimeZone42);
        org.joda.time.LocalTime.Property property44 = localTime43.secondOfMinute();
        org.joda.time.LocalTime localTime45 = property44.getLocalTime();
        org.joda.time.LocalTime localTime46 = property44.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property44.getFieldType();
        int int48 = localTime39.indexOf(dateTimeFieldType47);
        int int49 = localTime4.indexOf(dateTimeFieldType47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "01:53:19.936" + "'", str20, "01:53:19.936");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
    }

    @Test
    @Ignore
  public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withMillisOfDay(57);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        org.joda.time.LocalTime localTime17 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        int int19 = localTime18.getHourOfDay();
        org.joda.time.DateTime dateTime20 = localTime18.toDateTimeToday();
        long long21 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime22 = property13.getLocalTime();
        java.lang.String str23 = property13.getAsText();
        org.joda.time.LocalTime localTime25 = property13.addCopy(6);
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property35.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        int int44 = localTime38.get(dateTimeFieldType43);
        org.joda.time.LocalTime localTime46 = localTime32.withField(dateTimeFieldType43, 1);
        int int47 = localTime25.get(dateTimeFieldType43);
        org.joda.time.LocalTime localTime49 = localTime10.withField(dateTimeFieldType43, 6);
        org.joda.time.LocalTime.Property property50 = localTime10.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1606262400L) + "'", long21 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32" + "'", str23, "32");
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(localTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 38 + "'", int47 == 38);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(property50);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addCopy(49);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = property9.setCopy(7);
        org.joda.time.LocalTime localTime13 = localTime4.withFields((org.joda.time.ReadablePartial) localTime12);
        int[] intArray14 = localTime4.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 55, 21, 279]");
    }

    @Test
    @Ignore
  public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime0.plusMillis((int) (short) 0);
        java.lang.String str21 = localTime19.toString("01:53:34.032");
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.Interval interval28 = property27.toInterval();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        int int30 = localTime23.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.LocalTime localTime32 = localTime29.withMillisOfDay(49);
        org.joda.time.LocalTime localTime34 = localTime29.withMillisOfDay(6790130);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.roundHalfCeilingCopy();
        java.util.Locale locale41 = null;
        int int42 = property37.getMaximumTextLength(locale41);
        org.joda.time.DurationField durationField43 = property37.getDurationField();
        org.joda.time.LocalTime localTime44 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime45 = localTime29.withFields((org.joda.time.ReadablePartial) localTime44);
        int int46 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.LocalTime localTime48 = localTime19.minusHours(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType50 = localTime19.getFieldType(33);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 33");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "01:53:34.032" + "'", str21, "01:53:34.032");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(localTime48);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(11, 6852601, 35, 14, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6852601 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.addWrapFieldToCopy((int) (byte) -1);
        int int12 = localTime11.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime11.withFieldAdded(durationFieldType13, 6868375);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32" + "'", str8, "32");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime9 = localTime7.plusHours((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime7.plus(readablePeriod10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.Interval interval18 = property14.toInterval();
        org.joda.time.LocalTime localTime19 = property14.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property14.getFieldType();
        int int21 = localTime7.get(dateTimeFieldType20);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime7.withFieldAdded(durationFieldType22, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = localTime13.get(dateTimeFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = null;
        boolean boolean21 = localTime13.isSupported(durationFieldType20);
        org.joda.time.LocalTime localTime22 = localTime7.withFields((org.joda.time.ReadablePartial) localTime13);
        int[] intArray23 = localTime22.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(intArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 54, 33, 0]");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((-1));
        org.joda.time.LocalTime localTime32 = localTime17.minusMinutes(49);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long45 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property2.get();
        org.joda.time.LocalTime localTime47 = property2.getLocalTime();
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((java.lang.Object) localTime47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField50 = localTime47.getField(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "33" + "'", str8, "33");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 33 + "'", int23 == 33);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1606262426L) + "'", long45 == (-1606262426L));
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 33 + "'", int46 == 33);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(6868375, 6, 6846831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6868375 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 57, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.LocalTime localTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        int int14 = localTime8.get(dateTimeFieldType13);
        int int15 = localTime2.indexOf(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime2.withHourOfDay(56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    @Ignore
  public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime4.millisOfSecond();
        org.joda.time.LocalTime.Property property9 = localTime4.secondOfMinute();
        int int10 = localTime4.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) localTime5, dateTimeZone6);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime6 = property2.roundCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime6.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime10 = property2.setCopy("15");
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime12.plusMillis(48);
        org.joda.time.LocalTime localTime16 = localTime14.minusHours((-1606262400));
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        int int25 = localTime18.compareTo((org.joda.time.ReadablePartial) localTime24);
        boolean boolean26 = localTime14.equals((java.lang.Object) localTime24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        int int35 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        boolean boolean41 = localTime28.isSupported(dateTimeFieldType40);
        org.joda.time.LocalTime.Property property42 = localTime24.property(dateTimeFieldType40);
        org.joda.time.LocalTime.Property property43 = localTime10.property(dateTimeFieldType40);
        java.util.Locale locale44 = null;
        int int45 = property43.getMaximumTextLength(locale44);
        org.joda.time.LocalTime localTime46 = property43.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "34" + "'", str7, "34");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(localTime46);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(42, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, (int) ' ', 57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localTime3.getField(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 38");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(57);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        int int20 = localTime14.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime23 = localTime14.withPeriodAdded(readablePeriod21, (int) (short) 100);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) localTime23);
        org.joda.time.LocalTime.Property property25 = localTime24.millisOfSecond();
        boolean boolean26 = localTime6.isEqual((org.joda.time.ReadablePartial) localTime24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime6.withHourOfDay(6849990);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6849990 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    @Ignore
  public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("12", locale9);
        org.joda.time.LocalTime localTime12 = property2.addWrapFieldToCopy(52);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localTime14.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property2.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalTime localTime25 = property2.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = property2.setCopy("00:25:38.790");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"00:25:38.790\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "35" + "'", str7, "35");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalTime localTime7 = localTime5.minus(readablePeriod6);
        java.lang.String str8 = localTime5.toString();
        java.lang.String str10 = localTime5.toString("01:53:23.000");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01:54:36.000" + "'", str8, "01:54:36.000");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01:53:23.000" + "'", str10, "01:53:23.000");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.plus(readablePeriod9);
        org.joda.time.LocalTime localTime12 = localTime8.minusHours(39);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.Interval interval13 = property9.toInterval();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        boolean boolean16 = property2.equals((java.lang.Object) property15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property2.getFieldType();
        org.joda.time.LocalTime localTime18 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime19 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    @Ignore
  public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.setCopy("1");
        org.joda.time.LocalTime localTime15 = property2.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "36" + "'", str12, "36");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = localTime4.withField(dateTimeFieldType15, 1);
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.LocalTime localTime22 = localTime18.minusMillis(53);
        org.joda.time.LocalTime localTime24 = localTime22.plusSeconds(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        boolean boolean11 = localTime1.equals((java.lang.Object) localTime10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = property14.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property14.getFieldType();
        org.joda.time.LocalTime localTime20 = property14.getLocalTime();
        int int21 = localTime20.getSecondOfMinute();
        int int22 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 36 + "'", int21 == 36);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localTime4.getFieldTypes();
        org.joda.time.LocalTime localTime9 = localTime4.withMillisOfDay(56);
        int int10 = localTime9.size();
        int int11 = localTime9.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.Chronology chronology22 = localTime20.getChronology();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology22);
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((-1L), chronology22);
        org.joda.time.LocalTime localTime26 = localTime24.plusMillis(38);
        org.joda.time.LocalTime localTime27 = localTime9.withFields((org.joda.time.ReadablePartial) localTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField29 = localTime9.getField(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 46");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(23, 6855008, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6855008 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((-1));
        org.joda.time.LocalTime localTime32 = localTime17.minusMinutes(49);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long45 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property2.get();
        org.joda.time.LocalTime localTime48 = property2.addCopy((long) 6823607);
        org.joda.time.LocalTime.Property property49 = localTime48.millisOfSecond();
        org.joda.time.LocalTime localTime51 = property49.addNoWrapToCopy(426);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) property49, dateTimeZone52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "37" + "'", str8, "37");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 38 + "'", int23 == 38);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1606262422L) + "'", long45 == (-1606262422L));
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 37 + "'", int46 == 37);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime51);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        long long3 = property2.remainder();
        java.lang.String str4 = property2.getName();
        int int5 = property2.getMinimumValue();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsText(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy(9);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property2.setCopy("01:53:50.560", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:50.560\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 15L + "'", long3 == 15L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38" + "'", str7, "38");
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.secondOfMinute();
        boolean boolean8 = property7.isLeap();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        boolean boolean11 = property7.isLeap();
        org.joda.time.DateTimeField dateTimeField12 = property7.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.get();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        long long12 = property10.remainder();
        boolean boolean13 = property2.equals((java.lang.Object) property10);
        java.lang.String str14 = property10.getAsString();
        org.joda.time.LocalTime localTime16 = property10.setCopy("57");
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime16.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 38 + "'", int7 == 38);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 289L + "'", long12 == 289L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "38" + "'", str14, "38");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property7.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime13 = localTime11.minusMinutes(57);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now(chronology14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(202L, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(17, 706, 6875290, (int) (byte) -1, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 706 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        long long6 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 588L + "'", long6 == 588L);
    }

    @Test
    @Ignore
  public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("12", locale9);
        org.joda.time.LocalTime localTime12 = property2.addWrapFieldToCopy(52);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localTime14.toDateTime((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property2.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.DateTimeField dateTimeField25 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "38" + "'", str7, "38");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property2.addCopy(49);
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = property9.setCopy(7);
        org.joda.time.LocalTime localTime13 = localTime4.withFields((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime12.withFieldAdded(durationFieldType14, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.Interval interval13 = property9.toInterval();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        boolean boolean16 = property2.equals((java.lang.Object) property15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property2.getFieldType();
        java.lang.String str18 = property2.getAsString();
        org.joda.time.Interval interval19 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "38" + "'", str18, "38");
        org.junit.Assert.assertNotNull(interval19);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        boolean boolean6 = property3.equals((java.lang.Object) false);
        int int7 = property3.getLeapAmount();
        java.lang.String str8 = property3.getAsShortText();
        java.util.Locale locale10 = null;
        org.joda.time.LocalTime localTime11 = property3.setCopy("12", locale10);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((-1606262439L), chronology12);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "39" + "'", str8, "39");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        int int1 = localTime0.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localTime0.isSupported(durationFieldType2);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property9.getFieldType();
        boolean boolean13 = property9.isLeap();
        java.util.Locale locale14 = null;
        int int15 = property9.getMaximumShortTextLength(locale14);
        org.joda.time.DurationField durationField16 = property9.getLeapDurationField();
        org.joda.time.LocalTime localTime17 = property9.roundCeilingCopy();
        int int18 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNull(durationField16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property3.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime9 = localTime7.minusMinutes(57);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(202L, chronology10);
        int int13 = localTime12.getMillisOfDay();
        org.joda.time.LocalTime localTime15 = localTime12.plusSeconds(100);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 202 + "'", int13 == 202);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        boolean boolean12 = property9.equals((java.lang.Object) false);
        org.joda.time.Interval interval13 = property9.toInterval();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property15 = localTime14.hourOfDay();
        boolean boolean16 = property2.equals((java.lang.Object) property15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property2.getFieldType();
        org.joda.time.LocalTime localTime18 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property21.getFieldType();
        org.joda.time.LocalTime localTime25 = property21.withMaximumValue();
        org.joda.time.LocalTime localTime26 = property21.roundHalfFloorCopy();
        boolean boolean27 = localTime18.isEqual((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.LocalTime localTime29 = localTime18.plusMillis((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType31 = localTime29.getFieldType(55);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 55");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.LocalTime.Property property16 = localTime15.millisOfSecond();
        org.joda.time.DurationField durationField17 = property16.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.roundHalfEvenCopy();
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        org.joda.time.LocalTime localTime10 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumTextLength(locale12);
        org.joda.time.LocalTime localTime15 = property8.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime.Property property16 = localTime15.minuteOfHour();
        org.joda.time.LocalTime localTime18 = localTime15.withMinuteOfHour((int) (short) 10);
        boolean boolean19 = localTime5.isEqual((org.joda.time.ReadablePartial) localTime18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime.Property property8 = localTime4.millisOfSecond();
        org.joda.time.LocalTime.Property property9 = localTime4.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime4.minus(readablePeriod10);
        org.joda.time.LocalTime.Property property12 = localTime4.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("30");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"30\": Value 30 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 6823607);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localTime1.toDateTimeToday(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        int int18 = localTime15.getMinuteOfHour();
        org.joda.time.LocalTime localTime20 = localTime15.withHourOfDay(11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 54 + "'", int18 == 54);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    @Ignore
  public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("12", locale9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(26);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        int int21 = localTime14.compareTo((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.LocalTime localTime23 = localTime20.plusHours(10);
        int int24 = localTime23.getHourOfDay();
        boolean boolean25 = localTime12.isBefore((org.joda.time.ReadablePartial) localTime23);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = localTime23.getValue(6813876);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6813876");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        boolean boolean8 = property2.isLeap();
        int int9 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime9 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond(57);
        org.joda.time.LocalTime localTime14 = localTime10.minusMinutes(3);
        org.joda.time.LocalTime localTime16 = localTime14.withSecondOfMinute(55);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        int int22 = localTime16.get(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime9.withField(dateTimeFieldType21, (-1606262399));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262399 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 55 + "'", int22 == 55);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        int int9 = localTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    @Ignore
  public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        java.lang.String str9 = property2.getAsShortText();
        org.joda.time.DurationField durationField10 = property2.getRangeDurationField();
        java.util.Locale locale12 = null;
        org.joda.time.LocalTime localTime13 = property2.setCopy("48", locale12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        int int16 = localTime15.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property19.getFieldType();
        org.joda.time.LocalTime localTime23 = property19.withMinimumValue();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime();
        int int25 = localTime24.getHourOfDay();
        org.joda.time.DateTime dateTime26 = localTime24.toDateTimeToday();
        long long27 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime28 = property19.getLocalTime();
        java.lang.String str29 = property19.getAsText();
        org.joda.time.LocalTime localTime31 = property19.addCopy(6);
        boolean boolean32 = localTime15.isAfter((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.Interval interval41 = property40.toInterval();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        org.joda.time.LocalTime localTime43 = property40.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localTime43.toDateTimeToday(dateTimeZone44);
        org.joda.time.DateTime dateTime46 = localTime37.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        long long47 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.DateTime dateTime48 = localTime31.toDateTime((org.joda.time.ReadableInstant) dateTime45);
        int int49 = property2.getDifference((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTimeField dateTimeField50 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "42" + "'", str9, "42");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6882618 + "'", int16 == 6882618);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1606262400L) + "'", long27 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertEquals("'" + str29 + "' != '" + "42" + "'", str29, "42");
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(interval41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1606262417L) + "'", long47 == (-1606262417L));
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1606262406) + "'", int49 == (-1606262406));
        org.junit.Assert.assertNotNull(dateTimeField50);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        boolean boolean8 = property2.isLeap();
        org.joda.time.LocalTime localTime10 = property2.setCopy("15");
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime13 = localTime11.minusMinutes(6865000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "42" + "'", str7, "42");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime12 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withSecondOfMinute(6846831);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6846831 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "43" + "'", str8, "43");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        java.lang.Class<?> wildcardClass8 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 6842781);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime11 = property2.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.LocalTime localTime28 = localTime17.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime30 = localTime17.plusMillis((-1));
        org.joda.time.LocalTime localTime32 = localTime17.minusMinutes(49);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property37.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localTime40.toDateTimeToday(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.DateTime dateTime44 = localTime32.toDateTime((org.joda.time.ReadableInstant) dateTime42);
        long long45 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime42);
        int int46 = property2.get();
        org.joda.time.LocalTime localTime48 = property2.addCopy((long) 6823607);
        org.joda.time.LocalTime.Property property49 = localTime48.millisOfSecond();
        org.joda.time.LocalTime localTime51 = property49.addNoWrapToCopy(426);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((java.lang.Object) 426);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "43" + "'", str8, "43");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 44 + "'", int23 == 44);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-1606262416L) + "'", long45 == (-1606262416L));
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 43 + "'", int46 == 43);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime51);
    }

    @Test
    @Ignore
  public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property17.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property17.getFieldType();
        org.joda.time.LocalTime localTime23 = property17.getLocalTime();
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = localTime23.toDateTimeToday(dateTimeZone25);
        int int27 = property2.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime28 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44" + "'", str12, "44");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localTime9.getField(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44" + "'", str8, "44");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute(3);
        org.joda.time.LocalTime.Property property11 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        int int13 = localTime12.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    @Ignore
  public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(53);
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        int int17 = localTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localTime16.toDateTimeToday();
        long long19 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        int int20 = property2.getDifference((org.joda.time.ReadableInstant) dateTime18);
        long long21 = property2.remainder();
        org.joda.time.LocalTime localTime22 = property2.roundFloorCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262400L) + "'", long19 == (-1606262400L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1606262400) + "'", int20 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 809L + "'", long21 == 809L);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.joda.time.LocalTime localTime13 = property2.addCopy((long) 100);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        java.util.Locale locale16 = null;
        java.lang.String str17 = property2.getAsShortText(locale16);
        int int18 = property2.getMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "45" + "'", str8, "45");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "45" + "'", str17, "45");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 59 + "'", int18 == 59);
    }

    @Test
    @Ignore
  public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusMillis((int) (short) 0);
        org.joda.time.LocalTime localTime5 = localTime3.withMillisOfDay(706);
        org.joda.time.LocalTime.Property property6 = localTime5.millisOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property2.addCopy((-1606262455L));
        org.joda.time.DurationField durationField8 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property5.addCopy(49);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfSecond((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 59, chronology10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 6790130, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 30, chronology10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localTime13.toString(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "00:00:00.030" + "'", str15, "00:00:00.030");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusSeconds(6802864);
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfDay(54);
        java.util.Locale locale4 = null;
        java.lang.String str5 = localTime0.toString("59", locale4);
        int int6 = localTime0.getMillisOfSecond();
        org.joda.time.LocalTime localTime8 = localTime0.plusHours((int) ' ');
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "59" + "'", str5, "59");
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 845 + "'", int6 == 845);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        int int6 = localTime5.getMinuteOfHour();
        java.lang.String str7 = localTime5.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54 + "'", int6 == 54);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "01:54:59.886" + "'", str7, "01:54:59.886");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property14.getFieldType();
        org.joda.time.LocalTime localTime17 = property14.withMinimumValue();
        int int18 = property14.getMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        boolean boolean24 = property21.equals((java.lang.Object) false);
        org.joda.time.Interval interval25 = property21.toInterval();
        org.joda.time.LocalTime localTime26 = property21.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property27 = localTime26.hourOfDay();
        boolean boolean28 = property14.equals((java.lang.Object) property27);
        boolean boolean29 = localTime7.equals((java.lang.Object) property27);
        int int30 = localTime7.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 46 + "'", int30 == 46);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale9 = null;
        org.joda.time.LocalTime localTime10 = property2.setCopy("12", locale9);
        java.lang.Class<?> wildcardClass11 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "46" + "'", str7, "46");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.Chronology chronology14 = localTime12.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(845, 6818450, 6862446, 24, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 845 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        java.lang.String str8 = property2.getAsString();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        boolean boolean11 = property2.isLeap();
        org.joda.time.LocalTime localTime13 = property2.addCopy((long) 100);
        java.lang.String str14 = property2.getAsString();
        java.lang.Class<?> wildcardClass15 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "47" + "'", str8, "47");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "47" + "'", str14, "47");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    @Ignore
  public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.minusMillis(48);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime16.getValue(6865000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6865000");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "47" + "'", str12, "47");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.secondOfMinute();
        boolean boolean8 = property7.isLeap();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        org.joda.time.LocalTime localTime11 = property7.getLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalTime localTime17 = localTime15.minus(readablePeriod16);
        org.joda.time.LocalTime localTime19 = localTime15.plusSeconds(12);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime21 = localTime19.minus(readablePeriod20);
        org.joda.time.LocalTime localTime23 = localTime19.minusSeconds((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localTime8.isSupported(durationFieldType10);
        int int12 = localTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Chronology chronology11 = localTime9.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 49, chronology11);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((-1606262400L), chronology11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.Interval interval17 = property16.toInterval();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = localTime18.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        org.joda.time.LocalTime.Property property26 = localTime18.property(dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property26.getFieldType();
        org.joda.time.LocalTime.Property property28 = localTime13.property(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField30 = localTime13.getField(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:53:23.000");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withMillisOfDay(54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime2.withSecondOfMinute(6862446);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6862446 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    @Ignore
  public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.ReadableInstant readableInstant5 = null;
        int int6 = property2.getDifference(readableInstant5);
        org.joda.time.LocalTime localTime8 = property2.addCopy(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime8.withSecondOfMinute(6823000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6823000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1606262400) + "'", int6 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.getAsText();
        org.joda.time.LocalTime localTime10 = property2.setCopy(4);
        java.lang.Class<?> wildcardClass11 = localTime10.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "50" + "'", str8, "50");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(999, 706, 845);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int2 = localTime1.getMillisOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfSecond();
        org.joda.time.LocalTime.Property property4 = localTime1.minuteOfHour();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6891278 + "'", int2 == 6891278);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (short) 0, 11);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = localTime13.get(dateTimeFieldType18);
        org.joda.time.LocalTime localTime21 = localTime7.withField(dateTimeFieldType18, 1);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        boolean boolean23 = localTime21.isSupported(durationFieldType22);
        org.joda.time.LocalTime localTime25 = localTime21.minusMillis(53);
        org.joda.time.LocalTime.Property property26 = localTime25.minuteOfHour();
        int int27 = localTime25.getMillisOfDay();
        boolean boolean28 = localTime2.isEqual((org.joda.time.ReadablePartial) localTime25);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localTime25.getValue(6876183);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6876183");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6840947 + "'", int27 == 6840947);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    @Ignore
  public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.DateTime dateTime16 = localTime13.toDateTimeToday();
        int int17 = localTime13.getMinuteOfHour();
        org.joda.time.LocalTime.Property property18 = localTime13.secondOfMinute();
        boolean boolean19 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime13);
        int int20 = localTime13.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 54 + "'", int17 == 54);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime7 = property2.addWrapFieldToCopy(7);
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "51" + "'", str9, "51");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime4.property(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime();
        int int19 = property17.compareTo((org.joda.time.ReadablePartial) localTime18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime18.getValue(6848457);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6848457");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DurationField durationField9 = property2.getLeapDurationField();
        int int10 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    @Ignore
  public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        boolean boolean16 = localTime3.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime.Property property17 = localTime0.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        int int26 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime25);
        org.joda.time.LocalTime localTime28 = localTime25.plusHours(10);
        int int29 = localTime28.getHourOfDay();
        int int30 = property17.compareTo((org.joda.time.ReadablePartial) localTime28);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = localTime28.getFieldTypes();
        org.joda.time.LocalTime localTime33 = localTime28.plusMillis(2);
        int[] intArray34 = localTime28.getValues();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 11 + "'", int29 == 11);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[11, 54, 52, 0]");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(6790130);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalTime localTime15 = localTime13.plus(readablePeriod14);
        org.joda.time.LocalTime localTime17 = localTime13.minusHours((int) (byte) 1);
        org.joda.time.LocalTime.Property property18 = localTime13.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMillis(48);
        int int4 = localTime1.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        boolean boolean11 = localTime1.equals((java.lang.Object) localTime10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localTime10.getFieldTypes();
        org.joda.time.LocalTime localTime14 = localTime10.minusSeconds((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = localTime19.plusMillis((int) ' ');
        int int22 = localTime19.getMillisOfSecond();
        org.joda.time.LocalTime localTime24 = localTime19.minusSeconds(7);
        int int25 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime30 = localTime27.withMillisOfDay((int) '#');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray31 = localTime30.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalTime localTime34 = localTime30.withPeriodAdded(readablePeriod32, 19);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = localTime30.getFieldType(0);
        boolean boolean37 = localTime19.isBefore((org.joda.time.ReadablePartial) localTime30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime19.withSecondOfMinute(6839360);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6839360 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localTime24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray31);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.withMinuteOfHour(55);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localTime5.getFields();
        org.joda.time.LocalTime localTime10 = localTime5.withMillisOfDay(6790130);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        boolean boolean17 = property13.isLeap();
        org.joda.time.LocalTime localTime19 = property13.setCopy("31");
        org.joda.time.LocalTime localTime20 = localTime10.withFields((org.joda.time.ReadablePartial) localTime19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.joda.time.LocalTime localTime13 = property2.addWrapFieldToCopy(6790130);
        java.util.Locale locale14 = null;
        int int15 = property2.getMaximumShortTextLength(locale14);
        int int16 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        int int23 = localTime17.get(dateTimeFieldType22);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalTime localTime26 = localTime17.withPeriodAdded(readablePeriod24, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property29.getFieldType();
        org.joda.time.LocalTime localTime33 = property29.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.Interval interval37 = property36.toInterval();
        org.joda.time.LocalTime localTime38 = property36.roundFloorCopy();
        org.joda.time.LocalTime localTime40 = property36.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property36.getFieldType();
        org.joda.time.LocalTime.Property property42 = localTime33.property(dateTimeFieldType41);
        org.joda.time.LocalTime localTime44 = localTime17.withField(dateTimeFieldType41, (int) (short) 1);
        org.joda.time.LocalTime.Property property45 = localTime11.property(dateTimeFieldType41);
        java.util.Locale locale46 = null;
        int int47 = property45.getMaximumTextLength(locale46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 53 + "'", int23 == 53);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        boolean boolean8 = property2.isLeap();
        java.lang.String str9 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[secondOfMinute]" + "'", str9, "Property[secondOfMinute]");
    }

    @Test
    @Ignore
  public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property11.getFieldType();
        org.joda.time.LocalTime localTime15 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime();
        int int17 = localTime16.getHourOfDay();
        org.joda.time.DateTime dateTime18 = localTime16.toDateTimeToday();
        long long19 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalTime localTime20 = property11.getLocalTime();
        java.lang.String str21 = property11.getAsText();
        org.joda.time.LocalTime localTime23 = property11.addCopy(6);
        org.joda.time.LocalTime localTime25 = localTime23.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = localTime25.getFieldTypes();
        int int28 = localTime25.getValue((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalTime localTime30 = localTime25.plus(readablePeriod29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = localTime35.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        org.joda.time.LocalTime.Property property43 = localTime35.property(dateTimeFieldType42);
        boolean boolean44 = localTime30.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime localTime46 = localTime8.withField(dateTimeFieldType42, 52);
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        org.joda.time.LocalTime localTime48 = localTime46.plus(readablePeriod47);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1606262400L) + "'", long19 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "53" + "'", str21, "53");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime.Property property10 = localTime9.minuteOfHour();
        int int11 = property10.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
    }

    @Test
    @Ignore
  public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime19 = property14.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTimeToday(dateTimeZone20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Interval interval23 = property2.toInterval();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property26.getFieldType();
        org.joda.time.LocalTime localTime30 = property26.withMinimumValue();
        org.joda.time.LocalTime localTime31 = property26.withMaximumValue();
        org.joda.time.LocalTime localTime32 = property26.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.Interval interval36 = property35.toInterval();
        org.joda.time.LocalTime localTime37 = property35.roundFloorCopy();
        org.joda.time.LocalTime localTime38 = property35.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        int int44 = localTime38.get(dateTimeFieldType43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.LocalTime localTime47 = localTime38.withPeriodAdded(readablePeriod45, (int) (short) 100);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((java.lang.Object) localTime47);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = localTime47.toDateTimeToday(dateTimeZone49);
        int int51 = property26.compareTo((org.joda.time.ReadableInstant) dateTime50);
        int int52 = property2.compareTo((org.joda.time.ReadableInstant) dateTime50);
        java.util.Locale locale53 = null;
        int int54 = property2.getMaximumTextLength(locale53);
        java.util.Locale locale56 = null;
        org.joda.time.LocalTime localTime57 = property2.setCopy("29", locale56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606262400) + "'", int22 == (-1606262400));
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 54 + "'", int44 == 54);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2 + "'", int54 == 2);
        org.junit.Assert.assertNotNull(localTime57);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.LocalTime localTime23 = localTime21.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((long) 0, chronology24);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) localTime16, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime26.withMillisOfSecond((-1606262406));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262406 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    @Ignore
  public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.LocalTime localTime18 = localTime14.plusMillis((-1606262406));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "54" + "'", str12, "54");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond(57);
        org.joda.time.Chronology chronology7 = localTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((int) (byte) -1, 11, 100, 18, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    @Ignore
  public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.DurationField durationField13 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "55" + "'", str12, "55");
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 19, dateTimeZone1);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6850000, 6823607, 6868375, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6850000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = property2.addWrapFieldToCopy(58);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime5.getFieldType(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property10.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property16.getFieldType();
        int int19 = localTime13.get(dateTimeFieldType18);
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalTime localTime22 = localTime13.withPeriodAdded(readablePeriod20, (int) (short) 100);
        org.joda.time.LocalTime localTime24 = localTime13.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime26 = localTime13.plusMillis((-1));
        org.joda.time.LocalTime.Property property27 = localTime13.millisOfSecond();
        int int28 = localTime13.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        boolean boolean34 = property31.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime36 = property31.addCopy((int) (byte) 0);
        java.lang.String str37 = property31.getAsString();
        org.joda.time.LocalTime localTime38 = property31.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime40 = property31.setCopy("1");
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        org.joda.time.LocalTime localTime46 = property43.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        int int52 = localTime46.get(dateTimeFieldType51);
        org.joda.time.ReadablePeriod readablePeriod53 = null;
        org.joda.time.LocalTime localTime55 = localTime46.withPeriodAdded(readablePeriod53, (int) (short) 100);
        org.joda.time.LocalTime localTime57 = localTime46.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime59 = localTime46.plusMillis((-1));
        org.joda.time.LocalTime localTime61 = localTime46.minusMinutes(49);
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime((long) 50);
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.LocalTime localTime65 = new org.joda.time.LocalTime(dateTimeZone64);
        org.joda.time.LocalTime.Property property66 = localTime65.secondOfMinute();
        org.joda.time.Interval interval67 = property66.toInterval();
        org.joda.time.LocalTime localTime68 = property66.roundFloorCopy();
        org.joda.time.LocalTime localTime69 = property66.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localTime69.toDateTimeToday(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = localTime63.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localTime61.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        long long74 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime75 = localTime13.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        boolean boolean76 = localTime5.isEqual((org.joda.time.ReadablePartial) localTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime78 = localTime5.withSecondOfMinute(202);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 202 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 56 + "'", int19 == 56);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 56 + "'", int28 == 56);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localTime36);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "55" + "'", str37, "55");
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
// flaky:         org.junit.Assert.assertTrue("'" + int52 + "' != '" + 56 + "'", int52 == 56);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1606262404L) + "'", long74 == (-1606262404L));
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("41");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"41\": Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.getValue(426);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 426");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime9 = property2.addNoWrapToCopy((int) (byte) -1);
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        org.joda.time.DurationField durationField11 = property2.getLeapDurationField();
        int int12 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    @Ignore
  public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        int int6 = property2.getMinimumValue();
        int int7 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        int int10 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime19 = property14.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTimeToday(dateTimeZone20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalTime localTime23 = property2.withMaximumValue();
        java.lang.String str24 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606262400) + "'", int22 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "56" + "'", str24, "56");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 6823607);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    @Ignore
  public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.LocalTime localTime3 = localTime0.plusMillis((int) (short) 0);
        org.joda.time.LocalTime.Property property4 = localTime0.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalTime localTime6 = localTime0.minus(readablePeriod5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6850374, 6877442);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6850374 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    @Ignore
  public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        long long10 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalTime localTime11 = property2.getLocalTime();
        java.lang.String str12 = property2.getAsText();
        org.joda.time.LocalTime localTime14 = property2.addCopy(6);
        org.joda.time.LocalTime localTime16 = localTime14.withMillisOfDay((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.Interval interval20 = property19.toInterval();
        org.joda.time.LocalTime localTime21 = property19.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime27 = property24.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        int int33 = localTime27.get(dateTimeFieldType32);
        org.joda.time.LocalTime localTime35 = localTime21.withField(dateTimeFieldType32, 1);
        int int36 = localTime14.get(dateTimeFieldType32);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime42 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        int int48 = localTime42.get(dateTimeFieldType47);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.LocalTime localTime51 = localTime42.withPeriodAdded(readablePeriod49, (int) (short) 100);
        org.joda.time.LocalTime localTime53 = localTime42.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime55 = localTime42.minusMinutes((int) '4');
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.Interval interval59 = property58.toInterval();
        org.joda.time.LocalTime localTime60 = property58.roundFloorCopy();
        org.joda.time.LocalTime localTime62 = property58.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType63 = property58.getFieldType();
        int int64 = localTime55.indexOf(dateTimeFieldType63);
        org.joda.time.LocalTime localTime66 = localTime14.withField(dateTimeFieldType63, 20);
        org.joda.time.LocalTime localTime68 = localTime14.withSecondOfMinute(38);
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(dateTimeZone69);
        org.joda.time.LocalTime.Property property71 = localTime70.secondOfMinute();
        org.joda.time.Interval interval72 = property71.toInterval();
        org.joda.time.LocalTime localTime73 = property71.roundFloorCopy();
        org.joda.time.LocalTime localTime74 = property71.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone75 = null;
        org.joda.time.LocalTime localTime76 = new org.joda.time.LocalTime(dateTimeZone75);
        org.joda.time.LocalTime.Property property77 = localTime76.secondOfMinute();
        org.joda.time.LocalTime localTime78 = property77.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType79 = property77.getFieldType();
        int int80 = localTime74.get(dateTimeFieldType79);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.LocalTime localTime83 = localTime74.withPeriodAdded(readablePeriod81, (int) (short) 100);
        org.joda.time.LocalTime localTime85 = localTime74.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime87 = localTime74.minusMinutes((int) '4');
        org.joda.time.LocalTime.Property property88 = localTime87.hourOfDay();
        org.joda.time.LocalTime localTime90 = localTime87.minusHours(57);
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        org.joda.time.LocalTime localTime92 = localTime87.plus(readablePeriod91);
        boolean boolean93 = localTime68.isAfter((org.joda.time.ReadablePartial) localTime87);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField95 = localTime68.getField((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1606262400L) + "'", long10 == (-1606262400L));
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "56" + "'", str12, "56");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 57 + "'", int33 == 57);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
// flaky:         org.junit.Assert.assertTrue("'" + int48 + "' != '" + 57 + "'", int48 == 57);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldType63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(localTime78);
        org.junit.Assert.assertNotNull(dateTimeFieldType79);
// flaky:         org.junit.Assert.assertTrue("'" + int80 + "' != '" + 57 + "'", int80 == 57);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(localTime85);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localTime92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        long long3 = property2.remainder();
        java.lang.String str4 = property2.getName();
        int int5 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime6 = property2.roundCeilingCopy();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 857L + "'", long3 == 857L);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "secondOfMinute" + "'", str4, "secondOfMinute");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        java.util.Locale locale6 = null;
        java.lang.String str7 = property2.getAsShortText(locale6);
        int int8 = property2.getMaximumValueOverall();
        org.joda.time.LocalTime localTime10 = property2.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = localTime15.plusMillis((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalTime localTime20 = localTime17.withPeriodAdded(readablePeriod18, (int) (byte) 0);
        org.joda.time.LocalTime localTime22 = localTime17.plusMinutes(52);
        int int23 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57" + "'", str7, "57");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property8.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = property13.getFieldType();
        int int16 = localTime10.get(dateTimeFieldType15);
        org.joda.time.LocalTime localTime18 = localTime4.withField(dateTimeFieldType15, 1);
        int int19 = localTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime4.withHourOfDay(6839360);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6839360 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 57 + "'", int16 == 57);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    @Ignore
  public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime();
        int int8 = localTime7.getHourOfDay();
        org.joda.time.DateTime dateTime9 = localTime7.toDateTimeToday();
        boolean boolean10 = localTime3.isAfter((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime12 = localTime7.withMinuteOfHour((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        boolean boolean14 = localTime7.isSupported(durationFieldType13);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(obj0, dateTimeZone1);
        org.joda.time.LocalTime localTime4 = localTime2.plusSeconds(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = property7.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime2.withField(dateTimeFieldType9, 6873972);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6873972 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        int int7 = property2.get();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        long long12 = property10.remainder();
        boolean boolean13 = property2.equals((java.lang.Object) property10);
        java.lang.String str14 = property10.getAsString();
        org.joda.time.LocalTime localTime16 = property10.setCopy("57");
        org.joda.time.DateTimeField dateTimeField18 = localTime16.getField(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
// flaky:         org.junit.Assert.assertTrue("'" + long12 + "' != '" + 224L + "'", long12 == 224L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "58" + "'", str14, "58");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours(10);
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(20);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime15 = localTime10.withPeriodAdded(readablePeriod13, 46);
        int int16 = localTime10.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
    }

    @Test
    @Ignore
  public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, (int) (short) 100);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) '4');
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((-1));
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfSecond();
        int int20 = property19.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        int int32 = localTime26.get(dateTimeFieldType31);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalTime localTime35 = localTime26.withPeriodAdded(readablePeriod33, (int) (short) 100);
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((java.lang.Object) localTime35);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = localTime35.toDateTimeToday(dateTimeZone37);
        long long39 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalTime localTime40 = property19.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.LocalTime localTime48 = localTime46.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay((long) 0, chronology49);
        org.joda.time.LocalTime localTime51 = new org.joda.time.LocalTime(chronology49);
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime((long) 32, chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) property19, chronology49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1606262400000L) + "'", long39 == (-1606262400000L));
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(localTime50);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(56, 12121000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalTime localTime8 = property2.getLocalTime();
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = property9.withMaximumValue();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = property9.setCopy("01:53:59.864", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:59.864\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
    }
}
