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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfWeek((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalTime localTime3 = localDateTime1.toLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime6.getFieldType(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDateTime1.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDate((int) (byte) 0, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property2.setCopy("", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(0, 0, (int) '4', 3, (int) (short) 100, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property2.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withField(dateTimeFieldType8, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        java.util.Locale locale7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("hi!", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withTime(11, (int) (short) 100, 330, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMillisOfDay(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime(2020, (int) (short) 10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        java.lang.Class<?> wildcardClass7 = localDateTime1.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = localDateTime6.withDate((-1), 2020, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 56 + "'", int14 == 56);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant10 = null;
        long long11 = property9.getDifferenceAsLong(readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(100L);
        int int20 = localDateTime19.getSecondOfMinute();
        org.joda.time.DateTime dateTime21 = localDateTime19.toDateTime();
        long long22 = property17.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        long long23 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = property2.getDifference((org.joda.time.ReadableInstant) dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1606273017242");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "342" + "'", str6, "342");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 11651L + "'", long22 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1606273017242L + "'", long23 == 1606273017242L);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.minusHours((int) (short) 10);
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDateTime1.toString("hi!", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 56 + "'", int7 == 56);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval4 = property3.toInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 100, 330, 10612590, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 0, 0, (int) (byte) 100, (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withField(dateTimeFieldType3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) '#', 3, (int) (short) 0, (int) (short) 10, (int) (byte) 100, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime3.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime.Property property13 = localDateTime6.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.hourOfDay();
        int int12 = localDateTime6.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 794 + "'", int12 == 794);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime1.withDate((int) (short) 1, (int) 'a', 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        int int5 = localDateTime3.getEra();
        int int6 = localDateTime3.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2020 + "'", int6 == 2020);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        java.lang.String str7 = property2.getAsString();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property2.setCopy("", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "530" + "'", str6, "530");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "530" + "'", str7, "530");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        org.joda.time.LocalDateTime.Property property16 = localDateTime7.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime7.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime6.toString("Sunday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime12.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 20);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withField(dateTimeFieldType5, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDateTime8.isSupported(durationFieldType10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withField(dateTimeFieldType12, 602);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:57:23 UTC 2029");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:23 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        int int7 = localDateTime6.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        java.util.Locale locale5 = null;
        java.lang.String str6 = property2.getAsText(locale5);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "24" + "'", str3, "24");
        org.junit.Assert.assertNotNull(durationField4);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "24" + "'", str6, "24");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime3.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfCentury(10612590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10612590 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(20, 56, 330);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDate((int) (byte) 1, 48, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        int int9 = localDateTime8.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2029 + "'", int9 == 2029);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '#');
        java.lang.String str9 = localDateTime8.toString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2020-10-21T02:57:27.606" + "'", str9, "2020-10-21T02:57:27.606");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        java.lang.Class<?> wildcardClass6 = localDateTime1.getClass();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10649589 + "'", int5 == 10649589);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((-1), 2, 57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 20);
        java.lang.String str5 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "550" + "'", str5, "550");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withEra(2020);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2020 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        java.lang.Class<?> wildcardClass11 = localDateTime10.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDateTime0.getFieldType(10653346);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10653346");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth(709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:34 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:57:34 UTC 2020");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(48);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long) 'a');
        boolean boolean11 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        org.joda.time.DateTimeField dateTimeField8 = property2.getField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "71" + "'", str6, "71");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime(2029, 20, 7, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2029 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:57:36 UTC 2029");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10637811, 10653346, 20, (int) (short) 10, 48, (int) (byte) -1, 10653346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        int int7 = localDateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date7 = localDateTime6.toDate();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -650 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.DurationField durationField7 = property2.getRangeDurationField();
        int int8 = property2.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "767" + "'", str6, "767");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getMillisOfDay();
        int int5 = localDateTime3.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10658000 + "'", int4 == 10658000);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2020 + "'", int5 == 2020);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withWeekyear((int) '#');
        java.lang.Class<?> wildcardClass26 = localDateTime23.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = property2.addToCopy((long) 20);
        int int5 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime10.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2, (int) '4', 999, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property2.setCopy(602);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 602 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (short) 10);
        org.joda.time.DurationFieldType durationFieldType2 = null;
        boolean boolean3 = localDateTime1.isSupported(durationFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime((int) (short) 100, (int) (byte) 10, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(19, 2020, 602, 2029, 7, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2029 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withFieldAdded(durationFieldType7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMinutes((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime1.getFieldType(32);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10661467 + "'", int5 == 10661467);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) boolean13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 7, chronology1);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray18 = localDateTime17.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273061732L + "'", long16 == 1606273061732L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray18);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.minus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime7.withDayOfWeek(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 10, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute(2029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2029 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        int int12 = property11.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime4.minusDays(57);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDateTime4.toString("2020-10-21T02:57:27.606", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        java.lang.Class<?> wildcardClass3 = localDateTime1.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2029, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        boolean boolean20 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusYears((int) (short) -1);
        boolean boolean23 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.dayOfMonth();
        boolean boolean25 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        int int26 = localDateTime2.getYear();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localDateTime6.toString(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2020-04-06T02:57:44.149" + "'", str8, "2020-04-06T02:57:44.149");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        java.lang.String str10 = localDateTime7.toString();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localDateTime7.isAfter(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2001-11-25T02:57:44.221" + "'", str10, "2001-11-25T02:57:44.221");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        java.lang.Class<?> wildcardClass6 = property2.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfMonth();
        java.lang.String str10 = localDateTime6.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-04-06T02:57:45.158" + "'", str10, "2020-04-06T02:57:45.158");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        java.util.Locale locale14 = null;
        int int15 = property5.getMaximumTextLength(locale14);
        java.lang.String str16 = property5.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "7" + "'", str16, "7");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("27");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfMonth((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = property2.getDifference((org.joda.time.ReadableInstant) dateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20131200000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.Interval interval10 = property9.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        org.joda.time.LocalDateTime localDateTime8 = property2.roundCeilingCopy();
        int int9 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.monthOfYear();
        java.lang.String str9 = property8.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Nov" + "'", str9, "Nov");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        java.lang.String str10 = localDateTime5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField12 = localDateTime5.getField(10637811);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10637811");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "47" + "'", str3, "47");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:57:47.000" + "'", str10, "2020-11-25T02:57:47.000");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 1, 2020, 3, 10649589, 10659667, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10649589 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withFieldAdded(durationFieldType18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273067845L + "'", long16 == 1606273067845L);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(10637811, 330, 2029, 2029, 2020, 2020, 919, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2029 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        int int6 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusWeeks(10612590);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(100);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumTextLength(locale24);
        org.joda.time.LocalDateTime localDateTime26 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property28 = localDateTime17.property(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime1.withField(dateTimeFieldType27, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime1.withEra(10666832);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10666832 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10668606 + "'", int5 == 10668606);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Sun Mar 25 02:57:48 UTC 2029");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) 276, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDate((int) (short) 10, (int) (byte) 100, 10637811);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime9.withMillisOfDay((int) (short) 100);
        boolean boolean17 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime5.withSecondOfMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "49" + "'", str3, "49");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDateTime5.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime((org.joda.time.ReadableInstant) dateTime8);
        int int10 = localDateTime1.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(1970, 0, 19, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfMonth(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2020-10-21T02:57:27.606", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        int int5 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.era();
        org.joda.time.DurationField durationField7 = property6.getRangeDurationField();
        boolean boolean8 = property6.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNull(durationField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withHourOfDay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((java.lang.Object) property8, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.DateTimeField dateTimeField6 = property2.getField();
        java.lang.String str7 = property2.getAsString();
        java.util.Locale locale8 = null;
        java.lang.String str9 = property2.getAsShortText(locale8);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) (short) 100);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = localDateTime18.toDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.minusYears(11);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDateTime18.toDateTime(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = localDateTime16.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = property2.getDifference((org.joda.time.ReadableInstant) dateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 63650447999");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "51" + "'", str3, "51");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "51" + "'", str7, "51");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "51" + "'", str9, "51");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2020, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minus(readableDuration3);
        int int5 = localDateTime4.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(3, (-1), 48, 10671382, 10659288, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10671382 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundFloorCopy();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property5.addToCopy((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        int int11 = localDateTime1.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDurationAdded(readableDuration12, (int) 'a');
        int int15 = localDateTime14.getCenturyOfEra();
        int int16 = localDateTime14.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withDate(276, 10, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:52 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withYearOfCentury(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(276, 3, 999, (int) (byte) -1, 10659386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        java.lang.String str10 = localDateTime5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime5.getFieldType(10660354);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10660354");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52" + "'", str3, "52");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2020-11-25T02:57:52.000" + "'", str10, "2020-11-25T02:57:52.000");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime4.minusDays(57);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = localDateTime21.toString("2020-11-25T03:02:27.558");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(1606273058077L);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime7 = property2.addToCopy((long) (short) -1);
        int int8 = localDateTime7.getSecondOfMinute();
        java.lang.Class<?> wildcardClass9 = localDateTime7.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusWeeks(1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withFieldAdded(durationFieldType9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readablePeriod8);
        java.util.Date date10 = localDateTime6.toDate();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Wed Nov 25 02:57:54 UTC 2020");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 0, 10659667, 100, 987, (-1), 10659667, 2029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 987 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDate(47, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime6.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 276, dateTimeZone1);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate((int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.minusMillis(10658000);
        org.joda.time.Chronology chronology13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) 10658000, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property16.setCopy("135");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"135\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2001-11-24T02:57:38.450", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        int int5 = localDateTime4.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 57 + "'", int5 == 57);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) int2, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10676201 + "'", int2 == 10676201);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withYearOfCentury(10659667);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659667 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withMillisOfDay((int) (short) 100);
        int int13 = localDateTime12.getSecondOfMinute();
        int int14 = localDateTime12.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant20 = null;
        long long21 = property19.getDifferenceAsLong(readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100L);
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        long long32 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        long long33 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property19.getFieldType();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime16.withField(dateTimeFieldType34, 48);
        org.joda.time.LocalDateTime.Property property37 = localDateTime3.property(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = localDateTime3.withMillisOfSecond(10659386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659386 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 11651L + "'", long32 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1606273076498L + "'", long33 == 1606273076498L);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        int int24 = localDateTime16.getWeekOfWeekyear();
        int int25 = localDateTime16.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withMinuteOfHour(57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(10673096, 19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:56 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(49, 2020, 10637811, (int) 'a', 7, 6, 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withCenturyOfEra(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withCenturyOfEra(10653346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10653346 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:57:57 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        boolean boolean11 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundFloorCopy();
        long long13 = property9.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10677269L + "'", long13 == 10677269L);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property5.addToCopy((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfMonth(10673096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10673096 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(55, 418, 2001, (-1), 794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime1.withPeriodAdded(readablePeriod17, 100);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.year();
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = localDateTime19.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate((int) (byte) 0, 987, 698);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 987 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate(0, 10659386, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659386 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMillis(330);
        int int12 = localDateTime6.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        int int7 = localDateTime6.getYear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusMonths(3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime11.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        int int18 = property17.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        boolean boolean20 = localDateTime9.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime9.withField(dateTimeFieldType21, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 999 + "'", int18 == 999);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        int int6 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusWeeks(10612590);
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.millisOfSecond();
        java.util.Locale locale11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property9.setCopy("hi!", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10679188 + "'", int5 == 10679188);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        int int24 = localDateTime16.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime16.withDayOfYear(418);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 418 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 48 + "'", int24 == 48);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        java.lang.String str25 = localDateTime6.toString("34");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 57 + "'", int14 == 57);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "34" + "'", str25, "34");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusMillis(20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.era();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.minus(readablePeriod8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withDayOfMonth(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDate(9, (int) (byte) 0, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 57 + "'", int7 == 57);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        java.util.Locale locale29 = null;
        int int30 = property27.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime31 = property27.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property27.getFieldType();
        int int33 = localDateTime24.get(dateTimeFieldType32);
        int int34 = localDateTime17.indexOf(dateTimeFieldType32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime17.withYear((int) (short) -1);
        int int37 = localDateTime36.getCenturyOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray38 = localDateTime36.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273079905L + "'", long16 == 1606273079905L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 6 + "'", int33 == 6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray38);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        int int17 = property2.getMinimumValue();
        long long18 = property2.remainder();
        int int19 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273080188L + "'", long16 == 1606273080188L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusYears(11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime8.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDateTime6.toString("2001-11-24T02:57:38.450", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Nov");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Nov\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMinimumValue();
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusSeconds(10653346);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withSecondOfMinute(20);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withDurationAdded(readableDuration20, 1);
        int int23 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withDayOfWeek(2029);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2029 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDateTime11.getField((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        java.lang.String str11 = localDateTime5.toString("14");
        org.joda.time.LocalDateTime localDateTime13 = localDateTime5.minusDays(2029);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withWeekOfWeekyear(10659386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659386 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2" + "'", str3, "2");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "14" + "'", str11, "14");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        int int6 = property2.getMinimumValue();
        java.util.Locale locale7 = null;
        java.lang.String str8 = property2.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime10 = property2.addWrapFieldToCopy(99);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks(10649000);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "610" + "'", str8, "610");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(2001);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfMonth(49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withYearOfEra(999);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime20);
        java.lang.Class<?> wildcardClass23 = localDateTime20.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property12.getDifference(readableInstant13);
        long long15 = property12.remainder();
        org.joda.time.LocalDateTime localDateTime16 = property12.roundHalfCeilingCopy();
        int int17 = localDateTime16.getYear();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.plusMonths(3);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        int int28 = property27.getMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property27.getFieldType();
        boolean boolean30 = localDateTime19.isSupported(dateTimeFieldType29);
        int int31 = property9.compareTo((org.joda.time.ReadablePartial) localDateTime19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 999 + "'", int28 == 999);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        java.util.Locale locale15 = null;
        int int16 = property13.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime17 = property13.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property13.getFieldType();
        org.joda.time.LocalDateTime.Property property19 = localDateTime8.property(dateTimeFieldType18);
        long long20 = property19.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:03 UTC 2029");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(32, 10659667, 602, 2001, 919);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfMonth();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.millisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        boolean boolean11 = property9.isLeap();
        org.joda.time.LocalDateTime localDateTime12 = property9.roundFloorCopy();
        int int13 = property9.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.DateTime dateTime5 = localDateTime1.toDateTime();
        java.lang.Class<?> wildcardClass6 = dateTime5.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        java.util.Date date4 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.fromDateFields(date4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.year();
        org.joda.time.LocalTime localTime6 = localDateTime1.toLocalTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDateTime8.toDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minusYears(11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime8.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.minusHours(10653346);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = localDateTime6.getFieldTypes();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        int int7 = localDateTime4.getYear();
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = localDateTime4.getFields();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2001 + "'", int7 == 2001);
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime4.getFieldTypes();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:05 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(56);
        org.joda.time.DurationFieldType durationFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withFieldAdded(durationFieldType12, 987);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDayOfYear(57);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMonthOfYear(48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10686384 + "'", int2 == 10686384);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMillis(330);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime();
        org.joda.time.DateTime dateTime18 = localDateTime11.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        int int11 = localDateTime8.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusDays(44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDateTime10.toString("AD");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: A");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        int int6 = property5.getLeapAmount();
        boolean boolean7 = property5.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.lang.String str4 = property2.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        java.util.Locale locale9 = null;
        int int10 = property7.getMaximumTextLength(locale9);
        org.joda.time.LocalDateTime localDateTime11 = property7.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = property7.getFieldType();
        org.joda.time.LocalDateTime localDateTime13 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withCenturyOfEra(0);
        int int21 = localDateTime15.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.withCenturyOfEra(0);
        int int29 = localDateTime15.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property30 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime15.withYearOfEra(1);
        org.joda.time.DateTime dateTime33 = localDateTime32.toDateTime();
        org.joda.time.DateTime dateTime34 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime33);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = property2.getDifference((org.joda.time.ReadableInstant) dateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 63713520000000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "199" + "'", str4, "199");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 58 + "'", int21 == 58);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime10.withYearOfEra(1);
        org.joda.time.DateTime dateTime28 = localDateTime27.toDateTime();
        int int29 = property2.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "298" + "'", str6, "298");
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusDays(14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minus(readablePeriod16);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.era();
        int int7 = localDateTime1.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime1.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.era();
        java.util.Date date10 = localDateTime7.toDate();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfYear(276);
        int int13 = property2.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime12.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.DurationField durationField4 = property3.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNull(durationField4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withYearOfCentury(10659288);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659288 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withYearOfEra(999);
        java.lang.Class<?> wildcardClass16 = localDateTime15.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.withPeriodAdded(readablePeriod26, 100);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(10649589);
        java.lang.String str33 = property30.getAsText();
        org.joda.time.LocalDateTime localDateTime34 = property30.withMaximumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2" + "'", str33, "2");
        org.junit.Assert.assertNotNull(localDateTime34);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime.Property property9 = localDateTime1.centuryOfEra();
        java.util.Locale locale10 = null;
        int int11 = property9.getMaximumTextLength(locale10);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant17 = null;
        long long18 = property16.getDifferenceAsLong(readableInstant17);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(dateTimeZone19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(100L);
        int int27 = localDateTime26.getSecondOfMinute();
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime();
        long long29 = property24.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        long long30 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property16.getFieldType();
        boolean boolean32 = localDateTime13.isSupported(dateTimeFieldType31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime13.withEra(654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 654 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 11651L + "'", long29 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1606273090557L + "'", long30 == 1606273090557L);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        org.joda.time.DurationField durationField6 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime7 = property2.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusSeconds(10660354);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra(10659386);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659386 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDayOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, (-1));
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDurationAdded(readableDuration5, 10653346);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime7.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        boolean boolean12 = localDateTime10.isBefore((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.minusMonths(11);
        int int15 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime10.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.withYearOfEra(999);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumTextLength(locale24);
        org.joda.time.LocalDateTime localDateTime26 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        boolean boolean28 = localDateTime19.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime3.property(dateTimeFieldType27);
        org.joda.time.DateTimeField dateTimeField30 = property29.getField();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2020 + "'", int15 == 2020);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(654, 2001, 32, 794, 10671382, 602, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 794 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.LocalDateTime localDateTime6 = property2.withMinimumValue();
        org.joda.time.Interval interval7 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(interval7);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 2020);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2001-11-25T02:57:48.444");
        org.joda.time.LocalDate localDate2 = localDateTime1.toLocalDate();
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.withMinuteOfHour(56);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfCentury();
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.yearOfEra();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        java.lang.Class<?> wildcardClass26 = property24.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(48);
        java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.lang.String str12 = localDateTime11.toString();
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withDurationAdded(readableDuration13, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime11.getValue(10671382);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10671382");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2001-11-26T00:00:00.000" + "'", str12, "2001-11-26T00:00:00.000");
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        int int16 = localDateTime4.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        java.lang.Class<?> wildcardClass13 = property11.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        int int10 = localDateTime6.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(11, (int) (byte) 100, (int) (byte) 100, 2001, 20, 10658000, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localDateTime15.getField(330);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 330");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.ReadableInstant readableInstant6 = null;
        int int7 = property2.getDifference(readableInstant6);
        java.lang.String str8 = property2.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "309" + "'", str8, "309");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime6.getFieldType(10660354);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10660354");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.secondOfMinute();
        int int4 = localDateTime2.getYear();
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.year();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minus(readablePeriod6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.centuryOfEra();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.yearOfCentury();
        int int10 = localDateTime7.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = property13.withMinimumValue();
        org.joda.time.Chronology chronology17 = localDateTime16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime7, chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((java.lang.Object) 10612590, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 58 + "'", int10 == 58);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        int int5 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.era();
        int int7 = property6.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(999, 594, 1970, 99, 20, 10690810, 44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(38);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime9.getValue(10671382);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10671382");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, 10658000);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDateTime16.getValue(2029);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2029");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime1.getFieldType((int) (byte) 1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(10659386);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100L);
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        org.joda.time.DateTime dateTime32 = localDateTime27.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTime dateTime33 = localDateTime22.toDateTime((org.joda.time.ReadableInstant) dateTime31);
        int int34 = property16.compareTo((org.joda.time.ReadableInstant) dateTime33);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMonthOfYear(582);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 582 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusSeconds((int) (byte) 1);
        org.joda.time.ReadablePartial readablePartial12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withFields(readablePartial12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) property14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withMillisOfDay((int) (short) 100);
        int int13 = localDateTime12.getSecondOfMinute();
        int int14 = localDateTime12.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.minus(readablePeriod15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant20 = null;
        long long21 = property19.getDifferenceAsLong(readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(100L);
        int int30 = localDateTime29.getSecondOfMinute();
        org.joda.time.DateTime dateTime31 = localDateTime29.toDateTime();
        long long32 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        long long33 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = property19.getFieldType();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime16.withField(dateTimeFieldType34, 48);
        org.joda.time.LocalDateTime.Property property37 = localDateTime3.property(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime39 = localDateTime3.withYearOfCentury(418);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 418 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 11651L + "'", long32 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1606273097805L + "'", long33 == 1606273097805L);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        int int14 = localDateTime13.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2001 + "'", int14 == 2001);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        int int17 = property2.getMinimumValue();
        long long18 = property2.remainder();
        java.util.Locale locale19 = null;
        int int20 = property2.getMaximumTextLength(locale19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273098665L + "'", long16 == 1606273098665L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        int int5 = localDateTime1.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DurationField durationField8 = property6.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withYearOfCentury(10671382);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10671382 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMillis(330);
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundHalfFloorCopy();
        int int14 = localDateTime13.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = property9.getField();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withDurationAdded(readableDuration10, 846);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfMonth(10653346);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10653346 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "20" + "'", str3, "20");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        java.util.Locale locale3 = null;
        java.lang.String str4 = property2.getAsShortText(locale3);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "336" + "'", str4, "336");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withMonthOfYear(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMinimumValue();
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((int) (byte) 100, 10688833, 56, 10698240, 100, 18, 10673096, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698240 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.withPeriodAdded(readablePeriod26, 100);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(10649589);
        int int33 = property30.getMinimumValueOverall();
        java.lang.String str34 = property30.getAsShortText();
        int int35 = property30.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2" + "'", str34, "2");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(10659386);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField17 = localDateTime15.getField(999);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 999");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusMonths(56);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime11.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMinimumValue();
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(53, 1970, 21, (-1), 582, (int) (byte) 0, 995, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant19 = null;
        long long20 = property18.getDifferenceAsLong(readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(100L);
        int int29 = localDateTime28.getSecondOfMinute();
        org.joda.time.DateTime dateTime30 = localDateTime28.toDateTime();
        long long31 = property26.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        long long32 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime30);
        int int33 = property10.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int34 = property2.compareTo((org.joda.time.ReadableInstant) dateTime30);
        int int35 = property2.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime40 = property38.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime41 = property38.withMinimumValue();
        org.joda.time.Chronology chronology42 = localDateTime41.getChronology();
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(chronology42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((java.lang.Object) property2, chronology42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 11651L + "'", long31 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1606273101997L + "'", long32 == 1606273101997L);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 59 + "'", int35 == 59);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plus(readableDuration5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.plusYears(9);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.minus(readablePeriod14);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10671382, 99, 719, 276, 602, (int) (byte) -1, 332);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 276 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(10659667);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withSecondOfMinute(2001);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2001 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "23" + "'", str3, "23");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.getValue(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime19 = property2.setCopy("525");
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime21.getValue(49);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 49");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273104018L + "'", long16 == 1606273104018L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        java.util.Locale locale29 = null;
        int int30 = property27.getMaximumTextLength(locale29);
        org.joda.time.LocalDateTime localDateTime31 = property27.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = property27.getFieldType();
        int int33 = localDateTime24.get(dateTimeFieldType32);
        int int34 = localDateTime17.indexOf(dateTimeFieldType32);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime17.withYear((int) (short) -1);
        int int37 = localDateTime36.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYear(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273104333L + "'", long16 == 1606273104333L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 434 + "'", int33 == 434);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(localDateTime39);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(49, (int) (byte) 10, 292278993, 709, 919, 886);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis(100);
        org.joda.time.LocalDateTime.Property property11 = localDateTime1.dayOfYear();
        org.joda.time.Interval interval12 = property11.toInterval();
        boolean boolean13 = property11.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property18.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundCeilingCopy();
        java.util.Locale locale25 = null;
        int int26 = property23.getMaximumTextLength(locale25);
        org.joda.time.LocalDateTime localDateTime27 = property23.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = property23.getFieldType();
        int int29 = localDateTime20.get(dateTimeFieldType28);
        int int30 = localDateTime13.indexOf(dateTimeFieldType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime13.withHourOfDay(987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 987 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
// flaky:         org.junit.Assert.assertTrue("'" + int29 + "' != '" + 465 + "'", int29 == 465);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant4 = null;
        long long5 = property3.getDifferenceAsLong(readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        long long17 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime18 = property3.roundHalfFloorCopy();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime25 = property23.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundCeilingCopy();
        java.util.Locale locale30 = null;
        int int31 = property28.getMaximumTextLength(locale30);
        org.joda.time.LocalDateTime localDateTime32 = property28.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property28.getFieldType();
        int int34 = localDateTime25.get(dateTimeFieldType33);
        int int35 = localDateTime18.indexOf(dateTimeFieldType33);
        int int36 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime18.withPeriodAdded(readablePeriod37, 987);
        int int40 = localDateTime39.getYearOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1606273105774L + "'", long17 == 1606273105774L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 874 + "'", int34 == 874);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2020 + "'", int40 == 2020);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfMonth();
        org.joda.time.DurationField durationField22 = property21.getDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(durationField22);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        int int10 = localDateTime8.getYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.year();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.minus(readablePeriod12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.centuryOfEra();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.yearOfCentury();
        int int16 = localDateTime13.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime22 = property19.withMinimumValue();
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(chronology23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime13, chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(59, 0, 10698240, (int) (short) 10, 10660354, 10637811, 10653346, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10660354 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        org.joda.time.LocalDateTime.Property property16 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.Interval interval18 = property16.toInterval();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumTextLength(locale19);
        org.joda.time.LocalDateTime localDateTime21 = property16.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = property16.getFieldType();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = localDateTime0.toString("55", locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime0.withTime(995, 999, (int) (byte) 10, 10659667);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 995 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "55" + "'", str9, "55");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.withPeriodAdded(readablePeriod26, 100);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(10649589);
        java.lang.String str33 = property30.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime35 = property30.setCopy("969");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "2" + "'", str33, "2");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(698, 14, 20, 10703366, 70, 99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10703366 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        int int18 = property2.getLeapAmount();
        int int19 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField20 = property2.getRangeDurationField();
        java.lang.String str21 = property2.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property2.setCopy("2001-11-24T02:57:38.450");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2001-11-24T02:57:38.450\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273107926L + "'", long16 == 1606273107926L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertNotNull(durationField20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "26" + "'", str21, "26");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        java.lang.String str16 = localDateTime4.toString();
        org.joda.time.LocalDateTime.Property property17 = localDateTime4.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime4.withEra(3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2001-11-25T02:58:28.118" + "'", str16, "2001-11-25T02:58:28.118");
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        int int5 = property2.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DurationField durationField13 = property5.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = property5.setCopy(582);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 582 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        int int10 = localDateTime8.getYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = localDateTime12.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime15);
        long long17 = property6.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime16);
        int int18 = property6.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "28" + "'", str3, "28");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2020 + "'", int10 == 2020);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = localDateTime1.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDate(995, 19, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        int int13 = localDateTime12.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withDayOfMonth(886);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 886 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2001 + "'", int13 == 2001);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withYearOfEra(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType(10696766);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10696766");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMinuteOfHour((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.yearOfEra();
        boolean boolean22 = property21.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long) 10, dateTimeZone8);
        java.util.Date date10 = localDateTime9.toDate();
        boolean boolean11 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.plusMillis(32);
        int int23 = localDateTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 58 + "'", int23 == 58);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        int int7 = localDateTime4.getYear();
        int int8 = localDateTime4.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2001 + "'", int7 == 2001);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2001 + "'", int8 == 2001);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) "Sunday", chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Sunday\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withMillisOfDay((int) (short) 100);
        int int25 = localDateTime24.getSecondOfMinute();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        java.util.Locale locale37 = null;
        int int38 = property35.getMaximumTextLength(locale37);
        org.joda.time.LocalDateTime localDateTime39 = property35.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = property35.getFieldType();
        int int41 = localDateTime32.get(dateTimeFieldType40);
        boolean boolean42 = localDateTime24.isSupported(dateTimeFieldType40);
        int int43 = localDateTime9.get(dateTimeFieldType40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime45 = localDateTime9.withYearOfCentury(846);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 846 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
// flaky:         org.junit.Assert.assertTrue("'" + int41 + "' != '" + 969 + "'", int41 == 969);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int43 + "' != '" + 969 + "'", int43 == 969);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant13 = null;
        long long14 = property12.getDifferenceAsLong(readableInstant13);
        org.joda.time.DurationField durationField15 = property12.getRangeDurationField();
        boolean boolean16 = localDateTime6.equals((java.lang.Object) durationField15);
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime6.withPeriodAdded(readablePeriod17, 0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withDurationAdded(readableDuration20, 32);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime19, dateTimeZone23);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfDay(10612590);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.plusDays(2001);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime8.toString("era", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        int int8 = property7.getMaximumValue();
        java.lang.String str9 = property7.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 999 + "'", int8 == 999);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "millisOfSecond" + "'", str9, "millisOfSecond");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        java.lang.String str17 = property16.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "monthOfYear" + "'", str17, "monthOfYear");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = localDateTime3.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours(1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDateTime6.getFieldTypes();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        int[] intArray9 = localDateTime1.getValues();
        int int10 = localDateTime1.getYearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localDateTime1.getFieldTypes();
        java.lang.String str12 = localDateTime1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1970, 1, 1, 100]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1970-01-01T00:00:00.100" + "'", str12, "1970-01-01T00:00:00.100");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        java.lang.String str8 = property7.getAsString();
        java.lang.Class<?> wildcardClass9 = property7.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "584" + "'", str8, "584");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 582, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        java.util.Locale locale15 = null;
        int int16 = property13.getMaximumTextLength(locale15);
        int int17 = property13.getMinimumValue();
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(100L);
        int int23 = localDateTime22.getSecondOfMinute();
        org.joda.time.DateTime dateTime24 = localDateTime22.toDateTime();
        org.joda.time.DateTime dateTime25 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        long long26 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        int int30 = localDateTime29.getDayOfYear();
        int int31 = localDateTime29.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime();
        boolean boolean40 = localDateTime38.isBefore((org.joda.time.ReadablePartial) localDateTime39);
        org.joda.time.DateTime dateTime41 = localDateTime38.toDateTime();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime38.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(dateTimeZone44);
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime45.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime.Property property53 = localDateTime52.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime55 = localDateTime52.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime52.withCenturyOfEra(0);
        int int58 = localDateTime52.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.LocalDateTime localDateTime60 = new org.joda.time.LocalDateTime(dateTimeZone59);
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime60.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime65 = localDateTime60.withCenturyOfEra(0);
        int int66 = localDateTime52.compareTo((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime localDateTime67 = localDateTime50.withFields((org.joda.time.ReadablePartial) localDateTime60);
        org.joda.time.LocalDateTime localDateTime69 = localDateTime60.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone70 = null;
        org.joda.time.DateTime dateTime71 = localDateTime69.toDateTime(dateTimeZone70);
        org.joda.time.DateTime dateTime72 = localDateTime43.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        org.joda.time.DateTime dateTime73 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime71);
        int int74 = property10.compareTo((org.joda.time.ReadableInstant) dateTime71);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:31 UTC 2029");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 3041L + "'", long27 == 3041L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 330 + "'", int30 == 330);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2020 + "'", int31 == 2020);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 58 + "'", int58 == 58);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        java.lang.String str6 = property2.getAsText();
        java.lang.String str7 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "32" + "'", str6, "32");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "32" + "'", str7, "32");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withHourOfDay(3);
        org.joda.time.DurationFieldType durationFieldType14 = null;
        boolean boolean15 = localDateTime13.isSupported(durationFieldType14);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusDays(14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime6.yearOfCentury();
        boolean boolean17 = property16.isLeap();
        java.lang.String str18 = property16.toString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Property[yearOfCentury]" + "'", str18, "Property[yearOfCentury]");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        int int6 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusWeeks(10612590);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant12 = null;
        int int13 = property11.getDifference(readableInstant12);
        long long14 = property11.remainder();
        org.joda.time.LocalDateTime localDateTime15 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMonths(100);
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime23 = property22.roundCeilingCopy();
        java.util.Locale locale24 = null;
        int int25 = property22.getMaximumTextLength(locale24);
        org.joda.time.LocalDateTime localDateTime26 = property22.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = property22.getFieldType();
        org.joda.time.LocalDateTime.Property property28 = localDateTime17.property(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime1.withField(dateTimeFieldType27, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = localDateTime1.withEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10713016 + "'", int5 == 10713016);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Sun Mar 25 02:58:33 UTC 2029");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.withMinuteOfHour(56);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withYearOfEra(1);
        int int25 = localDateTime22.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        int int16 = property13.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 58 + "'", int10 == 58);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2099" + "'", str15, "2099");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2029, 418, 10637811, 10653346, 55, 10659667);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10653346 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        int int7 = localDateTime6.getDayOfMonth();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 25 + "'", int7 == 25);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(53, 330, (int) (byte) 10, 10688833, 332);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10688833 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        int int5 = property2.getMaximumValue();
        java.lang.String str6 = property2.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "35" + "'", str6, "35");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        java.util.Locale locale5 = null;
        java.lang.String str6 = localDateTime1.toString("298", locale5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "298" + "'", str6, "298");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withMonthOfYear(1);
        int int21 = localDateTime20.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime20.plusMonths(0);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:35 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10715962 + "'", int21 == 10715962);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("421");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, (int) '4');
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 100, 846, 17, 594, 719, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 594 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.minusSeconds(4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plusWeeks(53);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10716349 + "'", int2 == 10716349);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2063, 330, 430, 10710627, 55, 698, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10710627 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        java.util.Locale locale4 = null;
        int int5 = property2.getMaximumTextLength(locale4);
        org.joda.time.Interval interval6 = property2.toInterval();
        org.joda.time.DateTimeField dateTimeField7 = property2.getField();
        int int8 = property2.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusWeeks((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withMonthOfYear(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:36 UTC 2029");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DurationField durationField8 = property6.getDurationField();
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        int int10 = property6.get();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(100L);
        int int22 = localDateTime21.getSecondOfMinute();
        org.joda.time.DateTime dateTime23 = localDateTime21.toDateTime();
        long long24 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.LocalDateTime localDateTime25 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusDays(10);
        boolean boolean28 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(chronology29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.withYearOfEra(3);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime();
        boolean boolean41 = localDateTime39.isBefore((org.joda.time.ReadablePartial) localDateTime40);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime39.minusMonths(11);
        int int44 = localDateTime39.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime48 = localDateTime39.withYearOfEra(999);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime(dateTimeZone49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime52 = property51.roundCeilingCopy();
        java.util.Locale locale53 = null;
        int int54 = property51.getMaximumTextLength(locale53);
        org.joda.time.LocalDateTime localDateTime55 = property51.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = property51.getFieldType();
        boolean boolean57 = localDateTime48.isSupported(dateTimeFieldType56);
        org.joda.time.LocalDateTime.Property property58 = localDateTime32.property(dateTimeFieldType56);
        int int59 = localDateTime12.get(dateTimeFieldType56);
        org.joda.time.DateTime dateTime60 = localDateTime12.toDateTime();
        int int61 = property6.compareTo((org.joda.time.ReadableInstant) dateTime60);
        // The following exception was thrown during execution in test generation
        try {
            long long62 = property3.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime60);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 11651L + "'", long24 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2020 + "'", int44 == 2020);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 3 + "'", int54 == 3);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(dateTimeFieldType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes((int) (byte) 100);
        int int9 = localDateTime6.size();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMinutes(59);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.dayOfWeek();
        int int13 = localDateTime11.getYear();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2020 + "'", int13 == 2020);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.getLocalDateTime();
        org.joda.time.DurationField durationField6 = property2.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = property2.getFieldType();
        org.joda.time.LocalDateTime localDateTime9 = property2.addWrapFieldToCopy(1970);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10693513, (int) '4', 0, 719, 10, 0, 654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 719 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withYearOfEra(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.DateTime dateTime28 = localDateTime26.toDateTime();
        int int29 = property19.compareTo((org.joda.time.ReadableInstant) dateTime28);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.getLocalDateTime();
        int int6 = property2.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 38 + "'", int6 == 38);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = property5.addToCopy((long) 4);
        org.joda.time.DurationField durationField14 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((int) ' ');
        java.util.Locale locale10 = null;
        org.joda.time.LocalDateTime localDateTime11 = property2.setCopy("54", locale10);
        java.util.Locale locale12 = null;
        int int13 = property2.getMaximumTextLength(locale12);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(276, 0, 47, 502, 602, 10703366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 502 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(100L);
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime();
        long long13 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.LocalDateTime localDateTime14 = property8.roundCeilingCopy();
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromDateFields(date15);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property21 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime23 = property21.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        java.util.Locale locale28 = null;
        int int29 = property26.getMaximumTextLength(locale28);
        org.joda.time.LocalDateTime localDateTime30 = property26.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property26.getFieldType();
        int int32 = localDateTime23.get(dateTimeFieldType31);
        int int33 = localDateTime16.indexOf(dateTimeFieldType31);
        int int34 = localDateTime1.get(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:39 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 11651L + "'", long13 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
// flaky:         org.junit.Assert.assertTrue("'" + int32 + "' != '" + 670 + "'", int32 == 670);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 670 + "'", int34 == 670);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.withMinimumValue();
        long long18 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273119798L + "'", long16 == 1606273119798L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = localDateTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 26 + "'", int5 == 26);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        int int5 = localDateTime1.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withDayOfWeek(10612590);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10612590 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 11 + "'", int5 == 11);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(15, 9, 602, 10637811, 10698240, 665);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10637811 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        int int9 = localDateTime7.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 478 + "'", int9 == 478);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withYearOfEra(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime1.yearOfCentury();
        org.joda.time.LocalDateTime.Property property20 = localDateTime1.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.secondOfMinute();
        java.lang.String str24 = property23.getAsString();
        org.joda.time.DurationField durationField25 = property23.getDurationField();
        org.joda.time.LocalDateTime localDateTime26 = property23.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.secondOfMinute();
        int int31 = localDateTime29.getYear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = localDateTime33.toDateTime(dateTimeZone35);
        org.joda.time.DateTime dateTime37 = localDateTime29.toDateTime((org.joda.time.ReadableInstant) dateTime36);
        long long38 = property27.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime37);
        int int39 = property20.compareTo((org.joda.time.ReadableInstant) dateTime37);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property23);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "40" + "'", str24, "40");
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2020 + "'", int31 == 2020);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Date date12 = localDateTime11.toDate();
        java.lang.String str14 = localDateTime11.toString("6");
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "6" + "'", str14, "6");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime12.getFieldType(10690810);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10690810");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localDateTime1.isEqual(readablePartial5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.millisOfDay();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.dayOfMonth();
        boolean boolean6 = localDateTime1.equals((java.lang.Object) 10688833);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:42 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.plusYears((-1));
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        boolean boolean34 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusMonths(11);
        int int37 = localDateTime32.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime32.withYearOfEra(999);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDateTime localDateTime43 = new org.joda.time.LocalDateTime(dateTimeZone42);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime45 = property44.roundCeilingCopy();
        java.util.Locale locale46 = null;
        int int47 = property44.getMaximumTextLength(locale46);
        org.joda.time.LocalDateTime localDateTime48 = property44.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = property44.getFieldType();
        boolean boolean50 = localDateTime41.isSupported(dateTimeFieldType49);
        org.joda.time.LocalDateTime.Property property51 = localDateTime16.property(dateTimeFieldType49);
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.LocalDateTime localDateTime53 = localDateTime16.plus(readableDuration52);
        org.joda.time.LocalDateTime localDateTime55 = localDateTime53.minusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime57 = localDateTime55.plusDays(276);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 58 + "'", int14 == 58);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2020 + "'", int37 == 2020);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(dateTimeFieldType49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime57);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("23", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        int int6 = localDateTime1.getEra();
        int int7 = localDateTime1.getEra();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10723183 + "'", int5 == 10723183);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(6);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withDayOfMonth(694);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 694 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(1970);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withFieldAdded(durationFieldType9, 55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withYearOfCentury(1);
        int int15 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusYears((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime6.withMonthOfYear(1);
        java.lang.String str21 = localDateTime6.toString();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withMillisOfDay(10612590);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 02:58:43 UTC 2020");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2020-11-25T02:58:43.709" + "'", str21, "2020-11-25T02:58:43.709");
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.minuteOfHour();
        int int3 = localDateTime1.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(100L);
        int int16 = localDateTime15.getSecondOfMinute();
        org.joda.time.DateTime dateTime17 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime18 = localDateTime13.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        org.joda.time.DateTime dateTime19 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime17);
        java.lang.String str20 = localDateTime8.toString();
        org.joda.time.LocalDateTime.Property property21 = localDateTime8.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime1.withMonthOfYear(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2001-11-25T02:58:43.808" + "'", str20, "2001-11-25T02:58:43.808");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        int int11 = localDateTime1.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDurationAdded(readableDuration12, (int) 'a');
        int int15 = localDateTime14.getCenturyOfEra();
        int int16 = localDateTime14.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.withMinuteOfHour((int) ' ');
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime24.minus(readableDuration27);
        int int29 = localDateTime28.size();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property34 = localDateTime31.secondOfMinute();
        int int35 = localDateTime31.getMillisOfDay();
        int int36 = localDateTime31.getEra();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime31.minusWeeks(10612590);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant42 = null;
        int int43 = property41.getDifference(readableInstant42);
        long long44 = property41.remainder();
        org.joda.time.LocalDateTime localDateTime45 = property41.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.plusMonths(100);
        java.util.Date date48 = localDateTime47.toDate();
        org.joda.time.LocalDateTime.Property property49 = localDateTime47.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundCeilingCopy();
        java.util.Locale locale54 = null;
        int int55 = property52.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime56 = property52.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property52.getFieldType();
        org.joda.time.LocalDateTime.Property property58 = localDateTime47.property(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime31.withField(dateTimeFieldType57, (int) ' ');
        boolean boolean61 = localDateTime28.isSupported(dateTimeFieldType57);
        org.joda.time.LocalDateTime.Property property62 = localDateTime19.property(dateTimeFieldType57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime64 = localDateTime14.withField(dateTimeFieldType57, 10673096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10673096 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:43 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10723851 + "'", int35 == 10723851);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(date48);
// flaky:         org.junit.Assert.assertEquals(date48.toString(), "Sun Mar 25 02:58:43 UTC 2029");
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(property62);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("35", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(9);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDateTime12.getFieldTypes();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:44 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.lang.String str12 = localDateTime11.toString();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = localDateTime11.getFieldTypes();
        int[] intArray14 = localDateTime11.getValues();
        int int15 = localDateTime11.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2001-11-26T00:00:00.000" + "'", str12, "2001-11-26T00:00:00.000");
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2001, 11, 26, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        java.lang.String str16 = localDateTime4.toString();
        org.joda.time.LocalDateTime.Property property17 = localDateTime4.dayOfMonth();
        org.joda.time.Interval interval18 = property17.toInterval();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2001-11-25T02:58:44.437" + "'", str16, "2001-11-25T02:58:44.437");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDateTime8.isSupported(durationFieldType10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusWeeks(10659386);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localDateTime13.getField(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:44 UTC 2029");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        int int8 = localDateTime6.getDayOfWeek();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = localDateTime5.getFieldTypes();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.DurationField durationField13 = property5.getRangeDurationField();
        boolean boolean14 = property5.isLeap();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        int int9 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        org.joda.time.DateTime dateTime14 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime15 = localDateTime4.toDateTime((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minusWeeks(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime4.withDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 1, 17, 1, 999, 18, 502, 58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10671382);
        int int2 = localDateTime1.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 382 + "'", int2 == 382);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusYears((int) (short) -1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime6.getValue(10673096);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10673096");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getMinuteOfHour();
        int int11 = localDateTime7.getWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 58 + "'", int10 == 58);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2001 + "'", int11 == 2001);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.minusDays(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime6.withCenturyOfEra(10659288);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659288 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("Nov", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        java.util.Locale locale9 = null;
        int int10 = property8.getMaximumShortTextLength(locale9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        int int9 = localDateTime6.getMinuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMonthOfYear(10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime8.withTime(10649000, 292278993, 618, 882);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10649000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.dayOfYear();
        int int4 = localDateTime1.getMinuteOfHour();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        int int28 = property5.compareTo((org.joda.time.ReadableInstant) dateTime25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = property5.setCopy("873");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"873\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606273128392L + "'", long27 == 1606273128392L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withMonthOfYear(10698240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698240 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:48 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(987, (int) (byte) -1, (int) (short) 1, 100, 2001, 10658000, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        java.lang.String str6 = property2.getAsShortText();
        java.lang.String str7 = property2.getAsString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        boolean boolean16 = localDateTime14.isBefore((org.joda.time.ReadablePartial) localDateTime15);
        org.joda.time.DateTime dateTime17 = localDateTime14.toDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime21.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withCenturyOfEra(0);
        int int34 = localDateTime28.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(dateTimeZone35);
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime36.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.withCenturyOfEra(0);
        int int42 = localDateTime28.compareTo((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime26.withFields((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime36.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = localDateTime45.toDateTime(dateTimeZone46);
        org.joda.time.DateTime dateTime48 = localDateTime19.toDateTime((org.joda.time.ReadableInstant) dateTime47);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = property2.getDifference((org.joda.time.ReadableInstant) dateTime48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 20131200000");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "74" + "'", str6, "74");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "74" + "'", str7, "74");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + int34 + "' != '" + 58 + "'", int34 == 58);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTime48);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        org.joda.time.LocalDateTime.Property property16 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.Interval interval18 = property16.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) property16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(interval18);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDayOfYear(100);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withYearOfEra(10698240);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withWeekOfWeekyear(21);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        java.util.Locale locale8 = null;
        java.lang.String str9 = localDateTime0.toString("55", locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withWeekOfWeekyear(849);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 849 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "55" + "'", str9, "55");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime((int) (byte) 100, 719, 2001, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:49 UTC 2029");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusDays(10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plusMinutes(3);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusMillis((int) (short) 100);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMonthOfYear(10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        int int15 = property13.getDifference(readableInstant14);
        long long16 = property13.remainder();
        org.joda.time.LocalDateTime localDateTime17 = property13.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMonths(100);
        java.util.Date date20 = localDateTime19.toDate();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = property24.roundCeilingCopy();
        java.util.Locale locale26 = null;
        int int27 = property24.getMaximumTextLength(locale26);
        org.joda.time.LocalDateTime localDateTime28 = property24.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = property24.getFieldType();
        org.joda.time.LocalDateTime.Property property30 = localDateTime19.property(dateTimeFieldType29);
        org.joda.time.LocalDateTime localDateTime31 = property30.withMaximumValue();
        boolean boolean32 = localDateTime8.equals((java.lang.Object) localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Sun Mar 25 02:58:49 UTC 2029");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withYearOfCentury((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMonthOfYear(10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plus(readableDuration9);
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDateTime8.compareTo(readablePartial11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime17 = property11.roundCeilingCopy();
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant23 = null;
        long long24 = property22.getDifferenceAsLong(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(100L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        long long35 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property22.getFieldType();
        boolean boolean38 = localDateTime19.isSupported(dateTimeFieldType37);
        int int39 = localDateTime1.get(dateTimeFieldType37);
        java.lang.Class<?> wildcardClass40 = dateTimeFieldType37.getClass();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11651L + "'", long35 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1606273129474L + "'", long36 == 1606273129474L);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 574 + "'", int39 == 574);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.hourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606273053882L, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(59);
        int int5 = localDateTime2.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minusWeeks(583);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 882 + "'", int5 == 882);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        int int10 = localDateTime8.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant16 = null;
        long long17 = property15.getDifferenceAsLong(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime12.withField(dateTimeFieldType30, 48);
        int int33 = localDateTime12.getMillisOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11651L + "'", long28 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606273130478L + "'", long29 == 1606273130478L);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withSecondOfMinute(11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfYear(10726469);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10726469 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        boolean boolean11 = localDateTime8.isSupported(durationFieldType10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusHours(56);
        java.util.Locale locale15 = null;
        java.lang.String str16 = localDateTime13.toString("73", locale15);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:58:50 UTC 2029");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "73" + "'", str16, "73");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        int int6 = property2.getMaximumValueOverall();
        int int7 = property2.getMaximumValue();
        java.lang.String str8 = property2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property2.setCopy(10666832);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10666832 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusDays(6);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.minus(readablePeriod14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime10.withEra(10658000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10658000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusWeeks(32);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withHourOfDay(3);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withPeriodAdded(readablePeriod14, 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withSecondOfMinute(10698240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698240 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(430, 849, 18, 10688833, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10688833 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        int int5 = localDateTime3.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime18.getFieldType(0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime11.property(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime3.withFields((org.joda.time.ReadablePartial) localDateTime11);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.withYear(333);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(10659386);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        org.joda.time.DurationField durationField17 = property16.getLeapDurationField();
        int int18 = property16.getLeapAmount();
        java.lang.String str19 = property16.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "39" + "'", str19, "39");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withYearOfEra(1);
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDateTime1.toString("2020-11-25T02:57:49.054", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("762", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = property2.setCopy(268);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 268 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "52" + "'", str3, "52");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(19);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withWeekyear(882);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(583);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 583 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField12 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.minuteOfHour();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime10.toString("2020-11-25T02:57:49.054", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusWeeks((int) (byte) -1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusMillis(38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfCentury(10693513);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10693513 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100, 382, 583, (int) '4', 161, 276, 10688833, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.hourOfDay();
        int int9 = localDateTime6.getMonthOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 276, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMonthOfYear(10673096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10673096 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        java.util.Locale locale13 = null;
        int int14 = property5.getMaximumShortTextLength(locale13);
        org.joda.time.DateTimeField dateTimeField15 = property5.getField();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.secondOfMinute();
        java.lang.String str19 = property18.getAsString();
        org.joda.time.DurationField durationField20 = property18.getDurationField();
        org.joda.time.LocalDateTime localDateTime21 = property18.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfMonth();
        int int23 = localDateTime21.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime25.withMillisOfDay((int) (short) 100);
        boolean boolean33 = localDateTime21.isAfter((org.joda.time.ReadablePartial) localDateTime32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant37 = null;
        long long38 = property36.getDifferenceAsLong(readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(100L);
        int int47 = localDateTime46.getSecondOfMinute();
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime();
        long long49 = property44.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        long long50 = property36.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = localDateTime32.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        int int52 = property5.compareTo((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "53" + "'", str19, "53");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 48 + "'", int23 == 48);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 11651L + "'", long49 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1606273133461L + "'", long50 == 1606273133461L);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusMonths(10660354);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        int int7 = localDateTime6.getDayOfYear();
        int int8 = localDateTime6.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTime dateTime18 = localDateTime15.toDateTime();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.minusMillis(0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime22.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime29.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime29.withCenturyOfEra(0);
        int int35 = localDateTime29.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime(dateTimeZone36);
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime37.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime37.withCenturyOfEra(0);
        int int43 = localDateTime29.compareTo((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime37);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime37.plusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.DateTime dateTime48 = localDateTime46.toDateTime(dateTimeZone47);
        org.joda.time.DateTime dateTime49 = localDateTime20.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime50 = localDateTime6.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.joda.time.DateTime dateTime51 = localDateTime0.toDateTime((org.joda.time.ReadableInstant) dateTime48);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 330 + "'", int7 == 330);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2020 + "'", int8 == 2020);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 58 + "'", int35 == 58);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        int int10 = localDateTime8.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant16 = null;
        long long17 = property15.getDifferenceAsLong(readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(dateTimeZone18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(100L);
        int int26 = localDateTime25.getSecondOfMinute();
        org.joda.time.DateTime dateTime27 = localDateTime25.toDateTime();
        long long28 = property23.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        long long29 = property15.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime12.withField(dateTimeFieldType30, 48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType34 = localDateTime12.getFieldType(44);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 44");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 11651L + "'", long28 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1606273133989L + "'", long29 == 1606273133989L);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(10659667);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusYears(10660354);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "54" + "'", str3, "54");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime10 = property9.getLocalDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withCenturyOfEra((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withWeekOfWeekyear(10673096);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10673096 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(10659667);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withWeekyear(694);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime13.getFields();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "54" + "'", str3, "54");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        int int6 = property2.getMinimumValueOverall();
        boolean boolean7 = property2.isLeap();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = property2.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        java.util.Date date11 = localDateTime10.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        int int17 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime10.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withWeekyear((int) (short) 10);
        boolean boolean22 = property2.equals((java.lang.Object) localDateTime19);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Wed Nov 25 02:58:54 UTC 2020");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime6.withMinuteOfHour(56);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.yearOfCentury();
        int int24 = property23.getMinimumValue();
        org.joda.time.DurationField durationField25 = property23.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minusSeconds((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withHourOfDay(3);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime8.withPeriodAdded(readablePeriod14, 59);
        int int17 = localDateTime8.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2020 + "'", int17 == 2020);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plus(readablePeriod14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks(47);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.hourOfDay();
        java.lang.String str19 = property18.toString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Property[hourOfDay]" + "'", str19, "Property[hourOfDay]");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.DateTime dateTime9 = localDateTime6.toDateTime();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minusMillis(0);
        int int12 = localDateTime11.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(332);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 332");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        java.util.Date date4 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime11.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime1.withField(dateTimeFieldType13, 7);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime1.plusHours(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(100L);
        int int15 = localDateTime14.getSecondOfMinute();
        org.joda.time.DateTime dateTime16 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime17 = localDateTime12.toDateTime((org.joda.time.ReadableInstant) dateTime16);
        boolean boolean18 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime12);
        boolean boolean19 = localDateTime4.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime4.withYearOfCentury(738);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 738 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        java.util.Date date4 = localDateTime1.toDate();
        int int5 = localDateTime1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime12 = property5.addWrapFieldToCopy((int) (byte) -1);
        java.util.Locale locale13 = null;
        int int14 = property5.getMaximumShortTextLength(locale13);
        java.lang.String str15 = property5.getName();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfWeek" + "'", str15, "dayOfWeek");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.year();
        int int10 = localDateTime6.getMonthOfYear();
        int int11 = localDateTime6.getSecondOfMinute();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 55 + "'", int11 == 55);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2029, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minus(readablePeriod8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime();
        boolean boolean20 = localDateTime18.isBefore((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plusYears((int) (short) -1);
        boolean boolean23 = localDateTime9.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime22.dayOfMonth();
        boolean boolean25 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime2.minus(readablePeriod26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusYears(2020);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.era();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        java.lang.String str8 = property6.getAsShortText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "AD" + "'", str8, "AD");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime();
        boolean boolean14 = localDateTime12.isBefore((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField18 = localDateTime16.getField(0);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.minuteOfHour();
        boolean boolean20 = property2.equals((java.lang.Object) localDateTime16);
        java.util.Locale locale21 = null;
        int int22 = property2.getMaximumShortTextLength(locale21);
        java.util.Locale locale23 = null;
        java.lang.String str24 = property2.getAsShortText(locale23);
        java.util.Locale locale25 = null;
        int int26 = property2.getMaximumShortTextLength(locale25);
        org.joda.time.Interval interval27 = property2.toInterval();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "745" + "'", str24, "745");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertNotNull(interval27);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(1606273113862L, dateTimeZone1);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withCenturyOfEra(0);
        int int15 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        org.joda.time.LocalDateTime.Property property16 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime1.withYearOfEra(1);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.era();
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = property19.setCopy("2020-10-21T02:57:27.606", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2020-10-21T02:57:27.606\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minus(readablePeriod7);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(100L);
        int int11 = localDateTime10.getSecondOfMinute();
        org.joda.time.DateTime dateTime12 = localDateTime10.toDateTime();
        org.joda.time.DateTime dateTime13 = localDateTime8.toDateTime((org.joda.time.ReadableInstant) dateTime12);
        boolean boolean14 = localDateTime5.isAfter((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime19 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = property17.withMinimumValue();
        org.joda.time.Chronology chronology21 = localDateTime20.getChronology();
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime8, chronology21);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 330, chronology21);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 10637811);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.weekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        java.util.Locale locale3 = null;
        int int4 = property2.getMaximumShortTextLength(locale3);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(100L);
        int int6 = localDateTime5.getSecondOfMinute();
        org.joda.time.DateTime dateTime7 = localDateTime5.toDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withFields((org.joda.time.ReadablePartial) localDateTime5);
        java.lang.Class<?> wildcardClass9 = localDateTime8.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime1.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.secondOfMinute();
        int int5 = localDateTime1.getMillisOfDay();
        int int6 = localDateTime1.getEra();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusWeeks(10612590);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.era();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10737170 + "'", int5 == 10737170);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 333 + "'", int9 == 333);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusHours(49);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.minusDays(55);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withDurationAdded(readableDuration10, 846);
        java.lang.Class<?> wildcardClass13 = localDateTime5.getClass();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "57" + "'", str3, "57");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.withPeriodAdded(readablePeriod26, 100);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        int int30 = localDateTime8.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 58 + "'", int16 == 58);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        java.util.Locale locale11 = null;
        int int12 = property5.getMaximumShortTextLength(locale11);
        int int13 = property5.getLeapAmount();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2029, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusDays((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears(17);
        int int7 = localDateTime6.getYear();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1952 + "'", int7 == 1952);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDateTime1.toDateTime(dateTimeZone3);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.plus(readablePeriod5);
        int int7 = localDateTime1.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(19);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withWeekyear(882);
        org.joda.time.Chronology chronology19 = localDateTime18.getChronology();
        int int20 = localDateTime18.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) 100);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMaximumValue();
        boolean boolean11 = property9.isLeap();
        java.util.Locale locale13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property9.setCopy("48", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"48\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        int int7 = localDateTime6.getYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.minuteOfHour();
        int[] intArray9 = localDateTime6.getValues();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusWeeks(665);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2020 + "'", int7 == 2020);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2020, 11, 25, 10738289]");
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(dateTimeZone4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(100L);
        int int12 = localDateTime11.getSecondOfMinute();
        org.joda.time.DateTime dateTime13 = localDateTime11.toDateTime();
        long long14 = property9.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = property9.roundCeilingCopy();
        java.util.Locale locale16 = null;
        java.lang.String str17 = property9.getAsText(locale16);
        org.joda.time.LocalDateTime localDateTime18 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusDays(19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withWeekyear(882);
        org.joda.time.Chronology chronology23 = localDateTime22.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) property2, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11651L + "'", long14 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Sunday" + "'", str17, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withDurationAdded(readableDuration14, 10658000);
        org.joda.time.DateTime dateTime17 = localDateTime16.toDateTime();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfCentury();
        int int9 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.minuteOfHour();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 58 + "'", int9 == 58);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime7.plusWeeks(11);
        org.joda.time.LocalDateTime.Property property16 = localDateTime7.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.Interval interval18 = property16.toInterval();
        java.util.Locale locale19 = null;
        int int20 = property16.getMaximumTextLength(locale19);
        org.joda.time.LocalDateTime localDateTime21 = property16.roundHalfFloorCopy();
        long long22 = property16.remainder();
        java.lang.String str23 = property16.getAsString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 183538801L + "'", long22 == 183538801L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "48" + "'", str23, "48");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 2029, chronology1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfWeek();
        int int4 = property3.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(1606273130618L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1606273130618");
        } catch (java.lang.ArithmeticException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfMonth();
        int int22 = localDateTime19.getMonthOfYear();
        int int23 = localDateTime19.getYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2019 + "'", int23 == 2019);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        int int7 = localDateTime1.getMonthOfYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withYearOfEra(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth(10659667);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10659667 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.plusYears((int) (byte) 10);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minus(readablePeriod11);
        int int13 = localDateTime10.getDayOfWeek();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:58:58 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        java.util.Locale locale12 = null;
        java.lang.String str13 = property5.getAsText(locale12);
        org.joda.time.LocalDateTime localDateTime14 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusDays(19);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMinutes(1);
        int int19 = localDateTime18.getDayOfYear();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Sunday" + "'", str13, "Sunday");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 311 + "'", int19 == 311);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfCentury(2);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.weekOfWeekyear();
        boolean boolean22 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDateTime20);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(832, 108, 874, 14, 719, 665);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 719 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.plusMillis(100);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant14 = null;
        long long15 = property13.getDifferenceAsLong(readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(100L);
        int int24 = localDateTime23.getSecondOfMinute();
        org.joda.time.DateTime dateTime25 = localDateTime23.toDateTime();
        long long26 = property21.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        long long27 = property13.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.DateTime dateTime28 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDateTime.Property property29 = localDateTime10.weekOfWeekyear();
        int int30 = property29.getMinimumValue();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 11651L + "'", long26 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1606273139259L + "'", long27 == 1606273139259L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        boolean boolean9 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusWeeks((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime11.getValue(268);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 268");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfCentury();
        org.joda.time.DurationField durationField9 = property8.getRangeDurationField();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        java.lang.String str4 = property3.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Property[era]" + "'", str4, "Property[era]");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        int int10 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.yearOfEra();
        java.util.Locale locale14 = null;
        java.lang.String str15 = property13.getAsText(locale14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property13.getFieldType();
        org.joda.time.LocalDateTime localDateTime17 = property13.getLocalDateTime();
        java.util.Locale locale18 = null;
        int int19 = property13.getMaximumShortTextLength(locale18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2099" + "'", str15, "2099");
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("46");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property9.withMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(10738845);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        int int17 = property2.getMinimumValue();
        long long18 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime20 = property2.addToCopy(10649589);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(dateTimeZone22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.secondOfMinute();
        int int25 = localDateTime23.getYear();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.year();
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime23.minus(readablePeriod27);
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.centuryOfEra();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.yearOfCentury();
        int int31 = localDateTime28.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime35 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime36 = property34.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime37 = property34.withMinimumValue();
        org.joda.time.Chronology chronology38 = localDateTime37.getChronology();
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(chronology38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime28, chronology38);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime((long) 10612590, chronology38);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime20, chronology38);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273140622L + "'", long16 == 1606273140622L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2020 + "'", int25 == 2020);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
// flaky:         org.junit.Assert.assertTrue("'" + int31 + "' != '" + 59 + "'", int31 == 59);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMinuteOfHour(9);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plus(readablePeriod13);
        int int15 = localDateTime14.getDayOfWeek();
        int int16 = localDateTime14.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:59:00 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withWeekyear((int) (short) 10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.weekOfWeekyear();
        java.lang.String str14 = property13.toString();
        org.joda.time.Interval interval15 = property13.toInterval();
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:59:01 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Property[weekOfWeekyear]" + "'", str14, "Property[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[secondOfMinute]\"");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        int int9 = localDateTime4.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withYearOfEra((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDateTime11.getField(665);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 665");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:59:01 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 221 + "'", int9 == 221);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime17.withCenturyOfEra(0);
        int int23 = localDateTime17.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.withCenturyOfEra(0);
        int int31 = localDateTime17.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime34.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(dateTimeZone40);
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime41.withCenturyOfEra(0);
        int int47 = localDateTime41.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(dateTimeZone48);
        org.joda.time.LocalDateTime.Property property50 = localDateTime49.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime52 = localDateTime49.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime49.withCenturyOfEra(0);
        int int55 = localDateTime41.compareTo((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime39.withFields((org.joda.time.ReadablePartial) localDateTime49);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.withWeekyear((int) '#');
        boolean boolean59 = localDateTime32.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        int int60 = localDateTime56.getDayOfMonth();
        boolean boolean61 = localDateTime1.isBefore((org.joda.time.ReadablePartial) localDateTime56);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 59 + "'", int47 == 59);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(localDateTime52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 25 + "'", int60 == 25);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        int int2 = localDateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime3 = localDateTime1.toDateTime();
        java.util.Date date4 = localDateTime1.toDate();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusHours(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime();
        boolean boolean17 = localDateTime15.isBefore((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime15.plusYears((int) (short) -1);
        boolean boolean20 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDateTime19);
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.dayOfMonth();
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = property22.addToCopy(1606273080638L);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("62");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 62 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusDays(10705601);
        int int12 = localDateTime9.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusYears(0);
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withFieldAdded(durationFieldType7, 987);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        java.util.Locale locale15 = null;
        int int16 = property13.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime17 = property13.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property13.getFieldType();
        org.joda.time.LocalDateTime.Property property19 = localDateTime8.property(dateTimeFieldType18);
        java.lang.String str20 = property19.getAsString();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:59:02 UTC 2029");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "165" + "'", str20, "165");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYearOfEra(3);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property7 = localDateTime3.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withEra(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime4 = property2.getLocalDateTime();
        int int5 = property2.getMinimumValue();
        int int6 = property2.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfEvenCopy();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withDurationAdded(readableDuration8, (-1));
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 59 + "'", int6 == 59);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        java.util.Locale locale15 = null;
        int int16 = property13.getMaximumTextLength(locale15);
        org.joda.time.LocalDateTime localDateTime17 = property13.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property13.getFieldType();
        org.joda.time.LocalDateTime.Property property19 = localDateTime8.property(dateTimeFieldType18);
        org.joda.time.DurationFieldType durationFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime8.withFieldAdded(durationFieldType20, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Sun Mar 25 02:59:02 UTC 2029");
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.era();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(100L);
        int int14 = localDateTime13.getSecondOfMinute();
        org.joda.time.DateTime dateTime15 = localDateTime13.toDateTime();
        long long16 = property11.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.LocalDateTime localDateTime17 = property11.roundCeilingCopy();
        java.util.Date date18 = localDateTime17.toDate();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromDateFields(date18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant23 = null;
        long long24 = property22.getDifferenceAsLong(readableInstant23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime26.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(100L);
        int int33 = localDateTime32.getSecondOfMinute();
        org.joda.time.DateTime dateTime34 = localDateTime32.toDateTime();
        long long35 = property30.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        long long36 = property22.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = property22.getFieldType();
        boolean boolean38 = localDateTime19.isSupported(dateTimeFieldType37);
        int int39 = localDateTime1.get(dateTimeFieldType37);
        org.joda.time.LocalDateTime.Property property40 = localDateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime42 = localDateTime1.withDayOfWeek(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 11651L + "'", long16 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(date18);
        org.junit.Assert.assertEquals(date18.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 11651L + "'", long35 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1606273142338L + "'", long36 == 1606273142338L);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 437 + "'", int39 == 437);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        long long4 = property2.getDifferenceAsLong(readableInstant3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(100L);
        int int13 = localDateTime12.getSecondOfMinute();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        long long15 = property10.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        long long16 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.LocalDateTime localDateTime17 = property2.roundHalfFloorCopy();
        int int18 = property2.getLeapAmount();
        int int19 = property2.getMaximumValueOverall();
        org.joda.time.DurationField durationField20 = property2.getRangeDurationField();
        java.lang.String str21 = property2.getAsString();
        java.util.Locale locale22 = null;
        java.lang.String str23 = property2.getAsText(locale22);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 11651L + "'", long15 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1606273142482L + "'", long16 == 1606273142482L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 999 + "'", int19 == 999);
        org.junit.Assert.assertNotNull(durationField20);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "582" + "'", str21, "582");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "582" + "'", str23, "582");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("39", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfEra((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withCenturyOfEra(0);
        int int16 = localDateTime10.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withCenturyOfEra(0);
        int int24 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime.Property property25 = localDateTime10.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime10.withPeriodAdded(readablePeriod26, 100);
        int int29 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime.Property property31 = localDateTime8.era();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime40 = localDateTime33.withMillisOfDay((int) (short) 100);
        java.util.Date date41 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.minusSeconds((int) (byte) 1);
        int int44 = localDateTime40.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDateTime localDateTime46 = new org.joda.time.LocalDateTime(dateTimeZone45);
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime49 = localDateTime46.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.DateTime dateTime53 = localDateTime51.toDateTime();
        org.joda.time.DateTime dateTime54 = localDateTime40.toDateTime((org.joda.time.ReadableInstant) dateTime53);
        int int55 = property31.compareTo((org.joda.time.ReadableInstant) dateTime53);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 59 + "'", int16 == 59);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(10728678, 583, 665, 10690810, 919, 6, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10690810 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minusHours((int) (byte) 10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.secondOfMinute();
        org.joda.time.DurationField durationField10 = property9.getDurationField();
        java.util.Locale locale11 = null;
        java.lang.String str12 = property9.getAsText(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationField10);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2" + "'", str12, "2");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withSecondOfMinute(20);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDurationAdded(readableDuration10, 1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant16 = null;
        int int17 = property15.getDifference(readableInstant16);
        long long18 = property15.remainder();
        org.joda.time.LocalDateTime localDateTime19 = property15.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusMonths(100);
        java.util.Date date22 = localDateTime21.toDate();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromDateFields(date22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.minuteOfHour();
        boolean boolean25 = localDateTime12.isAfter((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(100L);
        int int34 = localDateTime33.getSecondOfMinute();
        org.joda.time.DateTime dateTime35 = localDateTime33.toDateTime();
        long long36 = property31.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.LocalDateTime localDateTime38 = property31.addWrapFieldToCopy((int) (byte) -1);
        int[] intArray39 = localDateTime38.getValues();
        boolean boolean40 = localDateTime12.isAfter((org.joda.time.ReadablePartial) localDateTime38);
        int int41 = localDateTime38.getEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Sun Mar 25 02:59:02 UTC 2029");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 11651L + "'", long36 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(intArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[2001, 11, 24, 10742974]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.plusDays((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime16.plusMinutes(582);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime0.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.plus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime0.withDayOfYear(10666832);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10666832 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        java.util.Date date9 = localDateTime8.toDate();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readableDuration11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusDays(56);
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfCeilingCopy();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Wed Nov 25 00:00:00 UTC 2020");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property12 = localDateTime6.yearOfEra();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime6.withMillisOfSecond(478);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readablePeriod6);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(100L);
        int int10 = localDateTime9.getSecondOfMinute();
        org.joda.time.DateTime dateTime11 = localDateTime9.toDateTime();
        org.joda.time.DateTime dateTime12 = localDateTime7.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = null;
        java.lang.String str15 = localDateTime4.toString(dateTimeFormatter14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime4.plusWeeks(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusHours(14);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minus(readableDuration20);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2020-11-25T03:03:39.580" + "'", str15, "2020-11-25T03:03:39.580");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minus(readablePeriod1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.plusSeconds(276);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withMinuteOfHour(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '#');
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfSecond(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfYear(882);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 882 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withWeekOfWeekyear(48);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.minusDays(2029);
        org.joda.time.LocalDateTime.Property property10 = localDateTime5.dayOfWeek();
        java.util.Locale locale11 = null;
        int int12 = property10.getMaximumTextLength(locale11);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 665, dateTimeZone1);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        int int3 = localDateTime1.getYear();
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.year();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minus(readablePeriod5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.centuryOfEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.yearOfCentury();
        int int9 = localDateTime6.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime15 = property12.withMinimumValue();
        org.joda.time.Chronology chronology16 = localDateTime15.getChronology();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime6, chronology16);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now(chronology16);
        int int20 = localDateTime19.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2020 + "'", int3 == 2020);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 59 + "'", int9 == 59);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 756 + "'", int20 == 756);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant3 = null;
        int int4 = property2.getDifference(readableInstant3);
        long long5 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths(100);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        boolean boolean10 = localDateTime6.isSupported(durationFieldType9);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withWeekOfWeekyear(738);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 738 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withCenturyOfEra(0);
        int int14 = localDateTime8.getMinuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.withCenturyOfEra(0);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime6.withFields((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime16.plusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDateTime25.getField(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 48");
        } catch (java.lang.IndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 59 + "'", int14 == 59);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2");
        org.joda.time.DateTimeField[] dateTimeFieldArray2 = localDateTime1.getFields();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYear(846);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(100L);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.DateTime dateTime10 = localDateTime8.toDateTime();
        java.util.Date date11 = localDateTime8.toDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.withCenturyOfEra((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDateTime18.getFieldType(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime8.withField(dateTimeFieldType20, 7);
        int int23 = localDateTime6.get(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldArray2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 846 + "'", int23 == 846);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.DateTimeField dateTimeField12 = localDateTime10.getField(0);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusWeeks(10688833);
        int int16 = localDateTime10.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundHalfFloorCopy();
        org.joda.time.DurationField durationField21 = property19.getDurationField();
        org.joda.time.LocalDateTime localDateTime22 = property19.getLocalDateTime();
        org.joda.time.DurationField durationField23 = property19.getRangeDurationField();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = property19.getFieldType();
        int int25 = localDateTime10.indexOf(dateTimeFieldType24);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withYearOfCentury(1);
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.minus(readablePeriod31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime27.plusWeeks(330);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime10.withFields((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = localDateTime35.isSupported(dateTimeFieldType36);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2020 + "'", int16 == 2020);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMillis(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.minusHours(999);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusYears((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withDayOfYear((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay(10659386);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.secondOfMinute();
        java.lang.String str17 = property16.getAsString();
        java.util.Locale locale18 = null;
        java.lang.String str19 = property16.getAsShortText(locale18);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "39" + "'", str17, "39");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "39" + "'", str19, "39");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        java.lang.String str3 = property2.getAsString();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.LocalDateTime localDateTime5 = property2.roundFloorCopy();
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.dayOfMonth();
        int int7 = localDateTime5.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withCenturyOfEra((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks(10659667);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withWeekyear(694);
        java.lang.String str14 = localDateTime9.toString();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 48 + "'", int7 == 48);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1020-11-25T02:59:04.000" + "'", str14, "1020-11-25T02:59:04.000");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(100L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withDurationAdded(readableDuration2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMinuteOfHour(10688833);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10688833 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(100L);
        int int8 = localDateTime7.getSecondOfMinute();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        long long10 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.LocalDateTime localDateTime11 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime12 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusYears(0);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withYear(582);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(dateTimeZone17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime18.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusYears(48);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((long) 'a');
        boolean boolean28 = localDateTime25.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime();
        boolean boolean37 = localDateTime35.isBefore((org.joda.time.ReadablePartial) localDateTime36);
        org.joda.time.DateTime dateTime38 = localDateTime35.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(dateTimeZone39);
        org.joda.time.LocalDateTime.Property property41 = localDateTime40.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime40.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime40.withMillisOfDay((int) (short) 100);
        int int48 = localDateTime47.getSecondOfMinute();
        int int49 = localDateTime47.getCenturyOfEra();
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.LocalDateTime localDateTime51 = localDateTime47.minus(readablePeriod50);
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.LocalDateTime localDateTime53 = new org.joda.time.LocalDateTime(dateTimeZone52);
        org.joda.time.LocalDateTime.Property property54 = localDateTime53.millisOfSecond();
        org.joda.time.ReadableInstant readableInstant55 = null;
        long long56 = property54.getDifferenceAsLong(readableInstant55);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.LocalDateTime localDateTime58 = new org.joda.time.LocalDateTime(dateTimeZone57);
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property62 = localDateTime61.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(100L);
        int int65 = localDateTime64.getSecondOfMinute();
        org.joda.time.DateTime dateTime66 = localDateTime64.toDateTime();
        long long67 = property62.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        long long68 = property54.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.DateTimeFieldType dateTimeFieldType69 = property54.getFieldType();
        org.joda.time.LocalDateTime localDateTime71 = localDateTime51.withField(dateTimeFieldType69, 48);
        org.joda.time.LocalDateTime localDateTime73 = localDateTime35.withField(dateTimeFieldType69, 49);
        int int74 = localDateTime25.get(dateTimeFieldType69);
        org.joda.time.LocalDateTime.Property property75 = localDateTime16.property(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11651L + "'", long10 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 20 + "'", int49 == 20);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 0L + "'", long56 == 0L);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + long67 + "' != '" + 11651L + "'", long67 == 11651L);
// flaky:         org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1606273144353L + "'", long68 == 1606273144353L);
        org.junit.Assert.assertNotNull(dateTimeFieldType69);
        org.junit.Assert.assertNotNull(localDateTime71);
        org.junit.Assert.assertNotNull(localDateTime73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 453 + "'", int74 == 453);
        org.junit.Assert.assertNotNull(property75);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(0);
        int int7 = localDateTime1.getMinuteOfHour();
        int int8 = localDateTime1.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withDayOfYear(100);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plus(readablePeriod11);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        java.util.Date date15 = localDateTime14.toDate();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        int int21 = localDateTime14.compareTo((org.joda.time.ReadablePartial) localDateTime17);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.withMonthOfYear((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withMinuteOfHour(9);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plus(readablePeriod26);
        boolean boolean28 = localDateTime10.isEqual((org.joda.time.ReadablePartial) localDateTime27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(100L);
        int int37 = localDateTime36.getSecondOfMinute();
        org.joda.time.DateTime dateTime38 = localDateTime36.toDateTime();
        long long39 = property34.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime38);
        org.joda.time.LocalDateTime localDateTime40 = property34.roundCeilingCopy();
        java.util.Date date41 = localDateTime40.toDate();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.fromDateFields(date41);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withYearOfEra(3);
        org.joda.time.LocalDateTime.Property property47 = localDateTime44.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime49 = property47.addToCopy((long) 0);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(dateTimeZone50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime53 = property52.roundCeilingCopy();
        java.util.Locale locale54 = null;
        int int55 = property52.getMaximumTextLength(locale54);
        org.joda.time.LocalDateTime localDateTime56 = property52.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = property52.getFieldType();
        int int58 = localDateTime49.get(dateTimeFieldType57);
        int int59 = localDateTime42.indexOf(dateTimeFieldType57);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime10.withField(dateTimeFieldType57, 453);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 59 + "'", int7 == 59);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 20 + "'", int8 == 20);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date15);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Nov 25 02:59:04 UTC 2020");
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 11651L + "'", long39 == 11651L);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(date41);
        org.junit.Assert.assertEquals(date41.toString(), "Mon Nov 26 00:00:00 UTC 2001");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 3 + "'", int55 == 3);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
// flaky:         org.junit.Assert.assertTrue("'" + int58 + "' != '" + 738 + "'", int58 == 738);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(localDateTime61);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (byte) 100, 10671382, 108, 52, 502, 10637811);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        int int11 = localDateTime1.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDurationAdded(readableDuration12, (int) 'a');
        int int15 = localDateTime14.getCenturyOfEra();
        int int16 = localDateTime14.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime14.withFieldAdded(durationFieldType18, 539);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:59:04 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(48);
        int int9 = localDateTime8.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.util.Date date2 = localDateTime1.toDate();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withMonthOfYear((int) (short) 1);
        int int11 = localDateTime1.getHourOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime1.withDurationAdded(readableDuration12, (int) 'a');
        int int15 = localDateTime14.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withMillisOfSecond(10698240);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10698240 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Nov 25 02:59:05 UTC 2020");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 20 + "'", int15 == 20);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundHalfFloorCopy();
        org.joda.time.DurationField durationField4 = property2.getDurationField();
        org.joda.time.DateTimeField dateTimeField5 = property2.getField();
        int int6 = property2.get();
        long long7 = property2.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 105L + "'", long7 == 105L);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withMillisOfDay((int) (short) 100);
        int int9 = localDateTime8.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.minus(readablePeriod10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusDays((int) (byte) 10);
        int int14 = localDateTime13.getYearOfCentury();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 20 + "'", int14 == 20);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        int int12 = localDateTime10.getHourOfDay();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        boolean boolean8 = localDateTime6.isBefore((org.joda.time.ReadablePartial) localDateTime7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMonths(11);
        int int11 = localDateTime6.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime6.withYearOfEra(999);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withYearOfCentury(1);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime15.withFields((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.minusMonths(10673096);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2020 + "'", int11 == 2020);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime3 = property2.roundCeilingCopy();
        int int4 = localDateTime3.getYear();
        int int5 = localDateTime3.getEra();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withYearOfCentury(1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDayOfYear((int) 'a');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfSecond();
        org.joda.time.DateTime dateTime14 = localDateTime12.toDateTime();
        boolean boolean15 = localDateTime3.isEqual((org.joda.time.ReadablePartial) localDateTime12);
        int int16 = localDateTime3.getMillisOfSecond();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2020 + "'", int4 == 2020);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 508 + "'", int16 == 508);
    }
}
