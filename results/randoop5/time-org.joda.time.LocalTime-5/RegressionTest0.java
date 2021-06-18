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
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) ' ', (-1), (int) (byte) 0);
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
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) 1, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.Class<?> wildcardClass4 = interval3.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(2, (int) (short) -1, 9, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withSecondOfMinute((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(13);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime8.toString("", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime7.getFieldType((-1606255660));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606255660");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (short) 1, 10, (int) (short) -1, (int) (byte) 0, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField18 = localTime16.getField((int) ' ');
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property10.getFieldType();
        org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (short) 0);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((java.lang.Object) localTime14);
        java.lang.Class<?> wildcardClass16 = localTime15.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(wildcardClass16);
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        java.lang.Class<?> wildcardClass23 = dateTimeFieldType20.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((-1), 17, 12, (int) (short) 0, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(100L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(13, (int) '4', (int) (byte) 100, 14, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '#', (int) (byte) 10, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
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
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(2);
        int int6 = localTime5.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        int int22 = localTime20.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusSeconds((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localTime9.getFieldType(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((-1606255660), 16, (int) (short) 10, 21, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255660 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        long long6 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 346L + "'", long6 == 346L);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(13);
        boolean boolean12 = localTime8.equals((java.lang.Object) 0.0d);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(4, 4, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        java.lang.String str5 = property2.getAsText();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "26" + "'", str5, "26");
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("01:52:19.611", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        java.lang.String str6 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime5.getFieldType(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.Chronology chronology22 = localTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(26, (int) 'a', 18, (int) 'a', chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 26 for hourOfDay must be in the range [0,23]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 28 + "'", int15 == 28);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1606255660), 23, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255660 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.joda.time.Chronology chronology9 = localTime7.getChronology();
        org.joda.time.LocalTime.Property property10 = localTime7.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property10.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime0.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01:52:28.917" + "'", str2, "01:52:28.917");
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("28");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"28\": Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = localTime19.withHourOfDay((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property2.setCopy((-1606262400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        int int12 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime14 = localTime11.plusHours((int) 'a');
        boolean boolean15 = localTime3.isEqual((org.joda.time.ReadablePartial) localTime11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) 'a', 32, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime1.getFieldType(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(27, (int) (short) 0, 0, 4, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        int int6 = localTime5.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 34 + "'", int6 == 34);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) localTime0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withField(dateTimeFieldType2, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("01:52:27.212", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.lang.String str5 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "34" + "'", str5, "34");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("28", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(18, (-1), 36, 9, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) 'a');
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = localTime20.getField(22);
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 37 + "'", int11 == 37);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = localTime4.getField((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        int int14 = property2.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.LocalTime localTime15 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property2.withMinimumValue();
        org.joda.time.DurationFieldType durationFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime16.withFieldAdded(durationFieldType17, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(100L, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (-1606255660), chronology9);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property9.setCopy("01:52:49.908");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:52:49.908\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(0L, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime9.withFieldAdded(durationFieldType10, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        int int8 = localTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        java.lang.String str6 = property2.getName();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property2.setCopy("01:52:35.632", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:52:35.632\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfMinute" + "'", str6, "secondOfMinute");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 30);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.Interval interval5 = property4.toInterval();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property4.withMaximumValue();
        org.joda.time.LocalTime localTime9 = localTime7.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime1.withField(dateTimeFieldType14, 6762000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6762000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("34", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("19", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.LocalTime localTime8 = localTime4.minusHours((int) (short) 1);
        boolean boolean9 = property2.equals((java.lang.Object) localTime8);
        boolean boolean10 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:52:41.833" + "'", str6, "01:52:41.833");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        int[] intArray8 = localTime7.getValues();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(100L, chronology16);
        org.joda.time.LocalTime localTime19 = localTime17.minusSeconds(13);
        org.joda.time.LocalTime localTime21 = localTime19.withHourOfDay((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone22);
        org.joda.time.LocalTime.Property property24 = localTime23.secondOfMinute();
        org.joda.time.Interval interval25 = property24.toInterval();
        org.joda.time.LocalTime localTime26 = property24.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property24.addCopy((long) 9);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        int int37 = localTime30.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        boolean boolean43 = localTime30.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime.Property property44 = localTime28.property(dateTimeFieldType42);
        boolean boolean45 = localTime19.isSupported(dateTimeFieldType42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime47 = localTime7.withField(dateTimeFieldType42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 53, 14, 83]");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = localTime5.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("40", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 1);
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) 'a');
        int int11 = property2.compareTo((org.joda.time.ReadablePartial) localTime10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime7.withField(dateTimeFieldType8, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property6.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(20, 18, 632);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 632 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 100, dateTimeZone1);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100, chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        int int14 = localTime12.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) (short) 0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 1);
        org.joda.time.DurationField durationField9 = property2.getDurationField();
        org.joda.time.DurationField durationField10 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNull(durationField10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("23", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumShortTextLength(locale6);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(100L, chronology15);
        org.joda.time.LocalTime localTime18 = localTime16.minusSeconds(13);
        boolean boolean19 = property2.equals((java.lang.Object) localTime16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(19, 45);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606255635), 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255635 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(16, (-1), (-1606255660));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (short) 0, 9, 1);
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) (byte) -1);
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime1.withFieldAdded(durationFieldType9, (-1606262400));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int[] intArray4 = localTime3.getValues();
        int int5 = localTime3.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[1, 52, 46, 451]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime19.withMillisOfSecond(20);
        org.joda.time.LocalTime localTime24 = localTime22.withMinuteOfHour(0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localTime24.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 16, chronology9);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
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
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property7.getAsText(locale8);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property7.setCopy("", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52" + "'", str9, "52");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        java.lang.String str10 = localTime7.toString("37");
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(100L, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) "37", chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"37\": Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "37" + "'", str10, "37");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        int int8 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        int[] intArray8 = localTime7.getValues();
        org.joda.time.LocalTime localTime10 = localTime7.plusMillis((int) (short) -1);
        java.lang.String str12 = localTime10.toString("44");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 53, 20, 260]");
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44" + "'", str12, "44");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = localTime12.minusHours(27);
        int int15 = localTime14.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.DurationFieldType durationFieldType21 = null;
        boolean boolean22 = localTime20.isSupported(durationFieldType21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.ReadablePartial readablePartial2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = localTime0.isEqual(readablePartial2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(100L, chronology14);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds(13);
        boolean boolean18 = localTime6.equals((java.lang.Object) localTime17);
        org.joda.time.LocalTime.Property property19 = localTime17.millisOfSecond();
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localTime17.toString("secondOfMinute", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.DurationField durationField5 = property2.getLeapDurationField();
        int int6 = property2.getMaximumValueOverall();
        int int7 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property2.setCopy("", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        int int7 = property6.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(0L, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.LocalTime localTime29 = localTime22.withField(dateTimeFieldType27, (int) (short) 0);
        org.joda.time.LocalTime localTime30 = localTime14.withFields((org.joda.time.ReadablePartial) localTime29);
        int int31 = localTime30.getMinuteOfHour();
        org.joda.time.LocalTime localTime33 = localTime30.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        int int42 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        boolean boolean48 = localTime35.isSupported(dateTimeFieldType47);
        org.joda.time.LocalTime.Property property49 = localTime30.property(dateTimeFieldType47);
        org.joda.time.LocalTime.Property property50 = localTime9.property(dateTimeFieldType47);
        int int51 = localTime9.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
// flaky:         org.junit.Assert.assertTrue("'" + int51 + "' != '" + 52 + "'", int51 == 52);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((int) (short) -1, 4, 6764000, 15, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) 'a');
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes(2);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(49, 42, 704);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray23 = localTime3.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray23);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(obj0, dateTimeZone1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property9 = localTime7.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        long long15 = property13.remainder();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime21 = property18.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime23 = localTime21.plusMillis((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.LocalTime localTime30 = localTime28.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(100L, chronology31);
        org.joda.time.LocalTime localTime34 = localTime32.minusSeconds(13);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime32.toDateTimeToday(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        long long38 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = property10.getDifference((org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1606255627099");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 122L + "'", long15 == 122L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
// flaky:         org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-1606255626L) + "'", long38 == (-1606255626L));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField9 = localTime6.getField((-1606255627));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606255627");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(43, 38, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "01:52:16.895");
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        java.lang.String str4 = localTime1.toString("26");
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "26" + "'", str4, "26");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        java.lang.String str8 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "55" + "'", str7, "55");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
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
        int int38 = property22.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime((java.lang.Object) int38, dateTimeZone39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime9.minus(readablePeriod12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        int int8 = property2.getMaximumValue();
        int int9 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) property2, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        int int16 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localTime9.isSupported(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime24.minusMinutes(202);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = localTime26.withHourOfDay(55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        int[] intArray8 = localTime7.getValues();
        java.lang.String str9 = localTime7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime7.withSecondOfMinute(161);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 161 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 53, 28, 288]");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "01:53:28.288" + "'", str9, "01:53:28.288");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime9 = property2.addCopy((long) 13);
        org.joda.time.DateTimeField dateTimeField10 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute(2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localTime5.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        int int17 = property15.get();
        org.joda.time.LocalTime localTime19 = property15.addCopy(100);
        org.joda.time.LocalTime localTime21 = property15.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property22 = localTime21.millisOfSecond();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime24 = localTime23.toDateTimeToday();
        org.joda.time.DateTime dateTime25 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property9.compareTo((org.joda.time.ReadableInstant) dateTime24);
        boolean boolean27 = localTime5.equals((java.lang.Object) int26);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "57" + "'", str12, "57");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 57 + "'", int17 == 57);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime10 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = localTime10.minusMinutes(37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localTime10.getFieldType(6764000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6764000");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
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
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime9.withFieldAdded(durationFieldType12, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("43");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"43\": Value 43 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((-1606255642), 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255642 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("37");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"37\": Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("52", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        int int17 = localTime16.getMillisOfDay();
        boolean boolean19 = localTime16.equals((java.lang.Object) 394L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6790000 + "'", int17 == 6790000);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime7 = localTime4.plusSeconds((-1606255626));
        org.joda.time.LocalTime.Property property8 = localTime4.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(100L, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) durationField8, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(100L, chronology15);
        org.joda.time.LocalTime localTime18 = localTime16.minusSeconds(13);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = localTime16.toDateTimeToday(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localTime7.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DurationFieldType durationFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime7.withFieldAdded(durationFieldType22, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        java.lang.Class<?> wildcardClass22 = localTime20.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(632);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        java.lang.Class<?> wildcardClass10 = localTime8.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(34, 0, 26, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 34 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(13);
        org.joda.time.LocalTime localTime12 = localTime10.withHourOfDay((int) (byte) 1);
        int[] intArray13 = localTime12.getValues();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 59, 47, 100]");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(6762000, 18, 6750458, 47, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6762000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getSecondOfMinute();
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localTime20.toString("", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime4.withPeriodAdded(readablePeriod8, 13);
        org.joda.time.LocalTime.Property property11 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localTime12.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        int int17 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime19 = localTime16.plusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localTime19.toDateTimeToday(dateTimeZone20);
        int int22 = property2.compareTo((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, 0);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime9);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime17.toDateTimeToday(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime17.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = property20.addNoWrapToCopy((-1606255633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(51, 53, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) property2, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 915L + "'", long4 == 915L);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        int int14 = property2.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        int int19 = property17.get();
        org.joda.time.LocalTime localTime21 = property17.addCopy(100);
        org.joda.time.LocalTime localTime23 = property17.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property24 = localTime23.millisOfSecond();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime26 = localTime25.toDateTimeToday();
        org.joda.time.DateTime dateTime27 = localTime23.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        long long28 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str29 = property2.getName();
        java.util.Locale locale31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = property2.setCopy("", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1606255614L) + "'", long28 == (-1606255614L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "secondOfMinute" + "'", str29, "secondOfMinute");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
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
        int int38 = property22.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property41.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property47.getFieldType();
        int int50 = localTime44.get(dateTimeFieldType49);
        org.joda.time.LocalTime.Property property51 = localTime44.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        int int56 = property54.get();
        org.joda.time.LocalTime localTime58 = property54.addCopy(100);
        org.joda.time.LocalTime localTime60 = property54.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property61 = localTime60.millisOfSecond();
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime63 = localTime62.toDateTimeToday();
        org.joda.time.DateTime dateTime64 = localTime60.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property51.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalTime localTime66 = property51.getLocalTime();
        boolean boolean67 = property22.equals((java.lang.Object) property51);
        org.joda.time.LocalTime localTime69 = property51.addCopy(632);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime71 = property51.setCopy("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 7 + "'", int50 == 7);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime69);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        java.lang.String str9 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        boolean boolean15 = property12.equals((java.lang.Object) false);
        int int16 = property12.getLeapAmount();
        java.lang.String str17 = property12.getAsString();
        long long18 = property12.remainder();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        int int23 = property21.get();
        org.joda.time.LocalTime localTime25 = property21.addCopy(100);
        org.joda.time.LocalTime localTime27 = property21.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfSecond();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.DateTime dateTime31 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property12.getDifference((org.joda.time.ReadableInstant) dateTime30);
        long long33 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        int int34 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "6" + "'", str17, "6");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 892L + "'", long18 == 892L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1606255613) + "'", int32 == (-1606255613));
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1606255613L) + "'", long33 == (-1606255613L));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(607L);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DurationField durationField3 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNull(durationField3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (-1606255660), dateTimeZone1);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) 'a');
        org.joda.time.LocalTime localTime20 = localTime18.minusMinutes(2);
        int[] intArray21 = localTime18.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(intArray21);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 53, 11, 97]");
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
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        java.lang.String str7 = property6.getAsShortText();
        long long8 = property6.remainder();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property6.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localTime10.getFieldType((-1606255642));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606255642");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 568L + "'", long8 == 568L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) property2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(825L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(19);
        org.joda.time.LocalTime localTime9 = localTime5.plusMillis((int) (short) 10);
        java.lang.String str10 = localTime5.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01:53:00.420" + "'", str10, "01:53:00.420");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(100L, chronology8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 18, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = localTime11.getFields();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday(dateTimeZone9);
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localTime8.isAfter(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 14 + "'", int4 == 14);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime4.withPeriodAdded(readablePeriod8, 13);
        org.joda.time.LocalTime.Property property11 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = localTime12.getField(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 38");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime10 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField12 = localTime10.getField(1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localTime6.isSupported(durationFieldType7);
        org.joda.time.LocalTime localTime10 = localTime6.plusMillis((int) (byte) 1);
        boolean boolean11 = localTime1.isAfter((org.joda.time.ReadablePartial) localTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime1.withMinuteOfHour((-1606255634));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255634 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("59");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"59\": Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        int int10 = localTime8.getMinuteOfHour();
        java.util.Locale locale12 = null;
        java.lang.String str13 = localTime8.toString("48", locale12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "48" + "'", str13, "48");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.Interval interval10 = property2.toInterval();
        org.joda.time.LocalTime localTime12 = property2.addCopy(2);
        org.joda.time.LocalTime localTime13 = property2.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime13.withFieldAdded(durationFieldType14, 6780000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localTime4, dateTimeZone5);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01:53:17.033" + "'", str2, "01:53:17.033");
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1606255624), (int) (short) 0, 58, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255624 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property2.getDifference(readableInstant9);
        long long11 = property2.remainder();
        org.joda.time.DurationField durationField12 = property2.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 17 + "'", int4 == 17);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 196L + "'", long11 == 196L);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.DurationField durationField5 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 528L + "'", long4 == 528L);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.getAsText();
        boolean boolean10 = property2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "17" + "'", str8, "17");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606255642), 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255642 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10L, chronology9);
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
        int int25 = localTime12.indexOf(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType27 = localTime12.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 19 + "'", int24 == 19);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime19.withMillisOfSecond(20);
        org.joda.time.LocalTime localTime24 = localTime22.withMinuteOfHour(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime26 = localTime24.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusSeconds(13);
        org.joda.time.LocalTime localTime12 = localTime8.withHourOfDay(1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = localTime8.toString("01:52:42.000", locale14);
        org.joda.time.LocalTime localTime17 = localTime8.plusMinutes(49);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "01:52:42.000" + "'", str15, "01:52:42.000");
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("48");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"48\": Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime9 = localTime4.withMillisOfSecond((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        boolean boolean8 = localTime0.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime0.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property9.setCopy((-1606255648));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255648 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        org.joda.time.DurationField durationField12 = property9.getDurationField();
        org.joda.time.LocalTime localTime13 = property9.roundFloorCopy();
        int int14 = property9.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(632);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        int int10 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime14 = localTime12.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        org.joda.time.LocalTime localTime21 = localTime14.withField(dateTimeFieldType19, (int) (short) 0);
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType19);
        org.joda.time.LocalTime localTime24 = localTime6.withMillisOfDay((int) '4');
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        boolean boolean8 = localTime0.isBefore((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.LocalTime.Property property9 = localTime0.minuteOfHour();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property9.setCopy("01:52:41.833", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:52:41.833\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime10 = property2.withMaximumValue();
        org.joda.time.LocalTime localTime12 = property2.addCopy(0L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.LocalTime.Property property12 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime13.getValue((-1606255660));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606255660");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        long long6 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 847L + "'", long6 == 847L);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localTime4.isSupported(durationFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime4.secondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        long long7 = property2.remainder();
        int int8 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 861L + "'", long7 == 861L);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        long long8 = property7.remainder();
        int int9 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) "38", dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"38\": Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) ' ');
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime1.withMillisOfSecond(6750458);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6750458 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("12", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property2.getDifference(readableInstant9);
        org.joda.time.LocalTime localTime11 = property2.withMaximumValue();
        org.joda.time.Interval interval12 = property2.toInterval();
        org.joda.time.LocalTime localTime14 = property2.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.LocalTime localTime22 = localTime20.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(0L, chronology23);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(980L, chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = localTime25.toDateTimeToday(dateTimeZone26);
        int int28 = property2.getDifference((org.joda.time.ReadableInstant) dateTime27);
        int int29 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 23 + "'", int4 == 23);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1606255597) + "'", int28 == (-1606255597));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(100L, chronology12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((int) (byte) -1, 17, (-1606255634), (int) (short) 1, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology8);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.LocalTime localTime13 = localTime10.plusSeconds((-1606255599));
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy(13);
        java.util.Locale locale12 = null;
        int int13 = property9.getMaximumShortTextLength(locale12);
        org.joda.time.LocalTime localTime14 = property9.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) property9, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime16 = localTime13.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime16.withPeriodAdded(readablePeriod17, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        boolean boolean25 = property22.equals((java.lang.Object) false);
        int int26 = property22.getLeapAmount();
        org.joda.time.LocalTime localTime27 = property22.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.Interval interval31 = property30.toInterval();
        org.joda.time.LocalTime localTime32 = property30.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = property30.withMaximumValue();
        org.joda.time.LocalTime localTime35 = localTime33.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property38.getFieldType();
        org.joda.time.LocalTime localTime42 = localTime35.withField(dateTimeFieldType40, (int) (short) 0);
        boolean boolean43 = localTime27.isSupported(dateTimeFieldType40);
        boolean boolean44 = localTime19.isSupported(dateTimeFieldType40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime46 = localTime7.withField(dateTimeFieldType40, (-26771040));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -26771040 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DurationField durationField10 = property8.getRangeDurationField();
        java.util.Locale locale11 = null;
        int int12 = property8.getMaximumShortTextLength(locale11);
        org.joda.time.LocalTime localTime14 = property8.addNoWrapToCopy(632);
        boolean boolean15 = property2.equals((java.lang.Object) property8);
        java.lang.String str16 = property2.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Property[secondOfMinute]" + "'", str16, "Property[secondOfMinute]");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray15 = localTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray15);
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
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DurationField durationField11 = property9.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        int int13 = property9.getMaximumValueOverall();
        org.joda.time.LocalTime localTime15 = property9.addWrapFieldToCopy(21);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        org.joda.time.LocalTime localTime21 = property18.withMinimumValue();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime23 = localTime22.toDateTimeToday();
        int int24 = property18.getDifference((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property9.compareTo((org.joda.time.ReadableInstant) dateTime23);
        int int26 = property5.compareTo((org.joda.time.ReadableInstant) dateTime23);
        boolean boolean27 = property5.isLeap();
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = property5.setCopy("01:52:42.000", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:52:42.000\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1606255594) + "'", int24 == (-1606255594));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = localTime4.toDateTimeToday(dateTimeZone8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10L, chronology9);
        org.joda.time.LocalTime localTime14 = localTime12.minusMinutes(16);
        org.joda.time.DateTimeField dateTimeField16 = localTime12.getField(0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) "01:52:19.611", dateTimeZone1);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology8);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localTime11.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = localTime5.withHourOfDay(25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 26 + "'", int11 == 26);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
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
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.getAsText();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        java.lang.String str11 = property2.getAsShortText();
        java.lang.String str12 = property2.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "27" + "'", str8, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "27" + "'", str10, "27");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "27" + "'", str11, "27");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "secondOfMinute" + "'", str12, "secondOfMinute");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        int int16 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localTime9.isSupported(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime24.minusMinutes(202);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType28 = localTime26.getFieldType(56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 56");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.addNoWrapToCopy(13);
        java.lang.String str12 = localTime11.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:55:04.650" + "'", str12, "01:55:04.650");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property2.setCopy((-1606255660));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255660 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 742L + "'", long4 == 742L);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (byte) 100);
        int int19 = localTime18.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 28 + "'", int11 == 28);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(46, (int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFieldType5, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 10);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime6 = property4.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localTime6.isSupported(durationFieldType7);
        org.joda.time.LocalTime localTime10 = localTime6.plusMillis((int) (byte) 1);
        boolean boolean11 = localTime1.isAfter((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.DateTime dateTime12 = localTime1.toDateTimeToday();
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds((-1606255641));
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds(30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localTime12.getField(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.Chronology chronology18 = localTime5.getChronology();
        org.joda.time.LocalTime localTime20 = localTime5.minusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType22 = localTime5.getFieldType(462);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 462");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(47, (-26771040), 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 19, dateTimeZone1);
        int int3 = localTime2.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime4.withPeriodAdded(readablePeriod8, 13);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localTime10.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime10.getValue(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 15");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        java.lang.String str12 = localTime8.toString("01:52:16.895");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localTime8.getFieldTypes();
        int int14 = localTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:52:16.895" + "'", str12, "01:52:16.895");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology8);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime13 = localTime10.plus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime13.withHourOfDay((-1606255627));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255627 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime13);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField9 = property2.getDurationField();
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumTextLength(locale10);
        java.lang.String str12 = property2.getAsString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) property2, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32" + "'", str12, "32");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        java.lang.String str9 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        boolean boolean15 = property12.equals((java.lang.Object) false);
        int int16 = property12.getLeapAmount();
        java.lang.String str17 = property12.getAsString();
        long long18 = property12.remainder();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        int int23 = property21.get();
        org.joda.time.LocalTime localTime25 = property21.addCopy(100);
        org.joda.time.LocalTime localTime27 = property21.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfSecond();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.DateTime dateTime31 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property12.getDifference((org.joda.time.ReadableInstant) dateTime30);
        long long33 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        int int34 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32" + "'", str17, "32");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 944L + "'", long18 == 944L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1606255587) + "'", int32 == (-1606255587));
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1606255587L) + "'", long33 == (-1606255587L));
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds((-1606255641));
        org.joda.time.LocalTime localTime14 = localTime12.plusHours((-1606255635));
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime12.withFieldAdded(durationFieldType15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 202);
        int int2 = localTime1.getSecondOfMinute();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        java.lang.String str8 = property7.getName();
        java.lang.String str9 = property7.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.LocalTime localTime18 = localTime16.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology19);
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology19);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(10L, chronology19);
        org.joda.time.LocalTime localTime24 = localTime22.minusMinutes(16);
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
        org.joda.time.LocalTime.Property property35 = localTime32.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.LocalTime.Property property38 = localTime37.secondOfMinute();
        org.joda.time.LocalTime localTime39 = property38.getLocalTime();
        boolean boolean41 = property38.equals((java.lang.Object) false);
        int int42 = property38.getLeapAmount();
        org.joda.time.LocalTime localTime43 = property38.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.Interval interval47 = property46.toInterval();
        org.joda.time.LocalTime localTime48 = property46.roundFloorCopy();
        org.joda.time.LocalTime localTime49 = property46.withMaximumValue();
        org.joda.time.LocalTime localTime51 = localTime49.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property54.getFieldType();
        org.joda.time.LocalTime localTime58 = localTime51.withField(dateTimeFieldType56, (int) (short) 0);
        boolean boolean59 = localTime43.isSupported(dateTimeFieldType56);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime(dateTimeZone60);
        org.joda.time.LocalTime.Property property62 = localTime61.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.Interval interval66 = property65.toInterval();
        org.joda.time.LocalTime localTime67 = property65.roundFloorCopy();
        int int68 = localTime61.compareTo((org.joda.time.ReadablePartial) localTime67);
        org.joda.time.DateTime dateTime69 = localTime61.toDateTimeToday();
        org.joda.time.DateTime dateTime70 = localTime43.toDateTime((org.joda.time.ReadableInstant) dateTime69);
        long long71 = property35.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.DateTime dateTime72 = localTime24.toDateTime((org.joda.time.ReadableInstant) dateTime70);
        int int73 = property7.compareTo((org.joda.time.ReadableInstant) dateTime70);
        org.joda.time.Interval interval74 = property7.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "millisOfDay" + "'", str8, "millisOfDay");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Property[millisOfDay]" + "'", str9, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(interval47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime70);
// flaky:         org.junit.Assert.assertTrue("'" + long71 + "' != '" + (-1606262367601L) + "'", long71 == (-1606262367601L));
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertNotNull(interval74);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime15 = property12.withMinimumValue();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime17 = localTime16.toDateTimeToday();
        int int18 = property12.getDifference((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = localTime9.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1606255586) + "'", int8 == (-1606255586));
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1606255586) + "'", int18 == (-1606255586));
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime4.withPeriodAdded(readablePeriod8, 13);
        org.joda.time.LocalTime.Property property11 = localTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localTime4.getField((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        int int13 = property11.getMinimumValueOverall();
        org.joda.time.LocalTime localTime14 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime15 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property11.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime17 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.Interval interval21 = property20.toInterval();
        org.joda.time.LocalTime localTime22 = property20.roundFloorCopy();
        org.joda.time.LocalTime localTime24 = property20.addCopy((long) 9);
        org.joda.time.LocalTime localTime26 = property20.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.LocalTime localTime30 = property29.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property29.getFieldType();
        org.joda.time.LocalTime localTime33 = localTime26.withField(dateTimeFieldType31, (int) (short) 1);
        boolean boolean34 = localTime17.isSupported(dateTimeFieldType31);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime36 = localTime35.toDateTimeToday();
        org.joda.time.DateTime dateTime37 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 1);
        int int9 = localTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.DurationField durationField8 = property6.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.LocalTime localTime10 = property6.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property6.withMinimumValue();
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(6820000, 44, (int) (byte) 100, 36, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6820000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localTime5.getFieldTypes();
        org.joda.time.LocalTime localTime8 = localTime5.plusSeconds((int) 'a');
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime8.withFieldAdded(durationFieldType9, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(localTime8);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, 0);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime9);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = localTime17.toDateTimeToday(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime17.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) property20, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime8 = localTime6.minusMinutes(6764000);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = localTime6.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.millisOfDay();
        org.joda.time.LocalTime localTime12 = localTime8.minusHours((-26771040));
        int int13 = localTime8.size();
        org.joda.time.LocalTime localTime15 = localTime8.plusSeconds(6802000);
        int int16 = localTime8.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime9.withSecondOfMinute(632);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 632 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        int[] intArray17 = localTime5.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField19 = localTime5.getField(6802000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6802000");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 53, 36, 0]");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) 'a');
        int int11 = localTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 0, 9, 1);
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) (byte) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localTime3.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime3.withMinuteOfHour(380);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 380 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) 'a', (-1606255648), (-1606255624));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.getLeapAmount();
        int int5 = property2.getMaximumValue();
        java.lang.Class<?> wildcardClass6 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
        org.junit.Assert.assertNotNull(wildcardClass6);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfEvenCopy();
        int int6 = property2.getLeapAmount();
        long long7 = property2.remainder();
        int int8 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 47L + "'", long7 == 47L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        org.joda.time.LocalTime localTime22 = localTime19.withMillisOfSecond(20);
        org.joda.time.LocalTime localTime24 = localTime22.withMinuteOfHour(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        int int29 = property27.get();
        org.joda.time.LocalTime localTime31 = property27.addCopy(100);
        org.joda.time.LocalTime localTime33 = property27.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property34 = localTime33.millisOfSecond();
        org.joda.time.LocalTime localTime36 = property34.setCopy((int) 'a');
        org.joda.time.LocalTime localTime37 = property34.roundHalfEvenCopy();
        boolean boolean38 = localTime22.equals((java.lang.Object) property34);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 36 + "'", int29 == 36);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumTextLength(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withFieldAdded(durationFieldType5, (-1606255633));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("01:53:35.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime9 = property2.addCopy((long) 13);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime9.getFields();
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime9.toString("millisOfSecond", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        java.lang.String str7 = property6.getAsShortText();
        long long8 = property6.remainder();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime10 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime12 = property6.addCopy((long) (byte) 0);
        boolean boolean13 = property6.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 386L + "'", long8 == 386L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        int int12 = property10.get();
        org.joda.time.LocalTime localTime14 = property10.addCopy(100);
        org.joda.time.LocalTime localTime16 = property10.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfSecond();
        org.joda.time.LocalTime localTime19 = property17.setCopy((int) 'a');
        int int20 = property17.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        boolean boolean22 = property2.equals((java.lang.Object) property17);
        int int23 = property17.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        int int9 = property2.get();
        java.lang.String str10 = property2.getAsString();
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        java.lang.Class<?> wildcardClass12 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "36" + "'", str10, "36");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 10, 51, 6754088, 6803000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6754088 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        int int10 = localTime8.getMinuteOfHour();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime8.withFieldAdded(durationFieldType11, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 53 + "'", int10 == 53);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DurationFieldType durationFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime0.withFieldAdded(durationFieldType2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        java.lang.String str7 = property2.getAsShortText();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsText(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "36" + "'", str7, "36");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "36" + "'", str9, "36");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday();
        java.lang.Class<?> wildcardClass25 = dateTime24.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localTime3.getFieldType(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        int int8 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) (short) 1);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) localTime8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = property2.getFieldType();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsText(locale7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "37" + "'", str8, "37");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, 0);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((java.lang.Object) localTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType19 = localTime17.getFieldType(86399999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 86399999");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 704);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        java.util.Locale locale6 = null;
        int int7 = property2.getMaximumTextLength(locale6);
        org.joda.time.LocalTime localTime8 = property2.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localTime8.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 37 + "'", int4 == 37);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:53:38.000" + "'", str12, "01:53:38.000");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        int int8 = property2.getMinimumValueOverall();
        int int9 = property2.getMinimumValue();
        boolean boolean10 = property2.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) 'a');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localTime18.getFieldTypes();
        java.util.Locale locale21 = null;
        java.lang.String str22 = localTime18.toString("01:52:49.908", locale21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 38 + "'", int11 == 38);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "01:52:49.908" + "'", str22, "01:52:49.908");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 961L + "'", long4 == 961L);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        java.util.Locale locale10 = null;
        java.lang.String str11 = localTime5.toString("01:52:27.212", locale10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = localTime5.toString(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01:52:27.212" + "'", str11, "01:52:27.212");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "02:25:38.026" + "'", str13, "02:25:38.026");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (-1606255587), chronology9);
        java.lang.Class<?> wildcardClass14 = localTime13.getClass();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        java.lang.String str2 = localTime0.toString(dateTimeFormatter1);
        org.joda.time.LocalTime localTime4 = localTime0.minusHours((int) (short) 1);
        org.joda.time.LocalTime.Property property5 = localTime0.minuteOfHour();
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01:53:38.077" + "'", str2, "01:53:38.077");
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        int int8 = property2.getMaximumValue();
        org.joda.time.LocalTime localTime10 = property2.setCopy(47);
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        org.joda.time.DurationField durationField12 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(0L, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        boolean boolean14 = property11.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime15 = property11.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        boolean boolean21 = property18.equals((java.lang.Object) false);
        int int22 = property18.getLeapAmount();
        org.joda.time.DurationField durationField23 = property18.getDurationField();
        org.joda.time.LocalTime localTime24 = property18.withMinimumValue();
        org.joda.time.LocalTime localTime25 = property18.withMaximumValue();
        java.util.Locale locale27 = null;
        org.joda.time.LocalTime localTime28 = property18.setCopy("25", locale27);
        org.joda.time.DateTime dateTime29 = localTime28.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.LocalTime localTime33 = property32.getLocalTime();
        boolean boolean35 = property32.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime37 = property32.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone41);
        org.joda.time.LocalTime.Property property43 = localTime42.secondOfMinute();
        org.joda.time.Interval interval44 = property43.toInterval();
        org.joda.time.LocalTime localTime45 = property43.roundFloorCopy();
        int int46 = localTime39.compareTo((org.joda.time.ReadablePartial) localTime45);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.LocalTime localTime50 = property49.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = property49.getFieldType();
        boolean boolean52 = localTime39.isSupported(dateTimeFieldType51);
        org.joda.time.LocalTime localTime54 = localTime37.withField(dateTimeFieldType51, 2);
        org.joda.time.LocalTime.Property property55 = localTime28.property(dateTimeFieldType51);
        int int56 = localTime15.indexOf(dateTimeFieldType51);
        int int57 = localTime8.get(dateTimeFieldType51);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime24 = localTime9.minusMinutes(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType26 = localTime9.getFieldType((-1606262400));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1606262400");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localTime10.getFieldType(6814365);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6814365");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        int int14 = property9.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 39 + "'", int4 == 39);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(607L);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        boolean boolean8 = property5.equals((java.lang.Object) false);
        int int9 = property5.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property5.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.withMaximumValue();
        org.joda.time.LocalTime localTime18 = localTime16.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.LocalTime localTime25 = localTime18.withField(dateTimeFieldType23, (int) (short) 0);
        boolean boolean26 = localTime10.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        int int35 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DateTime dateTime36 = localTime28.toDateTimeToday();
        org.joda.time.DateTime dateTime37 = localTime10.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        long long38 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.LocalTime localTime39 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime41 = localTime39.minusMinutes(1);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-446185L) + "'", long38 == (-446185L));
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localTime7.getFieldType(704);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 704");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        java.lang.String str7 = property6.getAsShortText();
        long long8 = property6.remainder();
        org.joda.time.LocalTime localTime9 = property6.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField10 = property6.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 791L + "'", long8 == 791L);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(607L);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        int int7 = property5.getMinimumValueOverall();
        org.joda.time.LocalTime localTime8 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property5.roundFloorCopy();
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfDay();
        java.lang.String str11 = property10.getName();
        java.lang.String str12 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.LocalTime localTime21 = localTime19.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology22);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology22);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(10L, chronology22);
        org.joda.time.LocalTime localTime27 = localTime25.minusMinutes(16);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime(dateTimeZone31);
        org.joda.time.LocalTime.Property property33 = localTime32.secondOfMinute();
        org.joda.time.Interval interval34 = property33.toInterval();
        org.joda.time.LocalTime localTime35 = property33.roundFloorCopy();
        int int36 = localTime29.compareTo((org.joda.time.ReadablePartial) localTime35);
        org.joda.time.Chronology chronology37 = localTime35.getChronology();
        org.joda.time.LocalTime.Property property38 = localTime35.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        boolean boolean44 = property41.equals((java.lang.Object) false);
        int int45 = property41.getLeapAmount();
        org.joda.time.LocalTime localTime46 = property41.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(dateTimeZone47);
        org.joda.time.LocalTime.Property property49 = localTime48.secondOfMinute();
        org.joda.time.Interval interval50 = property49.toInterval();
        org.joda.time.LocalTime localTime51 = property49.roundFloorCopy();
        org.joda.time.LocalTime localTime52 = property49.withMaximumValue();
        org.joda.time.LocalTime localTime54 = localTime52.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.LocalTime localTime58 = property57.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property57.getFieldType();
        org.joda.time.LocalTime localTime61 = localTime54.withField(dateTimeFieldType59, (int) (short) 0);
        boolean boolean62 = localTime46.isSupported(dateTimeFieldType59);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone66 = null;
        org.joda.time.LocalTime localTime67 = new org.joda.time.LocalTime(dateTimeZone66);
        org.joda.time.LocalTime.Property property68 = localTime67.secondOfMinute();
        org.joda.time.Interval interval69 = property68.toInterval();
        org.joda.time.LocalTime localTime70 = property68.roundFloorCopy();
        int int71 = localTime64.compareTo((org.joda.time.ReadablePartial) localTime70);
        org.joda.time.DateTime dateTime72 = localTime64.toDateTimeToday();
        org.joda.time.DateTime dateTime73 = localTime46.toDateTime((org.joda.time.ReadableInstant) dateTime72);
        long long74 = property38.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime73);
        org.joda.time.DateTime dateTime75 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime73);
        int int76 = property10.compareTo((org.joda.time.ReadableInstant) dateTime73);
        int int77 = property2.compareTo((org.joda.time.ReadableInstant) dateTime73);
        int int78 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime80 = property2.addCopy((int) 'a');
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfDay" + "'", str11, "millisOfDay");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[millisOfDay]" + "'", str12, "Property[millisOfDay]");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(interval34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(interval69);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + long74 + "' != '" + (-1606262361808L) + "'", long74 == (-1606262361808L));
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(localTime80);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        long long8 = property2.remainder();
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime10 = property2.getLocalTime();
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "40" + "'", str7, "40");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 70L + "'", long8 == 70L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (-1606255587), chronology9);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime13.withFieldAdded(durationFieldType14, 758);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = localTime12.minusHours(27);
        int int15 = localTime14.size();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTimeToday(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime11.withMillisOfSecond((-1606255626));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255626 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.joda.time.LocalTime.Property property12 = localTime5.millisOfSecond();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay(5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(607L);
        org.joda.time.LocalTime.Property property2 = localTime1.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        boolean boolean8 = property5.equals((java.lang.Object) false);
        int int9 = property5.getLeapAmount();
        org.joda.time.LocalTime localTime10 = property5.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.withMaximumValue();
        org.joda.time.LocalTime localTime18 = localTime16.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = property21.getFieldType();
        org.joda.time.LocalTime localTime25 = localTime18.withField(dateTimeFieldType23, (int) (short) 0);
        boolean boolean26 = localTime10.isSupported(dateTimeFieldType23);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        int int35 = localTime28.compareTo((org.joda.time.ReadablePartial) localTime34);
        org.joda.time.DateTime dateTime36 = localTime28.toDateTimeToday();
        org.joda.time.DateTime dateTime37 = localTime10.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        long long38 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = property2.setCopy("6812000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6812000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-446185L) + "'", long38 == (-446185L));
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.DurationField durationField8 = property2.getLeapDurationField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property2.addNoWrapToCopy(6790000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "40" + "'", str10, "40");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
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
        int int38 = property22.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.Interval interval42 = property41.toInterval();
        org.joda.time.LocalTime localTime43 = property41.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property41.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime(dateTimeZone45);
        org.joda.time.LocalTime.Property property47 = localTime46.secondOfMinute();
        org.joda.time.LocalTime localTime48 = property47.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property47.getFieldType();
        int int50 = localTime44.get(dateTimeFieldType49);
        org.joda.time.LocalTime.Property property51 = localTime44.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.LocalTime localTime55 = property54.getLocalTime();
        int int56 = property54.get();
        org.joda.time.LocalTime localTime58 = property54.addCopy(100);
        org.joda.time.LocalTime localTime60 = property54.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property61 = localTime60.millisOfSecond();
        org.joda.time.LocalTime localTime62 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime63 = localTime62.toDateTimeToday();
        org.joda.time.DateTime dateTime64 = localTime60.toDateTime((org.joda.time.ReadableInstant) dateTime63);
        int int65 = property51.compareTo((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalTime localTime66 = property51.getLocalTime();
        boolean boolean67 = property22.equals((java.lang.Object) property51);
        org.joda.time.LocalTime localTime69 = property51.addCopy(632);
        java.util.Locale locale70 = null;
        int int71 = property51.getMaximumTextLength(locale70);
        org.joda.time.LocalTime localTime73 = property51.addCopy((long) 2);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(dateTimeZone74);
        org.joda.time.LocalTime.Property property76 = localTime75.secondOfMinute();
        org.joda.time.LocalTime localTime77 = property76.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone78 = null;
        org.joda.time.LocalTime localTime79 = new org.joda.time.LocalTime(dateTimeZone78);
        org.joda.time.LocalTime.Property property80 = localTime79.secondOfMinute();
        org.joda.time.Interval interval81 = property80.toInterval();
        org.joda.time.LocalTime localTime82 = property80.roundFloorCopy();
        org.joda.time.LocalTime localTime83 = property80.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.LocalTime localTime85 = new org.joda.time.LocalTime(dateTimeZone84);
        org.joda.time.LocalTime.Property property86 = localTime85.secondOfMinute();
        org.joda.time.LocalTime localTime87 = property86.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType88 = property86.getFieldType();
        int int89 = localTime83.get(dateTimeFieldType88);
        org.joda.time.ReadablePeriod readablePeriod90 = null;
        org.joda.time.LocalTime localTime92 = localTime83.withPeriodAdded(readablePeriod90, 9);
        org.joda.time.LocalTime localTime94 = localTime83.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray95 = localTime83.getFields();
        org.joda.time.LocalTime localTime96 = localTime77.withFields((org.joda.time.ReadablePartial) localTime83);
        int int97 = property51.compareTo((org.joda.time.ReadablePartial) localTime96);
        org.joda.time.LocalTime localTime99 = property51.addCopy((-1606262400));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
// flaky:         org.junit.Assert.assertTrue("'" + int50 + "' != '" + 41 + "'", int50 == 41);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(localTime55);
// flaky:         org.junit.Assert.assertTrue("'" + int56 + "' != '" + 41 + "'", int56 == 41);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(localTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 3 + "'", int71 == 3);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(localTime83);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(localTime87);
        org.junit.Assert.assertNotNull(dateTimeFieldType88);
// flaky:         org.junit.Assert.assertTrue("'" + int89 + "' != '" + 41 + "'", int89 == 41);
        org.junit.Assert.assertNotNull(localTime92);
        org.junit.Assert.assertNotNull(localTime94);
        org.junit.Assert.assertNotNull(dateTimeFieldArray95);
        org.junit.Assert.assertNotNull(localTime96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertNotNull(localTime99);
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
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property2.setCopy("01:15:51.000", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:15:51.000\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("01:52:16.895", dateTimeFormatter1);
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
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy("6812000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6812000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
        org.joda.time.LocalTime.Property property12 = localTime5.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        int int17 = property15.get();
        org.joda.time.LocalTime localTime19 = property15.addCopy(100);
        org.joda.time.LocalTime localTime21 = property15.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property22 = localTime21.millisOfSecond();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime24 = localTime23.toDateTimeToday();
        org.joda.time.DateTime dateTime25 = localTime21.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        int int26 = property12.compareTo((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalTime localTime27 = property12.getLocalTime();
        org.joda.time.DateTimeField dateTimeField28 = property12.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = property12.setCopy("01:43:00.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:43:00.000\" for millisOfSecond is not supported");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 41 + "'", int17 == 41);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        int int9 = property2.get();
        java.lang.String str10 = property2.getAsString();
        long long11 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 41 + "'", int4 == 41);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 41 + "'", int9 == 41);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "41" + "'", str10, "41");
// flaky:         org.junit.Assert.assertTrue("'" + long11 + "' != '" + 732L + "'", long11 == 732L);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(100L, chronology14);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds(13);
        boolean boolean18 = localTime6.equals((java.lang.Object) localTime17);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localTime17.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, 0);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(145);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localTime16.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10L, chronology9);
        int int13 = localTime12.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (-1606255587), chronology9);
        org.joda.time.LocalTime localTime15 = localTime13.withSecondOfMinute((int) (short) 1);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(944L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        int int7 = property2.getMinimumValue();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfDay();
        boolean boolean20 = property19.isLeap();
        org.joda.time.LocalTime localTime21 = property19.roundCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 42 + "'", int11 == 42);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(632);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime8.minus(readablePeriod10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) ' ');
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        int int10 = property8.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime12 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property8.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        int int25 = property23.getMinimumValueOverall();
        org.joda.time.LocalTime localTime26 = property23.withMinimumValue();
        org.joda.time.LocalTime localTime27 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime29 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property32.addCopy((long) 9);
        org.joda.time.LocalTime localTime38 = property32.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        org.joda.time.LocalTime localTime45 = localTime38.withField(dateTimeFieldType43, (int) (short) 1);
        boolean boolean46 = localTime29.isSupported(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property47 = localTime18.property(dateTimeFieldType43);
        int int48 = localTime13.indexOf(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property49 = localTime1.property(dateTimeFieldType43);
        java.util.Locale locale51 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime52 = property49.setCopy("01:53:35.000", locale51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:35.000\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(property49);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        long long4 = property2.remainder();
        int int5 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.setCopy((int) (byte) 1);
        java.lang.String str8 = localTime7.toString();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localTime7.toString(dateTimeFormatter9);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = null;
        java.lang.String str12 = localTime7.toString(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 640L + "'", long4 == 640L);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "01:53:01.640" + "'", str8, "01:53:01.640");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01:53:01.640" + "'", str10, "01:53:01.640");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:53:01.640" + "'", str12, "01:53:01.640");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.DurationField durationField7 = property2.getLeapDurationField();
        java.lang.String str8 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "43" + "'", str6, "43");
        org.junit.Assert.assertNull(durationField7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "43" + "'", str8, "43");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(47L, dateTimeZone1);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withMillisOfDay((-1606255648));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255648 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.Interval interval9 = property2.toInterval();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property2.getAsText(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(interval9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "44" + "'", str11, "44");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        int int8 = property2.get();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        int int11 = property2.getMinimumValueOverall();
        java.lang.String str12 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 44 + "'", int8 == 44);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44" + "'", str12, "44");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) 1, 6790000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6790000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime7 = localTime6.toDateTimeToday();
        int int8 = property2.getDifference((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property11.getFieldType();
        org.joda.time.LocalTime localTime14 = property11.withMinimumValue();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime16 = localTime15.toDateTimeToday();
        int int17 = property11.getDifference((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property2.getDifference((org.joda.time.ReadableInstant) dateTime16);
        java.util.Locale locale19 = null;
        int int20 = property2.getMaximumShortTextLength(locale19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1606255575) + "'", int8 == (-1606255575));
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1606255575) + "'", int17 == (-1606255575));
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1606255575) + "'", int18 == (-1606255575));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfDay();
        java.util.Locale locale8 = null;
        int int9 = property7.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime localTime10 = property2.addCopy(984L);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime10.withFieldAdded(durationFieldType11, 518);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfSecond();
        int int9 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 999 + "'", int9 == 999);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        java.util.Locale locale11 = null;
        org.joda.time.LocalTime localTime12 = property2.setCopy("25", locale11);
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
        org.joda.time.LocalTime.Property property25 = localTime18.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.LocalTime localTime29 = property28.getLocalTime();
        int int30 = property28.get();
        org.joda.time.LocalTime localTime32 = property28.addCopy(100);
        org.joda.time.LocalTime localTime34 = property28.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfSecond();
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime37 = localTime36.toDateTimeToday();
        org.joda.time.DateTime dateTime38 = localTime34.toDateTime((org.joda.time.ReadableInstant) dateTime37);
        int int39 = property25.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int40 = property2.compareTo((org.joda.time.ReadableInstant) dateTime38);
        int int41 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 45 + "'", int30 == 45);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(37, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        int int8 = property7.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime24 = localTime9.minusMinutes(22);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localTime24.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime13 = property9.withMinimumValue();
        java.lang.String str14 = property9.getName();
        org.joda.time.DateTimeField dateTimeField15 = property9.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "millisOfSecond" + "'", str14, "millisOfSecond");
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        java.lang.String str10 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "46" + "'", str10, "46");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        int int12 = localTime6.get(dateTimeFieldType11);
        org.joda.time.LocalTime.Property property13 = localTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        int int18 = property16.get();
        org.joda.time.LocalTime localTime20 = property16.addCopy(100);
        org.joda.time.LocalTime localTime22 = property16.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property23 = localTime22.millisOfSecond();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime25 = localTime24.toDateTimeToday();
        org.joda.time.DateTime dateTime26 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property13.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime28 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property13.getFieldType();
        org.joda.time.LocalTime localTime31 = localTime0.withField(dateTimeFieldType29, 46);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.Interval interval35 = property34.toInterval();
        org.joda.time.LocalTime localTime36 = property34.roundFloorCopy();
        org.joda.time.LocalTime localTime37 = property34.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        int int43 = localTime37.get(dateTimeFieldType42);
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalTime localTime46 = localTime37.withPeriodAdded(readablePeriod44, 9);
        org.joda.time.LocalTime localTime48 = localTime37.plusSeconds((int) (byte) 10);
        int[] intArray49 = localTime37.getValues();
        boolean boolean50 = localTime31.isBefore((org.joda.time.ReadablePartial) localTime37);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(interval35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 46 + "'", int43 == 46);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(intArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[1, 53, 46, 0]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.LocalTime localTime19 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.addCopy((long) 9);
        boolean boolean27 = localTime5.equals((java.lang.Object) localTime26);
        org.joda.time.LocalTime localTime29 = localTime5.withMinuteOfHour(43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = null;
        java.lang.String str31 = localTime29.toString(dateTimeFormatter30);
        org.joda.time.ReadablePartial readablePartial32 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean33 = localTime29.isAfter(readablePartial32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertEquals("'" + str31 + "' != '" + "01:43:46.000" + "'", str31, "01:43:46.000");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(49, 6803000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime8 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime9 = property2.withMaximumValue();
        java.util.Locale locale11 = null;
        org.joda.time.LocalTime localTime12 = property2.setCopy("25", locale11);
        java.util.Locale locale13 = null;
        java.lang.String str14 = property2.getAsShortText(locale13);
        int int15 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "46" + "'", str14, "46");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        org.joda.time.LocalTime localTime13 = localTime11.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(100L, chronology14);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds(13);
        org.joda.time.LocalTime localTime19 = localTime15.withHourOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        int int24 = property22.get();
        org.joda.time.LocalTime localTime26 = property22.addCopy(100);
        org.joda.time.LocalTime localTime28 = property22.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property29 = localTime28.millisOfSecond();
        org.joda.time.LocalTime localTime31 = property29.setCopy((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTimeToday(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localTime19.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        long long35 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        java.lang.String str36 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 46 + "'", int24 == 46);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1606262376L) + "'", long35 == (-1606262376L));
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "46" + "'", str36, "46");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        org.joda.time.LocalTime localTime9 = property2.addCopy((long) 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        java.lang.String str10 = localTime7.toString("37");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime7.withMillisOfSecond(6785000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6785000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "37" + "'", str10, "37");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy((int) '#');
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        int int14 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        boolean boolean20 = localTime7.isSupported(dateTimeFieldType19);
        org.joda.time.LocalTime.Property property21 = localTime5.property(dateTimeFieldType19);
        org.joda.time.Interval interval22 = property21.toInterval();
        java.util.Locale locale23 = null;
        java.lang.String str24 = property21.getAsText(locale23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(interval22);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "48" + "'", str24, "48");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday();
        org.joda.time.LocalTime.Property property23 = localTime20.millisOfSecond();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(632);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        org.joda.time.LocalTime localTime10 = property9.roundCeilingCopy();
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime10.isSupported(durationFieldType11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) 'a');
        int int11 = localTime10.getHourOfDay();
        int[] intArray12 = localTime10.getValues();
        java.util.Locale locale14 = null;
        java.lang.String str15 = localTime10.toString("6812000", locale14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2, 53, 48, 0]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "6812000" + "'", str15, "6812000");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime.Property property10 = localTime8.hourOfDay();
        org.joda.time.Chronology chronology11 = localTime8.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) 'a');
        int int8 = localTime7.getMillisOfSecond();
        int int9 = localTime7.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "40");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"40\": Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.LocalTime localTime19 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.addCopy((long) 9);
        boolean boolean27 = localTime5.equals((java.lang.Object) localTime26);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localTime26.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        int int9 = localTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        boolean boolean16 = localTime14.isSupported(durationFieldType15);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localTime14.isSupported(durationFieldType17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        org.joda.time.LocalTime localTime23 = property21.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType24 = null;
        boolean boolean25 = localTime23.isSupported(durationFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        int int30 = property28.getMinimumValueOverall();
        org.joda.time.LocalTime localTime31 = property28.withMinimumValue();
        org.joda.time.LocalTime localTime32 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime33 = property28.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime34 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(dateTimeZone35);
        org.joda.time.LocalTime.Property property37 = localTime36.secondOfMinute();
        org.joda.time.Interval interval38 = property37.toInterval();
        org.joda.time.LocalTime localTime39 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime41 = property37.addCopy((long) 9);
        org.joda.time.LocalTime localTime43 = property37.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = property46.getFieldType();
        org.joda.time.LocalTime localTime50 = localTime43.withField(dateTimeFieldType48, (int) (short) 1);
        boolean boolean51 = localTime34.isSupported(dateTimeFieldType48);
        org.joda.time.LocalTime.Property property52 = localTime23.property(dateTimeFieldType48);
        int int53 = localTime14.indexOf(dateTimeFieldType48);
        int int54 = localTime8.get(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.LocalTime localTime12 = localTime10.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(100L, chronology13);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology13);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((-1606255611), 6803000, (-1606255624), (-1606255635), chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255611 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        int int5 = property2.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property2.setCopy((-1606262400));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606262400 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        java.lang.String str9 = localTime4.toString("00:24:36.784");
        org.joda.time.LocalTime.Property property10 = localTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property10.setCopy(6788097);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6788097 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00:24:36.784" + "'", str9, "00:24:36.784");
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        int int11 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime12 = property9.withMinimumValue();
        org.joda.time.LocalTime localTime13 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime15 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property18.addCopy((long) 9);
        org.joda.time.LocalTime localTime24 = property18.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        org.joda.time.LocalTime localTime31 = localTime24.withField(dateTimeFieldType29, (int) (short) 1);
        boolean boolean32 = localTime15.isSupported(dateTimeFieldType29);
        org.joda.time.LocalTime.Property property33 = localTime4.property(dateTimeFieldType29);
        int int35 = localTime4.getValue(0);
        org.joda.time.LocalTime localTime37 = localTime4.plusHours((-26771040));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField39 = localTime4.getField(632);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 632");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime1.millisOfDay();
        java.lang.String str11 = property10.toString();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((java.lang.Object) str11, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[millisOfDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[millisOfDay]" + "'", str11, "Property[millisOfDay]");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        java.lang.String str12 = localTime8.toString("01:52:16.895");
        org.joda.time.LocalTime localTime14 = localTime8.plusMillis(6840000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 50 + "'", int4 == 50);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:52:16.895" + "'", str12, "01:52:16.895");
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        int[] intArray8 = localTime7.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime7.withMinuteOfHour((-1606255587));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255587 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 53, 50, 639]");
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
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withFieldAdded(durationFieldType5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("01:52:41.833", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime.Property property8 = localTime7.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property8.setCopy((-1606255608));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255608 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(0L, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime14 = property12.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        org.joda.time.LocalTime localTime22 = localTime20.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property25.getFieldType();
        org.joda.time.LocalTime localTime29 = localTime22.withField(dateTimeFieldType27, (int) (short) 0);
        org.joda.time.LocalTime localTime30 = localTime14.withFields((org.joda.time.ReadablePartial) localTime29);
        int int31 = localTime30.getMinuteOfHour();
        org.joda.time.LocalTime localTime33 = localTime30.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(dateTimeZone34);
        org.joda.time.LocalTime.Property property36 = localTime35.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        org.joda.time.LocalTime localTime41 = property39.roundFloorCopy();
        int int42 = localTime35.compareTo((org.joda.time.ReadablePartial) localTime41);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = property45.getFieldType();
        boolean boolean48 = localTime35.isSupported(dateTimeFieldType47);
        org.joda.time.LocalTime.Property property49 = localTime30.property(dateTimeFieldType47);
        org.joda.time.LocalTime.Property property50 = localTime9.property(dateTimeFieldType47);
        java.util.Locale locale51 = null;
        int int52 = property50.getMaximumTextLength(locale51);
        java.lang.String str53 = property50.getAsText();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 53 + "'", int31 == 53);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(dateTimeFieldType47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "51" + "'", str53, "51");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime14 = localTime12.plusMillis((int) 'a');
        org.joda.time.Chronology chronology15 = localTime12.getChronology();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        boolean boolean17 = localTime12.isSupported(durationFieldType16);
        boolean boolean18 = localTime6.isEqual((org.joda.time.ReadablePartial) localTime12);
        int int19 = localTime6.getMillisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = localTime6.getField((int) (short) 0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 990 + "'", int19 == 990);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        java.lang.String str7 = localTime4.toString();
        org.joda.time.Chronology chronology8 = localTime4.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology8);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "01:53:52.000" + "'", str7, "01:53:52.000");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.DateTime dateTime23 = localTime22.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.Interval interval27 = property26.toInterval();
        org.joda.time.LocalTime localTime28 = property26.roundFloorCopy();
        org.joda.time.LocalTime localTime29 = property26.withMaximumValue();
        org.joda.time.LocalTime localTime31 = localTime29.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        org.joda.time.LocalTime.Property property34 = localTime33.secondOfMinute();
        org.joda.time.LocalTime localTime35 = property34.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = property34.getFieldType();
        org.joda.time.LocalTime localTime38 = localTime31.withField(dateTimeFieldType36, (int) (short) 0);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) localTime38);
        org.joda.time.LocalTime localTime40 = localTime22.withFields((org.joda.time.ReadablePartial) localTime38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField42 = localTime38.getField(298);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 298");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.millisOfDay();
        java.util.Locale locale12 = null;
        org.joda.time.LocalTime localTime13 = property10.setCopy("40", locale12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(25, 0, (-1), (-1606255579));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (short) 0, 9, 1);
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) (byte) -1);
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        int int10 = localTime1.indexOf(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localTime1.getField(881);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 881");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(758, 40, (int) (short) -1, 41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 758 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        java.util.Locale locale4 = null;
        java.lang.String str5 = property2.getAsText(locale4);
        org.joda.time.LocalTime localTime7 = property2.addCopy(26);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        int int10 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "52" + "'", str5, "52");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(100L, chronology8);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) 689L, chronology10);
        org.joda.time.LocalTime localTime16 = localTime14.plusMinutes(9);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime14.getFields();
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.getLocalTime();
        org.joda.time.DateTime dateTime8 = localTime7.toDateTimeToday();
        org.joda.time.LocalTime localTime10 = localTime7.withMillisOfSecond(202);
        java.lang.String str12 = localTime7.toString("01:53:16.699");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:53:16.699" + "'", str12, "01:53:16.699");
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
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        int int12 = localTime5.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6833000 + "'", int12 == 6833000);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.Chronology chronology18 = localTime5.getChronology();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology18);
        java.lang.String str20 = localTime19.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "01:53:53.345" + "'", str20, "01:53:53.345");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(10L, chronology9);
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
        int int25 = localTime12.indexOf(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType27 = localTime12.getFieldType(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 53 + "'", int24 == 53);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.Interval interval11 = property10.toInterval();
        org.joda.time.LocalTime localTime12 = property10.roundFloorCopy();
        int int13 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime12);
        int int14 = property2.compareTo((org.joda.time.ReadablePartial) localTime6);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.LocalTime localTime24 = property23.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = property23.getFieldType();
        int int26 = localTime20.get(dateTimeFieldType25);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime20.withPeriodAdded(readablePeriod27, 9);
        org.joda.time.LocalTime localTime31 = localTime20.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray32 = localTime20.getFields();
        org.joda.time.Chronology chronology33 = localTime20.getChronology();
        org.joda.time.Chronology chronology34 = localTime20.getChronology();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.now(chronology34);
        org.joda.time.LocalTime localTime36 = org.joda.time.LocalTime.now(chronology34);
        int int37 = property2.compareTo((org.joda.time.ReadablePartial) localTime36);
        org.joda.time.LocalTime localTime39 = property2.addNoWrapToCopy(35);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 54 + "'", int26 == 54);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldArray32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localTime39);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        int int17 = localTime16.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = localTime16.withFieldAdded(durationFieldType18, 0);
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 54 + "'", int11 == 54);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        java.lang.String str12 = localTime8.toString("01:52:16.895");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localTime8.getFieldTypes();
        org.joda.time.LocalTime.Property property14 = localTime8.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = localTime8.withFieldAdded(durationFieldType15, 380);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:52:16.895" + "'", str12, "01:52:16.895");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        int int8 = property2.getMaximumValue();
        java.lang.String str9 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "54" + "'", str9, "54");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        java.lang.String str9 = localTime4.toString("00:24:36.784");
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime4.withFieldAdded(durationFieldType10, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00:24:36.784" + "'", str9, "00:24:36.784");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        int int9 = property2.getMinimumValue();
        org.joda.time.Interval interval10 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 40, 34);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        int int4 = property2.getMinimumValueOverall();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime7 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.Interval interval12 = property11.toInterval();
        org.joda.time.LocalTime localTime13 = property11.roundFloorCopy();
        org.joda.time.LocalTime localTime15 = property11.addCopy((long) 9);
        org.joda.time.LocalTime localTime17 = property11.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(dateTimeZone18);
        org.joda.time.LocalTime.Property property20 = localTime19.secondOfMinute();
        org.joda.time.LocalTime localTime21 = property20.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property20.getFieldType();
        org.joda.time.LocalTime localTime24 = localTime17.withField(dateTimeFieldType22, (int) (short) 1);
        boolean boolean25 = localTime8.isSupported(dateTimeFieldType22);
        org.joda.time.LocalTime localTime27 = localTime8.plusMillis((-1606255641));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        boolean boolean8 = property2.equals((java.lang.Object) 517L);
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        int int10 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) '#');
        org.joda.time.LocalTime localTime25 = localTime20.minusMinutes(20);
        int int26 = localTime25.getMillisOfDay();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalTime localTime29 = localTime25.withPeriodAdded(readablePeriod27, 46);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 53 + "'", int21 == 53);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 77580555 + "'", int26 == 77580555);
        org.junit.Assert.assertNotNull(localTime29);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime1.toString(dateTimeFormatter10);
        int int12 = localTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01:53:54.584" + "'", str11, "01:53:54.584");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime localTime8 = localTime4.plusMillis((int) (byte) 1);
        int int9 = localTime8.getHourOfDay();
        int int10 = localTime8.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6834001 + "'", int10 == 6834001);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.LocalTime localTime8 = localTime4.minusHours((int) (short) 1);
        boolean boolean9 = property2.equals((java.lang.Object) localTime8);
        org.joda.time.DateTimeField[] dateTimeFieldArray10 = localTime8.getFields();
        org.joda.time.LocalTime localTime12 = localTime8.withMillisOfSecond(33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:53:54.681" + "'", str6, "01:53:54.681");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        java.lang.String str12 = localTime8.toString("01:52:16.895");
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localTime8.getFieldTypes();
        org.joda.time.LocalTime.Property property14 = localTime8.hourOfDay();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property14.setCopy("44", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 54 + "'", int4 == 54);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:52:16.895" + "'", str12, "01:52:16.895");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.getLocalTime();
        int int12 = property10.get();
        org.joda.time.LocalTime localTime14 = property10.addCopy(100);
        org.joda.time.LocalTime localTime16 = property10.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property17 = localTime16.millisOfSecond();
        org.joda.time.LocalTime localTime19 = property17.setCopy((int) 'a');
        int int20 = localTime7.compareTo((org.joda.time.ReadablePartial) localTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) int20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 55 + "'", int11 == 55);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(19);
        int int8 = localTime5.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime5.getFieldType(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
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
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property2.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property2.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.setCopy("01:53:44.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:53:44.000\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(100L, chronology17);
        org.joda.time.LocalTime localTime20 = localTime18.minusSeconds(13);
        org.joda.time.LocalTime localTime22 = localTime18.withHourOfDay(1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(dateTimeZone23);
        org.joda.time.LocalTime.Property property25 = localTime24.secondOfMinute();
        org.joda.time.LocalTime localTime26 = property25.getLocalTime();
        int int27 = property25.get();
        org.joda.time.LocalTime localTime29 = property25.addCopy(100);
        org.joda.time.LocalTime localTime31 = property25.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property32 = localTime31.millisOfSecond();
        org.joda.time.LocalTime localTime34 = property32.setCopy((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localTime34.toDateTimeToday(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTime dateTime38 = localTime1.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 55 + "'", int27 == 55);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        java.lang.String str4 = property2.getAsShortText();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "55" + "'", str4, "55");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology9);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology9);
        int int14 = localTime13.getHourOfDay();
        org.joda.time.LocalTime localTime16 = localTime13.minusMillis(12);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime18 = localTime13.minus(readablePeriod17);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 145, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = localTime4.plusMillis((int) ' ');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        boolean boolean8 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology16 = localTime15.getChronology();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(100L, chronology16);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.LocalTime localTime21 = localTime19.minusSeconds((-1606255641));
        org.joda.time.LocalTime localTime23 = localTime21.plusHours((-1606255635));
        boolean boolean24 = localTime6.isAfter((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = localTime23.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) ' ');
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.Interval interval9 = property8.toInterval();
        int int10 = property8.getMinimumValueOverall();
        org.joda.time.LocalTime localTime11 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime12 = property8.roundFloorCopy();
        org.joda.time.LocalTime localTime13 = property8.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        int int25 = property23.getMinimumValueOverall();
        org.joda.time.LocalTime localTime26 = property23.withMinimumValue();
        org.joda.time.LocalTime localTime27 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime28 = property23.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime29 = property23.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime36 = property32.addCopy((long) 9);
        org.joda.time.LocalTime localTime38 = property32.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone39);
        org.joda.time.LocalTime.Property property41 = localTime40.secondOfMinute();
        org.joda.time.LocalTime localTime42 = property41.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = property41.getFieldType();
        org.joda.time.LocalTime localTime45 = localTime38.withField(dateTimeFieldType43, (int) (short) 1);
        boolean boolean46 = localTime29.isSupported(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property47 = localTime18.property(dateTimeFieldType43);
        int int48 = localTime13.indexOf(dateTimeFieldType43);
        org.joda.time.LocalTime.Property property49 = localTime1.property(dateTimeFieldType43);
        java.lang.String str50 = property49.getAsString();
        int int51 = property49.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(property49);
// flaky:         org.junit.Assert.assertEquals("'" + str50 + "' != '" + "55" + "'", str50, "55");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 59 + "'", int51 == 59);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        int int9 = property2.get();
        java.lang.String str10 = property2.getAsString();
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.joda.time.DurationField durationField12 = property2.getLeapDurationField();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property2.setCopy("6807000", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6807000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 55 + "'", int4 == 55);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 55 + "'", int9 == 55);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "55" + "'", str10, "55");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNull(durationField12);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(10L, chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localTime14.getField(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        int int8 = property2.getMinimumValueOverall();
        int int9 = property2.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 55 + "'", int9 == 55);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis(19);
        org.joda.time.LocalTime localTime9 = localTime5.plusMillis((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime12 = localTime9.withPeriodAdded(readablePeriod10, 14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:52:50.000");
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = property2.setCopy(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        java.lang.String str9 = property2.getName();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        boolean boolean15 = property12.equals((java.lang.Object) false);
        int int16 = property12.getLeapAmount();
        java.lang.String str17 = property12.getAsString();
        long long18 = property12.remainder();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(dateTimeZone19);
        org.joda.time.LocalTime.Property property21 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime22 = property21.getLocalTime();
        int int23 = property21.get();
        org.joda.time.LocalTime localTime25 = property21.addCopy(100);
        org.joda.time.LocalTime localTime27 = property21.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfSecond();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime30 = localTime29.toDateTimeToday();
        org.joda.time.DateTime dateTime31 = localTime27.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        int int32 = property12.getDifference((org.joda.time.ReadableInstant) dateTime30);
        long long33 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalTime localTime34 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime36 = localTime34.withMinuteOfHour((-1606255568));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255568 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfMinute" + "'", str9, "secondOfMinute");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str17 + "' != '" + "56" + "'", str17, "56");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 11L + "'", long18 == 11L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 56 + "'", int23 == 56);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1606255563) + "'", int32 == (-1606255563));
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-1606255563L) + "'", long33 == (-1606255563L));
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, 603, 990, (-26771040));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 603 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.Chronology chronology22 = localTime9.getChronology();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(28, 45, 77580555, 6823000, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
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
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 56 + "'", int15 == 56);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime localTime10 = property2.addCopy(984L);
        org.joda.time.LocalTime localTime11 = property2.roundHalfEvenCopy();
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime11.withFieldAdded(durationFieldType12, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        int int9 = localTime8.getMinuteOfHour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = null;
        java.lang.String str11 = localTime8.toString(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00:00:00.100" + "'", str11, "00:00:00.100");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime5.withPeriodAdded(readablePeriod7, 19);
        java.util.Locale locale11 = null;
        java.lang.String str12 = localTime9.toString("01:53:37.738", locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime9.withHourOfDay(77580201);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 77580201 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "01:53:37.738" + "'", str12, "01:53:37.738");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsText(locale9);
        org.joda.time.LocalTime localTime11 = property2.roundCeilingCopy();
        int int12 = localTime11.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "56" + "'", str10, "56");
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 57 + "'", int12 == 57);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localTime11.toDateTimeToday(dateTimeZone12);
        org.joda.time.LocalTime localTime15 = localTime11.plusSeconds((-1606255587));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 56 + "'", int4 == 56);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        int int11 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime12 = property9.withMinimumValue();
        org.joda.time.LocalTime localTime13 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime14 = property9.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime15 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.Interval interval19 = property18.toInterval();
        org.joda.time.LocalTime localTime20 = property18.roundFloorCopy();
        org.joda.time.LocalTime localTime22 = property18.addCopy((long) 9);
        org.joda.time.LocalTime localTime24 = property18.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        org.joda.time.LocalTime localTime31 = localTime24.withField(dateTimeFieldType29, (int) (short) 1);
        boolean boolean32 = localTime15.isSupported(dateTimeFieldType29);
        org.joda.time.LocalTime.Property property33 = localTime4.property(dateTimeFieldType29);
        org.joda.time.LocalTime localTime35 = property33.addWrapFieldToCopy(25);
        org.joda.time.LocalTime localTime36 = property33.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(interval19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localTime1.getFieldType(6829000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6829000");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        int int17 = localTime16.getMillisOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localTime16.toString(dateTimeFormatter18);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) str19);
        int int21 = localTime20.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 57 + "'", int11 == 57);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6847000 + "'", int17 == 6847000);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:54:07.000" + "'", str19, "01:54:07.000");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        java.util.Locale locale8 = null;
        int int9 = property2.getMaximumShortTextLength(locale8);
        org.joda.time.DurationField durationField10 = property2.getLeapDurationField();
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.LocalTime localTime8 = localTime4.minusHours((int) (short) 1);
        boolean boolean9 = property2.equals((java.lang.Object) localTime8);
        java.util.Locale locale10 = null;
        int int11 = property2.getMaximumShortTextLength(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:53:57.621" + "'", str6, "01:53:57.621");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        long long8 = property2.remainder();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        int int13 = property11.get();
        org.joda.time.LocalTime localTime15 = property11.addCopy(100);
        org.joda.time.LocalTime localTime17 = property11.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfSecond();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime20 = localTime19.toDateTimeToday();
        org.joda.time.DateTime dateTime21 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime24 = property2.addCopy(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.LocalTime.Property property27 = localTime26.secondOfMinute();
        org.joda.time.LocalTime localTime28 = property27.getLocalTime();
        org.joda.time.LocalTime localTime29 = property27.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(dateTimeZone30);
        org.joda.time.LocalTime.Property property32 = localTime31.secondOfMinute();
        org.joda.time.Interval interval33 = property32.toInterval();
        org.joda.time.LocalTime localTime34 = property32.roundFloorCopy();
        org.joda.time.LocalTime localTime35 = property32.withMaximumValue();
        org.joda.time.LocalTime localTime37 = localTime35.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = property40.getFieldType();
        org.joda.time.LocalTime localTime44 = localTime37.withField(dateTimeFieldType42, (int) (short) 0);
        org.joda.time.LocalTime localTime45 = localTime29.withFields((org.joda.time.ReadablePartial) localTime44);
        int int46 = localTime45.getMinuteOfHour();
        org.joda.time.LocalTime localTime48 = localTime45.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(dateTimeZone49);
        org.joda.time.LocalTime.Property property51 = localTime50.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(dateTimeZone52);
        org.joda.time.LocalTime.Property property54 = localTime53.secondOfMinute();
        org.joda.time.Interval interval55 = property54.toInterval();
        org.joda.time.LocalTime localTime56 = property54.roundFloorCopy();
        int int57 = localTime50.compareTo((org.joda.time.ReadablePartial) localTime56);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime(dateTimeZone58);
        org.joda.time.LocalTime.Property property60 = localTime59.secondOfMinute();
        org.joda.time.LocalTime localTime61 = property60.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = property60.getFieldType();
        boolean boolean63 = localTime50.isSupported(dateTimeFieldType62);
        org.joda.time.LocalTime.Property property64 = localTime45.property(dateTimeFieldType62);
        int int65 = localTime24.get(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "57" + "'", str7, "57");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 733L + "'", long8 == 733L);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 57 + "'", int13 == 57);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606255562) + "'", int22 == (-1606255562));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(interval33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
// flaky:         org.junit.Assert.assertTrue("'" + int46 + "' != '" + 53 + "'", int46 == 53);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(property64);
// flaky:         org.junit.Assert.assertTrue("'" + int65 + "' != '" + 57 + "'", int65 == 57);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
        org.joda.time.Interval interval18 = property17.toInterval();
        org.joda.time.LocalTime localTime19 = property17.roundFloorCopy();
        org.joda.time.LocalTime localTime20 = property17.withMaximumValue();
        int int21 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime20);
        int int22 = localTime20.getSecondOfMinute();
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
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DurationField durationField11 = property9.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        int int13 = property9.getMaximumValueOverall();
        org.joda.time.LocalTime localTime15 = property9.addWrapFieldToCopy(21);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        org.joda.time.LocalTime localTime21 = property18.withMinimumValue();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime23 = localTime22.toDateTimeToday();
        int int24 = property18.getDifference((org.joda.time.ReadableInstant) dateTime23);
        int int25 = property9.compareTo((org.joda.time.ReadableInstant) dateTime23);
        int int26 = property5.compareTo((org.joda.time.ReadableInstant) dateTime23);
        java.util.Locale locale27 = null;
        java.lang.String str28 = property5.getAsShortText(locale27);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 59 + "'", int13 == 59);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1606255562) + "'", int24 == (-1606255562));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "53" + "'", str28, "53");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(23, 21, (-1606255641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255641 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
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
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(dateTimeZone21);
        org.joda.time.LocalTime.Property property23 = localTime22.secondOfMinute();
        org.joda.time.Interval interval24 = property23.toInterval();
        org.joda.time.LocalTime localTime25 = property23.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property23.withMaximumValue();
        org.joda.time.LocalTime localTime28 = localTime26.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        org.joda.time.LocalTime localTime35 = localTime28.withField(dateTimeFieldType33, (int) (short) 0);
        int int36 = localTime14.get(dateTimeFieldType33);
        org.joda.time.LocalTime.Property property37 = localTime14.secondOfMinute();
        int int38 = property2.compareTo((org.joda.time.ReadablePartial) localTime14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 58 + "'", int20 == 58);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localTime35);
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + 58 + "'", int36 == 58);
        org.junit.Assert.assertNotNull(property37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getSecondOfMinute();
        org.joda.time.DateTime dateTime22 = localTime20.toDateTimeToday();
        int int23 = localTime20.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 78780158 + "'", int23 == 78780158);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy((int) '#');
        org.joda.time.LocalTime localTime10 = property2.addCopy(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withHourOfDay(41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        long long8 = property2.remainder();
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        int int10 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "58" + "'", str7, "58");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 338L + "'", long8 == 338L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property3.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime10 = property9.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        int int12 = localTime6.get(dateTimeFieldType11);
        org.joda.time.LocalTime.Property property13 = localTime6.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        int int18 = property16.get();
        org.joda.time.LocalTime localTime20 = property16.addCopy(100);
        org.joda.time.LocalTime localTime22 = property16.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property23 = localTime22.millisOfSecond();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime25 = localTime24.toDateTimeToday();
        org.joda.time.DateTime dateTime26 = localTime22.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        int int27 = property13.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime28 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property13.getFieldType();
        org.joda.time.LocalTime localTime31 = localTime0.withField(dateTimeFieldType29, 46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay(6823000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6823000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 58 + "'", int12 == 58);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 58 + "'", int18 == 58);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay((int) ' ');
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localTime4.getFieldTypes();
        java.util.Locale locale7 = null;
        java.lang.String str8 = localTime4.toString("0", locale7);
        org.joda.time.LocalTime localTime10 = localTime4.minusMinutes((-1));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(58, 7, (-1), 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        org.joda.time.LocalTime localTime5 = property2.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.DurationField durationField7 = property2.getDurationField();
        int int8 = property2.get();
        java.util.Locale locale9 = null;
        int int10 = property2.getMaximumShortTextLength(locale9);
        int int11 = property2.getMinimumValueOverall();
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumTextLength(locale12);
        org.joda.time.DurationField durationField14 = property2.getRangeDurationField();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) durationField14, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(durationField7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 58 + "'", int8 == 58);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = localTime7.plusHours((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localTime10.toDateTimeToday(dateTimeZone11);
        org.joda.time.LocalTime localTime14 = localTime10.minusMillis(28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = localTime10.withSecondOfMinute(6814365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6814365 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(6, 6790000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6790000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property2.getDifference(readableInstant9);
        int int11 = property2.get();
        org.joda.time.LocalTime localTime13 = property2.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.LocalTime.Property property21 = localTime18.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime18.withPeriodAdded(readablePeriod22, 13);
        int int25 = property2.compareTo((org.joda.time.ReadablePartial) localTime24);
        java.lang.Class<?> wildcardClass26 = localTime24.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(wildcardClass26);
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
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = property12.getFieldType();
        org.joda.time.LocalTime localTime16 = localTime9.withField(dateTimeFieldType14, 0);
        org.joda.time.DurationFieldType durationFieldType17 = null;
        boolean boolean18 = localTime16.isSupported(durationFieldType17);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(145);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalTime localTime22 = localTime20.plus(readablePeriod21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime10 = property2.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime13 = localTime10.withPeriodAdded(readablePeriod11, 44);
        org.joda.time.LocalTime localTime15 = localTime10.plusSeconds((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
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
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.LocalTime localTime19 = localTime5.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        int int21 = localTime19.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType23 = localTime19.getFieldType(472);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 472");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 59 + "'", int11 == 59);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:52:49.908");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.Chronology chronology18 = localTime5.getChronology();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(chronology18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) localTime19, dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField23 = localTime19.getField(734);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 734");
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
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.getAsText();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property2.getAsShortText(locale9);
        org.joda.time.DateTimeField dateTimeField11 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "59" + "'", str8, "59");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "59" + "'", str10, "59");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        boolean boolean14 = property11.equals((java.lang.Object) false);
        int int15 = property11.getLeapAmount();
        org.joda.time.LocalTime localTime16 = property11.withMinimumValue();
        boolean boolean17 = localTime8.isBefore((org.joda.time.ReadablePartial) localTime16);
        java.lang.String str18 = localTime8.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "00:00:00.010" + "'", str18, "00:00:00.010");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = localTime5.getFields();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localTime5.toString(dateTimeFormatter18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "01:54:00.000" + "'", str19, "01:54:00.000");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(352L, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime2.getField(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime8 = property2.roundHalfFloorCopy();
        java.lang.Class<?> wildcardClass9 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.Interval interval6 = property5.toInterval();
        org.joda.time.LocalTime localTime7 = property5.roundFloorCopy();
        int int8 = localTime1.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.DateTime dateTime9 = localTime1.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime1.millisOfDay();
        java.lang.String str11 = property10.toString();
        int int12 = property10.get();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[millisOfDay]" + "'", str11, "Property[millisOfDay]");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6840637 + "'", int12 == 6840637);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 2);
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
        org.joda.time.LocalTime.Property property12 = localTime9.millisOfSecond();
        boolean boolean13 = localTime1.isEqual((org.joda.time.ReadablePartial) localTime9);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        java.util.Locale locale23 = null;
        java.lang.String str24 = property22.getAsText(locale23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10" + "'", str24, "10");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.minusSeconds((-1606255641));
        org.joda.time.LocalTime localTime14 = localTime12.plusHours((-1606255635));
        org.joda.time.LocalTime localTime16 = localTime12.minusMinutes((int) '4');
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.LocalTime localTime11 = localTime9.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(100L, chronology12);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 18, chronology14);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(37, 11, 6764000, (int) '4', chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 37 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
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
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType20);
        java.util.Locale locale24 = null;
        org.joda.time.LocalTime localTime25 = property22.setCopy("20", locale24);
        int int26 = property22.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
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
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds(47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime6.withMinuteOfHour(538);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(386L, chronology1);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 9);
        org.joda.time.LocalTime localTime16 = localTime5.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime localTime18 = localTime5.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime.Property property19 = localTime5.millisOfDay();
        org.joda.time.LocalTime.Property property20 = localTime5.minuteOfHour();
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
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((-1606262361808L));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = null;
        java.lang.String str10 = localTime8.toString(dateTimeFormatter9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime8.getValue(25);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 25");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "00:26:01.441" + "'", str10, "00:26:01.441");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        int int23 = localTime3.getSecondOfMinute();
        org.joda.time.LocalTime.Property property24 = localTime3.minuteOfHour();
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
        org.joda.time.LocalTime localTime40 = localTime31.withPeriodAdded(readablePeriod38, 9);
        org.joda.time.LocalTime localTime42 = localTime31.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localTime31.getFields();
        org.joda.time.Chronology chronology44 = localTime31.getChronology();
        org.joda.time.Chronology chronology45 = localTime31.getChronology();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 37, chronology45);
        boolean boolean47 = localTime3.isBefore((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.LocalTime localTime49 = localTime46.plusSeconds((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime51 = localTime49.withSecondOfMinute(77580978);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 77580978 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime49);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        int int9 = property2.get();
        java.lang.String str10 = property2.getAsString();
        boolean boolean11 = property2.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property2.getFieldType();
        org.joda.time.LocalTime localTime13 = property2.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("25", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime6 = property2.roundHalfEvenCopy();
        boolean boolean8 = property2.equals((java.lang.Object) 517L);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localTime9.toDateTimeToday(dateTimeZone10);
        int int12 = property2.compareTo((org.joda.time.ReadableInstant) dateTime11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = localTime12.minusSeconds((-1606255624));
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        org.joda.time.LocalTime localTime6 = property2.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime.Property property9 = localTime8.secondOfMinute();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.joda.time.LocalTime localTime11 = property9.roundFloorCopy();
        org.joda.time.LocalTime localTime12 = property9.withMaximumValue();
        org.joda.time.LocalTime localTime14 = localTime12.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(dateTimeZone15);
        org.joda.time.LocalTime.Property property17 = localTime16.secondOfMinute();
        org.joda.time.LocalTime localTime18 = property17.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        org.joda.time.LocalTime localTime21 = localTime14.withField(dateTimeFieldType19, (int) (short) 0);
        org.joda.time.LocalTime.Property property22 = localTime6.property(dateTimeFieldType19);
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        java.util.Locale locale25 = null;
        java.lang.String str26 = localTime23.toString("01:53:01.930", locale25);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:53:01.930" + "'", str26, "01:53:01.930");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100, chronology9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) chronology9, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.getLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(0L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(6827000, 8, 19, 86399999, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6827000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("01:52:27.212");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property2.getDifference(readableInstant9);
        int int11 = property2.get();
        org.joda.time.LocalTime localTime13 = property2.setCopy(0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        org.joda.time.LocalTime localTime18 = property16.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType19 = null;
        boolean boolean20 = localTime18.isSupported(durationFieldType19);
        org.joda.time.LocalTime.Property property21 = localTime18.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime18.withPeriodAdded(readablePeriod22, 13);
        int int25 = property2.compareTo((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalTime localTime28 = localTime24.withPeriodAdded(readablePeriod26, 27);
        int int29 = localTime28.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 6843000 + "'", int29 == 6843000);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime14 = property9.addWrapFieldToCopy(33);
        java.lang.String str15 = localTime14.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "01:54:40.412" + "'", str15, "01:54:40.412");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        boolean boolean14 = property11.equals((java.lang.Object) false);
        int int15 = property11.getLeapAmount();
        org.joda.time.LocalTime localTime16 = property11.withMinimumValue();
        boolean boolean17 = localTime8.isBefore((org.joda.time.ReadablePartial) localTime16);
        org.joda.time.LocalTime localTime19 = localTime16.plusMillis(518);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(55, 13, 6833000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(126, 32, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 126 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property4 = localTime3.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.getLocalTime();
        org.joda.time.LocalTime localTime7 = localTime5.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(0L, chronology8);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(317L, chronology8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime16 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        int int22 = localTime16.get(dateTimeFieldType21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime25 = localTime16.withPeriodAdded(readablePeriod23, 9);
        org.joda.time.LocalTime localTime27 = localTime16.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localTime16.getFields();
        org.joda.time.LocalTime localTime30 = localTime16.withMillisOfSecond((int) (byte) 0);
        org.joda.time.LocalTime.Property property31 = localTime16.millisOfDay();
        org.joda.time.LocalTime localTime32 = property31.roundHalfCeilingCopy();
        boolean boolean33 = localTime10.isBefore((org.joda.time.ReadablePartial) localTime32);
        org.joda.time.LocalTime.Property property34 = localTime10.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalTime localTime37 = localTime10.withPeriodAdded(readablePeriod35, (int) 'a');
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime37);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-1606255635), 6790000, 27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255635 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime7 = localTime4.plusSeconds((-1606255626));
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        org.joda.time.LocalTime localTime14 = localTime12.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(100L, chronology15);
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.LocalTime localTime19 = localTime16.minusHours((int) (short) -1);
        boolean boolean20 = localTime7.isBefore((org.joda.time.ReadablePartial) localTime16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime8 = localTime6.minusSeconds(0);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = localTime6.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.ReadableInstant readableInstant9 = null;
        int int10 = property2.getDifference(readableInstant9);
        org.joda.time.LocalTime localTime12 = property2.addCopy((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = property2.getFieldType();
        int int14 = property2.get();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property2.setCopy("01:54:09.562", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:54:09.562\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1606262400) + "'", int10 == (-1606262400));
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime(dateTimeZone6);
        org.joda.time.LocalTime.Property property8 = localTime7.secondOfMinute();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property8.getFieldType();
        int int11 = localTime5.get(dateTimeFieldType10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.Interval interval15 = property14.toInterval();
        org.joda.time.LocalTime localTime16 = property14.roundFloorCopy();
        org.joda.time.LocalTime localTime17 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime19 = localTime17.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property22.getFieldType();
        org.joda.time.LocalTime localTime26 = localTime19.withField(dateTimeFieldType24, (int) (short) 0);
        int int27 = localTime5.get(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime34 = localTime32.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(100L, chronology35);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.LocalTime localTime39 = localTime36.minusHours((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime(dateTimeZone44);
        org.joda.time.LocalTime.Property property46 = localTime45.secondOfMinute();
        org.joda.time.LocalTime localTime47 = property46.getLocalTime();
        org.joda.time.LocalTime localTime49 = localTime47.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology50 = localTime49.getChronology();
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology50);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology50);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime(10L, chronology50);
        org.joda.time.LocalTime localTime54 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a', chronology50);
        boolean boolean55 = localTime36.isEqual((org.joda.time.ReadablePartial) localTime54);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalTime localTime57 = new org.joda.time.LocalTime(dateTimeZone56);
        org.joda.time.LocalTime.Property property58 = localTime57.secondOfMinute();
        org.joda.time.LocalTime localTime59 = property58.getLocalTime();
        org.joda.time.DurationField durationField60 = property58.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField61 = property58.getField();
        org.joda.time.LocalTime localTime62 = property58.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalTime localTime64 = new org.joda.time.LocalTime(dateTimeZone63);
        org.joda.time.LocalTime.Property property65 = localTime64.secondOfMinute();
        org.joda.time.Interval interval66 = property65.toInterval();
        org.joda.time.LocalTime localTime67 = property65.roundFloorCopy();
        org.joda.time.LocalTime localTime68 = property65.withMaximumValue();
        org.joda.time.LocalTime localTime70 = localTime68.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.LocalTime localTime74 = property73.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property73.getFieldType();
        org.joda.time.LocalTime localTime77 = localTime70.withField(dateTimeFieldType75, (int) (short) 0);
        org.joda.time.LocalTime.Property property78 = localTime62.property(dateTimeFieldType75);
        boolean boolean79 = localTime36.isSupported(dateTimeFieldType75);
        boolean boolean80 = localTime5.isSupported(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
// flaky:         org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localTime59);
        org.junit.Assert.assertNotNull(durationField60);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertNotNull(localTime62);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(interval66);
        org.junit.Assert.assertNotNull(localTime67);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(localTime70);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertNotNull(localTime77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
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
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) '#');
        org.joda.time.DateTime dateTime24 = localTime20.toDateTimeToday();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(12, 20);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((int) (short) 0, 9, 1);
        org.joda.time.LocalTime localTime33 = localTime31.withSecondOfMinute(32);
        boolean boolean34 = localTime27.isBefore((org.joda.time.ReadablePartial) localTime33);
        boolean boolean35 = localTime20.isAfter((org.joda.time.ReadablePartial) localTime27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime37 = localTime20.withMillisOfSecond(6790000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6790000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(518L);
        int int2 = localTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime1.withMinuteOfHour(145);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 145 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 518 + "'", int2 == 518);
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
        org.joda.time.LocalTime localTime6 = localTime4.minusMillis((-1606262400));
        org.joda.time.LocalTime localTime8 = localTime4.plusHours(17);
        java.lang.Class<?> wildcardClass9 = localTime8.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) "01:52:16.895");
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(chronology2);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay(0);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime11 = localTime8.withPeriodAdded(readablePeriod9, (int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(dateTimeZone12);
        org.joda.time.LocalTime.Property property14 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property14.getLocalTime();
        boolean boolean17 = property14.equals((java.lang.Object) false);
        int int18 = property14.getLeapAmount();
        org.joda.time.LocalTime localTime19 = property14.withMinimumValue();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime25 = property22.withMaximumValue();
        org.joda.time.LocalTime localTime27 = localTime25.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone28);
        org.joda.time.LocalTime.Property property30 = localTime29.secondOfMinute();
        org.joda.time.LocalTime localTime31 = property30.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property30.getFieldType();
        org.joda.time.LocalTime localTime34 = localTime27.withField(dateTimeFieldType32, (int) (short) 0);
        boolean boolean35 = localTime19.isSupported(dateTimeFieldType32);
        boolean boolean36 = localTime11.isSupported(dateTimeFieldType32);
        int int37 = localTime11.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime11.withMinuteOfHour(6843000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6843000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        org.joda.time.DateTime dateTime12 = localTime8.toDateTime((org.joda.time.ReadableInstant) dateTime11);
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
        org.joda.time.LocalTime localTime27 = localTime18.withPeriodAdded(readablePeriod25, 9);
        boolean boolean28 = localTime8.equals((java.lang.Object) readablePeriod25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.Interval interval32 = property31.toInterval();
        org.joda.time.LocalTime localTime33 = property31.roundFloorCopy();
        org.joda.time.LocalTime localTime35 = property31.addCopy((long) 9);
        org.joda.time.LocalTime localTime36 = property31.roundHalfFloorCopy();
        org.joda.time.DurationField durationField37 = property31.getLeapDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property31.getFieldType();
        org.joda.time.LocalTime localTime40 = localTime8.withField(dateTimeFieldType38, 8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType42 = localTime40.getFieldType(97);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(interval32);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(localTime40);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = localTime4.toString(dateTimeFormatter5);
        org.joda.time.LocalTime localTime8 = localTime4.minusHours((int) (short) 1);
        boolean boolean9 = property2.equals((java.lang.Object) localTime8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime8.minus(readablePeriod10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "01:54:05.830" + "'", str6, "01:54:05.830");
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.LocalTime localTime14 = property9.addWrapFieldToCopy(33);
        java.lang.String str15 = property9.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localTime14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "870" + "'", str15, "870");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(42, (-1606255621), 6803000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 56, dateTimeZone1);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(54, 43, 126, (-1606255633));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-1606255634), 999, 6789000, (-1606255570));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255634 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 0, 9, 1);
        org.joda.time.LocalTime localTime5 = localTime3.plusMinutes((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localTime5.getField(47);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 47");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        org.joda.time.LocalTime localTime5 = property2.withMinimumValue();
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime9 = localTime5.withPeriodAdded(readablePeriod7, 19);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localTime5.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addNoWrapToCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addCopy(6770000);
        org.joda.time.LocalTime localTime9 = property2.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.withMillisOfSecond((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withHourOfDay(32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property2.setCopy("01:52:48.072");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01:52:48.072\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withMillisOfDay((-1606255621));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255621 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.Interval interval3 = property2.toInterval();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.LocalTime localTime6 = property2.addCopy((long) 9);
        org.joda.time.LocalTime localTime7 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField8 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime9 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property2.withMinimumValue();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.minus(readablePeriod11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.getLocalTime();
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology10);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology10);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology10);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999, chronology10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.LocalTime.Property property18 = localTime17.secondOfMinute();
        org.joda.time.LocalTime localTime19 = property18.getLocalTime();
        org.joda.time.DurationField durationField20 = property18.getRangeDurationField();
        java.util.Locale locale21 = null;
        int int22 = property18.getMaximumShortTextLength(locale21);
        org.joda.time.LocalTime localTime24 = property18.addNoWrapToCopy(632);
        org.joda.time.LocalTime.Property property25 = localTime24.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(dateTimeZone26);
        org.joda.time.LocalTime.Property property28 = localTime27.secondOfMinute();
        org.joda.time.Interval interval29 = property28.toInterval();
        org.joda.time.LocalTime localTime30 = property28.roundFloorCopy();
        org.joda.time.LocalTime localTime31 = property28.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime33 = property28.addCopy((long) ' ');
        org.joda.time.LocalTime localTime35 = property28.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime36 = property28.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.LocalTime.Property property39 = localTime38.secondOfMinute();
        org.joda.time.Interval interval40 = property39.toInterval();
        int int41 = property39.getMinimumValueOverall();
        org.joda.time.LocalTime localTime42 = property39.withMinimumValue();
        org.joda.time.LocalTime localTime43 = property39.roundFloorCopy();
        org.joda.time.LocalTime localTime44 = property39.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime45 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalTime localTime47 = new org.joda.time.LocalTime(dateTimeZone46);
        org.joda.time.LocalTime.Property property48 = localTime47.secondOfMinute();
        org.joda.time.Interval interval49 = property48.toInterval();
        org.joda.time.LocalTime localTime50 = property48.roundFloorCopy();
        org.joda.time.LocalTime localTime52 = property48.addCopy((long) 9);
        org.joda.time.LocalTime localTime54 = property48.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalTime localTime56 = new org.joda.time.LocalTime(dateTimeZone55);
        org.joda.time.LocalTime.Property property57 = localTime56.secondOfMinute();
        org.joda.time.LocalTime localTime58 = property57.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType59 = property57.getFieldType();
        org.joda.time.LocalTime localTime61 = localTime54.withField(dateTimeFieldType59, (int) (short) 1);
        boolean boolean62 = localTime45.isSupported(dateTimeFieldType59);
        org.joda.time.LocalTime localTime64 = localTime36.withField(dateTimeFieldType59, 55);
        org.joda.time.LocalTime localTime66 = localTime24.withField(dateTimeFieldType59, 59);
        boolean boolean67 = localTime15.isSupported(dateTimeFieldType59);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.LocalTime localTime69 = new org.joda.time.LocalTime(dateTimeZone68);
        org.joda.time.LocalTime.Property property70 = localTime69.secondOfMinute();
        org.joda.time.LocalTime localTime71 = property70.getLocalTime();
        java.util.Locale locale72 = null;
        java.lang.String str73 = property70.getAsText(locale72);
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.LocalTime localTime75 = new org.joda.time.LocalTime(dateTimeZone74);
        org.joda.time.LocalTime.Property property76 = localTime75.secondOfMinute();
        org.joda.time.LocalTime localTime77 = property76.getLocalTime();
        int int78 = property76.get();
        org.joda.time.LocalTime localTime80 = property76.addCopy(100);
        org.joda.time.LocalTime localTime82 = property76.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property83 = localTime82.millisOfSecond();
        org.joda.time.LocalTime localTime84 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime85 = localTime84.toDateTimeToday();
        org.joda.time.DateTime dateTime86 = localTime82.toDateTime((org.joda.time.ReadableInstant) dateTime85);
        int int87 = property70.compareTo((org.joda.time.ReadableInstant) dateTime85);
        org.joda.time.DateTime dateTime88 = localTime15.toDateTime((org.joda.time.ReadableInstant) dateTime85);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(interval40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime44);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(interval49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localTime58);
        org.junit.Assert.assertNotNull(dateTimeFieldType59);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(localTime64);
        org.junit.Assert.assertNotNull(localTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(property70);
        org.junit.Assert.assertNotNull(localTime71);
// flaky:         org.junit.Assert.assertEquals("'" + str73 + "' != '" + "7" + "'", str73, "7");
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localTime77);
// flaky:         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 7 + "'", int78 == 7);
        org.junit.Assert.assertNotNull(localTime80);
        org.junit.Assert.assertNotNull(localTime82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(localTime84);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertNotNull(dateTime86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(dateTime88);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime6 = localTime4.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(100L, chronology7);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime localTime14 = localTime12.minusHours(27);
        java.lang.String str16 = localTime14.toString("00:24:36.784");
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        int int21 = property19.getLeapAmount();
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 2);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray24 = localTime23.getFieldTypes();
        java.lang.String str26 = localTime23.toString("01:52:35.632");
        int int27 = property19.compareTo((org.joda.time.ReadablePartial) localTime23);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.LocalTime localTime34 = localTime32.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology35 = localTime34.getChronology();
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime(0L, chronology35);
        org.joda.time.LocalTime localTime37 = new org.joda.time.LocalTime(chronology35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.LocalTime.Property property40 = localTime39.secondOfMinute();
        org.joda.time.LocalTime localTime41 = property40.getLocalTime();
        org.joda.time.LocalTime localTime42 = property40.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.Interval interval46 = property45.toInterval();
        org.joda.time.LocalTime localTime47 = property45.roundFloorCopy();
        org.joda.time.LocalTime localTime48 = property45.withMaximumValue();
        org.joda.time.LocalTime localTime50 = localTime48.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalTime localTime52 = new org.joda.time.LocalTime(dateTimeZone51);
        org.joda.time.LocalTime.Property property53 = localTime52.secondOfMinute();
        org.joda.time.LocalTime localTime54 = property53.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = property53.getFieldType();
        org.joda.time.LocalTime localTime57 = localTime50.withField(dateTimeFieldType55, (int) (short) 0);
        org.joda.time.LocalTime localTime58 = localTime42.withFields((org.joda.time.ReadablePartial) localTime57);
        int int59 = localTime58.getMinuteOfHour();
        org.joda.time.LocalTime localTime61 = localTime58.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.LocalTime localTime63 = new org.joda.time.LocalTime(dateTimeZone62);
        org.joda.time.LocalTime.Property property64 = localTime63.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.LocalTime localTime66 = new org.joda.time.LocalTime(dateTimeZone65);
        org.joda.time.LocalTime.Property property67 = localTime66.secondOfMinute();
        org.joda.time.Interval interval68 = property67.toInterval();
        org.joda.time.LocalTime localTime69 = property67.roundFloorCopy();
        int int70 = localTime63.compareTo((org.joda.time.ReadablePartial) localTime69);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.LocalTime localTime72 = new org.joda.time.LocalTime(dateTimeZone71);
        org.joda.time.LocalTime.Property property73 = localTime72.secondOfMinute();
        org.joda.time.LocalTime localTime74 = property73.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType75 = property73.getFieldType();
        boolean boolean76 = localTime63.isSupported(dateTimeFieldType75);
        org.joda.time.LocalTime.Property property77 = localTime58.property(dateTimeFieldType75);
        org.joda.time.LocalTime.Property property78 = localTime37.property(dateTimeFieldType75);
        int int79 = localTime23.indexOf(dateTimeFieldType75);
        org.joda.time.LocalTime localTime81 = localTime14.withField(dateTimeFieldType75, (int) (short) 10);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "00:24:36.784" + "'", str16, "00:24:36.784");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:52:35.632" + "'", str26, "01:52:35.632");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(interval46);
        org.junit.Assert.assertNotNull(localTime47);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertNotNull(localTime57);
        org.junit.Assert.assertNotNull(localTime58);
// flaky:         org.junit.Assert.assertTrue("'" + int59 + "' != '" + 54 + "'", int59 == 54);
        org.junit.Assert.assertNotNull(localTime61);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(interval68);
        org.junit.Assert.assertNotNull(localTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertNotNull(localTime74);
        org.junit.Assert.assertNotNull(dateTimeFieldType75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2 + "'", int79 == 2);
        org.junit.Assert.assertNotNull(localTime81);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        int int4 = property2.get();
        org.joda.time.LocalTime localTime6 = property2.addCopy(100);
        org.joda.time.LocalTime localTime8 = property2.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property9 = localTime8.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) 'a');
        int int12 = property9.getMinimumValueOverall();
        org.joda.time.DateTimeField dateTimeField13 = property9.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property9.addNoWrapToCopy((-1606255608));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        java.lang.String str7 = property2.getAsString();
        long long8 = property2.remainder();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone9);
        org.joda.time.LocalTime.Property property11 = localTime10.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property11.getLocalTime();
        int int13 = property11.get();
        org.joda.time.LocalTime localTime15 = property11.addCopy(100);
        org.joda.time.LocalTime localTime17 = property11.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property18 = localTime17.millisOfSecond();
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime20 = localTime19.toDateTimeToday();
        org.joda.time.DateTime dateTime21 = localTime17.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = property2.getDifference((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalTime localTime24 = property2.addCopy(0);
        org.joda.time.DateTime dateTime25 = localTime24.toDateTimeToday();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "8" + "'", str7, "8");
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 318L + "'", long8 == 318L);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1606255551) + "'", int22 == (-1606255551));
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime7 = property2.withMaximumValue();
        java.lang.String str8 = property2.getAsText();
        int int9 = property2.getMaximumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        int int14 = property12.get();
        org.joda.time.LocalTime localTime16 = property12.addCopy(100);
        org.joda.time.LocalTime localTime18 = property12.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property19 = localTime18.millisOfSecond();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime21 = localTime20.toDateTimeToday();
        org.joda.time.DateTime dateTime22 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        int int23 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "8" + "'", str8, "8");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1606255551) + "'", int23 == (-1606255551));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime.Property property5 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property5.getLocalTime();
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay(100L, chronology9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (short) 100, chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone14);
        org.joda.time.LocalTime.Property property16 = localTime15.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.getLocalTime();
        boolean boolean19 = property16.equals((java.lang.Object) false);
        int int20 = property16.getLeapAmount();
        org.joda.time.DurationField durationField21 = property16.getDurationField();
        org.joda.time.LocalTime localTime22 = property16.withMinimumValue();
        org.joda.time.LocalTime localTime23 = property16.withMaximumValue();
        java.util.Locale locale25 = null;
        org.joda.time.LocalTime localTime26 = property16.setCopy("25", locale25);
        org.joda.time.DateTime dateTime27 = localTime26.toDateTimeToday();
        long long28 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        java.lang.String str29 = property13.getAsString();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1606269265L) + "'", long28 == (-1606269265L));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0" + "'", str29, "0");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = property2.getFieldType();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.LocalTime localTime9 = property2.addCopy(980L);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime14 = property13.getLocalTime();
        org.joda.time.LocalTime localTime16 = localTime14.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology17 = localTime16.getChronology();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(100L, chronology17);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) property2, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "8" + "'", str6, "8");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        boolean boolean5 = property2.equals((java.lang.Object) false);
        org.joda.time.LocalTime localTime7 = property2.addCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime.Property property10 = localTime9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        org.joda.time.LocalTime localTime15 = property13.roundFloorCopy();
        int int16 = localTime9.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime20 = property19.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property19.getFieldType();
        boolean boolean22 = localTime9.isSupported(dateTimeFieldType21);
        org.joda.time.LocalTime localTime24 = localTime7.withField(dateTimeFieldType21, 2);
        org.joda.time.LocalTime localTime26 = localTime24.minusMinutes(202);
        org.joda.time.LocalTime.Property property27 = localTime26.hourOfDay();
        org.joda.time.DurationField durationField28 = property27.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNull(durationField28);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(41, (int) (byte) 1, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
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
        int int6 = property2.getLeapAmount();
        org.joda.time.LocalTime localTime8 = property2.addCopy((int) 'a');
        org.joda.time.LocalTime localTime10 = property2.addCopy(984L);
        org.joda.time.LocalTime localTime12 = property2.setCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withMinuteOfHour((-1606255597));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255597 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.DurationField durationField4 = property2.getRangeDurationField();
        java.util.Locale locale5 = null;
        int int6 = property2.getMaximumShortTextLength(locale5);
        org.joda.time.LocalTime localTime8 = property2.addNoWrapToCopy(632);
        boolean boolean9 = property2.isLeap();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.LocalTime.Property property12 = localTime11.secondOfMinute();
        org.joda.time.LocalTime localTime13 = property12.getLocalTime();
        int int14 = property12.get();
        org.joda.time.LocalTime localTime16 = property12.addCopy(100);
        org.joda.time.LocalTime localTime18 = property12.addWrapFieldToCopy((int) 'a');
        org.joda.time.LocalTime.Property property19 = localTime18.millisOfSecond();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTime dateTime21 = localTime20.toDateTimeToday();
        org.joda.time.DateTime dateTime22 = localTime18.toDateTime((org.joda.time.ReadableInstant) dateTime21);
        int int23 = property2.compareTo((org.joda.time.ReadableInstant) dateTime22);
        int int24 = property2.get();
        java.lang.String str25 = property2.toString();
        java.lang.Class<?> wildcardClass26 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Property[secondOfMinute]" + "'", str25, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        int int32 = localTime25.compareTo((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        boolean boolean38 = localTime25.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime.Property property39 = localTime20.property(dateTimeFieldType37);
        int int40 = property39.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 59 + "'", int40 == 59);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
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
        org.joda.time.LocalTime localTime18 = localTime9.withPeriodAdded(readablePeriod16, 9);
        org.joda.time.LocalTime localTime20 = localTime9.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localTime9.getFields();
        org.joda.time.LocalTime localTime22 = localTime3.withFields((org.joda.time.ReadablePartial) localTime9);
        int int23 = localTime3.getSecondOfMinute();
        org.joda.time.LocalTime.Property property24 = localTime3.minuteOfHour();
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
        org.joda.time.LocalTime localTime40 = localTime31.withPeriodAdded(readablePeriod38, 9);
        org.joda.time.LocalTime localTime42 = localTime31.plusSeconds((int) (byte) 10);
        org.joda.time.DateTimeField[] dateTimeFieldArray43 = localTime31.getFields();
        org.joda.time.Chronology chronology44 = localTime31.getChronology();
        org.joda.time.Chronology chronology45 = localTime31.getChronology();
        org.joda.time.LocalTime localTime46 = new org.joda.time.LocalTime((long) 37, chronology45);
        boolean boolean47 = localTime3.isBefore((org.joda.time.ReadablePartial) localTime46);
        org.joda.time.LocalTime localTime49 = localTime46.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology50 = localTime46.getChronology();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(localTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTimeFieldArray43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(localTime49);
        org.junit.Assert.assertNotNull(chronology50);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime.Property property6 = localTime5.secondOfMinute();
        org.joda.time.Interval interval7 = property6.toInterval();
        org.joda.time.LocalTime localTime8 = property6.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) ' ');
        java.lang.String str11 = localTime8.toString();
        org.joda.time.Chronology chronology12 = localTime8.getChronology();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) '#', (-1606255568), (-1606255561), 24, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01:54:10.000" + "'", str11, "01:54:10.000");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType5 = null;
        boolean boolean6 = localTime4.isSupported(durationFieldType5);
        org.joda.time.LocalTime.Property property7 = localTime4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalTime localTime10 = localTime4.withPeriodAdded(readablePeriod8, 13);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalTime localTime12 = localTime10.minus(readablePeriod11);
        java.lang.String str14 = localTime10.toString("12");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = null;
        java.lang.String str16 = localTime10.toString(dateTimeFormatter15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime10.withMinuteOfHour((-1606255575));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1606255575 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "12" + "'", str14, "12");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "01:54:10.000" + "'", str16, "01:54:10.000");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime.Property property2 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime3 = property2.getLocalTime();
        org.joda.time.LocalTime localTime4 = property2.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(dateTimeZone5);
        org.joda.time.LocalTime.Property property7 = localTime6.secondOfMinute();
        org.joda.time.Interval interval8 = property7.toInterval();
        org.joda.time.LocalTime localTime9 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.withMaximumValue();
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone13);
        org.joda.time.LocalTime.Property property15 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.LocalTime localTime19 = localTime12.withField(dateTimeFieldType17, (int) (short) 0);
        org.joda.time.LocalTime localTime20 = localTime4.withFields((org.joda.time.ReadablePartial) localTime19);
        int int21 = localTime20.getMinuteOfHour();
        org.joda.time.LocalTime localTime23 = localTime20.withMillisOfSecond((int) '#');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(dateTimeZone24);
        org.joda.time.LocalTime.Property property26 = localTime25.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(dateTimeZone27);
        org.joda.time.LocalTime.Property property29 = localTime28.secondOfMinute();
        org.joda.time.Interval interval30 = property29.toInterval();
        org.joda.time.LocalTime localTime31 = property29.roundFloorCopy();
        int int32 = localTime25.compareTo((org.joda.time.ReadablePartial) localTime31);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(dateTimeZone33);
        org.joda.time.LocalTime.Property property35 = localTime34.secondOfMinute();
        org.joda.time.LocalTime localTime36 = property35.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property35.getFieldType();
        boolean boolean38 = localTime25.isSupported(dateTimeFieldType37);
        org.joda.time.LocalTime.Property property39 = localTime20.property(dateTimeFieldType37);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime(dateTimeZone43);
        org.joda.time.LocalTime.Property property45 = localTime44.secondOfMinute();
        org.joda.time.LocalTime localTime46 = property45.getLocalTime();
        org.joda.time.LocalTime localTime48 = localTime46.plusMinutes((int) ' ');
        org.joda.time.Chronology chronology49 = localTime48.getChronology();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay((long) 10, chronology49);
        org.joda.time.LocalTime localTime51 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) 0, chronology49);
        org.joda.time.LocalTime localTime52 = org.joda.time.LocalTime.now(chronology49);
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology49);
        int int54 = localTime20.compareTo((org.joda.time.ReadablePartial) localTime53);
        int[] intArray55 = localTime20.getValues();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 54 + "'", int21 == 54);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertNotNull(localTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(localTime51);
        org.junit.Assert.assertNotNull(localTime52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(intArray55);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[21, 54, 0, 211]");
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
        org.joda.time.LocalTime localTime5 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime7 = property2.addCopy((long) ' ');
        org.joda.time.LocalTime localTime9 = property2.setCopy((int) (byte) 10);
        org.joda.time.LocalTime localTime10 = property2.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.Interval interval14 = property13.toInterval();
        int int15 = property13.getMinimumValueOverall();
        org.joda.time.LocalTime localTime16 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime17 = property13.roundFloorCopy();
        org.joda.time.LocalTime localTime18 = property13.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime19 = property13.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(dateTimeZone20);
        org.joda.time.LocalTime.Property property22 = localTime21.secondOfMinute();
        org.joda.time.Interval interval23 = property22.toInterval();
        org.joda.time.LocalTime localTime24 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.addCopy((long) 9);
        org.joda.time.LocalTime localTime28 = property22.addCopy((int) (short) 1);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(dateTimeZone29);
        org.joda.time.LocalTime.Property property31 = localTime30.secondOfMinute();
        org.joda.time.LocalTime localTime32 = property31.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property31.getFieldType();
        org.joda.time.LocalTime localTime35 = localTime28.withField(dateTimeFieldType33, (int) (short) 1);
        boolean boolean36 = localTime19.isSupported(dateTimeFieldType33);
        org.joda.time.LocalTime localTime38 = localTime10.withField(dateTimeFieldType33, 55);
        org.joda.time.LocalTime localTime40 = localTime10.minusSeconds(28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(interval23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime40);
    }
}
