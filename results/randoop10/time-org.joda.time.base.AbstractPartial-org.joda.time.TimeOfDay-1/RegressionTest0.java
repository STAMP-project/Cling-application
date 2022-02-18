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
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
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
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) -1, (int) '#', (int) (byte) 1, (int) '#', 10, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime3.withTime((int) '4', 0, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime3.withTime((-1), 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(3, (int) (short) -1, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.LocalDateTime localDateTime6 = dateTime5.toLocalDateTime();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = dateTime8.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = localDateTime6.isBefore((org.joda.time.ReadablePartial) timeOfDay11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(7);
        org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = timeOfDay13.isAfter((org.joda.time.ReadablePartial) localDateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        long long7 = dateTime5.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withDayOfWeek((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-607919900L) + "'", long7 == (-607919900L));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeOfDay8.toString("monthOfYear", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) ' ', (int) (short) 10, 100, (int) (short) 100, 14, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        long long7 = dateTime5.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime5.withMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-607919900L) + "'", long7 == (-607919900L));
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 100, (int) (short) 1, 3, (-1), (int) (short) -1, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int[] intArray16 = timeOfDay8.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = timeOfDay8.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.DateTime dateTime11 = dateTime7.withYear(1);
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(7, 1, (int) 'a', 4, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.lang.String str7 = property5.getAsShortText();
        java.util.Locale locale8 = null;
        int int9 = property5.getMaximumTextLength(locale8);
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = property5.setCopy("T00:00:00.200", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T00:00:00.200\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter2.parseDateTime("31");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property9.setCopy("T00:00:00.200", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T00:00:00.200\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime0.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfHour();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeField11.set(4080100L, "0001-12-31T23:48:00.100-01:00", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0001-12-31T23:48:00.100-01:00\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("-01:00", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.eras();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        boolean boolean12 = durationFieldType0.isSupported(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology9.getDateTimeMillis((long) 100, 0, 14, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology8.get(readablePeriod10, (long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        int int10 = dateMidnight9.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateMidnight9.toString("T00:00:00.200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        int int10 = localTime9.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 712 + "'", int10 == 712);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        java.lang.String str7 = date5.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str7, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str10 = dateTimeZone8.getShortName((long) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(7, 8, (int) (byte) 0, (int) ' ', 11, (int) (short) 1, (int) (byte) -1, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-01:00" + "'", str10, "-01:00");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.eras();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.minuteOfDay();
        boolean boolean14 = durationFieldType2.isSupported(chronology11);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 3, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) 0.0f, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = dateTimeFormatter2.parseMutableDateTime("0002-01-01T00:48:00.100Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime12 = dateTime9.toLocalDateTime();
        org.joda.time.DateTime.Property property13 = dateTime9.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property13.addToCopy((long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (-82800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology17.months();
        boolean boolean21 = dateTimeFieldType8.isSupported(chronology17);
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType8.getDurationType();
        boolean boolean23 = dateTime7.isSupported(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) boolean23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime3.withDate(100, (-3600000), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.lang.Appendable appendable4 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(7);
        org.joda.time.DateTime dateTime13 = dateTime9.withYear(1);
        org.joda.time.Chronology chronology14 = dateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.minuteOfDay();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology14);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadablePartial) localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMinutes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = timeOfDay10.getField((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (byte) -1, 23, 85680, (int) (short) 1, (int) (byte) 100, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.Instant instant10 = dateTime9.toInstant();
        org.joda.time.DateTime.Property property11 = dateTime9.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay4.getFieldType(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime12 = dateTime9.toLocalDateTime();
        org.joda.time.DateTime.Property property13 = dateTime9.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime9.withWeekOfWeekyear((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeOfDay13.get(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.ReadableInstant readableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter2.print(readableInstant3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) (-3600000));
        org.joda.time.DateTime dateTime14 = dateTime7.withZone(dateTimeZone11);
        org.joda.time.DateTime dateTime16 = dateTime14.withDayOfYear((int) 'a');
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(7);
        org.joda.time.DateTime dateTime24 = dateTime20.withYear(1);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property26 = dateTime24.hourOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime29 = dateTime27.withDayOfYear(8);
        boolean boolean30 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime14.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        long long11 = property9.remainder();
        java.lang.String str12 = property9.toString();
        int int13 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 480100L + "'", long11 == 480100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[hourOfDay]" + "'", str12, "Property[hourOfDay]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        boolean boolean18 = property8.equals((java.lang.Object) dateTime17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology17.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) chronology8, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str15 = dateTimeZone13.getShortName((long) 0);
        org.joda.time.DateTime dateTime16 = dateTime11.withZone(dateTimeZone13);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-01:00" + "'", str15, "-01:00");
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.DateTime dateTime11 = dateTime7.withYear(1);
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DurationField durationField15 = chronology12.months();
        boolean boolean16 = dateTimeFieldType3.isSupported(chronology12);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 100, chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(17, (int) 'a', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"100\" is malformed at \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print((long) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        gregorianCalendar13.add((int) (byte) 0, (-3600000));
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.setWeekDate(3, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property8.setCopy("yearOfEra", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DurationField durationField15 = chronology13.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(14, 70, (int) '#', 0, 7, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean15 = gregorianCalendar13.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.setWeekDate((int) (short) 10, 712, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("yearOfEra", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(dateTimeParser5);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone16.getName(0L, locale18);
        boolean boolean20 = gregorianCalendar13.equals((java.lang.Object) str19);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(85680, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Thu Jan 01 00:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thu Jan 01 00:00:00 UTC 1970\" is malformed at \"hu Jan 01 00:00:00 UTC 1970\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = gregorianCalendar13.isSet(54060000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54060000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        long long11 = dateTimeField9.roundHalfEven(480100L);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime17 = dateTime15.minusDays(7);
        org.joda.time.DateTime dateTime19 = dateTime15.withYear(1);
        org.joda.time.Chronology chronology20 = dateTime15.getChronology();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(chronology20);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay27 = dateTime24.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.millisOfSecond();
        int int29 = property28.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay31 = property28.addToCopy(100);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay36 = dateTime33.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property37 = timeOfDay36.millisOfSecond();
        boolean boolean38 = timeOfDay31.isEqual((org.joda.time.ReadablePartial) timeOfDay36);
        int[] intArray39 = timeOfDay31.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localTime21, (int) (short) 10, intArray39, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[23, 0, 0, 200]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar13);
        boolean boolean16 = gregorianCalendar13.isLenient();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property13.setCopy("", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) 1, 23, 712, 12, 85680, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85680 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("6");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay13.withSecondOfMinute(12);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeOfDay17.getValue(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        java.util.Locale locale17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap18 = gregorianCalendar13.getDisplayNames(54060000, 85680, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.add(11, 11);
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap20 = gregorianCalendar13.getDisplayNames(3, 3, locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        long long6 = java.util.Date.UTC(12, (-3600000), 100, (int) '4', 12, 82800);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-9469100436480000L) + "'", long6 == (-9469100436480000L));
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        java.time.Instant instant7 = date5.toInstant();
        java.lang.Object obj8 = date5.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        java.time.Instant instant7 = date5.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay((java.lang.Object) instant7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(instant7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime14 = property11.withMaximumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime14.toString(dateTimeFormatter18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.plusMinutes(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property24 = timeOfDay20.property(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField10.set((long) 85680, "08:36:01.912");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"08:36:01.912\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.lang.String str5 = dateTime1.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31T23:00:00.100-01:00" + "'", str5, "1969-12-31T23:00:00.100-01:00");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology6.get(readablePeriod7, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable5, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        int int11 = calendar7.get(10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        long long11 = dateTimeField9.roundFloor((long) 3);
        int int13 = dateTimeField9.getMaximumValue((long) (-3600000));
        org.joda.time.DurationField durationField14 = dateTimeField9.getLeapDurationField();
        java.util.Locale locale15 = null;
        int int16 = dateTimeField9.getMaximumShortTextLength(locale15);
        org.joda.time.ReadablePartial readablePartial17 = null;
        int[] intArray19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField9.addWrapPartial(readablePartial17, 0, intArray19, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-82800000L) + "'", long11 == (-82800000L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        int int13 = property12.getLeapAmount();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        java.util.TimeZone timeZone14 = dateTimeZone10.toTimeZone();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar16 = java.util.Calendar.getInstance(timeZone14, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        java.util.Locale locale16 = null;
        java.util.Calendar calendar17 = dateTime13.toCalendar(locale16);
        int int19 = calendar17.getMaximum(9);
        int int20 = calendar7.compareTo(calendar17);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay();
        int[] intArray18 = new int[] { '#', 9, (byte) 1, 9, 22 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = dateTimeField10.addWrapField((org.joda.time.ReadablePartial) timeOfDay11, 6, intArray18, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[35, 9, 1, 9, 22]");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.DateTime dateTime17 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str21 = dateTimeZone19.getShortName((long) 0);
        org.joda.time.DateTime dateTime22 = dateTime17.withZone(dateTimeZone19);
        org.joda.time.DateTime dateTime23 = dateTime7.withZone(dateTimeZone19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime7.withEra(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-01:00" + "'", str21, "-01:00");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.lang.Object obj10 = null;
        boolean boolean11 = calendar7.equals(obj10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        gregorianCalendar13.add((int) (byte) 0, (-3600000));
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        java.util.Locale locale27 = null;
        java.util.Calendar calendar28 = dateTime24.toCalendar(locale27);
        int int29 = gregorianCalendar13.compareTo(calendar28);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getName(0L, locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        java.lang.Appendable appendable10 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(7);
        org.joda.time.DateTime dateTime18 = dateTime14.withYear(1);
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight20 = dateTime19.toDateMidnight();
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(7);
        org.joda.time.DateTime dateTime29 = dateTime25.withYear(1);
        org.joda.time.DateTime dateTime30 = dateTime29.withEarlierOffsetAtOverlap();
        int int31 = dateTime30.getMonthOfYear();
        org.joda.time.DateTime dateTime32 = localDate21.toDateTime((org.joda.time.ReadableInstant) dateTime30);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable10, (org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 12 + "'", int31 == 12);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(999, 0, 100, (int) '4', 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'secondOfMinute' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(7);
        org.joda.time.DateTime dateTime18 = dateTime14.withYear(1);
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.withChronologyRetainFields(chronology19);
        java.util.Locale locale24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = timeOfDay22.toString("yearOfEra", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        int int6 = date5.getHours();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = dateTime8.toTimeOfDay();
        java.util.Date date12 = dateTime8.toDate();
        long long13 = date12.getTime();
        java.time.Instant instant14 = date12.toInstant();
        int int15 = date5.compareTo(date12);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime6 = localTime4.withSecondOfMinute(1);
        org.joda.time.LocalTime localTime8 = localTime6.plusMinutes(4);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap13 = calendar7.getDisplayNames((int) (short) 10, 14, locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"monthOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        long long11 = property9.remainder();
        int int12 = property9.getMinimumValue();
        int int13 = property9.get();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 480100L + "'", long11 == 480100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 22 + "'", int13 == 22);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.lang.String str7 = property5.getAsShortText();
        org.joda.time.DateTimeField dateTimeField8 = property5.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = property5.setCopy("gregory");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(1L);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.plus(readablePeriod19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay13.minus(readablePeriod21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = timeOfDay13.toString("T01:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("T23:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.DateTime dateTime11 = dateTime7.withYear(1);
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((int) '4', (int) 'a', 10, 24, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter5.parseLocalDate("08:36:01.912");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(7);
        org.joda.time.DateTime dateTime34 = dateTime30.withYear(1);
        org.joda.time.DateTime dateTime35 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str39 = dateTimeZone37.getShortName((long) 0);
        org.joda.time.DateTime dateTime40 = dateTime35.withZone(dateTimeZone37);
        org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str43 = dateTimeFieldType42.toString();
        boolean boolean44 = localTime41.isSupported(dateTimeFieldType42);
        org.joda.time.LocalTime localTime46 = localTime41.minusMinutes(79680);
        org.joda.time.format.DateTimePrinter dateTimePrinter47 = null;
        org.joda.time.format.DateTimeParser dateTimeParser48 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter47, dateTimeParser48);
        boolean boolean50 = dateTimeFormatter49.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = dateTimeFormatter49.withPivotYear((int) (byte) -1);
        boolean boolean53 = localTime41.equals((java.lang.Object) dateTimeFormatter49);
        java.util.Locale locale54 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) localTime41, locale54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-01:00" + "'", str39, "-01:00");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "monthOfYear" + "'", str43, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime7 = dateTime1.minusDays((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime7.withTime(999, 79680, 9, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime12 = localTime10.withSecondOfMinute(1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime12, 14, locale14);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay20 = dateTime17.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.millisOfSecond();
        int int22 = property21.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay24 = property21.addToCopy(100);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay29 = dateTime26.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property30 = timeOfDay29.millisOfSecond();
        boolean boolean31 = timeOfDay24.isEqual((org.joda.time.ReadablePartial) timeOfDay29);
        int int32 = timeOfDay29.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray33 = timeOfDay29.getFieldTypes();
        org.joda.time.TimeOfDay.Property property34 = timeOfDay29.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.TimeOfDay timeOfDay36 = timeOfDay29.plus(readablePeriod35);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay29.minus(readablePeriod37);
        java.util.Locale locale39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay29, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14" + "'", str15, "14");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(timeOfDay38);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear(1);
        org.joda.time.Chronology chronology15 = dateTime10.getChronology();
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(chronology15);
        org.joda.time.DurationField durationField17 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.minuteOfHour();
        org.joda.time.DurationField durationField19 = chronology15.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(0, 0, (int) (byte) -1, 23, (int) ' ', (-292275054), 5, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.DateTime.Property property17 = dateTime16.secondOfDay();
        long long18 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property8.setCopy("0001-12-31T23:48:00.100-01:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0001-12-31T23:48:00.100-01:00\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getName(0L, locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.DateTime dateTime18 = dateTime17.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str22 = dateTimeZone20.getShortName((long) 0);
        org.joda.time.DateTime dateTime23 = dateTime18.withZone(dateTimeZone20);
        org.joda.time.DateTime.Property property24 = dateTime23.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime23.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dateTimeFormatter8.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime25, "31", 6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-01:00" + "'", str22, "-01:00");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str9 = dateTimeZone7.getShortName((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(69, 79680, (int) (byte) 100, 7, 69, 79680, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-01:00" + "'", str9, "-01:00");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(8, 79680, 2, 79680, 31, 54060000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 79680 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.minus(readablePeriod3);
        org.joda.time.LocalTime.Property property5 = localTime2.millisOfDay();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property5.setCopy("-01:00", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-01:00\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 69, chronology1);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime30 = property13.withMinimumValue();
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = property13.setCopy("0002-01-01T00:00:00.000-01:00", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0002-01-01T00:00:00.000-01:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        gregorianCalendar13.add((int) (byte) 0, (-3600000));
        java.lang.String str21 = gregorianCalendar13.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.roll(69, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "gregory" + "'", str21, "gregory");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("T23:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.secondOfMinute();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay32 = dateTime29.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property33 = timeOfDay32.millisOfSecond();
        int int34 = property33.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay36 = property33.addToCopy(100);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays(7);
        org.joda.time.DateTime dateTime46 = dateTime42.withYear(1);
        org.joda.time.Chronology chronology47 = dateTime42.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField49 = chronology47.minuteOfDay();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology47);
        org.joda.time.LocalTime.Property property51 = localTime50.millisOfSecond();
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime55 = dateTime53.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime57 = dateTime55.minusDays(7);
        org.joda.time.DateTime dateTime59 = dateTime55.withYear(1);
        org.joda.time.DateTime dateTime60 = dateTime59.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property61 = dateTime59.hourOfDay();
        org.joda.time.DateTime dateTime62 = property61.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime64 = dateTime62.withDayOfYear(8);
        org.joda.time.DateTime dateTime66 = dateTime64.withMillis((long) 10);
        long long67 = property51.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime64);
        org.joda.time.LocalTime localTime68 = property51.withMinimumValue();
        int[] intArray69 = localTime68.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = dateTimeField27.addWrapField((org.joda.time.ReadablePartial) timeOfDay36, 7, intArray69, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 7");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 62134912800000L + "'", long67 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime68);
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[1, 0, 0, 0]");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        long long11 = dateTimeField9.roundFloor((long) 3);
        int int13 = dateTimeField9.getMaximumValue((long) (-3600000));
        org.joda.time.DurationField durationField14 = dateTimeField9.getLeapDurationField();
        java.util.Locale locale15 = null;
        int int16 = dateTimeField9.getMaximumShortTextLength(locale15);
        java.lang.Class<?> wildcardClass17 = dateTimeField9.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-82800000L) + "'", long11 == (-82800000L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertNull(durationField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfDay();
        org.joda.time.DurationField durationField16 = chronology13.months();
        boolean boolean17 = dateTimeFieldType4.isSupported(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(13, 4, (int) (short) 100, (int) '4', chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1);
        org.joda.time.DateTime dateTime29 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str33 = dateTimeZone31.getShortName((long) 0);
        org.joda.time.DateTime dateTime34 = dateTime29.withZone(dateTimeZone31);
        long long37 = dateTimeZone31.adjustOffset((long) 5, true);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean41 = dateTimeZone39.equals((java.lang.Object) (-3600000));
        long long43 = dateTimeZone31.getMillisKeepLocal(dateTimeZone39, 100L);
        org.joda.time.DateTime dateTime44 = timeOfDay20.toDateTimeToday(dateTimeZone39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField46 = timeOfDay20.getField(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:00" + "'", str33, "-01:00");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5L + "'", long37 == 5L);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.add(11, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = gregorianCalendar13.get(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        long long12 = dateTimeField10.roundFloor((long) 12);
        long long14 = dateTimeField10.roundHalfEven((long) 17);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay19 = dateTime16.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.millisOfSecond();
        int int21 = property20.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay23 = property20.addToCopy(100);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay28 = dateTime25.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property29 = timeOfDay28.millisOfSecond();
        boolean boolean30 = timeOfDay23.isEqual((org.joda.time.ReadablePartial) timeOfDay28);
        int int31 = timeOfDay28.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray32 = timeOfDay28.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.TimeOfDay timeOfDay35 = timeOfDay28.withPeriodAdded(readablePeriod33, (int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay37 = timeOfDay35.plusMinutes(12);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay43 = dateTime40.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.millisOfSecond();
        int int45 = property44.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay47 = property44.addToCopy(100);
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay52 = dateTime49.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay52.millisOfSecond();
        boolean boolean54 = timeOfDay47.isEqual((org.joda.time.ReadablePartial) timeOfDay52);
        int[] intArray55 = timeOfDay47.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = timeOfDay47.getFieldType(0);
        int[] intArray58 = timeOfDay47.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray60 = dateTimeField10.set((org.joda.time.ReadablePartial) timeOfDay37, 3, intArray58, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray32);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[23, 0, 0, 200]");
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime30 = property13.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = localTime30.withMillisOfSecond(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (byte) 100, 12, 712);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(79680, 0, 14, 712, 0, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 712 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.minusMinutes(79680);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((int) (byte) -1);
        boolean boolean26 = localTime14.equals((java.lang.Object) dateTimeFormatter22);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(7);
        org.joda.time.DateTime dateTime34 = dateTime30.withYear(1);
        org.joda.time.DateTime dateTime35 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime36 = dateTime35.toDateTimeISO();
        org.joda.time.DateTime dateTime38 = dateTime36.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property39 = dateTime38.monthOfYear();
        int int40 = dateTime38.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str44 = dateTimeZone42.getShortName((long) 0);
        org.joda.time.MutableDateTime mutableDateTime45 = dateTime38.toMutableDateTime(dateTimeZone42);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = dateTimeFormatter22.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime45, "31", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 85680 + "'", int40 == 85680);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "-01:00" + "'", str44, "-01:00");
        org.junit.Assert.assertNotNull(mutableDateTime45);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean17 = timeOfDay8.isSupported(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = timeOfDay8.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfEra();
        java.lang.String str30 = property29.getName();
        boolean boolean31 = property29.isLeap();
        org.joda.time.DateTime dateTime32 = property29.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime34 = dateTime32.plusWeeks(0);
        org.joda.time.DateTime dateTime35 = timeOfDay20.toDateTime((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int37 = timeOfDay20.get(dateTimeFieldType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "yearOfEra" + "'", str30, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        long long6 = java.util.Date.UTC(0, 22, 7, 0, 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2150668800000L) + "'", long6 == (-2150668800000L));
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a');
        int int2 = localTime1.getSecondOfMinute();
        int int3 = localTime1.getMinuteOfHour();
        org.joda.time.LocalTime localTime5 = localTime1.plusHours(1);
        org.joda.time.LocalTime.Property property6 = localTime1.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime1.withField(dateTimeFieldType7, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology24);
        int int27 = dateTimeField26.getMaximumValue();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(7);
        org.joda.time.DateTime dateTime35 = dateTime31.withYear(1);
        org.joda.time.DateTime dateTime36 = dateTime35.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str40 = dateTimeZone38.getShortName((long) 0);
        org.joda.time.DateTime dateTime41 = dateTime36.withZone(dateTimeZone38);
        org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(dateTimeZone38);
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str44 = dateTimeFieldType43.toString();
        boolean boolean45 = localTime42.isSupported(dateTimeFieldType43);
        java.util.Locale locale46 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = dateTimeField26.getAsText((org.joda.time.ReadablePartial) localTime42, locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 12 + "'", int27 == 12);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "-01:00" + "'", str40, "-01:00");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "monthOfYear" + "'", str44, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        int int6 = date5.getHours();
        int int7 = date5.getHours();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(7);
        org.joda.time.DateTime dateTime15 = dateTime11.withYear(1);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime15.hourOfDay();
        long long18 = dateTime15.getMillis();
        boolean boolean19 = date5.equals((java.lang.Object) long18);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-62104063919900L) + "'", long18 == (-62104063919900L));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder4.setWeekDefinition((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property10 = dateTime8.hourOfDay();
        org.joda.time.DateTime dateTime11 = property10.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfYear(8);
        org.joda.time.Chronology chronology14 = dateTime11.getChronology();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) (-3600000), chronology14);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localTime15.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime12 = localTime10.withSecondOfMinute(1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime12, 14, locale14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime17 = localTime16.toDateTimeToday();
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay23 = dateTime20.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.millisOfSecond();
        int int25 = property24.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay27 = property24.addToCopy(100);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay32 = dateTime29.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property33 = timeOfDay32.millisOfSecond();
        boolean boolean34 = timeOfDay27.isEqual((org.joda.time.ReadablePartial) timeOfDay32);
        int[] intArray35 = timeOfDay27.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = timeOfDay27.getFieldType(0);
        int[] intArray38 = timeOfDay27.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) localTime16, 100, intArray38, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "14" + "'", str15, "14");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[23, 0, 0, 200]");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder6.setCalendarType("T01:00:00.100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: T01:00:00.100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.clear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = calendar7.isSet(79680);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 79680");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology17);
        boolean boolean19 = timeOfDay13.isBefore((org.joda.time.ReadablePartial) localTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = timeOfDay13.withMinuteOfHour(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = dateTimeFormatter2.parseMutableDateTime("-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(1200000, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572174150,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=36,SECOND=14,MILLISECOND=150,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar13);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.setWeekDate((-3600000), 82800, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.withPeriodAdded(readablePeriod6, (int) '4');
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusSeconds((-3600000));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeOfDay10.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.util.TimeZone timeZone10 = calendar7.getTimeZone();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap14 = calendar7.getDisplayNames((int) (short) 0, (int) (short) 10, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy("0", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.DurationField durationField12 = chronology9.months();
        boolean boolean13 = dateTimeFieldType0.isSupported(chronology9);
        java.lang.String str14 = chronology9.toString();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = chronology9.get(readablePeriod15, (long) 712, 4080100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[-01:00]" + "'", str14, "ISOChronology[-01:00]");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology10.months();
        boolean boolean14 = dateTimeFieldType1.isSupported(chronology10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 100, chronology10);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(7);
        org.joda.time.DateTime dateTime24 = dateTime20.withYear(1);
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean28 = localTime26.isSupported(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property29 = timeOfDay16.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        long long11 = dateTimeField9.roundHalfEven(480100L);
        boolean boolean13 = dateTimeField9.isLeap((-82800000L));
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay18 = dateTime15.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay18.millisOfSecond();
        int int20 = property19.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay22 = property19.addToCopy(100);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay27 = dateTime24.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.millisOfSecond();
        boolean boolean29 = timeOfDay22.isEqual((org.joda.time.ReadablePartial) timeOfDay27);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology31);
        boolean boolean33 = timeOfDay27.isBefore((org.joda.time.ReadablePartial) localTime32);
        int[] intArray38 = new int[] { 2022, 24, 2000 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField9.set((org.joda.time.ReadablePartial) localTime32, 54060000, intArray38, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3600000L + "'", long11 == 3600000L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[2022, 24, 2000]");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        gregorianCalendar13.setFirstDayOfWeek((int) (byte) -1);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(7);
        org.joda.time.DateTime dateTime24 = dateTime20.withYear(1);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property29 = dateTime28.monthOfYear();
        org.joda.time.DateTime dateTime31 = dateTime28.minus((long) 1);
        org.joda.time.DurationFieldType durationFieldType32 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime36.minusDays(7);
        org.joda.time.DateTime dateTime40 = dateTime36.withYear(1);
        org.joda.time.Chronology chronology41 = dateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.hourOfHalfday();
        org.joda.time.Chronology chronology45 = chronology41.withUTC();
        boolean boolean46 = durationFieldType32.isSupported(chronology45);
        org.joda.time.DateTime dateTime48 = dateTime31.withFieldAdded(durationFieldType32, 1);
        boolean boolean49 = gregorianCalendar13.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(durationFieldType32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        int int7 = date5.getDate();
        date5.setHours(3);
        int int10 = date5.getYear();
        java.lang.Object obj11 = date5.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 03:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "Thu Jan 01 03:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "Thu Jan 01 03:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "Thu Jan 01 03:00:00 UTC 1970");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale5);
        java.lang.Appendable appendable7 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology17);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay25 = dateTime22.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        int int27 = property26.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property26.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay29.plusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property32 = timeOfDay29.hourOfDay();
        boolean boolean33 = localTime20.isAfter((org.joda.time.ReadablePartial) timeOfDay29);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays(7);
        org.joda.time.DateTime dateTime41 = dateTime37.withYear(1);
        org.joda.time.DateTime dateTime42 = dateTime41.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property43 = dateTime41.hourOfDay();
        org.joda.time.DateTime dateTime44 = property43.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property45 = dateTime44.weekOfWeekyear();
        java.util.Locale locale46 = null;
        int int47 = property45.getMaximumShortTextLength(locale46);
        org.joda.time.DateTime dateTime48 = property45.withMaximumValue();
        org.joda.time.DateTime.Property property49 = dateTime48.millisOfDay();
        org.joda.time.DateTime dateTime50 = localTime20.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, (org.joda.time.ReadableInstant) dateTime50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.util.TimeZone timeZone10 = calendar7.getTimeZone();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone10, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Date date1 = new java.util.Date((-82799998L));
        java.lang.Object obj2 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Wed Dec 31 01:00:00 UTC 1969");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Wed Dec 31 01:00:00 UTC 1969");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Wed Dec 31 01:00:00 UTC 1969");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Wed Dec 31 01:00:00 UTC 1969");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        gregorianCalendar13.add((int) (byte) 0, (-3600000));
        java.lang.String str21 = gregorianCalendar13.getCalendarType();
        gregorianCalendar13.set(12, (-1), (int) ' ', 100, 712, 32770);
        java.lang.Object obj29 = gregorianCalendar13.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "gregory" + "'", str21, "gregory");
        org.junit.Assert.assertNotNull(obj29);
        org.junit.Assert.assertEquals(obj29.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=12,MONTH=-1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=32,DAY_OF_YEAR=32,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=100,MINUTE=712,SECOND=32770,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj29), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=12,MONTH=-1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=32,DAY_OF_YEAR=32,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=100,MINUTE=712,SECOND=32770,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj29), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=0,YEAR=12,MONTH=-1,WEEK_OF_YEAR=5,WEEK_OF_MONTH=1,DAY_OF_MONTH=32,DAY_OF_YEAR=32,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=100,MINUTE=712,SECOND=32770,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        java.util.Locale locale6 = null;
        int int7 = property5.getMaximumShortTextLength(locale6);
        int int8 = property5.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay14 = dateTime11.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.millisOfSecond();
        int int16 = property15.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay18 = property15.addToCopy(100);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay23 = dateTime20.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.millisOfSecond();
        boolean boolean25 = timeOfDay18.isEqual((org.joda.time.ReadablePartial) timeOfDay23);
        int int26 = timeOfDay23.size();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay23, 14, locale28);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay34 = dateTime31.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.millisOfSecond();
        int int36 = property35.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay38 = property35.addToCopy(100);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime42 = dateTime40.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay43 = dateTime40.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property44 = timeOfDay43.millisOfSecond();
        boolean boolean45 = timeOfDay38.isEqual((org.joda.time.ReadablePartial) timeOfDay43);
        int[] intArray46 = timeOfDay38.getValues();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay52 = dateTime49.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay52.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay52.withPeriodAdded(readablePeriod54, (int) '4');
        int[] intArray57 = timeOfDay56.getValues();
        int[] intArray59 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) timeOfDay38, (int) (short) 0, intArray57, 712);
        java.lang.String str60 = dateTimeField9.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14" + "'", str29, "14");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(intArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray57), "[735, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[735, 0, 0, 100]");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "DateTimeField[millisOfSecond]" + "'", str60, "DateTimeField[millisOfSecond]");
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(1328, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        java.lang.String str9 = property8.getName();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = chronology18.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField22 = chronology18.secondOfDay();
        boolean boolean23 = property8.equals((java.lang.Object) dateTimeField22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yearOfEra" + "'", str9, "yearOfEra");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime14 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime15 = dateTime14.withLaterOffsetAtOverlap();
        long long16 = dateTime14.getMillis();
        int int17 = dateTime14.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-62073219600000L) + "'", long16 == (-62073219600000L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 357 + "'", int17 == 357);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DurationField durationField12 = dateTimeField11.getRangeDurationField();
        int int13 = dateTimeField11.getMinimumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        calendar7.setLenient(true);
        int int14 = calendar7.getLeastMaximum(16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = calendar7.isSet((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200000 + "'", int14 == 1200000);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        java.time.Instant instant6 = date5.toInstant();
        int int7 = date5.getMinutes();
        long long8 = date5.getTime();
        java.lang.String str9 = date5.toGMTString();
        date5.setYear(8);
        java.lang.Object obj12 = date5.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 01 00:00:00 UTC 1908");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str9, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "Wed Jan 01 00:00:00 UTC 1908");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "Wed Jan 01 00:00:00 UTC 1908");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "Wed Jan 01 00:00:00 UTC 1908");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.DurationField durationField16 = dateTimeField15.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNull(durationField16);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        long long16 = chronology8.add((long) 7, 5L, 11);
        org.joda.time.DateTimeField dateTimeField17 = chronology8.clockhourOfHalfday();
        java.lang.String str18 = dateTimeField17.getName();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 62L + "'", long16 == 62L);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "clockhourOfHalfday" + "'", str18, "clockhourOfHalfday");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Property[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[hourOfDay]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property11 = timeOfDay8.hourOfDay();
        int int12 = timeOfDay8.size();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay8.plusMillis(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay17 = timeOfDay8.withField(dateTimeFieldType15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology8.get(readablePeriod11, 0L, 24L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime9.withTime(70, 1200000, 11, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(11, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(7);
        org.joda.time.DateTime dateTime18 = dateTime14.withYear(1);
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter8.withChronology(chronology19);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(15, 79680, (int) ' ', 17, 1200000, (int) ' ', chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFormatter22);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay23 = property21.addToCopy(2);
        java.util.Locale locale25 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = property21.setCopy("hours", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hours\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = gregorianCalendar13.getMaximum(2000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setDate((int) '#', (-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder6.setInstant((long) 79680);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(2022, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        int int12 = dateTime9.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((java.lang.Object) int12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.DateTime dateTime11 = dateTime7.withYear(1);
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekyearOfCentury();
        org.joda.time.DurationField durationField14 = chronology12.weeks();
        org.joda.time.DurationField durationField15 = chronology12.centuries();
        org.joda.time.DateTimeField dateTimeField16 = chronology12.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((int) (short) 0, 79680, 32770, 5, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 79680 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.secondOfDay();
        long long21 = chronology13.add((long) 7, 5L, 11);
        org.joda.time.DurationField durationField22 = chronology13.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology13.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((int) (short) 0, 79680, 79680, 1328, 1328, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1328 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 62L + "'", long21 == 62L);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int4 = dateTimeZone2.getStandardOffset((long) (short) 0);
        int int6 = dateTimeZone2.getOffsetFromLocal((long) 4);
        int int8 = dateTimeZone2.getStandardOffset((-62073219600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (short) 10, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-3600000) + "'", int4 == (-3600000));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-3600000) + "'", int6 == (-3600000));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-3600000) + "'", int8 == (-3600000));
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar7.get(712);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 712");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale7 = null;
        java.lang.String str8 = dateTimeZone5.getName(0L, locale7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter3.withZone(dateTimeZone5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.parse("08:36:01.063", dateTimeFormatter9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalTime localTime16 = property13.addCopy(1L);
        org.joda.time.LocalTime localTime18 = property13.addNoWrapToCopy(54060000);
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str22 = dateTimeZone20.getShortName((long) 0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 54060000, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-01:00" + "'", str22, "-01:00");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.DateTime dateTime31 = dateTime26.plus(readableDuration30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime31.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        long long13 = dateTimeField10.set((long) (short) 0, 6);
        int int14 = dateTimeField10.getMaximumValue();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(7);
        org.joda.time.DateTime dateTime22 = dateTime18.withYear(1);
        org.joda.time.DateTime dateTime23 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str27 = dateTimeZone25.getShortName((long) 0);
        org.joda.time.DateTime dateTime28 = dateTime23.withZone(dateTimeZone25);
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(dateTimeZone25);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str31 = dateTimeFieldType30.toString();
        boolean boolean32 = localTime29.isSupported(dateTimeFieldType30);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay37 = dateTime34.toTimeOfDay();
        org.joda.time.LocalTime localTime38 = dateTime34.toLocalTime();
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DurationField durationField40 = chronology39.years();
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType30.getField(chronology39);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.now(chronology39);
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay48 = dateTime45.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property49 = timeOfDay48.millisOfSecond();
        org.joda.time.DurationField durationField50 = property49.getDurationField();
        java.lang.String str51 = property49.getAsShortText();
        org.joda.time.DateTimeField dateTimeField52 = property49.getField();
        org.joda.time.LocalTime localTime53 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime55 = localTime53.withSecondOfMinute(1);
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalTime localTime57 = localTime55.minus(readablePeriod56);
        java.lang.String str58 = localTime55.toString();
        int[] intArray60 = new int[] { 10 };
        int int61 = dateTimeField52.getMaximumValue((org.joda.time.ReadablePartial) localTime55, intArray60);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray63 = dateTimeField10.addWrapPartial((org.joda.time.ReadablePartial) localTime42, 13, intArray60, 999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-61200000L) + "'", long13 == (-61200000L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 24 + "'", int14 == 24);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-01:00" + "'", str27, "-01:00");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "monthOfYear" + "'", str31, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "100" + "'", str51, "100");
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(localTime53);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertNotNull(localTime57);
// flaky:         org.junit.Assert.assertEquals("'" + str58 + "' != '" + "08:36:01.098" + "'", str58, "08:36:01.098");
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 999 + "'", int61 == 999);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        boolean boolean22 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime28 = dateTime26.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime30 = dateTime28.minusDays(7);
        org.joda.time.DateTime dateTime32 = dateTime28.withYear(1);
        org.joda.time.Chronology chronology33 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField34 = chronology33.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField35 = chronology33.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology33.year();
        boolean boolean37 = calendar24.before((java.lang.Object) dateTimeField36);
        org.joda.time.TimeOfDay timeOfDay38 = org.joda.time.TimeOfDay.fromCalendarFields(calendar24);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = calendar24.getGreatestMinimum(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=-62104063919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeOfDay38);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar0.getLeastMaximum(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572176175,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=36,SECOND=16,MILLISECOND=175,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        boolean boolean8 = calendar7.isLenient();
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-292275054), 15, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        long long13 = dateTimeField10.add(0L, 31);
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField10.set((-1483228799900L), "", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 111600000L + "'", long13 == 111600000L);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalTime localTime15 = property13.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property13.setCopy("0002-01-01T00:00:00.000-01:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0002-01-01T00:00:00.000-01:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.Chronology chronology13 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology13.minuteOfDay();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(8, 32772, 0, (int) (short) 0, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1200000, (-1), 70, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        long long16 = chronology8.add((long) 7, 5L, 11);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology8.get(readablePeriod17, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 62L + "'", long16 == 62L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(7, (int) ' ', chronology10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeOfDay13.toString("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: l");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(7);
        org.joda.time.LocalDateTime localDateTime24 = dateTime23.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(17);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronology();
        java.io.Writer writer22 = null;
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays(7);
        org.joda.time.DateTime dateTime30 = dateTime26.withYear(1);
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        int int32 = dateTime31.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(writer22, (org.joda.time.ReadableInstant) dateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 12 + "'", int32 == 12);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.add(11, 11);
        gregorianCalendar13.clear();
        boolean boolean18 = gregorianCalendar13.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = gregorianCalendar13.getLeastMaximum((-738188));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -738188");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.withPeriodAdded(readablePeriod6, (int) '4');
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute(1);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfDay(2);
        boolean boolean14 = timeOfDay4.isAfter((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.LocalTime localTime16 = localTime11.withMillisOfDay(22);
        java.lang.String str17 = localTime16.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "00:00:00.022" + "'", str17, "00:00:00.022");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        java.util.Calendar.Builder builder11 = builder4.setTimeOfDay(0, 23, 14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder4.setInstant((-62104060800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.LocalTime localTime16 = property13.getLocalTime();
        java.util.Locale locale18 = null;
        java.lang.String str19 = localTime16.toString("-01:00", locale18);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology10.months();
        boolean boolean14 = dateTimeFieldType1.isSupported(chronology10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 100, chronology10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology10.add(readablePeriod16, (long) 100, 17);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology10.getDateTimeMillis((int) (short) 0, 0, 1, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay15 = dateTime12.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay15.withPeriodAdded(readablePeriod17, (int) '4');
        int[] intArray20 = timeOfDay19.getValues();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.withMinuteOfHour(11);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) timeOfDay22, 712, locale24);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime31 = dateTime29.minusDays(7);
        org.joda.time.DateTime dateTime33 = dateTime29.withYear(1);
        org.joda.time.DateTime dateTime34 = dateTime33.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str38 = dateTimeZone36.getShortName((long) 0);
        org.joda.time.DateTime dateTime39 = dateTime34.withZone(dateTimeZone36);
        org.joda.time.LocalTime localTime40 = new org.joda.time.LocalTime(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str42 = dateTimeFieldType41.toString();
        boolean boolean43 = localTime40.isSupported(dateTimeFieldType41);
        org.joda.time.LocalTime localTime45 = localTime40.minusMinutes(79680);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay50 = dateTime47.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property51 = timeOfDay50.millisOfSecond();
        int int52 = property51.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay54 = property51.addToCopy(100);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime58 = dateTime56.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay59 = dateTime56.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property60 = timeOfDay59.millisOfSecond();
        boolean boolean61 = timeOfDay54.isEqual((org.joda.time.ReadablePartial) timeOfDay59);
        int[] intArray62 = timeOfDay54.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = timeOfDay54.getFieldType(0);
        int[] intArray65 = timeOfDay54.getValues();
        int int66 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localTime45, intArray65);
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime70 = dateTime68.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime72 = dateTime70.minusDays(7);
        org.joda.time.DateTime dateTime74 = dateTime70.withYear(1);
        org.joda.time.DateTime dateTime75 = dateTime74.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property76 = dateTime74.hourOfDay();
        org.joda.time.DateTime dateTime77 = property76.roundHalfFloorCopy();
        long long78 = property76.remainder();
        java.lang.String str79 = property76.toString();
        long long80 = property76.remainder();
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime84 = dateTime82.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay85 = dateTime82.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property86 = timeOfDay85.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.TimeOfDay timeOfDay89 = timeOfDay85.withPeriodAdded(readablePeriod87, (int) '4');
        org.joda.time.LocalTime localTime90 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime92 = localTime90.withSecondOfMinute(1);
        org.joda.time.LocalTime localTime94 = localTime92.withMillisOfDay(2);
        boolean boolean95 = timeOfDay85.isAfter((org.joda.time.ReadablePartial) localTime92);
        int int96 = property76.compareTo((org.joda.time.ReadablePartial) timeOfDay85);
        int int97 = localTime45.compareTo((org.joda.time.ReadablePartial) timeOfDay85);
        java.lang.String str98 = timeOfDay85.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 0, 0, 100]");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "712" + "'", str25, "712");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "-01:00" + "'", str38, "-01:00");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "monthOfYear" + "'", str42, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(timeOfDay59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertNotNull(intArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray65), "[23, 0, 0, 200]");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 24 + "'", int66 == 24);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime74);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 480100L + "'", long78 == 480100L);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Property[hourOfDay]" + "'", str79, "Property[hourOfDay]");
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 480100L + "'", long80 == 480100L);
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(timeOfDay85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(timeOfDay89);
        org.junit.Assert.assertNotNull(localTime90);
        org.junit.Assert.assertNotNull(localTime92);
        org.junit.Assert.assertNotNull(localTime94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + (-1) + "'", int96 == (-1));
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "T23:00:00.100" + "'", str98, "T23:00:00.100");
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.minusMinutes(79680);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        java.lang.String str21 = durationFieldType20.getName();
        org.joda.time.LocalTime localTime23 = localTime14.withFieldAdded(durationFieldType20, 15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField25 = localTime14.getField(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "halfdays" + "'", str21, "halfdays");
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        long long16 = dateTimeZone10.adjustOffset((long) 5, true);
        java.util.Locale locale18 = null;
        java.lang.String str19 = dateTimeZone10.getName(3110L, locale18);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 5L + "'", long16 == 5L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.setFirstDayOfWeek((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gregorianCalendar13.isSet(85680);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 85680");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        long long16 = chronology8.add((long) 7, 5L, 11);
        org.joda.time.DurationField durationField17 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField18 = chronology8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long24 = chronology8.getDateTimeMillis((long) 3, (-292275054), 712, 7, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 62L + "'", long16 == 62L);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime10 = property8.roundCeilingCopy();
        org.joda.time.DurationField durationField11 = property8.getLeapDurationField();
        org.joda.time.DateTime dateTime12 = property8.roundFloorCopy();
        java.lang.Class<?> wildcardClass13 = property8.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        java.time.Instant instant6 = date5.toInstant();
        int int7 = date5.getMinutes();
        long long8 = date5.getTime();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        java.util.Date date14 = dateTime10.toDate();
        long long15 = date14.getTime();
        org.joda.time.TimeOfDay timeOfDay16 = org.joda.time.TimeOfDay.fromDateFields(date14);
        java.lang.String str17 = date14.toGMTString();
        int int18 = date5.compareTo(date14);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1 Jan 1970 00:00:00 GMT" + "'", str17, "1 Jan 1970 00:00:00 GMT");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int9 = dateTimeZone7.getStandardOffset((long) (short) 0);
        int int11 = dateTimeZone7.getOffsetFromLocal((long) 4);
        int int13 = dateTimeZone7.getStandardOffset((-62073219600000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100, 0, 0, (int) (byte) -1, (-738188), 1328, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-3600000) + "'", int9 == (-3600000));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-3600000) + "'", int11 == (-3600000));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-3600000) + "'", int13 == (-3600000));
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(14, (int) (byte) 100, 0, 712);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfHour();
        org.joda.time.DurationField durationField12 = dateTimeField11.getRangeDurationField();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay17 = dateTime14.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.millisOfSecond();
        int int19 = property18.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay21 = property18.addToCopy(100);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay26 = dateTime23.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay26.millisOfSecond();
        boolean boolean28 = timeOfDay21.isEqual((org.joda.time.ReadablePartial) timeOfDay26);
        int int29 = timeOfDay26.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray30 = timeOfDay26.getFieldTypes();
        org.joda.time.TimeOfDay.Property property31 = timeOfDay26.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay33 = property31.setCopy(1);
        java.lang.String str34 = timeOfDay33.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray35 = timeOfDay33.getFieldTypes();
        int int36 = timeOfDay33.size();
        java.util.Locale locale38 = null;
        java.lang.String str39 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) timeOfDay33, (-3600000), locale38);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = dateTimeField11.set((long) 70, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "T01:00:00.100" + "'", str34, "T01:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-3600000" + "'", str39, "-3600000");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay31 = dateTime28.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property32 = timeOfDay31.millisOfSecond();
        int int33 = property32.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay35 = property32.addToCopy(100);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime39 = dateTime37.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay40 = dateTime37.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property41 = timeOfDay40.millisOfSecond();
        boolean boolean42 = timeOfDay35.isEqual((org.joda.time.ReadablePartial) timeOfDay40);
        int int43 = timeOfDay40.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray44 = timeOfDay40.getFieldTypes();
        org.joda.time.TimeOfDay.Property property45 = timeOfDay40.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.TimeOfDay timeOfDay47 = timeOfDay40.plus(readablePeriod46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) timeOfDay47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(timeOfDay47);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DurationField durationField13 = chronology8.millis();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod14, (long) 85680, (long) 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        boolean boolean22 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        calendar24.set(14, 9, 2);
        int int30 = calendar24.getMinimum((int) (short) 10);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay35 = dateTime32.toTimeOfDay();
        org.joda.time.LocalTime localTime36 = dateTime32.toLocalTime();
        java.util.Locale locale37 = null;
        java.util.Calendar calendar38 = dateTime32.toCalendar(locale37);
        calendar38.setLenient(false);
        boolean boolean41 = calendar24.equals((java.lang.Object) false);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=14,MONTH=9,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(calendar38);
        org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 'a');
        int int2 = localTime1.getSecondOfMinute();
        int int3 = localTime1.getMinuteOfHour();
        int int4 = localTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime1.toString("1 Jan 1970 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime30 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime31 = property13.roundFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int33 = localTime31.get(dateTimeFieldType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = dateTimeFormatter25.parseLocalTime("-1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        org.joda.time.DateTime dateTime14 = property11.withMaximumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.millisOfDay();
        int int16 = property15.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 86399999 + "'", int16 == 86399999);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime1.withMillisOfSecond((-738188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder0.setCalendarType("DateTimeField[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: DateTimeField[minuteOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar7.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.setFirstDayOfWeek((int) (short) -1);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay20 = dateTime17.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.millisOfSecond();
        java.util.Locale locale22 = null;
        int int23 = property21.getMaximumShortTextLength(locale22);
        int int24 = property21.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField25 = property21.getField();
        boolean boolean26 = gregorianCalendar13.equals((java.lang.Object) property21);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getName(0L, locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter8.withOffsetParsed();
        java.lang.Appendable appendable10 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay15 = dateTime12.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay15.withPeriodAdded(readablePeriod17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable10, (org.joda.time.ReadablePartial) timeOfDay19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        org.joda.time.Chronology chronology21 = dateTimeFormatter20.getChronology();
        java.io.Writer writer22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter20.printTo(writer22, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNull(chronology21);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        int int21 = timeOfDay20.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay26 = dateTime23.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property27 = timeOfDay26.millisOfSecond();
        int int28 = property27.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay30 = property27.addToCopy(100);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay35 = dateTime32.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property36 = timeOfDay35.millisOfSecond();
        boolean boolean37 = timeOfDay30.isEqual((org.joda.time.ReadablePartial) timeOfDay35);
        org.joda.time.TimeOfDay timeOfDay39 = timeOfDay30.withMinuteOfHour((int) '#');
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMillis(100);
        boolean boolean42 = timeOfDay20.isAfter((org.joda.time.ReadablePartial) timeOfDay39);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int46 = dateTimeZone44.getStandardOffset((long) (short) 0);
        long long49 = dateTimeZone44.convertLocalToUTC(480100L, false);
        java.lang.String str51 = dateTimeZone44.getShortName((long) '4');
        org.joda.time.DateTimeZone.setDefault(dateTimeZone44);
        org.joda.time.LocalTime localTime53 = new org.joda.time.LocalTime((java.lang.Object) timeOfDay20, dateTimeZone44);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property55 = timeOfDay20.property(dateTimeFieldType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(timeOfDay26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(timeOfDay35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(timeOfDay39);
        org.junit.Assert.assertNotNull(timeOfDay41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-3600000) + "'", int46 == (-3600000));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 4080100L + "'", long49 == 4080100L);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "-01:00" + "'", str51, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        boolean boolean13 = dateTimeField11.isSupported();
        java.util.Locale locale14 = null;
        int int15 = dateTimeField11.getMaximumShortTextLength(locale14);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, 1L, 8);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(7);
        org.joda.time.DateTime dateTime22 = dateTime18.withYear(1);
        org.joda.time.DateTime dateTime23 = dateTime22.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property24 = dateTime22.hourOfDay();
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        boolean boolean28 = dateTimeZone26.equals((java.lang.Object) (-3600000));
        org.joda.time.DateTime dateTime29 = dateTime22.withZone(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int33 = dateTimeZone31.getStandardOffset((long) (short) 0);
        long long35 = dateTimeZone26.getMillisKeepLocal(dateTimeZone31, (long) 0);
        org.joda.time.Chronology chronology36 = chronology8.withZone(dateTimeZone31);
        // The following exception was thrown during execution in test generation
        try {
            long long44 = chronology36.getDateTimeMillis((int) (short) 1, (int) (byte) 100, 2, 15, 85680, 15, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85680 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-3600000) + "'", int33 == (-3600000));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(chronology36);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set(14, 15, 1);
        boolean boolean18 = gregorianCalendar13.isLenient();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = dateTime3.withChronology(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime3.withDayOfYear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        java.lang.String str21 = timeOfDay20.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        int int23 = timeOfDay20.size();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = timeOfDay20.getValue(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "T01:00:00.100" + "'", str21, "T01:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        java.lang.String str9 = property8.getName();
        boolean boolean10 = property8.isLeap();
        int int11 = property8.getMinimumValue();
        java.util.Locale locale12 = null;
        int int13 = property8.getMaximumShortTextLength(locale12);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yearOfEra" + "'", str9, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withHourOfDay(7);
        java.util.GregorianCalendar gregorianCalendar8 = dateTime7.toGregorianCalendar();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap12 = gregorianCalendar8.getDisplayNames(11, 53, locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        boolean boolean20 = property9.equals((java.lang.Object) dateTimeField19);
        long long22 = dateTimeField19.roundHalfEven((long) 16);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay27 = dateTime24.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property28 = timeOfDay27.millisOfSecond();
        int int29 = property28.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay31 = property28.addToCopy(100);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime35 = dateTime33.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay36 = dateTime33.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property37 = timeOfDay36.millisOfSecond();
        boolean boolean38 = timeOfDay31.isEqual((org.joda.time.ReadablePartial) timeOfDay36);
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay31.withMinuteOfHour((int) '#');
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime45 = dateTime43.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay46 = dateTime43.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property47 = timeOfDay46.millisOfSecond();
        int int48 = property47.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay50 = property47.addToCopy(100);
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime54 = dateTime52.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay55 = dateTime52.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property56 = timeOfDay55.millisOfSecond();
        boolean boolean57 = timeOfDay50.isEqual((org.joda.time.ReadablePartial) timeOfDay55);
        int[] intArray58 = timeOfDay50.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType60 = timeOfDay50.getFieldType(0);
        int[] intArray61 = timeOfDay50.getValues();
        java.util.Locale locale63 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray64 = dateTimeField19.set((org.joda.time.ReadablePartial) timeOfDay31, 31, intArray61, "14", locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3600000L + "'", long22 == 3600000L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(timeOfDay27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(timeOfDay36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(timeOfDay46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(timeOfDay50);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(timeOfDay55);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType60);
        org.junit.Assert.assertNotNull(intArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray61), "[23, 0, 0, 200]");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        java.time.Instant instant7 = date5.toInstant();
        date5.setMinutes((int) (short) 10);
        java.lang.String str10 = date5.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:10:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Thu Jan 01 00:10:00 UTC 1970" + "'", str10, "Thu Jan 01 00:10:00 UTC 1970");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.LocalTime localTime16 = property13.addCopy(1L);
        org.joda.time.LocalTime localTime18 = property13.addNoWrapToCopy(54060000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = property13.setCopy(54060000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54060000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("T00:00:00.200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        // The following exception was thrown during execution in test generation
        try {
            calendar7.roll(85680, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        int int6 = localTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = dateTime8.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.withPeriodAdded(readablePeriod13, (int) '4');
        boolean boolean16 = localTime5.equals((java.lang.Object) timeOfDay15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(7);
        org.joda.time.DateTime dateTime24 = dateTime20.withYear(1);
        org.joda.time.DateTime dateTime25 = dateTime24.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime26 = dateTime25.toDateTimeISO();
        org.joda.time.DateTime dateTime28 = dateTime26.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime29 = dateTime26.toLocalDateTime();
        org.joda.time.DateTime.Property property30 = dateTime26.era();
        org.joda.time.DateTime.Property property31 = dateTime26.yearOfEra();
        int int32 = dateTime26.getSecondOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str34 = dateTimeFieldType33.toString();
        org.joda.time.DateTime.Property property35 = dateTime26.property(dateTimeFieldType33);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = localTime5.get(dateTimeFieldType33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 79680 + "'", int32 == 79680);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "monthOfYear" + "'", str34, "monthOfYear");
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        long long14 = dateTime12.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer6, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-607919900L) + "'", long14 == (-607919900L));
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.DateTime dateTime9 = dateTime8.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str13 = dateTimeZone11.getShortName((long) 0);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone11);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str17 = dateTimeFieldType16.toString();
        boolean boolean18 = localTime15.isSupported(dateTimeFieldType16);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay23 = dateTime20.toTimeOfDay();
        org.joda.time.LocalTime localTime24 = dateTime20.toLocalTime();
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.years();
        org.joda.time.DateTimeField dateTimeField27 = dateTimeFieldType16.getField(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay((java.lang.Object) (short) 10, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-01:00" + "'", str13, "-01:00");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "monthOfYear" + "'", str17, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        java.lang.String str9 = property8.getName();
        boolean boolean10 = property8.isLeap();
        int int11 = property8.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yearOfEra" + "'", str9, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology17.months();
        boolean boolean21 = dateTimeFieldType8.isSupported(chronology17);
        org.joda.time.DurationFieldType durationFieldType22 = dateTimeFieldType8.getDurationType();
        boolean boolean23 = dateTime7.isSupported(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime7.withDayOfWeek(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology10.months();
        boolean boolean14 = dateTimeFieldType1.isSupported(chronology10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 100, chronology10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology10.add(readablePeriod16, (long) 100, 17);
        org.joda.time.DurationField durationField20 = chronology10.months();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(7);
        org.joda.time.DateTime dateTime29 = dateTime25.withYear(1);
        org.joda.time.Chronology chronology30 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.hourOfHalfday();
        org.joda.time.Chronology chronology34 = chronology30.withUTC();
        boolean boolean35 = durationFieldType21.isSupported(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay((java.lang.Object) durationField20, chronology34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        int int10 = dateMidnight9.getSecondOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(7);
        org.joda.time.DateTime dateTime18 = dateTime14.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(7);
        org.joda.time.DateTime dateTime27 = dateTime23.withYear(1);
        org.joda.time.Chronology chronology28 = dateTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField30 = chronology28.minuteOfDay();
        org.joda.time.DurationField durationField31 = chronology28.months();
        boolean boolean32 = dateTimeFieldType19.isSupported(chronology28);
        org.joda.time.DurationFieldType durationFieldType33 = dateTimeFieldType19.getDurationType();
        boolean boolean34 = dateTime18.isSupported(dateTimeFieldType19);
        boolean boolean35 = dateMidnight9.isSupported(dateTimeFieldType19);
        java.lang.String str36 = dateTimeFieldType19.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(durationFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "weekyearOfCentury" + "'", str36, "weekyearOfCentury");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        long long13 = dateTimeField10.add(0L, 31);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(4080100L);
        int[] intArray17 = null;
        int[] intArray19 = dateTimeField10.add((org.joda.time.ReadablePartial) localTime15, 9, intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime15.withMillisOfSecond((-738188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 111600000L + "'", long13 == 111600000L);
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.Chronology chronology22 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.minuteOfDay();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology22);
        java.lang.String str26 = localTime25.toString();
        org.joda.time.Chronology chronology27 = localTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = chronology27.yearOfCentury();
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) 17, chronology27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((java.lang.Object) dateTimeField11, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "01:00:00.000" + "'", str26, "01:00:00.000");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) dateTimeField13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime0.withPeriodAdded(readablePeriod2, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime0.withField(dateTimeFieldType5, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 10, (int) '#', (-738188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.DateTime dateTime27 = org.joda.time.DateTime.now(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime27.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology8.get(readablePeriod12, (-9469100436480000L), (long) 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(999, 15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(9);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays(7);
        org.joda.time.DateTime dateTime15 = dateTime11.withYear(1);
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property17 = dateTime15.hourOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property19 = dateTime18.weekOfWeekyear();
        java.util.Locale locale20 = null;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.DateTime dateTime22 = property19.withMaximumValue();
        org.joda.time.DateTime.Property property23 = dateTime22.millisOfDay();
        int int24 = dateTime22.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) '4', 1970, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.year();
        java.lang.String str13 = dateTimeField11.getAsShortText((-61200000L));
        boolean boolean14 = dateTimeField11.isSupported();
        int int16 = dateTimeField11.get((long) (-292275054));
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField11.set(10L, "DateTimeField[minuteOfHour]", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[minuteOfHour]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1969" + "'", str13, "1969");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1969 + "'", int16 == 1969);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        boolean boolean20 = property9.equals((java.lang.Object) dateTimeField19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay25 = dateTime22.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        int int27 = property26.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property26.addToCopy(100);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay34 = dateTime31.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.millisOfSecond();
        boolean boolean36 = timeOfDay29.isEqual((org.joda.time.ReadablePartial) timeOfDay34);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay29.withMinuteOfHour((int) '#');
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withMillisOfSecond((int) '#');
        int int41 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.DurationFieldType durationFieldType42 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay44 = timeOfDay40.withFieldAdded(durationFieldType42, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(durationFieldType42);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime10 = localTime9.toDateTimeToday();
        int int11 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime3.withWeekOfWeekyear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.util.Locale locale6 = null;
        java.lang.String str7 = dateTimeZone4.getName(0L, locale6);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withZone(dateTimeZone4);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology18.minuteOfDay();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology18);
        java.lang.String str22 = localTime21.toString();
        org.joda.time.Chronology chronology23 = localTime21.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeFormatter8.print((org.joda.time.ReadablePartial) localTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "-01:00" + "'", str7, "-01:00");
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "01:00:00.000" + "'", str22, "01:00:00.000");
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(9, (int) (short) -1, 53, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime30 = property13.withMinimumValue();
        org.joda.time.LocalTime localTime32 = localTime30.withMinuteOfHour(11);
        int int33 = localTime32.size();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays(7);
        org.joda.time.LocalDateTime localDateTime40 = dateTime39.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = localDateTime40.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property43 = localTime32.property(dateTimeFieldType42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean15 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean17 = gregorianCalendar13.isSet((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        java.time.Instant instant6 = date5.toInstant();
        int int7 = date5.getSeconds();
        java.lang.Object obj8 = null;
        boolean boolean9 = date5.equals(obj8);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime4 = localTime0.withPeriodAdded(readablePeriod2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localTime4.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalTime localTime30 = property13.withMinimumValue();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(7);
        org.joda.time.DateTime dateTime38 = dateTime34.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime43 = dateTime41.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime45 = dateTime43.minusDays(7);
        org.joda.time.DateTime dateTime47 = dateTime43.withYear(1);
        org.joda.time.Chronology chronology48 = dateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.minuteOfDay();
        org.joda.time.DurationField durationField51 = chronology48.months();
        boolean boolean52 = dateTimeFieldType39.isSupported(chronology48);
        org.joda.time.DurationFieldType durationFieldType53 = dateTimeFieldType39.getDurationType();
        boolean boolean54 = dateTime38.isSupported(dateTimeFieldType39);
        org.joda.time.DurationFieldType durationFieldType55 = dateTimeFieldType39.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime57 = localTime30.withFieldAdded(durationFieldType55, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(durationField51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(durationFieldType53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(durationFieldType55);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimePrinter dateTimePrinter5 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer6 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays(7);
        org.joda.time.DateTime dateTime16 = dateTime12.withYear(1);
        org.joda.time.Chronology chronology17 = dateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.minuteOfDay();
        org.joda.time.DurationField durationField20 = chronology17.months();
        boolean boolean21 = dateTimeFieldType8.isSupported(chronology17);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (byte) 100, chronology17);
        org.joda.time.TimeOfDay timeOfDay23 = new org.joda.time.TimeOfDay((java.lang.Object) dateTime22);
        org.joda.time.LocalTime localTime24 = dateTime22.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadableInstant) dateTime22);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(dateTimePrinter5);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(13, 22, 13, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder6.set(54060000, (-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        boolean boolean13 = dateTimeField11.isSupported();
        long long15 = dateTimeField11.roundFloor((long) 53);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("clockhourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'clockhourOfHalfday' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.set((long) 3, 1328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1328 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(9);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        java.lang.Appendable appendable9 = null;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now();
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(appendable9, (org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withHourOfDay(7);
        java.util.GregorianCalendar gregorianCalendar8 = dateTime7.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = gregorianCalendar8.get(999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 999");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(gregorianCalendar8);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        boolean boolean20 = property9.equals((java.lang.Object) dateTimeField19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay25 = dateTime22.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        int int27 = property26.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property26.addToCopy(100);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay34 = dateTime31.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.millisOfSecond();
        boolean boolean36 = timeOfDay29.isEqual((org.joda.time.ReadablePartial) timeOfDay34);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay29.withMinuteOfHour((int) '#');
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withMillisOfSecond((int) '#');
        int int41 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay40);
        org.joda.time.TimeOfDay.Property property42 = timeOfDay40.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(property42);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((java.lang.Object) dateTimeField14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.withMillisOfDay(70);
        org.joda.time.DateTime dateTime17 = dateTime11.withMillis(111600000L);
        org.joda.time.YearMonthDay yearMonthDay18 = dateTime17.toYearMonthDay();
        org.joda.time.DateTime.Property property19 = dateTime17.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = property19.setCopy("08:36:01.471");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"08:36:01.471\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 85680 + "'", int13 == 85680);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        java.lang.Appendable appendable6 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear(1);
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTimeISO();
        org.joda.time.DateTime dateTime18 = dateTime16.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property19 = dateTime18.monthOfYear();
        int int20 = dateTime18.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str24 = dateTimeZone22.getShortName((long) 0);
        org.joda.time.MutableDateTime mutableDateTime25 = dateTime18.toMutableDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = dateTime18.plusDays(100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable6, (org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 85680 + "'", int20 == 85680);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-01:00" + "'", str24, "-01:00");
        org.junit.Assert.assertNotNull(mutableDateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime10 = dateTime8.plusYears((int) (short) 0);
        boolean boolean12 = dateTime8.isEqual((long) (byte) 0);
        java.util.Locale locale13 = null;
        java.util.Calendar calendar14 = dateTime8.toCalendar(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime8.withWeekOfWeekyear(82800);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 82800 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-62104063919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.roll(17, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        java.io.Writer writer6 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.Instant instant13 = dateTime12.toInstant();
        org.joda.time.DateTime.Property property14 = dateTime12.centuryOfEra();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime12.plus(readableDuration15);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.DateTime dateTime13 = dateTime12.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property14 = dateTime12.hourOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear(8);
        org.joda.time.Chronology chronology18 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.yearOfEra();
        org.joda.time.DurationField durationField20 = chronology18.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((int) (short) 1, (int) (byte) 0, 69, 712, 17, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 712 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withLocale(locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter2.parseDateTime("-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(1);
        org.joda.time.LocalTime localTime4 = localTime2.withMillisOfDay(2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType5.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime4.withField(dateTimeFieldType5, (-738188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1);
        org.joda.time.DateTime.Property property29 = dateTime28.yearOfEra();
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays(7);
        org.joda.time.DateTime dateTime37 = dateTime33.withYear(1);
        org.joda.time.DateTime dateTime38 = dateTime37.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str42 = dateTimeZone40.getShortName((long) 0);
        org.joda.time.DateTime dateTime43 = dateTime38.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime44 = dateTime28.withZone(dateTimeZone40);
        org.joda.time.DateTime dateTime46 = dateTime28.minusHours((int) 'a');
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.DateTime dateTime48 = dateTime28.minus(readableDuration47);
        int int49 = property18.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DurationField durationField50 = property18.getRangeDurationField();
        org.joda.time.TimeOfDay timeOfDay51 = property18.getTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay53 = property18.addNoWrapToCopy(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-01:00" + "'", str42, "-01:00");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(timeOfDay51);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int2 = localTime0.get(dateTimeFieldType1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis(11);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(7);
        org.joda.time.DateTime dateTime23 = dateTime19.withYear(1);
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.minuteOfDay();
        org.joda.time.DurationField durationField27 = chronology24.months();
        boolean boolean28 = dateTimeFieldType15.isSupported(chronology24);
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType15.getDurationType();
        boolean boolean30 = dateTime14.isSupported(dateTimeFieldType15);
        int int31 = dateTime6.get(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property32 = localTime0.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 69 + "'", int31 == 69);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology10);
        java.lang.String str14 = localTime13.toString();
        org.joda.time.Chronology chronology15 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.yearOfCentury();
        org.joda.time.TimeOfDay timeOfDay17 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 357, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology15.getDateTimeMillis((long) 32769, 9, 357, 11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 357 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "01:00:00.000" + "'", str14, "01:00:00.000");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(timeOfDay17);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        java.time.Instant instant6 = date5.toInstant();
        int int7 = date5.getHours();
        int int8 = date5.getMinutes();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.plus(readablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = timeOfDay13.getField((-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -3600000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        calendar7.setLenient(true);
        int int14 = calendar7.getLeastMaximum(16);
        calendar7.set(0, 13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.clear(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=13,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=-1,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200000 + "'", int14 == 1200000);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.minusMinutes(79680);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = localTime14.withField(dateTimeFieldType20, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(999, 12, 54060000, 70, (int) (short) 100, 86399999, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        java.lang.String str21 = timeOfDay20.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray22 = timeOfDay20.getFieldTypes();
        java.lang.String str23 = timeOfDay20.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "T01:00:00.100" + "'", str21, "T01:00:00.100");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "T01:00:00.100" + "'", str23, "T01:00:00.100");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMillis(11);
        org.joda.time.DateTime.Property property4 = dateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = property4.addToCopy(31529280100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 31529280100 * 604800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        boolean boolean13 = dateTimeZone11.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology14 = chronology9.withZone(dateTimeZone11);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(480100L, chronology9);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = chronology9.get(readablePeriod16, (-62104064400000L), (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime.Property property8 = dateTime7.yearOfEra();
        org.joda.time.DateTime dateTime9 = property8.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.secondOfMinute();
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay16 = dateTime13.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property17 = timeOfDay16.millisOfSecond();
        java.util.Locale locale18 = null;
        int int19 = property17.getMaximumShortTextLength(locale18);
        int int20 = property17.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField21 = property17.getField();
        java.util.Locale locale22 = null;
        int int23 = dateTimeField21.getMaximumTextLength(locale22);
        java.util.Locale locale25 = null;
        java.lang.String str26 = dateTimeField21.getAsText((int) (byte) 0, locale25);
        long long28 = dateTimeField21.roundHalfFloor((-607919900L));
        int int29 = dateTime9.get(dateTimeField21);
        org.joda.time.DurationField durationField30 = dateTimeField21.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = dateTimeField21.getDifference((-62104057200000L), 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -62104057200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(timeOfDay16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-607919900L) + "'", long28 == (-607919900L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 100 + "'", int29 == 100);
        org.junit.Assert.assertNotNull(durationField30);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = gregorianCalendar13.isSet(31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeOfDay15);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(22, (int) (short) 10, 70, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(365, 14, 357);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        boolean boolean22 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime21);
        int int23 = dateTime13.getEra();
        org.joda.time.LocalTime localTime24 = dateTime13.toLocalTime();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalTime localTime27 = localTime24.withPeriodAdded(readablePeriod25, 9);
        int int28 = localTime27.getHourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime32 = dateTime30.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay33 = dateTime30.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property34 = timeOfDay33.millisOfSecond();
        int int35 = property34.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay37 = property34.addToCopy(100);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime41 = dateTime39.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay42 = dateTime39.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property43 = timeOfDay42.millisOfSecond();
        boolean boolean44 = timeOfDay37.isEqual((org.joda.time.ReadablePartial) timeOfDay42);
        int int45 = timeOfDay42.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray46 = timeOfDay42.getFieldTypes();
        org.joda.time.TimeOfDay.Property property47 = timeOfDay42.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay49 = property47.setCopy(1);
        org.joda.time.TimeOfDay.Property property50 = timeOfDay49.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay52 = property50.addToCopy(2);
        boolean boolean53 = localTime27.equals((java.lang.Object) 2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 22 + "'", int28 == 22);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(timeOfDay33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(timeOfDay42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(timeOfDay49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(13, 22, 13, 11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder6.setWeekDefinition((int) 'a', 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((-3600000), 85680);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        java.util.Calendar.Builder builder11 = builder4.setTimeOfDay(0, 23, 14);
        java.util.Locale locale12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder11.setLocale(locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.setCopy("14");
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeOfDay8.getValue(712);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 712");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (byte) 1, 1328, 54060000, 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1328 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.DateTime dateTime10 = dateTime9.withEarlierOffsetAtOverlap();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        int int12 = dateMidnight11.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(7);
        org.joda.time.DateTime dateTime20 = dateTime16.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(7);
        org.joda.time.DateTime dateTime29 = dateTime25.withYear(1);
        org.joda.time.Chronology chronology30 = dateTime25.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.minuteOfDay();
        org.joda.time.DurationField durationField33 = chronology30.months();
        boolean boolean34 = dateTimeFieldType21.isSupported(chronology30);
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType21.getDurationType();
        boolean boolean36 = dateTime20.isSupported(dateTimeFieldType21);
        boolean boolean37 = dateMidnight11.isSupported(dateTimeFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime0.withField(dateTimeFieldType21, 53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.DateTime dateTime11 = dateTime10.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property12 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = property12.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.withDayOfYear(8);
        org.joda.time.Chronology chronology16 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(16, 0, (-738188), chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for secondOfMinute must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        java.lang.String str16 = timeOfDay8.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay8.withSecondOfMinute(712);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 712 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "T23:00:00.200" + "'", str16, "T23:00:00.200");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        long long6 = date5.getTime();
        int int7 = date5.getDate();
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime11 = dateTime9.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay12 = dateTime9.toTimeOfDay();
        java.util.Date date13 = dateTime9.toDate();
        java.time.Instant instant14 = date13.toInstant();
        int int15 = date13.getHours();
        date13.setSeconds((int) (short) 1);
        date13.setMonth(4);
        int int20 = date5.compareTo(date13);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Fri May 01 00:00:01 UTC 1970");
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.setMinimalDaysInFirstWeek(0);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(11, 32772, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int9 = calendar7.getMaximum(9);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields(calendar7);
        calendar7.setLenient(true);
        int int14 = calendar7.getLeastMaximum(16);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(5, (-738188), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1200000 + "'", int14 == 1200000);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.util.TimeZone timeZone10 = calendar7.getTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        boolean boolean13 = calendar11.isSet((int) (byte) 10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572184330,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=8,HOUR_OF_DAY=8,MINUTE=36,SECOND=24,MILLISECOND=330,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        java.lang.Class<?> wildcardClass1 = dateTimeFieldType0.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.util.TimeZone timeZone10 = calendar7.getTimeZone();
        boolean boolean12 = calendar7.isSet(8);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.minuteOfDay();
        org.joda.time.DurationField durationField13 = chronology10.months();
        boolean boolean14 = dateTimeFieldType1.isSupported(chronology10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (byte) 100, chronology10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        long long19 = chronology10.add(readablePeriod16, (long) 100, 17);
        org.joda.time.DurationField durationField20 = chronology10.months();
        org.joda.time.DurationField durationField21 = chronology10.years();
        java.lang.Class<?> wildcardClass22 = durationField21.getClass();
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(7);
        org.joda.time.DateTime dateTime13 = dateTime9.withYear(1);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        java.lang.String str18 = dateTime17.toString();
        int int19 = dateTime17.getSecondOfMinute();
        boolean boolean20 = dateTime1.equals((java.lang.Object) dateTime17);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) dateTime17);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = chronology22.get(readablePeriod24, 25L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str18, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        java.util.Locale locale12 = null;
        int int13 = property11.getMaximumShortTextLength(locale12);
        int int14 = property11.get();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        java.util.Locale locale6 = null;
        int int7 = property5.getMaximumShortTextLength(locale6);
        int int8 = property5.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay14 = dateTime11.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.millisOfSecond();
        int int16 = property15.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay18 = property15.addToCopy(100);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay23 = dateTime20.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property24 = timeOfDay23.millisOfSecond();
        boolean boolean25 = timeOfDay18.isEqual((org.joda.time.ReadablePartial) timeOfDay23);
        int int26 = timeOfDay23.size();
        java.util.Locale locale28 = null;
        java.lang.String str29 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) timeOfDay23, 14, locale28);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay23.plusMillis(16);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = timeOfDay23.get(dateTimeFieldType32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "14" + "'", str29, "14");
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property13.setCopy(1200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1200000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.hourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.minuteOfDay();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        boolean boolean13 = dateTimeField11.isSupported();
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeField11.set((long) 1969, "Property[hourOfDay]", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[hourOfDay]\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime7 = dateTime5.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays(7);
        org.joda.time.DateTime dateTime11 = dateTime7.withYear(1);
        org.joda.time.Chronology chronology12 = dateTime7.getChronology();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        boolean boolean16 = dateTimeZone14.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology17 = chronology12.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay(54060000, 54060000, (int) (short) 1, 12, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54060000 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(7);
        org.joda.time.DateTime dateTime13 = dateTime9.withYear(1);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        java.lang.String str18 = dateTime17.toString();
        int int19 = dateTime17.getSecondOfMinute();
        boolean boolean20 = dateTime1.equals((java.lang.Object) dateTime17);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) dateTime17);
        org.joda.time.DateTime.Property property22 = dateTime17.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime17.withEra(1328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1328 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str18, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean15 = gregorianCalendar13.isWeekDateSupported();
        int int16 = gregorianCalendar13.getWeekYear();
        java.lang.String str17 = gregorianCalendar13.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "java.util.GregorianCalendar[time=-62104057919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=48,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]" + "'", str17, "java.util.GregorianCalendar[time=-62104057919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=48,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        java.lang.String str16 = timeOfDay8.toString();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays(7);
        org.joda.time.DateTime dateTime24 = dateTime20.withYear(1);
        org.joda.time.Chronology chronology25 = dateTime20.getChronology();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(chronology25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean28 = localTime26.isSupported(dateTimeFieldType27);
        boolean boolean29 = timeOfDay8.isBefore((org.joda.time.ReadablePartial) localTime26);
        org.joda.time.TimeOfDay.Property property30 = timeOfDay8.hourOfDay();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "T23:00:00.200" + "'", str16, "T23:00:00.200");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.add(11, 32770);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.set((int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=117972000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1973,MONTH=8,WEEK_OF_YEAR=39,WEEK_OF_MONTH=5,DAY_OF_MONTH=27,DAY_OF_YEAR=270,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=10,HOUR_OF_DAY=10,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.lang.String str7 = property5.getAsShortText();
        java.util.Locale locale8 = null;
        int int9 = property5.getMaximumTextLength(locale8);
        java.util.Locale locale10 = null;
        java.lang.String str11 = property5.getAsShortText(locale10);
        org.joda.time.TimeOfDay timeOfDay13 = property5.setCopy((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = timeOfDay13.getField((-738188));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -738188");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(9);
        java.lang.StringBuffer stringBuffer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer8, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder4.setInstant((long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay13.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay20 = property18.setCopy(1);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.withMillisOfSecond(69);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay25 = timeOfDay20.withFieldAdded(durationFieldType23, 1328);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(durationFieldType23);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.plusHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localTime4.getField(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.set((int) (short) 1, (int) 'a', (int) (short) 1);
        gregorianCalendar13.add((int) (byte) 0, (-3600000));
        java.lang.String str21 = gregorianCalendar13.getCalendarType();
        gregorianCalendar13.set(12, (-1), (int) ' ', 100, 712, 32770);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.set((int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "gregory" + "'", str21, "gregory");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder8 = builder4.setTimeOfDay((int) (byte) 10, (int) (short) 0, 13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder8.setInstant((-62104060800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("17 Nov 1935 10:32:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        int int6 = localTime5.getMillisOfSecond();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay11 = dateTime8.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property12 = timeOfDay11.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay11.withPeriodAdded(readablePeriod13, (int) '4');
        boolean boolean16 = localTime5.equals((java.lang.Object) timeOfDay15);
        org.joda.time.LocalTime localTime18 = localTime5.withMillisOfSecond((int) ' ');
        org.joda.time.DateTimeField dateTimeField20 = localTime18.getField((int) (byte) 1);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField20.set((long) 0, "ISOChronology[-01:00]", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[-01:00]\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        long long11 = property9.remainder();
        int int12 = property9.getMinimumValue();
        org.joda.time.DateTime dateTime13 = property9.roundFloorCopy();
        org.joda.time.DateTime dateTime14 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTime14.toString("0001-12-31T23:48:35.100-01:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 480100L + "'", long11 == 480100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        boolean boolean22 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime21);
        boolean boolean23 = dateTime21.isEqualNow();
        org.joda.time.DateTime dateTime25 = dateTime21.minusSeconds(22);
        java.lang.String str26 = dateTime25.toString();
        java.lang.Class<?> wildcardClass27 = dateTime25.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0001-12-31T22:07:38.100-01:00" + "'", str26, "0001-12-31T22:07:38.100-01:00");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(69, (-738188), 32770, 85680, 7, 5, 79680);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 85680 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1);
        org.joda.time.DateTime dateTime29 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str33 = dateTimeZone31.getShortName((long) 0);
        org.joda.time.DateTime dateTime34 = dateTime29.withZone(dateTimeZone31);
        long long37 = dateTimeZone31.adjustOffset((long) 5, true);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean41 = dateTimeZone39.equals((java.lang.Object) (-3600000));
        long long43 = dateTimeZone31.getMillisKeepLocal(dateTimeZone39, 100L);
        org.joda.time.DateTime dateTime44 = timeOfDay20.toDateTimeToday(dateTimeZone39);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType46 = dateTimeFieldType45.getDurationType();
        boolean boolean47 = dateTime44.isSupported(dateTimeFieldType45);
        org.joda.time.DateTime dateTime48 = dateTime44.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime50 = dateTime44.withHourOfDay(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:00" + "'", str33, "-01:00");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5L + "'", long37 == 5L);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        int int27 = dateTimeFormatter2.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = dateTimeFormatter2.parseLocalDate("java.util.GregorianCalendar[time=-62104057919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=48,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2000 + "'", int27 == 2000);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((-1), 79680, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = dateTimeFormatter26.parseLocalTime("36");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((int) (short) -1, 2000, 7, 59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.clear();
        boolean boolean10 = calendar7.after((java.lang.Object) (short) 0);
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap14 = calendar7.getDisplayNames((-738188), 712, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter2.parseLocalTime("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay22 = dateTime19.toTimeOfDay();
        org.joda.time.LocalTime localTime23 = dateTime19.toLocalTime();
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DurationField durationField25 = chronology24.years();
        org.joda.time.DateTimeField dateTimeField26 = dateTimeFieldType15.getField(chronology24);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(chronology24);
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        org.joda.time.LocalTime localTime29 = property28.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = localTime29.withField(dateTimeFieldType30, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.setMinimalDaysInFirstWeek(0);
        java.lang.Object obj10 = calendar7.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "java.util.GregorianCalendar[time=-3119900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=0,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear(1);
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str19 = dateTimeZone17.getShortName((long) 0);
        org.joda.time.DateTime dateTime20 = dateTime15.withZone(dateTimeZone17);
        long long23 = dateTimeZone17.adjustOffset((long) 5, true);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        boolean boolean27 = dateTimeZone25.equals((java.lang.Object) (-3600000));
        long long29 = dateTimeZone17.getMillisKeepLocal(dateTimeZone25, 100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime((int) '4', (int) (short) -1, 79680, 69, 31, 1268, 32769, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-01:00" + "'", str19, "-01:00");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 5L + "'", long23 == 5L);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property9.setCopy("T23:00:00.100", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T23:00:00.100\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder2.setWeekDefinition((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        calendar1.setFirstDayOfWeek(13);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(357, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=13,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField14 = property13.getField();
        org.joda.time.DateTimeField dateTimeField15 = property13.getField();
        org.joda.time.LocalTime localTime16 = property13.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str18 = dateTimeFieldType17.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localTime16.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "monthOfYear" + "'", str18, "monthOfYear");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        java.util.Calendar.Builder builder6 = builder0.setDate((int) '#', (-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder0.setInstant((-1483228799900L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = dateTimeFormatter17.parseLocalDate("08:36:01.961");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        int int7 = dateTimeFormatter6.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.parse("+15:01", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2000 + "'", int7 == 2000);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1268, 1328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1268 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.TimeOfDay timeOfDay8 = timeOfDay4.withPeriodAdded(readablePeriod6, (int) '4');
        int[] intArray9 = timeOfDay8.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeOfDay8.getValue(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[23, 0, 0, 100]");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay8.withMinuteOfHour((int) '#');
        java.lang.String str18 = timeOfDay17.toString();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = timeOfDay17.toString("T00:00:00.200");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "T23:35:00.200" + "'", str18, "T23:35:00.200");
        org.junit.Assert.assertNotNull(timeOfDay20);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        int int3 = dateTimeZone1.getStandardOffset((long) (short) 0);
        long long6 = dateTimeZone1.convertLocalToUTC(480100L, false);
        java.lang.String str8 = dateTimeZone1.getShortName((long) '4');
        long long10 = dateTimeZone1.previousTransition((-2150668800000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-3600000) + "'", int3 == (-3600000));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 4080100L + "'", long6 == 4080100L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-01:00" + "'", str8, "-01:00");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-2150668800000L) + "'", long10 == (-2150668800000L));
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 11);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localTime1.get(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = dateTimeFormatter17.parseLocalTime("85715");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        org.joda.time.TimeOfDay.Property property21 = timeOfDay20.secondOfMinute();
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = property21.setCopy("-3600000", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.Instant instant6 = dateTime5.toInstant();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime9 = dateTime5.withDurationAdded(readableDuration7, 712);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime11.withField(dateTimeFieldType12, 17);
        int int15 = dateTime11.getYear();
        boolean boolean16 = dateTime11.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime11.toString("DateTimeField[millisOfSecond]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 10);
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.secondOfMinute();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumTextLength(locale3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime10 = dateTime8.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(7);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear(1);
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property16 = dateTime14.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = dateTime17.withDayOfYear(8);
        org.joda.time.Chronology chronology20 = dateTime17.getChronology();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (-3600000), chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(1200000, (int) (byte) 10, 1, 3, 17, 3600096, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600096 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(70, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime10 = dateTime8.minusDays(7);
        org.joda.time.DateTime dateTime12 = dateTime8.withYear(1);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfEra();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str26 = dateTimeZone24.getShortName((long) 0);
        org.joda.time.DateTime dateTime27 = dateTime22.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime28 = dateTime12.withZone(dateTimeZone24);
        org.joda.time.DateTime dateTime30 = dateTime12.minusHours((int) 'a');
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(7);
        org.joda.time.DateTime dateTime38 = dateTime34.withYear(1);
        org.joda.time.Chronology chronology39 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField40 = chronology39.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        long long44 = chronology39.add(readablePeriod41, 9L, 5);
        org.joda.time.DateTime dateTime45 = dateTime30.toDateTime(chronology39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((int) '4', 1970, 1970, 3600096, 15, chronology39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600096 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-01:00" + "'", str26, "-01:00");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 9L + "'", long44 == 9L);
        org.junit.Assert.assertNotNull(dateTime45);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        org.joda.time.TimeOfDay timeOfDay15 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay18 = timeOfDay15.withFieldAdded(durationFieldType16, 85680);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(durationFieldType16);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        java.lang.Appendable appendable26 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(7);
        org.joda.time.DateTime dateTime34 = dateTime30.withYear(1);
        org.joda.time.DateTime dateTime35 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str39 = dateTimeZone37.getShortName((long) 0);
        org.joda.time.DateTime dateTime40 = dateTime35.withZone(dateTimeZone37);
        org.joda.time.DateTime.Property property41 = dateTime40.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime42 = dateTime40.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable26, (org.joda.time.ReadableInstant) dateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "-01:00" + "'", str39, "-01:00");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        java.util.Date date5 = dateTime1.toDate();
        java.time.Instant instant6 = date5.toInstant();
        int int7 = date5.getHours();
        date5.setDate((int) (byte) 10);
        int int10 = date5.getYear();
        date5.setMonth((-738188));
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat May 10 00:00:00 UTC 59547");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 70 + "'", int10 == 70);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime.Property property11 = dateTime10.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.hours();
        org.joda.time.format.DateTimePrinter dateTimePrinter13 = null;
        org.joda.time.format.DateTimeParser dateTimeParser14 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter13, dateTimeParser14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime23 = dateTime21.minusDays(7);
        org.joda.time.DateTime dateTime25 = dateTime21.withYear(1);
        org.joda.time.Chronology chronology26 = dateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField27 = chronology26.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter15.withChronology(chronology26);
        boolean boolean30 = durationFieldType12.isSupported(chronology26);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) dateTime10, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = chronology26.getDateTimeMillis((long) 79680, (int) (byte) -1, (int) (byte) 1, 712, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTime dateTime15 = dateTime11.plusSeconds((int) '#');
        org.joda.time.DateTime dateTime16 = dateTime15.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str18 = dateTimeFieldType17.getName();
        java.lang.String str19 = dateTimeFieldType17.toString();
        boolean boolean20 = dateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.Instant instant21 = dateTime16.toInstant();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 85680 + "'", int13 == 85680);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfYear" + "'", str18, "dayOfYear");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "dayOfYear" + "'", str19, "dayOfYear");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean15 = gregorianCalendar13.isWeekDateSupported();
        java.util.Date date16 = gregorianCalendar13.getTime();
        java.util.Date date17 = new java.util.Date();
        int int18 = date17.getTimezoneOffset();
        gregorianCalendar13.setTime(date17);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = gregorianCalendar13.isSet(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Tue Jan 03 00:48:00 UTC 2");
// flaky:         org.junit.Assert.assertEquals(date17.toString(), "Fri Feb 11 09:36:29 UTC 2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(7, 9, 11);
        java.util.Calendar.Builder builder6 = builder4.setLenient(true);
        java.util.Calendar calendar7 = builder4.build();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder4.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=-61922016000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=7,MONTH=9,WEEK_OF_YEAR=42,WEEK_OF_MONTH=3,DAY_OF_MONTH=11,DAY_OF_YEAR=284,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.Date date1 = new java.util.Date("1 Jan 1970 00:00:00 GMT");
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromDateFields(date1);
        java.lang.String str3 = date1.toLocaleString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Jan 1, 1970 12:00:00 AM" + "'", str3, "Jan 1, 1970 12:00:00 AM");
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Locale locale2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setLocale(locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(30961509, (int) (short) 100, 20, 1328);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30961509 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfYear(8);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 10);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(7);
        org.joda.time.DateTime dateTime22 = dateTime18.withYear(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays(7);
        org.joda.time.DateTime dateTime31 = dateTime27.withYear(1);
        org.joda.time.Chronology chronology32 = dateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.minuteOfDay();
        org.joda.time.DurationField durationField35 = chronology32.months();
        boolean boolean36 = dateTimeFieldType23.isSupported(chronology32);
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType23.getDurationType();
        boolean boolean38 = dateTime22.isSupported(dateTimeFieldType23);
        org.joda.time.DurationFieldType durationFieldType39 = dateTimeFieldType23.getRangeDurationType();
        boolean boolean40 = dateTime12.isSupported(dateTimeFieldType23);
        org.joda.time.DateTime.Property property41 = dateTime12.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = dateTime12.toString("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(1268, 4, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1268 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(4080100L);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, 1);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime8 = dateTime6.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay9 = dateTime6.toTimeOfDay();
        org.joda.time.DateTime dateTime11 = dateTime6.withYearOfCentury(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(7);
        org.joda.time.DateTime dateTime20 = dateTime16.withYear(1);
        org.joda.time.Chronology chronology21 = dateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField23 = chronology21.minuteOfDay();
        org.joda.time.DurationField durationField24 = chronology21.months();
        boolean boolean25 = dateTimeFieldType12.isSupported(chronology21);
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType12.getDurationType();
        org.joda.time.DateTime dateTime28 = dateTime11.withFieldAdded(durationFieldType26, 2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = localTime4.withFieldAdded(durationFieldType26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        org.joda.time.DateTime dateTime22 = dateTime21.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property23 = dateTime21.hourOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.withDayOfYear(8);
        org.joda.time.DateTime dateTime28 = dateTime26.withMillis((long) 10);
        long long29 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime26);
        java.lang.String str30 = property13.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime32 = property13.setCopy("T23:00:00.200");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"T23:00:00.200\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 62134912800000L + "'", long29 == 62134912800000L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "millisOfSecond" + "'", str30, "millisOfSecond");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay8.withMinuteOfHour((int) '#');
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.withMillisOfSecond((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("java.util.GregorianCalendar[time=-62104057919900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=48,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfDay();
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.now(chronology9);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(3600035L, chronology9);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays(7);
        org.joda.time.DateTime dateTime23 = dateTime19.withYear(1);
        org.joda.time.Chronology chronology24 = dateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField26 = chronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.hourOfHalfday();
        org.joda.time.Chronology chronology28 = chronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField29 = chronology24.centuryOfEra();
        java.lang.String str30 = chronology24.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) chronology9, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ISOChronology[-01:00]" + "'", str30, "ISOChronology[-01:00]");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.weekyearOfCentury();
        org.joda.time.DurationField durationField10 = chronology8.weeks();
        org.joda.time.DurationField durationField11 = chronology8.centuries();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.dayOfYear();
        long long16 = dateTimeField13.getDifferenceAsLong((long) 32770, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField13.set((long) 1200000, "08:36:01.471");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"08:36:01.471\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime.Property property14 = dateTime8.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property14.addToCopy((int) (byte) 0);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.minus(readableDuration17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime16.withMinuteOfHour((-738188));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -738188 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime1 = localTime0.toDateTimeToday();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.weeks();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology10);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(chronology10);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay19 = dateTime16.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay19.millisOfSecond();
        int int21 = property20.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay23 = property20.addToCopy(100);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay28 = dateTime25.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property29 = timeOfDay28.millisOfSecond();
        boolean boolean30 = timeOfDay23.isEqual((org.joda.time.ReadablePartial) timeOfDay28);
        org.joda.time.TimeOfDay timeOfDay32 = timeOfDay23.withMinuteOfHour((int) '#');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime38 = dateTime36.minusDays(7);
        org.joda.time.DateTime dateTime40 = dateTime36.withYear(1);
        org.joda.time.DateTime dateTime41 = dateTime40.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime42 = dateTime41.toDateTimeISO();
        org.joda.time.DateTime dateTime44 = dateTime42.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property45 = dateTime44.monthOfYear();
        org.joda.time.DateTime dateTime47 = property45.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DateTime dateTime48 = property45.getDateTime();
        org.joda.time.DateTime dateTime49 = timeOfDay32.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        boolean boolean50 = dateTime14.isEqual((org.joda.time.ReadableInstant) dateTime49);
        boolean boolean51 = dateTime1.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(timeOfDay23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(timeOfDay32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime9 = dateTime7.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays(7);
        org.joda.time.DateTime dateTime13 = dateTime9.withYear(1);
        org.joda.time.DateTime dateTime14 = dateTime13.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTimeISO();
        org.joda.time.DateTime dateTime17 = dateTime15.plusMinutes((int) (short) 100);
        java.lang.String str18 = dateTime17.toString();
        int int19 = dateTime17.getSecondOfMinute();
        boolean boolean20 = dateTime1.equals((java.lang.Object) dateTime17);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((java.lang.Object) dateTime17);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(7);
        org.joda.time.DateTime dateTime29 = dateTime25.withYear(1);
        org.joda.time.DateTime.Property property30 = dateTime29.yearOfEra();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime34 = dateTime32.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays(7);
        org.joda.time.DateTime dateTime38 = dateTime34.withYear(1);
        org.joda.time.DateTime.Property property39 = dateTime38.secondOfDay();
        long long40 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        boolean boolean41 = dateTime17.isEqual((org.joda.time.ReadableInstant) dateTime38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = dateTime38.withHourOfDay(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str18, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 0L + "'", long40 == 0L);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology9);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property13.addCopy(62134912800000L);
        org.joda.time.LocalTime localTime17 = property13.addNoWrapToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localTime17.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 10);
        org.joda.time.TimeOfDay.Property property2 = timeOfDay1.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.plusSeconds(712);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeOfDay4.toString("Jan 10, 1970 12:00:00 AM", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime9.yearOfCentury();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay17 = dateTime14.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property18 = timeOfDay17.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.withPeriodAdded(readablePeriod19, (int) '4');
        org.joda.time.TimeOfDay timeOfDay23 = timeOfDay21.plusSeconds((-3600000));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime6 = dateTime4.minusDays(7);
        org.joda.time.DateTime dateTime8 = dateTime4.withYear(1);
        org.joda.time.Chronology chronology9 = dateTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.weekyearOfCentury();
        org.joda.time.DurationField durationField11 = chronology9.weeks();
        org.joda.time.DurationField durationField12 = chronology9.centuries();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField15 = chronology9.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(3600035L, chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withHourOfDay(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isOffsetParsed();
        java.util.Locale locale5 = dateTimeFormatter3.getLocale();
        java.util.Locale locale6 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withLocale(locale6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.parse("08:36:01.339", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay5 = dateTime2.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.millisOfSecond();
        int int7 = property6.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay9 = property6.addToCopy(100);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay14 = dateTime11.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property15 = timeOfDay14.millisOfSecond();
        boolean boolean16 = timeOfDay9.isEqual((org.joda.time.ReadablePartial) timeOfDay14);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay9.withMinuteOfHour((int) '#');
        java.lang.String str19 = timeOfDay18.toString();
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay18.plusHours(2);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay18.withPeriodAdded(readablePeriod22, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, (int) (short) 1);
        int int29 = dateTimeZone27.getOffset(0L);
        org.joda.time.DateTime dateTime30 = timeOfDay18.toDateTimeToday(dateTimeZone27);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime(111600000L, dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = localTime31.withHourOfDay(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "T23:35:00.200" + "'", str19, "T23:35:00.200");
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 54060000 + "'", int29 == 54060000);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        long long11 = dateTimeField9.roundFloor((long) 3);
        int int13 = dateTimeField9.getMaximumValue((long) (-3600000));
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeField9.getAsText((long) (short) 0, locale15);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay21 = dateTime18.toTimeOfDay();
        org.joda.time.LocalTime localTime22 = dateTime18.toLocalTime();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime28 = dateTime26.minusDays(7);
        org.joda.time.DateTime dateTime30 = dateTime26.withYear(1);
        org.joda.time.DateTime dateTime31 = dateTime30.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime32 = dateTime31.toDateTimeISO();
        org.joda.time.DateTime dateTime34 = dateTime32.plusMinutes((int) (short) 100);
        java.lang.String str35 = dateTime34.toString();
        int int36 = dateTime34.getSecondOfMinute();
        boolean boolean37 = dateTime18.equals((java.lang.Object) dateTime34);
        org.joda.time.LocalTime localTime38 = new org.joda.time.LocalTime((java.lang.Object) dateTime34);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalTime localTime40 = localTime38.plus(readablePeriod39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime44 = dateTime42.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay45 = dateTime42.toTimeOfDay();
        org.joda.time.LocalTime localTime46 = dateTime42.toLocalTime();
        int int47 = localTime46.getMillisOfSecond();
        org.joda.time.DateTime dateTime49 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime51 = dateTime49.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay52 = dateTime49.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property53 = timeOfDay52.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay52.withPeriodAdded(readablePeriod54, (int) '4');
        boolean boolean57 = localTime46.equals((java.lang.Object) timeOfDay56);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime61 = dateTime59.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime63 = dateTime61.minusDays(7);
        org.joda.time.DateTime dateTime65 = dateTime61.withYear(1);
        org.joda.time.Chronology chronology66 = dateTime61.getChronology();
        org.joda.time.DateTimeField dateTimeField67 = chronology66.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        long long71 = chronology66.add(readablePeriod68, 9L, 5);
        org.joda.time.TimeOfDay timeOfDay72 = timeOfDay56.withChronologyRetainFields(chronology66);
        boolean boolean73 = localTime40.isAfter((org.joda.time.ReadablePartial) timeOfDay56);
        java.util.Locale locale75 = null;
        java.lang.String str76 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localTime40, 3, locale75);
        java.util.Locale locale79 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long80 = dateTimeField9.set((long) (short) 0, "Jan 10, 1970 12:00:00 AM", locale79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan 10, 1970 12:00:00 AM\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-82800000L) + "'", long11 == (-82800000L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "31" + "'", str16, "31");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str35, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(timeOfDay45);
        org.junit.Assert.assertNotNull(localTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 9L + "'", long71 == 9L);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "3" + "'", str76, "3");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(7);
        org.joda.time.DateTime dateTime17 = dateTime13.withYear(1);
        org.joda.time.Chronology chronology18 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.weekyearOfCentury();
        boolean boolean20 = property9.equals((java.lang.Object) dateTimeField19);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay25 = dateTime22.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        int int27 = property26.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay29 = property26.addToCopy(100);
        org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime33 = dateTime31.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay34 = dateTime31.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property35 = timeOfDay34.millisOfSecond();
        boolean boolean36 = timeOfDay29.isEqual((org.joda.time.ReadablePartial) timeOfDay34);
        org.joda.time.TimeOfDay timeOfDay38 = timeOfDay29.withMinuteOfHour((int) '#');
        org.joda.time.TimeOfDay timeOfDay40 = timeOfDay38.withMillisOfSecond((int) '#');
        int int41 = dateTimeField19.getMinimumValue((org.joda.time.ReadablePartial) timeOfDay40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay43 = timeOfDay40.withMinuteOfHour(3600096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600096 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(timeOfDay34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(timeOfDay38);
        org.junit.Assert.assertNotNull(timeOfDay40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        java.util.Locale locale6 = null;
        int int7 = property5.getMaximumShortTextLength(locale6);
        int int8 = property5.get();
        java.util.Locale locale9 = null;
        java.lang.String str10 = property5.getAsText(locale9);
        java.lang.String str11 = property5.getAsText();
        org.joda.time.TimeOfDay timeOfDay12 = property5.withMaximumValue();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(7);
        org.joda.time.DateTime dateTime20 = dateTime16.withYear(1);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime22 = dateTime21.toDateTimeISO();
        org.joda.time.DateTime dateTime24 = dateTime22.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property25 = dateTime24.monthOfYear();
        int int26 = dateTime24.getSecondOfDay();
        org.joda.time.DateTime dateTime28 = dateTime24.plusSeconds((int) '#');
        org.joda.time.DateTime dateTime29 = dateTime28.withLaterOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.dayOfYear();
        java.lang.String str31 = dateTimeFieldType30.getName();
        java.lang.String str32 = dateTimeFieldType30.toString();
        boolean boolean33 = dateTime29.isSupported(dateTimeFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay35 = timeOfDay12.withField(dateTimeFieldType30, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertNotNull(timeOfDay12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 85680 + "'", int26 == 85680);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "dayOfYear" + "'", str31, "dayOfYear");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "dayOfYear" + "'", str32, "dayOfYear");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        long long6 = java.util.Date.UTC((int) '4', 2, 1200000, (int) 'a', 69, 365);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 103117371305000L + "'", long6 == 103117371305000L);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        boolean boolean14 = gregorianCalendar13.isWeekDateSupported();
        boolean boolean15 = gregorianCalendar13.isWeekDateSupported();
        int int16 = gregorianCalendar13.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar13.add(3600096, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(23, (int) 'a', 1, 5, 5, 357);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 357 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay15 = dateTime12.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay15.withPeriodAdded(readablePeriod17, (int) '4');
        int[] intArray20 = timeOfDay19.getValues();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay19.withMinuteOfHour(11);
        java.util.Locale locale24 = null;
        java.lang.String str25 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) timeOfDay22, 712, locale24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(7);
        org.joda.time.DateTime dateTime34 = dateTime30.withYear(1);
        org.joda.time.Chronology chronology35 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.minuteOfDay();
        org.joda.time.LocalTime localTime38 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology35);
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(chronology35);
        org.joda.time.TimeOfDay timeOfDay41 = timeOfDay39.minusMinutes((int) (byte) 100);
        java.util.Locale locale42 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str43 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) timeOfDay41, locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[23, 0, 0, 100]");
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "712" + "'", str25, "712");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(timeOfDay41);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property9 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = property9.roundHalfFloorCopy();
        long long11 = property9.remainder();
        java.lang.String str12 = property9.toString();
        long long13 = property9.remainder();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay18 = dateTime15.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property19 = timeOfDay18.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay18.withPeriodAdded(readablePeriod20, (int) '4');
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime25 = localTime23.withSecondOfMinute(1);
        org.joda.time.LocalTime localTime27 = localTime25.withMillisOfDay(2);
        boolean boolean28 = timeOfDay18.isAfter((org.joda.time.ReadablePartial) localTime25);
        int int29 = property9.compareTo((org.joda.time.ReadablePartial) timeOfDay18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = property9.setCopy("DateTimeField[millisOfSecond]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[millisOfSecond]\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 480100L + "'", long11 == 480100L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Property[hourOfDay]" + "'", str12, "Property[hourOfDay]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 480100L + "'", long13 == 480100L);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime5 = dateTime3.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime7 = dateTime5.minusDays(7);
        org.joda.time.DateTime dateTime9 = dateTime5.withYear(1);
        org.joda.time.Chronology chronology10 = dateTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(7, (int) ' ', chronology10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay18 = dateTime15.toTimeOfDay();
        org.joda.time.LocalTime localTime19 = dateTime15.toLocalTime();
        int int20 = localTime19.getMillisOfSecond();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay25 = dateTime22.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property26 = timeOfDay25.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.TimeOfDay timeOfDay29 = timeOfDay25.withPeriodAdded(readablePeriod27, (int) '4');
        boolean boolean30 = localTime19.equals((java.lang.Object) timeOfDay29);
        org.joda.time.LocalTime localTime32 = localTime19.withMillisOfSecond((int) ' ');
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay37 = dateTime34.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.millisOfSecond();
        java.util.Locale locale39 = null;
        int int40 = property38.getMaximumShortTextLength(locale39);
        int int41 = property38.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField42 = property38.getField();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime46 = dateTime44.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay47 = dateTime44.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property48 = timeOfDay47.millisOfSecond();
        int int49 = property48.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay51 = property48.addToCopy(100);
        org.joda.time.DateTime dateTime53 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime55 = dateTime53.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay56 = dateTime53.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property57 = timeOfDay56.millisOfSecond();
        boolean boolean58 = timeOfDay51.isEqual((org.joda.time.ReadablePartial) timeOfDay56);
        int int59 = timeOfDay56.size();
        java.util.Locale locale61 = null;
        java.lang.String str62 = dateTimeField42.getAsText((org.joda.time.ReadablePartial) timeOfDay56, 14, locale61);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime66 = dateTime64.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay67 = dateTime64.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property68 = timeOfDay67.millisOfSecond();
        int int69 = property68.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay71 = property68.addToCopy(100);
        org.joda.time.DateTime dateTime73 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime75 = dateTime73.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay76 = dateTime73.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property77 = timeOfDay76.millisOfSecond();
        boolean boolean78 = timeOfDay71.isEqual((org.joda.time.ReadablePartial) timeOfDay76);
        int[] intArray79 = timeOfDay71.getValues();
        org.joda.time.DateTime dateTime82 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime84 = dateTime82.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay85 = dateTime82.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property86 = timeOfDay85.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod87 = null;
        org.joda.time.TimeOfDay timeOfDay89 = timeOfDay85.withPeriodAdded(readablePeriod87, (int) '4');
        int[] intArray90 = timeOfDay89.getValues();
        int[] intArray92 = dateTimeField42.addWrapPartial((org.joda.time.ReadablePartial) timeOfDay71, (int) (short) 0, intArray90, 712);
        // The following exception was thrown during execution in test generation
        try {
            chronology10.validate((org.joda.time.ReadablePartial) localTime32, intArray92);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 735 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(timeOfDay29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(timeOfDay47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(timeOfDay51);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 4 + "'", int59 == 4);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "14" + "'", str62, "14");
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(timeOfDay71);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(property77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTime84);
        org.junit.Assert.assertNotNull(timeOfDay85);
        org.junit.Assert.assertNotNull(property86);
        org.junit.Assert.assertNotNull(timeOfDay89);
        org.junit.Assert.assertNotNull(intArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray90), "[735, 0, 0, 100]");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[735, 0, 0, 100]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DurationField durationField11 = chronology8.months();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.dayOfMonth();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime16 = dateTime14.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay17 = dateTime14.toTimeOfDay();
        org.joda.time.LocalTime localTime18 = dateTime14.toLocalTime();
        int int19 = localTime18.getMillisOfSecond();
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay24 = dateTime21.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property25 = timeOfDay24.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay24.withPeriodAdded(readablePeriod26, (int) '4');
        boolean boolean29 = localTime18.equals((java.lang.Object) timeOfDay28);
        org.joda.time.LocalTime localTime31 = localTime18.withMillisOfSecond((int) ' ');
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) localTime31, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localTime31);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime6 = dateTime4.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays(7);
        org.joda.time.DateTime dateTime10 = dateTime6.withYear(1);
        org.joda.time.Chronology chronology11 = dateTime6.getChronology();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        boolean boolean15 = dateTimeZone13.equals((java.lang.Object) (-3600000));
        org.joda.time.Chronology chronology16 = chronology11.withZone(dateTimeZone13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter2.withZone(dateTimeZone13);
        boolean boolean18 = dateTimeFormatter2.isPrinter();
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withLocale(locale19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        boolean boolean24 = dateTimeZone22.equals((java.lang.Object) (-3600000));
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter2.withZone(dateTimeZone22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.ReadablePartial readablePartial27 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeFormatter2.print(readablePartial27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        int int16 = timeOfDay13.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray17 = timeOfDay13.getFieldTypes();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay13.withPeriodAdded(readablePeriod18, (int) (short) -1);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime24 = dateTime22.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(7);
        org.joda.time.DateTime dateTime28 = dateTime24.withYear(1);
        org.joda.time.DateTime dateTime29 = dateTime28.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str33 = dateTimeZone31.getShortName((long) 0);
        org.joda.time.DateTime dateTime34 = dateTime29.withZone(dateTimeZone31);
        long long37 = dateTimeZone31.adjustOffset((long) 5, true);
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        boolean boolean41 = dateTimeZone39.equals((java.lang.Object) (-3600000));
        long long43 = dateTimeZone31.getMillisKeepLocal(dateTimeZone39, 100L);
        org.joda.time.DateTime dateTime44 = timeOfDay20.toDateTimeToday(dateTimeZone39);
        boolean boolean45 = dateTime44.isAfterNow();
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime49 = dateTime47.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime51 = dateTime49.minusDays(7);
        org.joda.time.DateTime dateTime53 = dateTime49.withYear(1);
        org.joda.time.DateTime.Property property54 = dateTime53.yearOfEra();
        java.lang.String str55 = property54.getName();
        boolean boolean56 = property54.isLeap();
        org.joda.time.DateTime dateTime57 = property54.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime59 = dateTime57.plusWeeks(0);
        java.lang.String str60 = dateTime57.toString();
        boolean boolean61 = dateTime44.isEqual((org.joda.time.ReadableInstant) dateTime57);
        int int62 = dateTime44.getEra();
        org.joda.time.ReadableDuration readableDuration63 = null;
        org.joda.time.DateTime dateTime64 = dateTime44.plus(readableDuration63);
        boolean boolean65 = dateTime44.isEqualNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray17);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "-01:00" + "'", str33, "-01:00");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 5L + "'", long37 == 5L);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 100L + "'", long43 == 100L);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "yearOfEra" + "'", str55, "yearOfEra");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "0002-01-01T00:00:00.000-01:00" + "'", str60, "0002-01-01T00:00:00.000-01:00");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.util.Locale locale5 = dateTimeFormatter2.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear(9);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.LocalTime localTime14 = dateTime10.toLocalTime();
        org.joda.time.Chronology chronology15 = localTime14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.hours();
        long long20 = chronology15.add(0L, (long) (short) 0, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter7.withChronology(chronology15);
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withLocale(locale22);
        java.lang.Appendable appendable24 = null;
        org.joda.time.ReadableInstant readableInstant25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter21.printTo(appendable24, readableInstant25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("08:36:01.293");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        long long6 = java.util.Date.UTC((int) (short) 0, 2022, 9, 22, 59, 86399999);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 3195500339000L + "'", long6 == 3195500339000L);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.minusMinutes(79680);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        boolean boolean23 = dateTimeFormatter22.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter22.withPivotYear((int) (byte) -1);
        boolean boolean26 = localTime14.equals((java.lang.Object) dateTimeFormatter22);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime30 = dateTime28.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime32 = dateTime30.minusDays(7);
        org.joda.time.DateTime dateTime34 = dateTime30.withYear(1);
        org.joda.time.DateTime dateTime35 = dateTime34.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime.Property property36 = dateTime34.hourOfDay();
        int int37 = dateTime34.getMillisOfSecond();
        int int38 = dateTime34.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dateTimeFormatter22.print((org.joda.time.ReadableInstant) dateTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1328 + "'", int38 == 1328);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        java.lang.String str12 = dateTime11.toString();
        java.util.GregorianCalendar gregorianCalendar13 = dateTime11.toGregorianCalendar();
        gregorianCalendar13.add(11, 11);
        gregorianCalendar13.clear();
        java.util.Date date18 = gregorianCalendar13.getTime();
        java.lang.Object obj19 = gregorianCalendar13.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0001-12-31T23:48:00.100-01:00" + "'", str12, "0001-12-31T23:48:00.100-01:00");
        org.junit.Assert.assertNotNull(gregorianCalendar13);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 01:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "java.util.GregorianCalendar[time=3600000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "java.util.GregorianCalendar[time=3600000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "java.util.GregorianCalendar[time=3600000,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.lang.String str7 = property5.getAsShortText();
        java.util.Locale locale8 = null;
        int int9 = property5.getMaximumTextLength(locale8);
        org.joda.time.TimeOfDay timeOfDay10 = property5.getTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = timeOfDay10.getFieldType(712);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 712");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "100" + "'", str7, "100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(timeOfDay10);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime4 = dateTime2.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay5 = dateTime2.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.millisOfSecond();
        int int7 = property6.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay9 = property6.setCopy("14");
        int[] intArray10 = timeOfDay9.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder0.setFields(intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(timeOfDay9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[23, 0, 0, 14]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(15, (int) (byte) 1, 86399999, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime8.toDateTimeISO();
        org.joda.time.DateTime dateTime11 = dateTime9.plusMinutes((int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.monthOfYear();
        int int13 = dateTime11.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str17 = dateTimeZone15.getShortName((long) 0);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime11.toMutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(15, (int) (short) 1);
        int int23 = dateTimeZone21.getOffset(0L);
        boolean boolean24 = dateTimeZone15.equals((java.lang.Object) int23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.ReadableInstant readableInstant26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int27 = dateTime25.compareTo(readableInstant26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 85680 + "'", int13 == 85680);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-01:00" + "'", str17, "-01:00");
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 54060000 + "'", int23 == 54060000);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        calendar7.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar7.getMaximum(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.minuteOfDay();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField10.set((long) (-1), "08:36:01.471", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"08:36:01.471\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay13 = dateTime10.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property14 = timeOfDay13.millisOfSecond();
        boolean boolean15 = timeOfDay8.isEqual((org.joda.time.ReadablePartial) timeOfDay13);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay8.withMinuteOfHour((int) '#');
        java.lang.String str18 = timeOfDay17.toString();
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay17.plusHours(2);
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.plusHours(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeOfDay13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "T23:35:00.200" + "'", str18, "T23:35:00.200");
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(timeOfDay22);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter2.parseMillis("hours");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(dateTimeZone5);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getRangeDurationType();
        java.lang.String str2 = durationFieldType1.toString();
        java.lang.String str3 = durationFieldType1.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "days" + "'", str2, "days");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "days" + "'", str3, "days");
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        int int8 = dateTime1.getSecondOfDay();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.DateTime dateTime11 = dateTime1.withPeriodAdded(readablePeriod9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withEra((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 82800 + "'", int8 == 82800);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        java.util.Locale locale6 = null;
        java.util.Calendar calendar7 = dateTime1.toCalendar(locale6);
        calendar7.setLenient(false);
        java.util.TimeZone timeZone10 = calendar7.getTimeZone();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = calendar7.getDisplayName(357, (int) (byte) 0, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "GMT-01:00");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        java.util.Locale locale6 = null;
        int int7 = property5.getMaximumShortTextLength(locale6);
        int int8 = property5.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getDurationField();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay15 = dateTime12.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property16 = timeOfDay15.millisOfSecond();
        int int17 = property16.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay19 = property16.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay21 = timeOfDay19.plusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property22 = timeOfDay19.hourOfDay();
        int int23 = timeOfDay19.size();
        org.joda.time.TimeOfDay timeOfDay25 = timeOfDay19.plusMillis(14);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime31 = dateTime29.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime33 = dateTime31.minusDays(7);
        org.joda.time.DateTime dateTime35 = dateTime31.withYear(1);
        org.joda.time.Chronology chronology36 = dateTime31.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.minuteOfDay();
        org.joda.time.LocalTime localTime39 = org.joda.time.LocalTime.fromMillisOfDay((-82800000L), chronology36);
        java.lang.String str40 = localTime39.toString();
        org.joda.time.Chronology chronology41 = localTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone43 = chronology41.getZone();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay48 = dateTime45.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property49 = timeOfDay48.millisOfSecond();
        java.util.Locale locale50 = null;
        int int51 = property49.getMaximumShortTextLength(locale50);
        int int52 = property49.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField53 = property49.getField();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime57 = dateTime55.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay58 = dateTime55.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property59 = timeOfDay58.millisOfSecond();
        int int60 = property59.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay62 = property59.addToCopy(100);
        org.joda.time.DateTime dateTime64 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime66 = dateTime64.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay67 = dateTime64.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property68 = timeOfDay67.millisOfSecond();
        boolean boolean69 = timeOfDay62.isEqual((org.joda.time.ReadablePartial) timeOfDay67);
        int int70 = timeOfDay67.size();
        java.util.Locale locale72 = null;
        java.lang.String str73 = dateTimeField53.getAsText((org.joda.time.ReadablePartial) timeOfDay67, 14, locale72);
        org.joda.time.TimeOfDay timeOfDay75 = timeOfDay67.plusMillis(16);
        int[] intArray77 = chronology41.get((org.joda.time.ReadablePartial) timeOfDay75, (long) 23);
        java.util.Locale locale79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField9.set((org.joda.time.ReadablePartial) timeOfDay25, 79200, intArray77, "0001-12-31T22:07:38.100-01:00", locale79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0001-12-31T22:07:38.100-01:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(timeOfDay25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "01:00:00.000" + "'", str40, "01:00:00.000");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(dateTimeField53);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(timeOfDay58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(timeOfDay62);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(timeOfDay67);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 4 + "'", int70 == 4);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "14" + "'", str73, "14");
        org.junit.Assert.assertNotNull(timeOfDay75);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[0, 0, 0, 23]");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology8.secondOfDay();
        int int14 = dateTimeField13.getMaximumValue();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime16 = localTime15.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalTime localTime19 = localTime15.withPeriodAdded(readablePeriod17, (int) 'a');
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime23 = dateTime21.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay24 = dateTime21.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property25 = timeOfDay24.millisOfSecond();
        int int26 = property25.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay28 = property25.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.plusMinutes((int) (byte) 10);
        org.joda.time.TimeOfDay.Property property31 = timeOfDay28.hourOfDay();
        int int32 = timeOfDay28.size();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime36 = dateTime34.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay37 = dateTime34.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property38 = timeOfDay37.millisOfSecond();
        org.joda.time.DurationField durationField39 = property38.getDurationField();
        java.lang.String str40 = property38.getAsShortText();
        java.util.Locale locale41 = null;
        int int42 = property38.getMaximumTextLength(locale41);
        org.joda.time.TimeOfDay timeOfDay43 = property38.getTimeOfDay();
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime47 = dateTime45.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay48 = dateTime45.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property49 = timeOfDay48.millisOfSecond();
        int int50 = property49.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay52 = property49.addToCopy(100);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime56 = dateTime54.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay57 = dateTime54.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property58 = timeOfDay57.millisOfSecond();
        boolean boolean59 = timeOfDay52.isEqual((org.joda.time.ReadablePartial) timeOfDay57);
        int[] intArray60 = timeOfDay52.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType62 = timeOfDay52.getFieldType(0);
        org.joda.time.DurationFieldType durationFieldType63 = dateTimeFieldType62.getDurationType();
        boolean boolean64 = timeOfDay43.isSupported(dateTimeFieldType62);
        boolean boolean65 = timeOfDay28.isSupported(dateTimeFieldType62);
        boolean boolean66 = localTime15.isSupported(dateTimeFieldType62);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime71 = dateTime69.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay72 = dateTime69.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property73 = timeOfDay72.millisOfSecond();
        int int74 = property73.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay76 = property73.setCopy("14");
        int[] intArray77 = timeOfDay76.getValues();
        java.util.Locale locale79 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray80 = dateTimeField13.set((org.joda.time.ReadablePartial) localTime15, 59, intArray77, "hi!", locale79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 86399 + "'", int14 == 86399);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertNotNull(timeOfDay30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(timeOfDay37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "100" + "'", str40, "100");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(timeOfDay48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(timeOfDay57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[23, 0, 0, 200]");
        org.junit.Assert.assertNotNull(dateTimeFieldType62);
        org.junit.Assert.assertNotNull(durationFieldType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(timeOfDay72);
        org.junit.Assert.assertNotNull(property73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertNotNull(timeOfDay76);
        org.junit.Assert.assertNotNull(intArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray77), "[23, 0, 0, 14]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay4 = dateTime1.toTimeOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay4.millisOfSecond();
        int int6 = property5.getMinimumValue();
        org.joda.time.TimeOfDay timeOfDay8 = property5.addToCopy(100);
        org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.plusMinutes((int) (byte) 10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays(7);
        org.joda.time.DateTime dateTime18 = dateTime14.withYear(1);
        org.joda.time.Chronology chronology19 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.TimeOfDay timeOfDay22 = timeOfDay8.withChronologyRetainFields(chronology19);
        org.joda.time.TimeOfDay timeOfDay24 = timeOfDay8.minusHours(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType26 = timeOfDay24.getFieldType(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(timeOfDay8);
        org.junit.Assert.assertNotNull(timeOfDay10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        java.lang.String str16 = dateTimeFieldType15.toString();
        boolean boolean17 = localTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalTime localTime19 = localTime14.minusMinutes(79680);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now();
        org.joda.time.DateTime dateTime21 = localTime20.toDateTimeToday();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.LocalTime localTime24 = localTime20.withPeriodAdded(readablePeriod22, (int) 'a');
        org.joda.time.LocalTime localTime26 = localTime20.minusMinutes(69);
        int int27 = localTime19.compareTo((org.joda.time.ReadablePartial) localTime26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = localTime26.withMinuteOfHour(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "monthOfYear" + "'", str16, "monthOfYear");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((-1));
        java.lang.String str12 = dateTimeZone10.getShortName((long) 0);
        org.joda.time.DateTime dateTime13 = dateTime8.withZone(dateTimeZone10);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays(7);
        org.joda.time.DateTime dateTime21 = dateTime17.withYear(1);
        boolean boolean22 = dateTime13.isBefore((org.joda.time.ReadableInstant) dateTime21);
        java.util.Locale locale23 = null;
        java.util.Calendar calendar24 = dateTime21.toCalendar(locale23);
        calendar24.set(14, 9, 2);
        int int30 = calendar24.getMinimum((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = calendar24.getLeastMaximum(1969);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-01:00" + "'", str12, "-01:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(calendar24);
        org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT-01:00\",offset=-3600000,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=14,MONTH=9,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=8,SECOND=0,MILLISECOND=100,ZONE_OFFSET=-3600000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        boolean boolean5 = dateTimeFormatter2.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter2.parseLocalDate("hourOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(31, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime3 = dateTime1.minusMinutes((int) '4');
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays(7);
        org.joda.time.DateTime dateTime7 = dateTime3.withYear(1);
        org.joda.time.Chronology chronology8 = dateTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField11 = chronology8.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = chronology8.clockhourOfDay();
        int int14 = dateTimeField12.getLeapAmount((long) (byte) -1);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMinutes((int) '4');
        org.joda.time.TimeOfDay timeOfDay19 = dateTime16.toTimeOfDay();
        int int20 = timeOfDay19.getSecondOfMinute();
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) timeOfDay19, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalTime localTime4 = localTime2.minus(readablePeriod3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        java.lang.String str6 = dateTimeFieldType5.getName();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType5.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withFieldAdded(durationFieldType7, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "halfdayOfDay" + "'", str6, "halfdayOfDay");
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(31, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }
}
