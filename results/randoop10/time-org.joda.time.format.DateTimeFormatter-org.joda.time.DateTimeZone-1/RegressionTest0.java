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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, (int) (short) -1, (int) (byte) 1, (int) '#', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) -1, (int) 'a', (int) 'a', (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) 100, (int) '4', (int) (byte) 100, (int) (short) -1, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((java.lang.Object) (byte) 0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, (int) (byte) 100, 0, (int) '4', (int) (short) -1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDate((int) (byte) -1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Locale.Category category0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale1 = java.util.Locale.getDefault(category0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDate((int) (short) 1, 9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime((int) (short) 100, (-1), 6, (int) 'a', (int) (byte) 100, 6, 10, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572329598L + "'", long21 == 1644572329598L);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime0.compareTo((org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate2.compareTo((org.joda.time.ReadablePartial) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfMonth(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField7 = localDateTime3.getField((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        java.util.Locale locale3 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDateTime1.toString("2022-02-11T09:38:49.281Z", locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_US");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (byte) 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) 'a', 2022, (int) (short) 10, (int) (short) 10, (int) (short) 10, (int) (byte) -1, (int) 'a', dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) 'a', 0, 1, 6, 42, 2, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfMonth(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDate(12, 4, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getYearOfEra();
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet9 = locale8.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime4.toString("2022-02-11T09:38:49.811Z", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        java.lang.String str19 = dateTime15.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime15.withField(dateTimeFieldType20, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-02-11T09:48:50.668Z" + "'", str19, "2022-02-11T09:48:50.668Z");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
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
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime6.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(48, (int) ' ', (int) (byte) 100, (int) (short) 0, 0, (int) (byte) 10, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        boolean boolean16 = dateTime14.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime18 = dateTime14.minusMinutes((int) (short) 10);
        long long19 = dateTime18.getMillis();
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((int) (byte) 10, (int) (short) 100, 2, (int) '#', (int) (byte) 0, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1644572331050L + "'", long19 == 1644572331050L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 6, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime15.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(20, 100, 2022, 12, (int) (short) 1, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.Throwable throwable1 = null;
        java.io.IOException iOException2 = new java.io.IOException("2022-02-11T09:38:49.281Z", throwable1);
        java.lang.String str3 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "java.io.IOException: 2022-02-11T09:38:49.281Z" + "'", str3, "java.io.IOException: 2022-02-11T09:38:49.281Z");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        int int5 = localDate4.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate4.withMonthOfYear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        int int7 = localDate6.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) int7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int5 = property2.getMaximumValueOverall();
        long long6 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundCeilingCopy();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusSeconds((int) (byte) -1);
        boolean boolean17 = localDateTime9.isEqual((org.joda.time.ReadablePartial) localDateTime14);
        boolean boolean18 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 899331530L + "'", long6 == 899331530L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology5);
        org.joda.time.LocalTime localTime8 = localTime6.minusHours((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property2.compareTo((org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:38:49.281Z", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:38:49.281z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572331580L + "'", long14 == 1644572331580L);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.monthOfYear();
        org.joda.time.LocalDateTime localDateTime25 = property23.addWrapFieldToCopy((int) (short) 100);
        int int26 = localDateTime25.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = localDateTime25.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.set(dateTimeFieldType28, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572331697L + "'", long14 == 1644572331697L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:48:51.698Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:48:51.698Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:48:51.698Z");
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.DurationFieldType durationFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.add(durationFieldType18, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = null;
        org.joda.time.format.DateTimeParser dateTimeParser5 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter4, dateTimeParser5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime3.toString(dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int5 = property2.getMaximumValueOverall();
        long long6 = property2.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property2.setCopy("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[UTC]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 899331958L + "'", long6 == 899331958L);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = property17.set((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter9.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localTime4.toString(dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Locale locale1 = java.util.Locale.US;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en_US" + "'", str3, "en_US");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        int int11 = dateTimeZone7.getOffset((long) (byte) -1);
        int int13 = dateTimeZone7.getStandardOffset((long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100, 0, 20, (int) (short) 1, (int) '4', dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withField(dateTimeFieldType2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withMonthOfYear(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate5.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((int) (short) 0, (-1), 2022, (int) '#', (int) (short) 10, (int) '#', (int) (short) 1, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572332565L + "'", long21 == 1644572332565L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfDay(10);
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = localDate11.toDateMidnight();
        java.lang.String str13 = localDate11.toString();
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology14.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((java.lang.Object) 10, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-11" + "'", str13, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(48, 0, (int) ' ', 6, (int) (byte) -1, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(0, 2022, (-1), (int) '#', (int) (byte) 1, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate2.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime12.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("java.io.IOException: 2022-02-11T09:38:49.281Z", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException: 2022-02-11T09:38:49.281Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "zh_TW");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withMonthOfYear(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property16.setCopy((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572333350L + "'", long14 == 1644572333350L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:38:53.350Z" + "'", str15, "2022-02-11T09:38:53.350Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        org.joda.time.DateTime dateTime23 = localDateTime15.toDateTime(dateTimeZone20);
        boolean boolean25 = dateTime23.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime27 = dateTime23.minusMinutes((int) (short) 10);
        long long28 = dateTime27.getMillis();
        org.joda.time.Chronology chronology29 = dateTime27.getChronology();
        org.joda.time.DateTime dateTime31 = dateTime27.plusHours((int) (short) 10);
        java.lang.Object obj32 = null;
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone34);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(obj32, dateTimeZone34);
        int int38 = dateTimeZone34.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime39 = dateTime27.toDateTime(dateTimeZone34);
        java.util.Locale locale41 = java.util.Locale.TAIWAN;
        java.lang.String str42 = locale41.getDisplayScript();
        java.lang.String str43 = dateTimeZone34.getName(0L, locale41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = property12.setCopy("2022-02-11T09:38:49.811Z", locale41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:49.811Z\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTime27);
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1644572333407L + "'", long28 == 1644572333407L);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "+00:00" + "'", str43, "+00:00");
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        boolean boolean15 = dateTime13.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes((int) (short) 10);
        long long18 = dateTime17.getMillis();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572333462L + "'", long18 == 1644572333462L);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = dateTimeFormatter4.parseMillis("en");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("2022-02-11", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        java.lang.String str2 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField3, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GJMonthOfYearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter4.print(1644572329337L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter2.parseLocalDate("en");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.lang.String str3 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Coordinated Universal Time" + "'", str3, "Coordinated Universal Time");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDateTime1.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("February", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(false, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        int int17 = mutableDateTime2.getMinuteOfHour();
        org.joda.time.ReadableInstant readableInstant18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = mutableDateTime2.compareTo(readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime2.withHourOfDay(35331916);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35331916 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addWrapFieldToCopy((int) (short) 100);
        int int23 = localDateTime22.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.set(dateTimeFieldType25, 42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        mutableDateTime17.addWeekyears((int) (byte) 1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1644572334930L + "'", long15 == 1644572334930L);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:38:54.738Z", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) (byte) 100, 12, (int) (short) 1, (int) ' ', 0, (int) (short) -1, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyear();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = mutableDateTime19.toDateTime(chronology36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = dateTime41.withTime((int) (short) -1, (int) (short) 10, 2022, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572335182L + "'", long14 == 1644572335182L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:48:55.182Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:48:55.182Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:48:55.182Z");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572335182L + "'", long35 == 1644572335182L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.DateTime dateTime19 = dateTime17.withWeekyear((int) (short) 100);
        int int20 = dateTime17.getYear();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        org.joda.time.DateTime.Property property31 = dateTime30.minuteOfHour();
        boolean boolean32 = dateTime17.equals((java.lang.Object) property31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTime17.toString("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: oo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572335217L + "'", long14 == 1644572335217L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Locale locale2 = java.util.Locale.US;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.getLanguage();
        java.lang.String str6 = locale2.getExtension('a');
        java.lang.String str7 = timeZone0.getDisplayName(locale2);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Coordinated Universal Time" + "'", str7, "Coordinated Universal Time");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
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
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setTime(48, (int) (short) 10, (int) 'a', 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572335362L + "'", long20 == 1644572335362L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMinutes(48);
        org.joda.time.LocalTime localTime12 = localTime4.plusHours(55);
        org.joda.time.DurationFieldType durationFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime4.withFieldAdded(durationFieldType13, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime8.toString("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(2022, 0, 100, (int) '4', (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withWeekOfWeekyear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = dateTimeFormatter4.parseLocalDateTime("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Locale locale0 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("2022-02-11T09:38:54.850Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-11T09:38:54.850Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(22, (int) (byte) 0, (int) (byte) 0, (int) 'a', 35331916, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalTime localTime2 = localTime0.plus(readablePeriod1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
        org.joda.time.LocalDateTime localDateTime9 = property7.addWrapFieldToCopy((int) (short) 100);
        int int10 = localDateTime9.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType((int) (short) 1);
        int int13 = localDateTime4.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime2.get(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property7.setCopy("fra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fra\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = org.joda.time.MutableDateTime.parse("+00:00", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572336772L + "'", long14 == 1644572336772L);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        long long22 = chronology15.getDateTimeMillis((int) (short) 0, 4, 9, 42);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology15.getDateTimeMillis(35331916, 1, 100, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572336784L + "'", long14 == 1644572336784L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-62158665599958L) + "'", long22 == (-62158665599958L));
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj7 = null;
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj7, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = localDateTime4.toDateTime(dateTimeZone9);
        boolean boolean14 = dateTime12.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime16 = dateTime12.minusMinutes((int) (short) 10);
        long long17 = dateTime16.getMillis();
        org.joda.time.Chronology chronology18 = dateTime16.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime16.plusHours((int) (short) 10);
        java.lang.Object obj21 = null;
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj21, dateTimeZone23);
        int int27 = dateTimeZone23.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime28 = dateTime16.toDateTime(dateTimeZone23);
        java.util.Locale locale30 = java.util.Locale.TAIWAN;
        java.lang.String str31 = locale30.getDisplayScript();
        java.lang.String str32 = dateTimeZone23.getName(0L, locale30);
        int int33 = property2.getMaximumTextLength(locale30);
        boolean boolean35 = locale30.equals((java.lang.Object) 2022);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1644572336795L + "'", long17 == 1644572336795L);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.halfdayOfDay();
        long long29 = chronology22.getDateTimeMillis((int) (short) 0, 4, 9, 42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(22, (int) (short) 10, 48, (int) '4', 52, (int) (short) 10, 0, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572336821L + "'", long21 == 1644572336821L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-62158665599958L) + "'", long29 == (-62158665599958L));
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-11T09:38:54.850Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:54.850Z\" is malformed at \"T09:38:54.850Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, (int) (byte) 10);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(chronology25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj29 = null;
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(obj29, dateTimeZone31);
        org.joda.time.DateTime dateTime34 = localDateTime26.toDateTime(dateTimeZone31);
        boolean boolean36 = dateTime34.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property37 = dateTime34.secondOfDay();
        int int38 = dateTime13.compareTo((org.joda.time.ReadableInstant) dateTime34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = dateTime13.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572336933L + "'", long14 == 1644572336933L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean3 = charSet1.equals((java.lang.Object) localTime2);
        java.util.Locale locale4 = java.util.Locale.US;
        java.util.Locale locale5 = java.util.Locale.US;
        java.lang.String str6 = locale4.getDisplayVariant(locale5);
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        java.util.Locale locale10 = java.util.Locale.TAIWAN;
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray12 = new java.util.Locale[] { locale4, locale8, locale10, locale11 };
        java.util.ArrayList<java.util.Locale> localeList13 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList13, localeArray12);
        boolean boolean15 = charSet1.containsAll((java.util.Collection<java.util.Locale>) localeList13);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = charSet1.add((java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        mutableDateTime2.setTime(1644572332357L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572337004L + "'", long20 == 1644572337004L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone4);
        java.lang.StringBuffer stringBuffer10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = localDate13.toDateMidnight();
        java.lang.String str15 = localDate13.toString();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer10, (org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572334850L + "'", long8 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11" + "'", str15, "2022-02-11");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyear();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = mutableDateTime19.toDateTime(chronology36);
        mutableDateTime19.addHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setTime(1, 1, 20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572337266L + "'", long14 == 1644572337266L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:48:57.266Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:48:57.266Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:48:57.266Z");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572337266L + "'", long35 == 1644572337266L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        java.lang.Object obj2 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property9.addWrapFieldToCopy((int) (short) 100);
        int int12 = localDateTime11.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property15 = localTime4.property(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(10, 0, 52, (int) (short) -1, (int) (short) 10, 2022, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("2089-04-16T10:54:54.551Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localTime10.getFieldType(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime3.toString("1980-01-01T00:00:00.100Z", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:38:56.018Z", (double) 1644572337431L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.644572337431E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology15);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours((int) '#');
        org.joda.time.LocalTime localTime20 = localTime18.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime21 = localTime13.withFields((org.joda.time.ReadablePartial) localTime20);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDate10.compareTo((org.joda.time.ReadablePartial) localTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        mutableDateTime19.add(1644572332644L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, (int) (byte) 10);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(chronology30);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime31.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj34 = null;
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone36);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(obj34, dateTimeZone36);
        org.joda.time.DateTime dateTime39 = localDateTime31.toDateTime(dateTimeZone36);
        mutableDateTime26.setDate((org.joda.time.ReadableInstant) dateTime39);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = null;
        boolean boolean42 = mutableDateTime26.isSupported(dateTimeFieldType41);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime26.weekOfWeekyear();
        mutableDateTime19.setDate((org.joda.time.ReadableInstant) mutableDateTime26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime26.setHourOfDay(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572338069L + "'", long14 == 1644572338069L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:48:58.069Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:48:58.069Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:48:58.069Z");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        mutableDateTime9.add(readableDuration10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer6, (org.joda.time.ReadableInstant) mutableDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11", (double) 1644572334440L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.64457233444E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 0, 6, 58, (int) (byte) -1, 52, 40, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        int int12 = dateTime9.getMonthOfYear();
        org.joda.time.DateTime.Property property13 = dateTime9.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property13.setCopy("2022-02-11T09:38:58.172Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:58.172Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        java.util.Locale locale34 = null;
        java.util.Calendar calendar35 = mutableDateTime2.toCalendar(locale34);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime2.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime38 = property36.set("2022-02-11T09:38:49.811Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:49.811Z\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572338283L + "'", long20 == 1644572338283L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(calendar35);
        org.junit.Assert.assertEquals(calendar35.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.monthOfYear();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.year();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withYearOfEra(49);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime9.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter3.parseLocalTime("2");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj37 = null;
        java.util.TimeZone timeZone38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forTimeZone(timeZone38);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone39);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(obj37, dateTimeZone39);
        org.joda.time.DateTime dateTime42 = localDateTime34.toDateTime(dateTimeZone39);
        boolean boolean44 = dateTime42.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime46 = dateTime42.minusMinutes((int) (short) 10);
        long long47 = dateTime46.getMillis();
        org.joda.time.Chronology chronology48 = dateTime46.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.era();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.halfdayOfDay();
        int int51 = mutableDateTime2.get(dateTimeField50);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        boolean boolean54 = dateTimeZone53.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((java.lang.Object) int51, dateTimeZone53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572338409L + "'", long20 == 1644572338409L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTime46);
// flaky:         org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1644572338409L + "'", long47 == 1644572338409L);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.era();
        org.joda.time.LocalDate localDate5 = localDate2.withDayOfWeek(3);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2089-04-16T10:54:54.551Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2089-04-16T10:54:54.551Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean4 = dateTimeZone1.equals((java.lang.Object) "2022-02-11T09:38:50.385Z");
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.now(dateTimeZone1);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime12 = property10.addWrapFieldToCopy((int) (short) 100);
        int int13 = localDateTime12.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType((int) (short) 1);
        int int16 = localDateTime7.get(dateTimeFieldType15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property17 = localTime5.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-11T09:38:54.440Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:38:54.440z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((java.lang.Object) durationField18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572338858L + "'", long14 == 1644572338858L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int3 = timeZone0.getOffset(1644572333371L);
        boolean boolean4 = timeZone0.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) timeZone0, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        java.util.Locale locale36 = java.util.Locale.US;
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = locale36.getDisplayVariant(locale37);
        java.lang.String str39 = locale37.getLanguage();
        java.lang.String str41 = locale37.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = property33.set("Etc/UTC", locale37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572338945L + "'", long20 == 1644572338945L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone5);
        long long9 = dateTimeZone5.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone5);
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.parse("Property[minuteOfDay]", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572334850L + "'", long9 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.roundCeiling();
        java.lang.String str36 = property33.toString();
        java.util.Locale locale38 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime39 = property33.set("2022-02-11T09:48:50.448Z", locale38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:48:50.448Z\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572339192L + "'", long20 == 1644572339192L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Property[minuteOfDay]" + "'", str36, "Property[minuteOfDay]");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3);
        mutableDateTime2.setMillis(1644572333244L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = mutableDateTime2.toString("2089-04-16T10:54:57.492Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        int int15 = dateTime13.getSecondOfMinute();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDateTime17.toDateTime(dateTimeZone22);
        boolean boolean27 = dateTime25.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime29 = dateTime25.minusMinutes((int) (short) 10);
        long long30 = dateTime29.getMillis();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DurationField durationField32 = chronology31.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate((java.lang.Object) int15, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572339276L + "'", long14 == 1644572339276L);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1644572339277L + "'", long30 == 1644572339277L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(durationField32);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DurationField durationField5 = property2.getDurationField();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTime.Property property17 = dateTime16.minuteOfHour();
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        java.util.Locale locale19 = java.util.Locale.getDefault();
        int int20 = property17.getMaximumShortTextLength(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = property2.setCopy("2022-02-11", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("Property[minuteOfDay]", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isPrinter();
        java.lang.Appendable appendable5 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology7);
        org.joda.time.LocalTime localTime10 = localTime8.minusHours((int) '#');
        org.joda.time.LocalTime localTime12 = localTime8.plusMillis(52);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable5, (org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId3 = timeZone2.toZoneId();
        int int5 = timeZone2.getOffset(1644572333371L);
        boolean boolean6 = timeZone2.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) locale0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime8 = property6.addWrapFieldToCopy((int) (short) 100);
        int int9 = localDateTime8.size();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime3.compareTo((org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        int int5 = dateTimeFormatter4.getDefaultYear();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.monthOfYear();
        org.joda.time.LocalDateTime localDateTime14 = property13.getLocalDateTime();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime localDateTime19 = property17.addWrapFieldToCopy((int) (short) 100);
        int int20 = localDateTime19.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property23 = localDateTime14.property(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2000 + "'", int5 == 2000);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 2022);
        org.joda.time.LocalDateTime localDateTime3 = localDate0.toLocalDateTime(localTime2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology6);
        org.joda.time.LocalTime localTime9 = localTime7.minusHours((int) '#');
        org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour(0);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = locale12.getISO3Language();
        boolean boolean14 = localTime11.equals((java.lang.Object) locale12);
        java.util.Locale.setDefault(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localTime2.toString("2022-02-11T09:38:57.848Z", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "fra" + "'", str13, "fra");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj7 = null;
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj7, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = localDateTime4.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime12.minuteOfHour();
        java.util.Date date14 = dateTime12.toDate();
        boolean boolean15 = timeZone0.inDaylightTime(date14);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Fri Feb 11 09:48:59 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-11T09:38:49.281Z");
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        java.lang.Appendable appendable5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.DateTime dateTime22 = dateTime19.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime24 = dateTime22.withMillisOfSecond(10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable5, (org.joda.time.ReadableInstant) dateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572340071L + "'", long20 == 1644572340071L);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillisOfSecond(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime18.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340088L + "'", long14 == 1644572340088L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        int int15 = dateTime13.getSecondOfMinute();
        int int16 = dateTime13.getEra();
        org.joda.time.DateTime.Property property17 = dateTime13.secondOfDay();
        java.lang.String str18 = property17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property17.setCopy("2022-02-11T09:38:59.346Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:59.346Z\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340100L + "'", long14 == 1644572340100L);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Property[secondOfDay]" + "'", str18, "Property[secondOfDay]");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime18 = dateTime16.plusYears(20);
        java.util.Locale locale20 = java.util.Locale.getDefault();
        java.lang.String str21 = locale20.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTime16.toString("2022-02-11T09:38:59.502Z", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340126L + "'", long14 == 1644572340126L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        boolean boolean3 = timeZone0.observesDaylightTime();
        boolean boolean4 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.Object obj7 = null;
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj7, dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) (byte) -1);
        int int15 = dateTimeZone9.getOffset(1644572334551L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((int) (short) 0, 2022, (int) (byte) 1, 58, (int) (short) 10, (int) (short) -1, 4, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property4.setCopy("2022-02-11T09:38:59.502Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:59.502Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("2022-02-11T09:38:59.548Z", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '4', 58, 42, 12, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology26 = localDateTime23.getChronology();
        org.joda.time.DurationField durationField27 = chronology26.seconds();
        org.joda.time.DateTimeField dateTimeField28 = chronology26.weekyearOfCentury();
        mutableDateTime21.setChronology(chronology26);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = chronology26.get(readablePeriod30, (long) (byte) 100, 1644572334850L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340234L + "'", long14 == 1644572340234L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:00.234Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:00.234Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:00.234Z");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone0.getRawOffset();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset(1, 59, 3, (int) (byte) 10, 38, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime(dateTimeZone28);
        boolean boolean33 = dateTime31.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes((int) (short) 10);
        long long36 = dateTime35.getMillis();
        org.joda.time.Chronology chronology37 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime35.plusHours((int) (short) 10);
        java.lang.Object obj40 = null;
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj40, dateTimeZone42);
        int int46 = dateTimeZone42.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime47 = dateTime35.toDateTime(dateTimeZone42);
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.LocalDateTime localDateTime49 = new org.joda.time.LocalDateTime(chronology48);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(chronology50);
        org.joda.time.LocalDateTime.Property property52 = localDateTime51.monthOfYear();
        org.joda.time.LocalDateTime localDateTime54 = property52.addWrapFieldToCopy((int) (short) 100);
        int int55 = localDateTime54.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = localDateTime54.getFieldType((int) (short) 1);
        int int58 = localDateTime49.get(dateTimeFieldType57);
        boolean boolean59 = dateTime35.isSupported(dateTimeFieldType57);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.set(dateTimeFieldType57, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340258L + "'", long14 == 1644572340258L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:00.258Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:00.258Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:00.258Z");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572340258L + "'", long36 == 1644572340258L);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(3);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withDayOfMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyear();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = mutableDateTime19.toDateTime(chronology36);
        // The following exception was thrown during execution in test generation
        try {
            long long49 = chronology36.getDateTimeMillis(55, (int) (short) 1, 2000, 6, 0, 70, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340460L + "'", long14 == 1644572340460L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:00.461Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:00.461Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:00.461Z");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572340461L + "'", long35 == 1644572340461L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.seconds();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 49, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis(1644572334228L, 640, (int) 'a', 48, 42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 640 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy(35331916);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35331916 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Chinese (Taiwan)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(6, 0, 42, 70, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.addNoWrapToCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property4.setCopy("2089-04-16T10:54:57.492Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2089-04-16T10:54:57.492Z\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime17.minusWeeks(640);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572340629L + "'", long14 == 1644572340629L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime1.withSecondOfMinute((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale.LanguageRange[] languageRangeArray3 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList4 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList4, languageRangeArray3);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale locale18 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet19 = locale18.getExtensionKeys();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean21 = charSet19.equals((java.lang.Object) localTime20);
        java.util.Locale locale22 = java.util.Locale.US;
        java.util.Locale locale23 = java.util.Locale.US;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        java.util.Locale locale25 = java.util.Locale.US;
        java.util.Locale locale26 = java.util.Locale.US;
        java.lang.String str27 = locale25.getDisplayVariant(locale26);
        java.util.Locale locale28 = java.util.Locale.TAIWAN;
        java.util.Locale locale29 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray30 = new java.util.Locale[] { locale22, locale26, locale28, locale29 };
        java.util.ArrayList<java.util.Locale> localeList31 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList31, localeArray30);
        boolean boolean33 = charSet19.containsAll((java.util.Collection<java.util.Locale>) localeList31);
        java.util.Locale.FilteringMode filteringMode34 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList35 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, (java.util.Collection<java.util.Locale>) localeList31, filteringMode34);
        java.util.Locale.LanguageRange[] languageRangeArray36 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList37 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList37, languageRangeArray36);
        java.lang.String[] strArray44 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList45 = new java.util.ArrayList<java.lang.String>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList45, strArray44);
        java.lang.String str47 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.lang.String>) strList45);
        java.util.Locale locale48 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet49 = locale48.getExtensionKeys();
        org.joda.time.LocalTime localTime50 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean51 = charSet49.equals((java.lang.Object) localTime50);
        java.util.Locale locale52 = java.util.Locale.US;
        java.util.Locale locale53 = java.util.Locale.US;
        java.lang.String str54 = locale52.getDisplayVariant(locale53);
        java.util.Locale locale55 = java.util.Locale.US;
        java.util.Locale locale56 = java.util.Locale.US;
        java.lang.String str57 = locale55.getDisplayVariant(locale56);
        java.util.Locale locale58 = java.util.Locale.TAIWAN;
        java.util.Locale locale59 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray60 = new java.util.Locale[] { locale52, locale56, locale58, locale59 };
        java.util.ArrayList<java.util.Locale> localeList61 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList61, localeArray60);
        boolean boolean63 = charSet49.containsAll((java.util.Collection<java.util.Locale>) localeList61);
        java.util.Locale.FilteringMode filteringMode64 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList65 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList37, (java.util.Collection<java.util.Locale>) localeList61, filteringMode64);
        java.util.List<java.util.Locale> localeList66 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList4, (java.util.Collection<java.util.Locale>) localeList31, filteringMode64);
        java.util.Locale.LanguageRange[] languageRangeArray67 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList68 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList68, languageRangeArray67);
        java.util.Collection<java.util.Locale> localeCollection70 = null;
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, localeCollection70);
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.lang.String[] strArray80 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        java.lang.String str83 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList81);
        java.util.Locale.FilteringMode filteringMode84 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList85 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList68, (java.util.Collection<java.lang.String>) strList81, filteringMode84);
        java.util.List<java.util.Locale> localeList86 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList66, filteringMode84);
        java.util.Locale.LanguageRange[] languageRangeArray87 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList88 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList88, languageRangeArray87);
        java.lang.String[] strArray95 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList96 = new java.util.ArrayList<java.lang.String>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList96, strArray95);
        java.lang.String str98 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList88, (java.util.Collection<java.lang.String>) strList96);
        java.util.List<java.lang.String> strList99 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList96);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + filteringMode34 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode34.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList35);
        org.junit.Assert.assertNotNull(languageRangeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet49);
        org.junit.Assert.assertNotNull(localTime50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + filteringMode64 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode64.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList65);
        org.junit.Assert.assertNotNull(localeList66);
        org.junit.Assert.assertNotNull(languageRangeArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNull(str83);
        org.junit.Assert.assertTrue("'" + filteringMode84 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode84.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList85);
        org.junit.Assert.assertNotNull(localeList86);
        org.junit.Assert.assertNotNull(languageRangeArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNull(str98);
        org.junit.Assert.assertNotNull(strList99);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone0.getRawOffset();
        boolean boolean4 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withMinuteOfHour(35331916);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35331916 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime9.withTime(40, 10, 70, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter4.getPrinter();
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime.Property property18 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime.Property property19 = localDateTime9.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer7, (org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        int int5 = localDate4.getDayOfYear();
        int int6 = localDate4.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 18 + "'", int6 == 18);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-11T09:38:59.488Z", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:38:59.488z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) (short) -1);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.plus(readablePeriod9);
        org.joda.time.DurationFieldType durationFieldType11 = null;
        boolean boolean12 = localTime8.isSupported(durationFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("2022-02-11T09:38:59.471Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-11T09:38:59.471Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "en_US");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property7.withMaximumValue();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292278992 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2" + "'", str8, "2");
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology8 = localDateTime5.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.weekyearOfCentury();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.Chronology chronology12 = chronology8.withUTC();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) boolean3, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone0.getDisplayName(true, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = property30.addWrapFieldToCopy((int) (short) 100);
        int int33 = localDateTime32.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDateTime32.getFieldType((int) (short) 1);
        int int36 = localDateTime27.get(dateTimeFieldType35);
        boolean boolean37 = dateTime13.isSupported(dateTimeFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) boolean37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572341526L + "'", long14 == 1644572341526L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime13.withDate(2000, (int) (short) 0, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyear();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = mutableDateTime19.toDateTime(chronology36);
        mutableDateTime19.addHours((int) (short) 100);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime(chronology44);
        org.joda.time.LocalDateTime localDateTime47 = localDateTime45.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology48 = localDateTime45.getChronology();
        org.joda.time.DurationField durationField49 = chronology48.seconds();
        org.joda.time.DateTimeField dateTimeField50 = chronology48.weekyearOfCentury();
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime(chronology48);
        org.joda.time.Chronology chronology52 = chronology48.withUTC();
        org.joda.time.DateTimeField dateTimeField53 = chronology52.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setRounding(dateTimeField53, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 6");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572341584L + "'", long14 == 1644572341584L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:01.584Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:01.584Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:01.584Z");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572341584L + "'", long35 == 1644572341584L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField53);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.withYear(35331916);
        org.joda.time.LocalDate.Property property11 = localDate2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDate2.getFieldType(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("fra", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy("2022-02-11T09:38:54.738Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:54.738Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalTime localTime2 = localTime0.plus(readablePeriod1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime localDateTime11 = property10.getLocalDateTime();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.monthOfYear();
        org.joda.time.LocalDateTime localDateTime16 = property14.addWrapFieldToCopy((int) (short) 100);
        int int17 = localDateTime16.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property20 = localDateTime11.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime2.get(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        org.joda.time.DateTime.Property property14 = dateTime9.era();
        org.joda.time.DurationField durationField15 = property14.getDurationField();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalTime localTime14 = localTime2.minus(readablePeriod13);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds(49);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime14.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        int int20 = localDateTime18.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withSecondOfMinute(3);
        int[] intArray26 = new int[] { 18, (-1), 49 };
        // The following exception was thrown during execution in test generation
        try {
            chronology15.validate((org.joda.time.ReadablePartial) localDateTime18, intArray26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572342311L + "'", long14 == 1644572342311L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35342311 + "'", int20 == 35342311);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[18, -1, 49]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '#', 1, 292278993, 39, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        boolean boolean3 = timeZone0.observesDaylightTime();
        java.lang.String str4 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = dateTime18.minusYears((int) 'a');
        org.joda.time.DateTime dateTime22 = dateTime20.withCenturyOfEra((int) '#');
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfCentury((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withWeekOfWeekyear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572342523L + "'", long14 == 1644572342523L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:02.523Z" + "'", str15, "2022-02-11T09:39:02.523Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField19 = chronology15.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology15.getDateTimeMillis(1644572336617L, 18, 0, 640, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 640 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572342577L + "'", long14 == 1644572342577L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(4, 4, (int) (short) 0, 1, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int6 = localDateTime4.getValue((int) (byte) 1);
        java.util.Locale.Category category8 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj13 = null;
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(obj13, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime(dateTimeZone15);
        boolean boolean20 = dateTime18.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime22 = dateTime18.minusMinutes((int) (short) 10);
        long long23 = dateTime22.getMillis();
        org.joda.time.Chronology chronology24 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime22.plusHours((int) (short) 10);
        java.lang.Object obj27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(obj27, dateTimeZone29);
        int int33 = dateTimeZone29.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = dateTime22.toDateTime(dateTimeZone29);
        java.util.Locale locale36 = java.util.Locale.TAIWAN;
        java.lang.String str37 = locale36.getDisplayScript();
        java.lang.String str38 = dateTimeZone29.getName(0L, locale36);
        java.util.Locale.setDefault(category8, locale36);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = localDateTime4.toString("2022-02-11T09:39:02.033Z", locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category8.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1644572342615L + "'", long23 == 1644572342615L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate5.withDayOfMonth(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime4.getField(40);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 40");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.year();
        int int8 = localDateTime5.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property9 = localDateTime5.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property9.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withField(dateTimeFieldType10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        boolean boolean8 = dateTimeZone5.equals((java.lang.Object) "2022-02-11T09:38:50.385Z");
        org.joda.time.DateMidnight dateMidnight9 = localDate2.toDateMidnight(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDate2.toString("2022-02-11T09:38:57.431Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("hi!", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = dateTimeFormatter4.parseLocalDateTime("en_us");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeField[] dateTimeFieldArray4 = localDateTime3.getFields();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusHours(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withDayOfMonth((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property10 = dateTime9.minuteOfHour();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        int int13 = property10.getMaximumShortTextLength(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = locale12.getUnicodeLocaleType("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: centuryOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfMonth((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        java.lang.String str19 = dateTime15.toString();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        boolean boolean31 = dateTime29.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) (short) 10);
        long long34 = dateTime33.getMillis();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.era();
        org.joda.time.DateTimeField dateTimeField37 = chronology35.yearOfCentury();
        org.joda.time.DurationField durationField38 = chronology35.days();
        org.joda.time.DurationField durationField39 = chronology35.hours();
        org.joda.time.DateTime dateTime40 = dateTime15.withChronology(chronology35);
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray43 = chronology35.get(readablePeriod41, 1644572342489L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2022-02-11T09:49:03.167Z" + "'", str19, "2022-02-11T09:49:03.167Z");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1644572343167L + "'", long34 == 1644572343167L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.halfdayOfDay();
        long long29 = chronology22.getDateTimeMillis((int) (short) 0, 4, 9, 42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(0, 40, 35331916, (int) 'u', 640, (int) (byte) 100, (int) (short) -1, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572343326L + "'", long21 == 1644572343326L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-62158665599958L) + "'", long29 == (-62158665599958L));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        org.joda.time.MutableDateTime mutableDateTime24 = mutableDateTime2.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setWeekOfWeekyear(35341772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(mutableDateTime24);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.setCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property4.setCopy((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((int) (byte) -1);
        boolean boolean15 = localDate6.equals((java.lang.Object) localDate14);
        org.joda.time.LocalDate localDate17 = localDate6.minusYears(20);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate17.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property13 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime14 = property13.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property13.setCopy("2022-02-11T09:38:59.346Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:59.346Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime dateTime17 = dateTime13.withDayOfYear((int) (short) 1);
        int int18 = dateTime13.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime13.withEra(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572343601L + "'", long14 == 1644572343601L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:03.601Z" + "'", str15, "2022-02-11T09:39:03.601Z");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 22 + "'", int18 == 22);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        int int6 = localDateTime5.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        int[] intArray6 = localDateTime3.getValues();
        int int7 = localDateTime3.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.plusMinutes(22);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plus(readablePeriod10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj16 = null;
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(obj16, dateTimeZone18);
        org.joda.time.DateTime dateTime21 = localDateTime13.toDateTime(dateTimeZone18);
        boolean boolean23 = dateTime21.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime25 = dateTime21.minusMinutes((int) (short) 10);
        long long26 = dateTime25.getMillis();
        org.joda.time.Chronology chronology27 = dateTime25.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime25.plusHours((int) (short) 10);
        java.lang.Object obj30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj30, dateTimeZone32);
        int int36 = dateTimeZone32.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime37 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime(dateTimeZone32);
        java.util.Locale locale40 = java.util.Locale.US;
        java.lang.String str41 = dateTimeZone32.getShortName(1644572330264L, locale40);
        java.lang.String str42 = dateTimeZone32.getID();
        org.joda.time.DateTime dateTime43 = localDateTime11.toDateTime(dateTimeZone32);
        org.joda.time.LocalDateTime.Property property44 = localDateTime11.weekyear();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(intArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[2022, 2, 7, 35343715]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1644572343715L + "'", long26 == 1644572343715L);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "+00:00" + "'", str41, "+00:00");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Etc/UTC" + "'", str42, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(property44);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((int) (byte) -1);
        boolean boolean15 = localDate6.equals((java.lang.Object) localDate14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate14.minus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = localDate14.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight7 = localDate6.toDateMidnight();
        java.lang.String str8 = localDate6.toString();
        org.joda.time.Chronology chronology9 = localDate6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology9.getZone();
        java.lang.String str11 = chronology9.toString();
        org.joda.time.DurationField durationField12 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField13 = chronology9.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((int) (short) 100, 0, (int) (short) -1, 10, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022-02-11" + "'", str8, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ISOChronology[UTC]" + "'", str11, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.withYear(35331916);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withWeekOfWeekyear(35341772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        int int6 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalTime localTime10 = localTime8.minus(readablePeriod9);
        org.joda.time.Chronology chronology11 = localTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(35341772, 42, 22, 48, (int) (short) -1, 2000, 10, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, (int) (byte) 10);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime20.getZone();
        mutableDateTime20.addMonths((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        mutableDateTime20.add(readablePeriod28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        mutableDateTime20.add(readableDuration30);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime20.setTime(52, 40, 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572344177L + "'", long14 == 1644572344177L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.parse("2022-02-11T09:48:58.834Z", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime14 = dateTime10.minusWeeks((int) (short) 1);
        boolean boolean15 = dateTime14.isAfterNow();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDateTime17.toDateTime(dateTimeZone22);
        boolean boolean27 = dateTime25.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime29 = dateTime25.minusMinutes((int) (short) 10);
        long long30 = dateTime29.getMillis();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.era();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime((java.lang.Object) locale0, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1644572344210L + "'", long30 == 1644572344210L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        java.lang.String str1 = locale0.getISO3Language();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        mutableDateTime20.add(readableDuration21, (int) (byte) 10);
        boolean boolean24 = dateTime13.isBefore((org.joda.time.ReadableInstant) mutableDateTime20);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime20.getZone();
        mutableDateTime20.addMonths((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime20.setDateTime((int) 'x', (int) (byte) -1, (int) (short) 0, 42, 3, 12, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572344344L + "'", long14 == 1644572344344L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMinutes(48);
        org.joda.time.LocalTime localTime12 = localTime4.minusMillis((int) (short) -1);
        java.lang.String str13 = localTime12.toString();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "13:00:00.002" + "'", str13, "13:00:00.002");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(4, 4, 10, (int) (short) 1, (int) 'a', (int) 'a', 6, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = localTime10.getFieldTypes();
        java.lang.Class<?> wildcardClass12 = localTime10.getClass();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-11T09:38:54.850Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:38:54.850z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.Object obj5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, (int) (byte) 10);
        boolean boolean30 = dateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime26.getZone();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime(obj5, dateTimeZone31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((int) '4', (int) ' ', 6, 38, 6, dateTimeZone31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572344595L + "'", long20 == 1644572344595L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withMillisOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime12 = dateTime10.plus(1644572329811L);
        org.joda.time.DateTime dateTime14 = dateTime10.withYear((int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = dateTime10.getClass();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime2.plusMillis(52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localTime6.toString("2022-02-11T09:38:58.694Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfMonth(12);
        long long25 = chronology15.set((org.joda.time.ReadablePartial) localDateTime23, 1644572330264L);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = chronology15.get(readablePeriod26, 1644572336148L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572344859L + "'", long14 == 1644572344859L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644659344859L + "'", long25 == 1644659344859L);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(292278993, 35341772, (int) (short) -1, 35341772, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property13 = localTime2.millisOfSecond();
        org.joda.time.LocalTime.Property property14 = localTime2.minuteOfHour();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.year();
        int int19 = localDateTime16.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property20 = localDateTime16.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = property20.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localTime2.get(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.year();
        int int4 = localDateTime1.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property5 = localDateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime1.withTime((int) (byte) 10, (int) 'x', (int) (byte) 10, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 49 + "'", int4 == 49);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds((int) (byte) -1);
        boolean boolean9 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.minus(readableDuration10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = localDateTime11.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldTypeArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [Lorg.joda.time.DateTimeFieldType;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale3 = java.util.Locale.ROOT;
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        org.joda.time.DateTime.Property property14 = dateTime13.minuteOfHour();
        org.joda.time.DateTime dateTime15 = property14.roundCeilingCopy();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        int int17 = property14.getMaximumShortTextLength(locale16);
        java.lang.String str18 = locale3.getDisplayCountry(locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = timeZone0.getDisplayName(true, (-1), locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology4.getDateTimeMillis((int) (byte) 0, (int) ' ', 59, 2922789, 2, 292278993, 48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        boolean boolean19 = dateTime18.isEqualNow();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572345420L + "'", long14 == 1644572345420L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:05.420Z" + "'", str15, "2022-02-11T09:39:05.420Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        java.io.Writer writer5 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        mutableDateTime26.add(readableDuration27, (int) (byte) 10);
        boolean boolean30 = dateTime19.isBefore((org.joda.time.ReadableInstant) mutableDateTime26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj35 = null;
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(obj35, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localDateTime32.toDateTime(dateTimeZone37);
        boolean boolean42 = dateTime40.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property43 = dateTime40.secondOfDay();
        int int44 = dateTime19.compareTo((org.joda.time.ReadableInstant) dateTime40);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadableInstant) dateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572345484L + "'", long20 == 1644572345484L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(35341772, (int) 'a', 39, 10, 70, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        int int7 = localDateTime5.size();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withFieldAdded(durationFieldType8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setMillis((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setDate(5, (int) 'x', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        mutableDateTime34.add(readablePeriod36, 3);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime34.setMinuteOfHour(4044);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4044 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572345622L + "'", long20 == 1644572345622L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean3 = charSet1.equals((java.lang.Object) localTime2);
        boolean boolean4 = charSet1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = charSet1.add((java.lang.Character) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        boolean boolean19 = dateTime17.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMinutes((int) (short) 10);
        long long22 = dateTime21.getMillis();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime21.plusHours((int) (short) 10);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        int int32 = dateTimeZone28.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = dateTime21.toDateTime(dateTimeZone28);
        boolean boolean34 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime21.withDayOfYear(55);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1644572345685L + "'", long22 == 1644572345685L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        java.io.Writer writer5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = localDate8.toDateMidnight();
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone4);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.lang.Appendable appendable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(appendable11, 1644572342982L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572334850L + "'", long8 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.withSecondOfMinute(35341772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime.Property property10 = localDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("2022-02-11T09:38:59.548Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:59.548Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        java.lang.Class<?> wildcardClass26 = dateTime25.getClass();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572345903L + "'", long14 == 1644572345903L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = dateTime9.get(dateTimeField13);
        org.joda.time.DateTime dateTime15 = dateTime9.toDateTime();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDateTime17.toDateTime(dateTimeZone22);
        org.joda.time.DateTime dateTime27 = dateTime25.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime29 = dateTime25.minusWeeks((int) (short) 1);
        boolean boolean30 = dateTime29.isAfterNow();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(chronology31);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj35 = null;
        java.util.TimeZone timeZone36 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forTimeZone(timeZone36);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone37);
        org.joda.time.LocalDateTime localDateTime39 = new org.joda.time.LocalDateTime(obj35, dateTimeZone37);
        org.joda.time.DateTime dateTime40 = localDateTime32.toDateTime(dateTimeZone37);
        boolean boolean42 = dateTime40.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime44 = dateTime40.minusMinutes((int) (short) 10);
        long long45 = dateTime44.getMillis();
        org.joda.time.Chronology chronology46 = dateTime44.getChronology();
        org.joda.time.DateTimeField dateTimeField47 = chronology46.era();
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfDay();
        org.joda.time.DateTime dateTime49 = dateTime29.withChronology(chronology46);
        org.joda.time.DateTime dateTime50 = dateTime15.toDateTime(chronology46);
        long long51 = dateTime50.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime53 = dateTime50.withDayOfMonth(35341772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
// flaky:         org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1644572345929L + "'", long45 == 1644572345929L);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
// flaky:         org.junit.Assert.assertTrue("'" + long51 + "' != '" + 1644572945928L + "'", long51 == 1644572945928L);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("100", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy(1644572345461L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1644572345461");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone0.getRawOffset();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        boolean boolean15 = dateTime13.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes((int) (short) 10);
        long long18 = dateTime17.getMillis();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute(9);
        org.joda.time.DateTime dateTime22 = dateTime20.withMillisOfSecond(10);
        org.joda.time.Chronology chronology23 = dateTime22.getChronology();
        org.joda.time.DurationField durationField24 = chronology23.millis();
        org.joda.time.DurationField durationField25 = chronology23.years();
        org.joda.time.DateTimeField dateTimeField26 = chronology23.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) timeZone0, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572346121L + "'", long18 == 1644572346121L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter2.parseLocalDate("2022-02-11T09:38:58.694Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("2022-02-11T09:49:03.828Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:49:03.828Z\" is malformed at \"T09:49:03.828Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone19);
        boolean boolean22 = dateTimeZone19.equals((java.lang.Object) "2022-02-11T09:38:50.385Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) chronology16, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1644572346359L + "'", long15 == 1644572346359L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology22.days();
        org.joda.time.DateTimeField dateTimeField26 = chronology22.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(1, 39, 18, (int) ' ', 625, 6, (int) 'x', chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572346471L + "'", long21 == 1644572346471L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone4);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17, (int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.ReadableDuration readableDuration31 = null;
        mutableDateTime16.add(readableDuration31);
        mutableDateTime16.setTime(1, (int) '#', (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = dateTimeFormatter9.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime16, "2", 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572334850L + "'", long8 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("100");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        org.joda.time.LocalDate localDate9 = localDate7.minusYears(640);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Coordinated Universal Time\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        java.util.Locale.LanguageRange[] languageRangeArray2 = new java.util.Locale.LanguageRange[] { languageRange1 };
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList3 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList3, languageRangeArray2);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Locale.LanguageRange[] languageRangeArray8 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList9 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList9, languageRangeArray8);
        java.util.Locale.LanguageRange[] languageRangeArray11 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList12 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList12, languageRangeArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList20 = new java.util.ArrayList<java.lang.String>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList20, strArray19);
        java.lang.String str22 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.lang.String>) strList20);
        java.util.Locale locale23 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet24 = locale23.getExtensionKeys();
        org.joda.time.LocalTime localTime25 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean26 = charSet24.equals((java.lang.Object) localTime25);
        java.util.Locale locale27 = java.util.Locale.US;
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        java.util.Locale locale30 = java.util.Locale.US;
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.TAIWAN;
        java.util.Locale locale34 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray35 = new java.util.Locale[] { locale27, locale31, locale33, locale34 };
        java.util.ArrayList<java.util.Locale> localeList36 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList36, localeArray35);
        boolean boolean38 = charSet24.containsAll((java.util.Collection<java.util.Locale>) localeList36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList12, (java.util.Collection<java.util.Locale>) localeList36, filteringMode39);
        java.util.Locale.LanguageRange[] languageRangeArray41 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList42 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList42, languageRangeArray41);
        java.lang.String[] strArray49 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        java.lang.String str52 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.lang.String>) strList50);
        java.util.Locale locale53 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet54 = locale53.getExtensionKeys();
        org.joda.time.LocalTime localTime55 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean56 = charSet54.equals((java.lang.Object) localTime55);
        java.util.Locale locale57 = java.util.Locale.US;
        java.util.Locale locale58 = java.util.Locale.US;
        java.lang.String str59 = locale57.getDisplayVariant(locale58);
        java.util.Locale locale60 = java.util.Locale.US;
        java.util.Locale locale61 = java.util.Locale.US;
        java.lang.String str62 = locale60.getDisplayVariant(locale61);
        java.util.Locale locale63 = java.util.Locale.TAIWAN;
        java.util.Locale locale64 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray65 = new java.util.Locale[] { locale57, locale61, locale63, locale64 };
        java.util.ArrayList<java.util.Locale> localeList66 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList66, localeArray65);
        boolean boolean68 = charSet54.containsAll((java.util.Collection<java.util.Locale>) localeList66);
        java.util.Locale.FilteringMode filteringMode69 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList70 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList42, (java.util.Collection<java.util.Locale>) localeList66, filteringMode69);
        java.util.List<java.util.Locale> localeList71 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList9, (java.util.Collection<java.util.Locale>) localeList36, filteringMode69);
        java.util.Locale.LanguageRange[] languageRangeArray72 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList73 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList73, languageRangeArray72);
        java.util.Collection<java.util.Locale> localeCollection75 = null;
        java.util.List<java.util.Locale> localeList76 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, localeCollection75);
        java.util.Locale.LanguageRange[] languageRangeArray77 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList78 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList78, languageRangeArray77);
        java.lang.String[] strArray85 = new java.lang.String[] { "2022-02-11", "en", "hi!", "en", "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        java.lang.String str88 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList78, (java.util.Collection<java.lang.String>) strList86);
        java.util.Locale.FilteringMode filteringMode89 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList90 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList73, (java.util.Collection<java.lang.String>) strList86, filteringMode89);
        java.util.List<java.util.Locale> localeList91 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList71, filteringMode89);
        java.util.Locale locale92 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList3, (java.util.Collection<java.util.Locale>) localeList91);
        org.junit.Assert.assertNotNull(languageRangeArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(languageRangeArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList40);
        org.junit.Assert.assertNotNull(languageRangeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet54);
        org.junit.Assert.assertNotNull(localTime55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + filteringMode69 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode69.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList70);
        org.junit.Assert.assertNotNull(localeList71);
        org.junit.Assert.assertNotNull(languageRangeArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(localeList76);
        org.junit.Assert.assertNotNull(languageRangeArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertTrue("'" + filteringMode89 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode89.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList90);
        org.junit.Assert.assertNotNull(localeList91);
        org.junit.Assert.assertNull(locale92);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone4);
        long long8 = dateTimeZone4.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter2.withZone(dateTimeZone4);
        boolean boolean10 = dateTimeFormatter9.isOffsetParsed();
        java.util.Locale locale11 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withLocale(locale11);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withDefaultYear(70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter13.print(1644572337528L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1644572334850L + "'", long8 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime20.plusHours((int) (short) 10);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        int int31 = dateTimeZone27.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = dateTime20.toDateTime(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(dateTimeZone27);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = dateTimeZone27.getShortName(1644572330264L, locale35);
        java.lang.String str37 = dateTimeZone27.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((int) (byte) 1, (int) (byte) 1, 0, 11, 292278993, 49, 49, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572347001L + "'", long21 == 1644572347001L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.Chronology chronology5 = localDateTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withEra(39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print(1644572334440L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.LocalDate localDate6 = localDate2.withDayOfWeek(6);
        int int7 = localDate6.size();
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate6.withFieldAdded(durationFieldType8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((int) (byte) -1);
        boolean boolean15 = localDate6.equals((java.lang.Object) localDate14);
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = null;
        org.joda.time.format.DateTimeParser dateTimeParser18 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter17, dateTimeParser18);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        long long25 = dateTimeZone21.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter19.withZone(dateTimeZone21);
        boolean boolean27 = dateTimeFormatter26.isOffsetParsed();
        java.util.Locale locale28 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter26.withLocale(locale28);
        java.util.Locale locale30 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str31 = locale30.getISO3Language();
        java.lang.String str32 = locale28.getDisplayName(locale30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = localDate6.toString("2022-02-11T09:39:07.256Z", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644572334850L + "'", long25 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "fra" + "'", str31, "fra");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "italien (Italie)" + "'", str32, "italien (Italie)");
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDateTime3.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTimeFormatter4.parseDateTime("2022-02-11T09:38:59.502Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds((int) (byte) -1);
        boolean boolean9 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime1.getHourOfDay();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = localDate13.toDateMidnight();
        int int15 = localDate13.getYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology10 = localDateTime7.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.seconds();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(10, (int) '#', (int) '#', 35347060, 6, 640, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347060 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int5 = property2.getMaximumValueOverall();
        long long6 = property2.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property2.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property2.roundHalfEvenCopy();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute(12);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property11.setCopy("2022-02-11T09:38:53.742Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:53.742Z\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 899347571L + "'", long6 == 899347571L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone7);
        long long11 = dateTimeZone7.convertUTCToLocal(1644572334850L);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(2022, 50, 2000, (int) '#', (int) (short) -1, 48, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1644572334850L + "'", long11 == 1644572334850L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(35341772, 22, 35347060, 5, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 2922789, (-1), 241, 4044);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.DateTime dateTime12 = dateTime10.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime14 = dateTime10.minusWeeks((int) (short) 1);
        boolean boolean15 = dateTime14.isAfterNow();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        org.joda.time.DateTime dateTime25 = localDateTime17.toDateTime(dateTimeZone22);
        boolean boolean27 = dateTime25.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime29 = dateTime25.minusMinutes((int) (short) 10);
        long long30 = dateTime29.getMillis();
        org.joda.time.Chronology chronology31 = dateTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.era();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTime dateTime34 = dateTime14.withChronology(chronology31);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(1644572330722L, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            long long40 = chronology31.getDateTimeMillis(2922789, 35347015, (int) 'x', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347015 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + long30 + "' != '" + 1644572347814L + "'", long30 == 1644572347814L);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        boolean boolean7 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.parse("13:00:00.002", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter4.getPrinter();
        boolean boolean7 = dateTimeFormatter4.isParser();
        java.lang.StringBuffer stringBuffer8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds((int) (byte) -1);
        int[] intArray15 = localDateTime12.getValues();
        int int16 = localDateTime12.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.plusMinutes(22);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer8, (org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 7, 35347964]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy(0);
        org.joda.time.DateTime dateTime20 = property16.roundHalfCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter23.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology26 = dateTimeFormatter25.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter27 = dateTimeFormatter25.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = dateTimeFormatter25.withDefaultYear((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTime20.toString(dateTimeFormatter29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572348159L + "'", long14 == 1644572348159L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:08.159Z" + "'", str15, "2022-02-11T09:39:08.159Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
        org.junit.Assert.assertNull(chronology26);
        org.junit.Assert.assertNull(dateTimePrinter27);
        org.junit.Assert.assertNotNull(dateTimeFormatter29);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        java.util.TimeZone timeZone2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = localDate4.toDateMidnight();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekyear((int) (short) 1);
        java.util.Date date8 = localDate7.toDate();
        boolean boolean9 = timeZone0.inDaylightTime(date8);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.withMillisOfDay((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withYearOfCentury(4044);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4044 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj30, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = localDateTime27.toDateTime(dateTimeZone32);
        boolean boolean37 = dateTime35.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime39 = dateTime35.minusMinutes((int) (short) 10);
        long long40 = dateTime39.getMillis();
        org.joda.time.Chronology chronology41 = dateTime39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.era();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField44 = chronology41.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime45 = new org.joda.time.LocalDateTime((java.lang.Object) (short) 1, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1644572348358L + "'", long40 == 1644572348358L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2022);
        java.io.Writer writer7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, readableInstant8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime35 = property33.set(3);
        java.lang.Object obj36 = mutableDateTime35.clone();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, (int) (byte) 10);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(chronology43);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime44.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj47 = null;
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone49);
        org.joda.time.LocalDateTime localDateTime51 = new org.joda.time.LocalDateTime(obj47, dateTimeZone49);
        org.joda.time.DateTime dateTime52 = localDateTime44.toDateTime(dateTimeZone49);
        mutableDateTime39.setDate((org.joda.time.ReadableInstant) dateTime52);
        mutableDateTime35.setMillis((org.joda.time.ReadableInstant) dateTime52);
        org.joda.time.Chronology chronology55 = mutableDateTime35.getChronology();
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(chronology58);
        org.joda.time.LocalDateTime localDateTime61 = localDateTime59.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj62 = null;
        java.util.TimeZone timeZone63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone63);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone64);
        org.joda.time.LocalDateTime localDateTime66 = new org.joda.time.LocalDateTime(obj62, dateTimeZone64);
        org.joda.time.DateTime dateTime67 = localDateTime59.toDateTime(dateTimeZone64);
        org.joda.time.DateTime dateTime69 = dateTime67.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime71 = dateTime67.minusWeeks((int) (short) 1);
        boolean boolean72 = dateTime71.isAfterNow();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.LocalDateTime localDateTime74 = new org.joda.time.LocalDateTime(chronology73);
        org.joda.time.LocalDateTime localDateTime76 = localDateTime74.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj77 = null;
        java.util.TimeZone timeZone78 = null;
        org.joda.time.DateTimeZone dateTimeZone79 = org.joda.time.DateTimeZone.forTimeZone(timeZone78);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone79);
        org.joda.time.LocalDateTime localDateTime81 = new org.joda.time.LocalDateTime(obj77, dateTimeZone79);
        org.joda.time.DateTime dateTime82 = localDateTime74.toDateTime(dateTimeZone79);
        boolean boolean84 = dateTime82.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime86 = dateTime82.minusMinutes((int) (short) 10);
        long long87 = dateTime86.getMillis();
        org.joda.time.Chronology chronology88 = dateTime86.getChronology();
        org.joda.time.DateTimeField dateTimeField89 = chronology88.era();
        org.joda.time.DateTimeField dateTimeField90 = chronology88.clockhourOfDay();
        org.joda.time.DateTime dateTime91 = dateTime71.withChronology(chronology88);
        org.joda.time.LocalDateTime localDateTime92 = new org.joda.time.LocalDateTime(1644572330722L, chronology88);
        org.joda.time.DateTime dateTime93 = new org.joda.time.DateTime(1644572336727L, chronology88);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime94 = new org.joda.time.DateTime((java.lang.Object) chronology55, chronology88);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572348477L + "'", long20 == 1644572348477L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertEquals(obj36.toString(), "1970-01-01T00:03:00.100Z");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj36), "1970-01-01T00:03:00.100Z");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj36), "1970-01-01T00:03:00.100Z");
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(dateTimeZone79);
        org.junit.Assert.assertNotNull(dateTime82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(dateTime86);
// flaky:         org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1644572348477L + "'", long87 == 1644572348477L);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertNotNull(dateTimeField89);
        org.junit.Assert.assertNotNull(dateTimeField90);
        org.junit.Assert.assertNotNull(dateTime91);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("utc", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        java.util.Locale locale38 = new java.util.Locale("en_US", "2022-02-11T09:48:50.448Z", "en");
        java.lang.String str39 = locale38.getDisplayVariant();
        java.lang.String str40 = property33.getAsText(locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = locale38.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for 2022-02-11T09:48:50.448Z");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572348522L + "'", long20 == 1644572348522L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertEquals(locale38.toString(), "en_us_2022-02-11T09:48:50.448Z_en");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "en" + "'", str39, "en");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "0" + "'", str40, "0");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime16.add(readableDuration17, (int) (byte) 10);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        mutableDateTime16.setDate((org.joda.time.ReadableInstant) dateTime29);
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone33);
        mutableDateTime16.setZone(dateTimeZone33);
        java.lang.String str37 = dateTimeZone33.getID();
        org.joda.time.DateTime dateTime38 = dateTime13.withZoneRetainFields(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = dateTime13.toString("java.io.IOException: 2022-02-11T09:38:49.281Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
// flaky:         org.junit.Assert.assertEquals("'" + str37 + "' != '" + "UTC" + "'", str37, "UTC");
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        int int5 = property3.get();
        org.joda.time.MutableDateTime mutableDateTime6 = property3.roundFloor();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setSecondOfMinute(241);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = dateTimeFormatter3.parseLocalDateTime("2022-02-11T09:39:04.035Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.setSecondOfDay(35347015);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347015 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Property[secondOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Property[secondOfDay]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime11 = dateTime9.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime13 = dateTime9.minusWeeks((int) (short) 1);
        boolean boolean14 = dateTime13.isAfterNow();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj19 = null;
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(obj19, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDateTime16.toDateTime(dateTimeZone21);
        boolean boolean26 = dateTime24.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime28 = dateTime24.minusMinutes((int) (short) 10);
        long long29 = dateTime28.getMillis();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.era();
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = dateTime13.withChronology(chronology30);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(chronology30);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight38 = localDate37.toDateMidnight();
        java.lang.String str39 = localDate37.toString();
        org.joda.time.Chronology chronology40 = localDate37.getChronology();
        org.joda.time.DateTimeZone dateTimeZone41 = chronology40.getZone();
        java.lang.String str42 = chronology40.toString();
        org.joda.time.DurationField durationField43 = chronology40.weeks();
        java.util.TimeZone timeZone44 = null;
        org.joda.time.DateTimeZone dateTimeZone45 = org.joda.time.DateTimeZone.forTimeZone(timeZone44);
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate(dateTimeZone45);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone45);
        org.joda.time.Chronology chronology48 = chronology40.withZone(dateTimeZone45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((java.lang.Object) chronology30, chronology48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1644572348925L + "'", long29 == 1644572348925L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "2022-02-11" + "'", str39, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "ISOChronology[UTC]" + "'", str42, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.addWrapFieldToCopy(55);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime6.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = chronology15.days();
        org.joda.time.DurationField durationField19 = chronology15.hours();
        java.lang.Object obj20 = null;
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone22);
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(obj20, dateTimeZone22);
        int int26 = dateTimeZone22.getOffset((long) (byte) -1);
        boolean boolean27 = dateTimeZone22.isFixed();
        int int29 = dateTimeZone22.getStandardOffset(1644572334551L);
        org.joda.time.Chronology chronology30 = chronology15.withZone(dateTimeZone22);
        org.joda.time.DurationField durationField31 = chronology15.centuries();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = chronology15.get(readablePeriod32, 1644572338772L, 1644572334267L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572348970L + "'", long14 == 1644572348970L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMinutes(48);
        int int11 = localTime10.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) int11, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        java.util.Locale locale3 = java.util.Locale.getDefault();
        java.lang.String str4 = locale3.getScript();
        java.lang.String str5 = timeZone1.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(locale3);
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Coordinated Universal Time" + "'", str5, "Coordinated Universal Time");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.withYear(35331916);
        org.joda.time.LocalDate localDate12 = localDate2.withWeekOfWeekyear(18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate12.withDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(49, 42, 22, (int) (byte) 1, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withZoneUTC();
        java.io.Writer writer8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.monthOfYear();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.year();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime10.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusHours(2);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer8, (org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1644572333194L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = localTime1.getField(35347060);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35347060");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeFormatter4.parseMillis("2022-02-11T09:38:59.548Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        int int15 = dateTime13.getSecondOfMinute();
        int int16 = dateTime13.getEra();
        org.joda.time.DateTime.Property property17 = dateTime13.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime13.withCenturyOfEra(35347060);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347060 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572349387L + "'", long14 == 1644572349387L);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int) ' ');
        java.io.Writer writer7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj12 = null;
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(obj12, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = localDateTime9.toDateTime(dateTimeZone14);
        boolean boolean19 = dateTime17.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime21 = dateTime17.minusMinutes((int) (short) 10);
        long long22 = dateTime21.getMillis();
        org.joda.time.Chronology chronology23 = dateTime21.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime21.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTime dateTime27 = dateTime21.minus(readableDuration26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMillis(59);
        org.joda.time.DateTime dateTime31 = dateTime27.withEra(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, (org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + long22 + "' != '" + 1644572349445L + "'", long22 == 1644572349445L);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime4.plusMinutes(48);
        org.joda.time.LocalTime localTime12 = localTime4.plusHours(55);
        org.joda.time.LocalTime.Property property13 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime15 = property13.addWrapFieldToCopy((int) 'u');
        org.joda.time.LocalTime localTime16 = property13.roundHalfFloorCopy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj21 = null;
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj21, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDateTime18.toDateTime(dateTimeZone23);
        boolean boolean28 = dateTime26.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime30 = dateTime26.minusMinutes((int) (short) 10);
        long long31 = dateTime30.getMillis();
        java.lang.String str32 = dateTime30.toString();
        org.joda.time.DateTime.Property property33 = dateTime30.hourOfDay();
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(chronology34);
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.monthOfYear();
        org.joda.time.LocalDateTime localDateTime38 = property36.addWrapFieldToCopy((int) (short) 100);
        int int39 = localDateTime38.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = localDateTime38.getFieldType((int) (short) 1);
        boolean boolean42 = dateTime30.isSupported(dateTimeFieldType41);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = localTime16.get(dateTimeFieldType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1644572349517L + "'", long31 == 1644572349517L);
// flaky:         org.junit.Assert.assertEquals("'" + str32 + "' != '" + "2022-02-11T09:39:09.517Z" + "'", str32, "2022-02-11T09:39:09.517Z");
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.era();
        org.joda.time.LocalDate localDate5 = localDate2.withDayOfWeek(3);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int3 = timeZone0.getOffset(1644572333371L);
        boolean boolean4 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) 'u');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays((int) (short) 10);
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId20 = timeZone19.toZoneId();
        int int22 = timeZone19.getOffset(1644572333371L);
        boolean boolean23 = timeZone19.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = locale26.getISO3Language();
        java.lang.String str28 = dateTimeZone24.getShortName((long) 100, locale26);
        java.util.Calendar calendar29 = dateTime18.toCalendar(locale26);
        java.lang.String str30 = timeZone0.getDisplayName(locale26);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645436949601,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=49,SECOND=9,MILLISECOND=601,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Coordinated Universal Time" + "'", str30, "Coordinated Universal Time");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate.Property property6 = localDate4.weekOfWeekyear();
        org.joda.time.LocalDate localDate8 = localDate4.withYearOfCentury(70);
        org.joda.time.LocalDate localDate10 = localDate4.minusYears((int) '4');
        int int11 = localDate4.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.secondOfDay();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId20 = timeZone19.toZoneId();
        int int22 = timeZone19.getOffset(1644572333371L);
        boolean boolean23 = timeZone19.observesDaylightTime();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        java.util.Locale locale26 = java.util.Locale.CHINESE;
        java.lang.String str27 = locale26.getISO3Language();
        java.lang.String str28 = dateTimeZone24.getShortName((long) 100, locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((java.lang.Object) chronology15, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572349710L + "'", long14 == 1644572349710L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "zho" + "'", str27, "zho");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.withYear(35331916);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate10.withMonthOfYear(39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        org.joda.time.DateTime dateTime29 = localDateTime21.toDateTime(dateTimeZone26);
        boolean boolean31 = dateTime29.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime33 = dateTime29.minusMinutes((int) (short) 10);
        long long34 = dateTime33.getMillis();
        org.joda.time.Chronology chronology35 = dateTime33.getChronology();
        org.joda.time.DateTime dateTime37 = dateTime33.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        mutableDateTime40.add(readableDuration41, (int) (byte) 10);
        boolean boolean44 = dateTime33.isBefore((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeZone dateTimeZone45 = mutableDateTime40.getZone();
        int int46 = mutableDateTime19.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int48 = mutableDateTime19.get(dateTimeFieldType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572349863L + "'", long14 == 1644572349863L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
// flaky:         org.junit.Assert.assertTrue("'" + long34 + "' != '" + 1644572349863L + "'", long34 == 1644572349863L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(dateTimeZone45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime.Property property20 = dateTime19.minuteOfHour();
        org.joda.time.DateTime dateTime22 = property20.setCopy(10);
        java.util.Locale locale24 = java.util.Locale.US;
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale24.getDisplayVariant(locale25);
        java.lang.String str27 = locale25.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = property20.setCopy("centuryOfEra", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "en" + "'", str27, "en");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((java.lang.Integer) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter4.parseLocalDate("2022-02-11T09:49:09.871Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) 'a', 100, 42, 49, 292278993, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        boolean boolean16 = dateTime14.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime18 = dateTime14.minusMinutes((int) (short) 10);
        long long19 = dateTime18.getMillis();
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField23 = chronology20.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((-1), 35347015, 6, 0, 1, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347015 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1644572350173L + "'", long19 == 1644572350173L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.LocalDate localDate6 = localDate2.withDayOfWeek(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        int int11 = localTime10.getSecondOfMinute();
        int int12 = localTime10.size();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.DateTime dateTime15 = dateTime13.plusYears(9);
        java.lang.Object obj16 = null;
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(obj16, dateTimeZone18);
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        int int22 = localDateTime20.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime20.withMillisOfDay(10);
        boolean boolean25 = dateTime15.equals((java.lang.Object) localDateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime15.withEra(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 42 + "'", int22 == 42);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.lang.String str8 = locale6.getLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime1.toString("2089-04-16T10:55:08.900Z", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = property16.addToCopy((int) (short) 1);
        org.joda.time.DateTime dateTime21 = property16.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime21.withDayOfMonth(40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572350519L + "'", long14 == 1644572350519L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:10.519Z" + "'", str15, "2022-02-11T09:39:10.519Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfYear();
        org.joda.time.LocalDate localDate6 = property5.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property5.setCopy("\u4e2d\u6587");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate13 = localDate9.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property14 = localDate13.yearOfEra();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate21 = localDate17.withWeekyear((int) (byte) -1);
        boolean boolean22 = localDate13.equals((java.lang.Object) localDate21);
        org.joda.time.LocalDate localDate24 = localDate13.minusYears(20);
        int[] intArray25 = localDate24.getValues();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight28 = localDate24.toDateMidnight(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((int) 'x', 35341772, 20, 18, (-1), 23, 5, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-21, 2, 12]");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateMidnight28);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.Locale locale3 = new java.util.Locale("en_US", "2022-02-11T09:48:50.448Z", "en");
        java.lang.String str4 = locale3.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = locale3.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_2022-02-11T09:48:50.448Z_en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en" + "'", str4, "en");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays((int) (byte) 0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj13 = null;
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(obj13, dateTimeZone15);
        org.joda.time.DateTime dateTime18 = localDateTime10.toDateTime(dateTimeZone15);
        boolean boolean20 = dateTime18.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime22 = dateTime18.minusMinutes((int) (short) 10);
        long long23 = dateTime22.getMillis();
        org.joda.time.Chronology chronology24 = dateTime22.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime22.plusHours((int) (short) 10);
        java.lang.Object obj27 = null;
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(obj27, dateTimeZone29);
        int int33 = dateTimeZone29.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime34 = dateTime22.toDateTime(dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone29);
        java.util.Locale locale37 = java.util.Locale.US;
        java.lang.String str38 = dateTimeZone29.getShortName(1644572330264L, locale37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) localDate8, dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1644572350838L + "'", long23 == 1644572350838L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.era();
        org.joda.time.DateTimeField dateTimeField18 = chronology16.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, chronology16);
        org.joda.time.DurationField durationField20 = chronology16.centuries();
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1644572350851L + "'", long15 == 1644572350851L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        mutableDateTime2.setMinuteOfHour(55);
        int int35 = mutableDateTime2.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.add(durationFieldType36, 35350243);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572350862L + "'", long20 == 1644572350862L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1644572333722L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime1.add(readableDuration2, 2022);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfDay();
        int int7 = mutableDateTime1.getRoundingMode();
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean3 = charSet1.equals((java.lang.Object) localTime2);
        org.joda.time.LocalTime.Property property4 = localTime2.millisOfDay();
        int int5 = localTime2.size();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter5.getPrinter();
        boolean boolean8 = dateTimeFormatter5.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.parse("2022-02-11T09:49:10.436Z", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.year();
        int int9 = localDateTime6.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime1.withField(dateTimeFieldType11, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 49 + "'", int9 == 49);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.parse("Chinese (Taiwan)", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DurationField durationField25 = chronology22.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(35341772, 20, 580, (int) '4', 292278993, 6, (int) (byte) 100, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572351188L + "'", long21 == 1644572351188L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter4.getPrinter();
        boolean boolean7 = dateTimeFormatter4.isParser();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology12);
        org.joda.time.LocalTime localTime15 = localTime13.minusHours((int) '#');
        org.joda.time.LocalTime localTime17 = localTime15.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime18 = localTime10.withFields((org.joda.time.ReadablePartial) localTime17);
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfDay(241);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTimeFormatter4.print((org.joda.time.ReadablePartial) localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addWrapFieldToCopy((int) (short) 100);
        int int23 = localDateTime22.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime2.set(dateTimeFieldType25, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = property6.getLocalDateTime();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj15 = null;
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(obj15, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDateTime12.toDateTime(dateTimeZone17);
        boolean boolean22 = dateTime20.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime24 = dateTime20.minusMinutes((int) (short) 10);
        long long25 = dateTime24.getMillis();
        org.joda.time.Chronology chronology26 = dateTime24.getChronology();
        org.joda.time.DateTime dateTime28 = dateTime24.plusHours((int) (short) 10);
        java.lang.Object obj29 = null;
        java.util.TimeZone timeZone30 = null;
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone31);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(obj29, dateTimeZone31);
        int int35 = dateTimeZone31.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime36 = dateTime24.toDateTime(dateTimeZone31);
        java.util.Locale locale38 = java.util.Locale.TAIWAN;
        java.lang.String str39 = locale38.getDisplayScript();
        java.lang.String str40 = dateTimeZone31.getName(0L, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        java.lang.String str42 = property6.getAsText(locale38);
        java.lang.String str43 = locale38.getDisplayName();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644572351538L + "'", long25 == 1644572351538L);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "+00:00" + "'", str40, "+00:00");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "\u4e8c\u6708" + "'", str42, "\u4e8c\u6708");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "\u4e2d\u6587\u53f0\u7063)" + "'", str43, "\u4e2d\u6587\u53f0\u7063)");
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone12);
        long long16 = dateTimeZone12.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter10.withZone(dateTimeZone12);
        boolean boolean18 = dateTimeFormatter17.isOffsetParsed();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter17.withLocale(locale19);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter17.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withDefaultYear(70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDate2.toString(dateTimeFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1644572334850L + "'", long16 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.DateTime dateTime12 = localTime10.toDateTimeToday();
        java.lang.Object obj13 = null;
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(obj13, dateTimeZone15);
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        int int19 = localDateTime17.getDayOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        org.joda.time.LocalDateTime localDateTime24 = property22.addWrapFieldToCopy((int) (short) 100);
        int int25 = localDateTime24.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = localDateTime24.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property28 = localDateTime17.property(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property29 = localTime10.property(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        boolean boolean16 = dateTime14.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime18 = dateTime14.minusMinutes((int) (short) 10);
        long long19 = dateTime18.getMillis();
        org.joda.time.Chronology chronology20 = dateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.era();
        org.joda.time.DateTimeField dateTimeField22 = chronology20.yearOfCentury();
        org.joda.time.DurationField durationField23 = chronology20.days();
        org.joda.time.DurationField durationField24 = chronology20.hours();
        org.joda.time.DurationField durationField25 = chronology20.halfdays();
        org.joda.time.DurationField durationField26 = chronology20.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(2, 640, (int) ' ', 40, 35350603, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1644572351698L + "'", long19 == 1644572351698L);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime11);
        long long15 = dateTimeZone7.nextTransition(1644572347205L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(0, 49, 0, (int) (byte) -1, 8, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1644572347205L + "'", long15 == 1644572347205L);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        java.lang.String str3 = dateTimeZone1.getID();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight5 = localDate4.toDateMidnight();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology11 = dateTimeFormatter10.getChronolgy();
        boolean boolean12 = dateTimeFormatter10.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateMidnight5.toString(dateTimeFormatter13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNull(chronology11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.Locale locale3 = new java.util.Locale("en_US", "2022-02-11T09:48:50.448Z", "en");
        java.lang.String str4 = locale3.toString();
        org.junit.Assert.assertEquals(locale3.toString(), "en_us_2022-02-11T09:48:50.448Z_en");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "en_us_2022-02-11T09:48:50.448Z_en" + "'", str4, "en_us_2022-02-11T09:48:50.448Z_en");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime15.withMinuteOfHour(35350243);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35350243 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField39 = chronology36.weekyear();
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime(chronology36);
        org.joda.time.DateTime dateTime41 = mutableDateTime19.toDateTime(chronology36);
        int int42 = dateTime41.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = dateTime41.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572351811L + "'", long14 == 1644572351811L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:11.811Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:11.811Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:11.811Z");
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572351811L + "'", long35 == 1644572351811L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 42 + "'", int42 == 42);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj8 = null;
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(obj8, dateTimeZone10);
        org.joda.time.DateTime dateTime13 = localDateTime5.toDateTime(dateTimeZone10);
        boolean boolean15 = dateTime13.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime17 = dateTime13.minusMinutes((int) (short) 10);
        long long18 = dateTime17.getMillis();
        org.joda.time.Chronology chronology19 = dateTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.era();
        org.joda.time.DateTimeField dateTimeField21 = chronology19.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(2022, (int) (byte) 1, 13, 0, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1644572351834L + "'", long18 == 1644572351834L);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withYear(1);
        int int4 = localDateTime1.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.Chronology chronology4 = localTime1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.monthOfYear();
        org.joda.time.LocalDateTime.Property property9 = localDateTime7.year();
        int int10 = localDateTime7.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusWeeks(2);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime7.plusYears((int) (byte) 10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate21 = localDate17.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property22 = localDate21.yearOfEra();
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate29 = localDate25.withWeekyear((int) (byte) -1);
        boolean boolean30 = localDate21.equals((java.lang.Object) localDate29);
        org.joda.time.LocalDate localDate32 = localDate21.minusYears(20);
        int[] intArray33 = localDate32.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) localDateTime14, intArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[-21, 2, 12]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays((int) (byte) 0);
        org.joda.time.LocalDate localDate10 = localDate5.minusDays(1);
        int int11 = localDate5.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-11T09:39:09.880Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:39:09.880Z\" is malformed at \"22-02-11T09:39:09.880Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3);
        mutableDateTime2.addDays((int) (short) 100);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        boolean boolean18 = dateTime16.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime20 = dateTime16.minusMinutes((int) (short) 10);
        long long21 = dateTime20.getMillis();
        org.joda.time.Chronology chronology22 = dateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.era();
        org.joda.time.DateTimeField dateTimeField24 = chronology22.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.weekyear();
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(chronology22);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj31 = null;
        java.util.TimeZone timeZone32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forTimeZone(timeZone32);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(obj31, dateTimeZone33);
        org.joda.time.DateTime dateTime36 = localDateTime28.toDateTime(dateTimeZone33);
        boolean boolean38 = dateTime36.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime40 = dateTime36.minusMinutes((int) (short) 10);
        long long41 = dateTime40.getMillis();
        org.joda.time.Chronology chronology42 = dateTime40.getChronology();
        org.joda.time.DateTime dateTime44 = dateTime40.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.MutableDateTime mutableDateTime47 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology46);
        org.joda.time.ReadableDuration readableDuration48 = null;
        mutableDateTime47.add(readableDuration48, (int) (byte) 10);
        boolean boolean51 = dateTime40.isBefore((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime47.getZone();
        int int53 = mutableDateTime26.compareTo((org.joda.time.ReadableInstant) mutableDateTime47);
        mutableDateTime2.setTime((org.joda.time.ReadableInstant) mutableDateTime47);
        org.joda.time.Chronology chronology55 = mutableDateTime47.getChronology();
        int int56 = mutableDateTime47.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType57 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime47.add(durationFieldType57, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1644572352122L + "'", long21 == 1644572352122L);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime40);
// flaky:         org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1644572352122L + "'", long41 == 1644572352122L);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 70 + "'", int56 == 70);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = property30.addWrapFieldToCopy((int) (short) 100);
        int int33 = localDateTime32.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDateTime32.getFieldType((int) (short) 1);
        int int36 = localDateTime27.get(dateTimeFieldType35);
        boolean boolean37 = dateTime13.isSupported(dateTimeFieldType35);
        org.joda.time.format.DateTimePrinter dateTimePrinter38 = null;
        org.joda.time.format.DateTimeParser dateTimeParser39 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter38, dateTimeParser39);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter42 = dateTimeFormatter40.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter42.withPivotYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = dateTime13.toString(dateTimeFormatter44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572352172L + "'", long14 == 1644572352172L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter42);
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone5);
        long long9 = dateTimeZone5.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone5);
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withLocale(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.parse("2022-02-11T09:38:59.548Z", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572334850L + "'", long9 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone5);
        long long9 = dateTimeZone5.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone5);
        boolean boolean11 = dateTimeFormatter10.isOffsetParsed();
        java.util.Locale locale12 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withLocale(locale12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter14.withDefaultYear(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.parse("0", dateTimeFormatter16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572334850L + "'", long9 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTime dateTime18 = dateTime15.minusMillis(9);
        org.joda.time.DateTime dateTime19 = dateTime18.toDateTimeISO();
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone21);
        long long25 = dateTimeZone21.convertUTCToLocal(1644572334850L);
        org.joda.time.MutableDateTime mutableDateTime26 = dateTime19.toMutableDateTime(dateTimeZone21);
        mutableDateTime26.setMillisOfSecond((int) (byte) 1);
        java.util.TimeZone timeZone29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forTimeZone(timeZone29);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone30);
        mutableDateTime26.setZone(dateTimeZone30);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime26.setDayOfWeek(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644572334850L + "'", long25 == 1644572334850L);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime.Property property3 = localDateTime1.year();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusSeconds(6);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withCenturyOfEra(0);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusHours(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMonthOfYear(640);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 640 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.minusMonths(55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDate2.getFieldType(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int3 = timeZone0.getOffset(1644572333371L);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone0.getOffset((int) 'u', (int) (byte) 1, 580, (-2), 6, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.parse("2022-02-11T09:38:53.244Z");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) mutableDateTime3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime1.compareTo((org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        boolean boolean7 = dateTimeFormatter5.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter5.withZoneUTC();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter5.withPivotYear((java.lang.Integer) 35341772);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.parse("2022-02-11T09:38:58.172Z", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = localDateTime3.toDateTime(dateTimeZone8);
        boolean boolean13 = dateTime11.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMinutes((int) (short) 10);
        long long16 = dateTime15.getMillis();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology17.days();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.halfdays();
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(chronology17);
        org.joda.time.ReadableInstant readableInstant24 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int25 = dateTime1.compareTo(readableInstant24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1644572352653L + "'", long16 == 1644572352653L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.minusYears(0);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfSecond(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTimeField dateTimeField4 = property2.getField();
        java.util.Locale locale8 = new java.util.Locale("en", "2022-02-11T09:38:53.742Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = property2.set("2022-02-11", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "en_2022-02-11T09:38:53.742Z");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusSeconds((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.DateTime dateTime19 = dateTime13.minus(readableDuration18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMillis(59);
        org.joda.time.DateTime dateTime23 = dateTime19.withEra(0);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfDay();
        org.joda.time.DateTime dateTime26 = property25.roundCeilingCopy();
        org.joda.time.format.DateTimePrinter dateTimePrinter28 = null;
        org.joda.time.format.DateTimeParser dateTimeParser29 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter28, dateTimeParser29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime(dateTimeZone32);
        long long36 = dateTimeZone32.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter30.withZone(dateTimeZone32);
        boolean boolean38 = dateTimeFormatter37.isOffsetParsed();
        java.util.Locale locale39 = java.util.Locale.ITALY;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter37.withLocale(locale39);
        java.util.Locale locale41 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str42 = locale41.getISO3Language();
        java.lang.String str43 = locale39.getDisplayName(locale41);
        java.lang.String str44 = locale39.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = property25.setCopy("2022-02-11T09:49:03.828Z", locale39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:49:03.828Z\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572352769L + "'", long14 == 1644572352769L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572334850L + "'", long36 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "it_IT");
        org.junit.Assert.assertNotNull(dateTimeFormatter40);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "fra" + "'", str42, "fra");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "italien (Italie)" + "'", str43, "italien (Italie)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = localDateTime3.toDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime13 = dateTime11.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime15 = dateTime11.minusWeeks((int) (short) 1);
        boolean boolean16 = dateTime15.isAfterNow();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj21 = null;
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone23);
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(obj21, dateTimeZone23);
        org.joda.time.DateTime dateTime26 = localDateTime18.toDateTime(dateTimeZone23);
        boolean boolean28 = dateTime26.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime30 = dateTime26.minusMinutes((int) (short) 10);
        long long31 = dateTime30.getMillis();
        org.joda.time.Chronology chronology32 = dateTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.era();
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfDay();
        org.joda.time.DateTime dateTime35 = dateTime15.withChronology(chronology32);
        org.joda.time.LocalDateTime localDateTime36 = new org.joda.time.LocalDateTime(1644572330722L, chronology32);
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(1644572336727L, chronology32);
        int int38 = dateTime37.getWeekyear();
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime30);
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 1644572352790L + "'", long31 == 1644572352790L);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2022 + "'", int38 == 2022);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds((int) (byte) -1);
        boolean boolean9 = localDateTime1.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        int int10 = localDateTime1.getHourOfDay();
        org.joda.time.Chronology chronology11 = localDateTime1.getChronology();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology11.get(readablePeriod12, 1644572343998L, 1644572347838L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(obj0, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfYear((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.plus(readablePeriod14);
        java.util.Locale.Category category17 = java.util.Locale.Category.DISPLAY;
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj22 = null;
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(obj22, dateTimeZone24);
        org.joda.time.DateTime dateTime27 = localDateTime19.toDateTime(dateTimeZone24);
        boolean boolean29 = dateTime27.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime31 = dateTime27.minusMinutes((int) (short) 10);
        long long32 = dateTime31.getMillis();
        org.joda.time.Chronology chronology33 = dateTime31.getChronology();
        org.joda.time.DateTime dateTime35 = dateTime31.plusHours((int) (short) 10);
        java.lang.Object obj36 = null;
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(obj36, dateTimeZone38);
        int int42 = dateTimeZone38.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime43 = dateTime31.toDateTime(dateTimeZone38);
        java.util.Locale locale45 = java.util.Locale.TAIWAN;
        java.lang.String str46 = locale45.getDisplayScript();
        java.lang.String str47 = dateTimeZone38.getName(0L, locale45);
        java.util.Locale.setDefault(category17, locale45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = localDateTime15.toString("2022-02-11T09:39:08.051Z", locale45);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + category17 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category17.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTime31);
// flaky:         org.junit.Assert.assertTrue("'" + long32 + "' != '" + 1644572352978L + "'", long32 == 1644572352978L);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property13 = localTime12.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.addCopy(9);
        java.lang.Class<?> wildcardClass16 = property13.getClass();
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = localDate7.toDateMidnight();
        java.lang.String str9 = localDate7.toString();
        org.joda.time.LocalDate localDate11 = localDate7.withDayOfWeek(6);
        boolean boolean12 = languageRange1.equals((java.lang.Object) localDate11);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "utc" + "'", str3, "utc");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "utc" + "'", str4, "utc");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-11" + "'", str9, "2022-02-11");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        org.joda.time.DateTime.Property property14 = dateTime9.era();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology17);
        org.joda.time.ReadableDuration readableDuration19 = null;
        mutableDateTime18.add(readableDuration19, (int) (byte) 10);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime(dateTimeZone28);
        boolean boolean33 = dateTime31.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes((int) (short) 10);
        long long36 = dateTime35.getMillis();
        org.joda.time.Chronology chronology37 = dateTime35.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime35.plusHours((int) (short) 10);
        java.lang.Object obj40 = null;
        java.util.TimeZone timeZone41 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forTimeZone(timeZone41);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone42);
        org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime(obj40, dateTimeZone42);
        int int46 = dateTimeZone42.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime47 = dateTime35.toDateTime(dateTimeZone42);
        mutableDateTime18.setZoneRetainFields(dateTimeZone42);
        org.joda.time.MutableDateTime.Property property49 = mutableDateTime18.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime50 = property49.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property51 = mutableDateTime50.minuteOfDay();
        java.util.Locale locale52 = java.util.Locale.getDefault();
        java.lang.String str53 = property51.getAsText(locale52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime54 = property14.setCopy("Taiwan", locale52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Taiwan\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572353171L + "'", long36 == 1644572353171L);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(locale52);
// flaky:         org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "0" + "'", str53, "0");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        java.lang.Object obj5 = null;
        boolean boolean6 = property2.equals(obj5);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(dateTimeZone5);
        long long9 = dateTimeZone5.convertUTCToLocal(1644572334850L);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter3.withZone(dateTimeZone5);
        int int11 = dateTimeFormatter10.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.parse("", dateTimeFormatter10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1644572334850L + "'", long9 == 1644572334850L);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2000 + "'", int11 == 2000);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.Object obj0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(obj0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMonths((int) (short) -1);
        int int4 = localDateTime1.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.minusSeconds((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime6.getValue(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42 + "'", int4 == 42);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusYears((int) (short) 100);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate7 = localDate2.withPeriodAdded(readablePeriod5, 38);
        org.joda.time.LocalDate localDate9 = localDate2.withDayOfYear(10);
        org.joda.time.LocalDate.Property property10 = localDate2.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property12 = localDate2.property(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-11T09:39:09.262Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:39:09.262Z\" is malformed at \"22-02-11T09:39:09.262Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.minuteOfHour();
        int int6 = localDateTime4.getDayOfYear();
        int int7 = localDateTime4.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 42 + "'", int6 == 42);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 13 + "'", int7 == 13);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = mutableDateTime4.toString("2089-04-16T10:54:56.847Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDateTime1.toString("2022-02-11T09:49:11.602Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 916);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 916");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withZoneUTC();
        java.util.Locale locale8 = dateTimeFormatter4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = dateTimeFormatter4.parseLocalDateTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property13 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property13.setCopy(640);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        long long19 = dateTimeZone17.nextTransition(0L);
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = property13.getDifference((org.joda.time.ReadableInstant) mutableDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -1644572953885");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property12 = dateTime9.secondOfDay();
        org.joda.time.DateTime dateTime13 = property12.withMaximumValue();
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime13.toMutableDateTimeISO();
        org.joda.time.DateTime dateTime16 = dateTime13.withMillisOfDay(48);
        org.joda.time.DateTime.Property property17 = dateTime13.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property17.setCopy(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronolgy();
        boolean boolean7 = dateTimeFormatter5.isPrinter();
        boolean boolean8 = dateTimeFormatter5.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.parse("2022-02-11T09:39:04.292Z", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        java.lang.Class<?> wildcardClass2 = mutableDateTime1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int3 = timeZone0.getOffset(1644572333371L);
        boolean boolean4 = timeZone0.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = timeZone0.getOffset(52, 38, (int) (byte) -1, 2000, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-02-11T09:38:59.729Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-11T09:38:59.729Z\" is malformed at \"22-02-11T09:38:59.729Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plus(readablePeriod3);
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMonths(292278993);
        int int8 = localDateTime4.size();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (short) -1);
        int int12 = localDate9.getYear();
        org.joda.time.LocalDate localDate14 = localDate9.withYearOfEra(1);
        org.joda.time.DateTimeField[] dateTimeFieldArray15 = localDate9.getFields();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = localDateTime6.isAfter((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldArray15);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        double double4 = languageRange1.getWeight();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.minusWeeks((int) (short) -1);
        boolean boolean10 = languageRange1.equals((java.lang.Object) localDate9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "utc" + "'", str3, "utc");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.minusMonths(55);
        org.joda.time.LocalDate.Property property11 = localDate2.dayOfWeek();
        java.util.Locale locale13 = java.util.Locale.ROOT;
        java.lang.String str14 = locale13.getISO3Language();
        java.lang.String str15 = locale13.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property11.setCopy("2022-02-11T09:38:58.694Z", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:58.694Z\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime8.plusMillis((int) (short) -1);
        int int11 = localTime10.getMinuteOfHour();
        org.joda.time.LocalTime.Property property12 = localTime10.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property12.setCopy("1970-01-01T00:00:00.004Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.004Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.weekOfWeekyear();
        mutableDateTime18.addYears((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.setDayOfMonth(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.seconds();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.weekyearOfCentury();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.Chronology chronology8 = chronology4.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology8.getDateTimeMillis(1644572343349L, 2022, (int) (short) -1, 2, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.seconds();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 49, chronology5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(1644572336326L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1644572336326");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeFormatter4.parseMillis("13:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear(6);
        java.util.Locale locale5 = java.util.Locale.CHINA;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withLocale(locale5);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds((int) (byte) -1);
        int[] intArray14 = localDateTime11.getValues();
        int int15 = localDateTime11.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.plusMinutes(22);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 7, 35354753]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean4 = charSet2.equals((java.lang.Object) localTime3);
        java.util.Locale locale5 = java.util.Locale.US;
        java.util.Locale locale6 = java.util.Locale.US;
        java.lang.String str7 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale8 = java.util.Locale.US;
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.util.Locale locale11 = java.util.Locale.TAIWAN;
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale[] localeArray13 = new java.util.Locale[] { locale5, locale9, locale11, locale12 };
        java.util.ArrayList<java.util.Locale> localeList14 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList14, localeArray13);
        boolean boolean16 = charSet2.containsAll((java.util.Collection<java.util.Locale>) localeList14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale locale17 = java.util.Locale.lookup(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(localeArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(39, 35341772, 35354, (-1), 0, (int) (short) 0, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        mutableDateTime2.addSeconds(4044);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime2.weekyear();
        java.lang.String str29 = mutableDateTime2.toString();
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022-01-01T02:42:24.010Z" + "'", str29, "2022-01-01T02:42:24.010Z");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight8 = localDate7.toDateMidnight();
        java.lang.String str9 = localDate7.toString();
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        org.joda.time.LocalDate localDate12 = localDate7.plusYears(2022);
        int int13 = localDate7.getYear();
        org.joda.time.LocalDate localDate15 = localDate7.minusMonths(55);
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.minusWeeks((int) (short) -1);
        int int21 = localDate20.getDayOfYear();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = localDate24.toDateMidnight();
        java.lang.String str26 = localDate24.toString();
        org.joda.time.Chronology chronology27 = localDate24.getChronology();
        org.joda.time.LocalDate localDate29 = localDate24.plusYears(2022);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localDate24.getFieldType(0);
        org.joda.time.LocalDate localDate33 = localDate20.withField(dateTimeFieldType31, 55);
        org.joda.time.LocalDate.Property property34 = localDate15.property(dateTimeFieldType31);
        org.joda.time.LocalDate localDate36 = property34.addWrapFieldToCopy(2022);
        org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime();
        org.joda.time.DateTime dateTime38 = localDate36.toDateTime((org.joda.time.ReadableInstant) mutableDateTime37);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = property3.getDifference((org.joda.time.ReadableInstant) dateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -65307894554927");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022-02-11" + "'", str9, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-11" + "'", str26, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = dateTimeFormatter4.getPrinter();
        boolean boolean7 = dateTimeFormatter4.isParser();
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer8, 1644572335421L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertNull(dateTimePrinter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        mutableDateTime2.add(readableDuration17);
        mutableDateTime2.setTime(1, (int) '#', (int) (short) 0, 10);
        mutableDateTime2.setDayOfYear((int) (short) 1);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(chronology26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj30 = null;
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone32);
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(obj30, dateTimeZone32);
        org.joda.time.DateTime dateTime35 = localDateTime27.toDateTime(dateTimeZone32);
        boolean boolean37 = dateTime35.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime39 = dateTime35.minusMinutes((int) (short) 10);
        long long40 = dateTime39.getMillis();
        org.joda.time.Chronology chronology41 = dateTime39.getChronology();
        org.joda.time.DateTime dateTime43 = dateTime39.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology45 = null;
        org.joda.time.MutableDateTime mutableDateTime46 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        mutableDateTime46.add(readableDuration47, (int) (byte) 10);
        boolean boolean50 = dateTime39.isBefore((org.joda.time.ReadableInstant) mutableDateTime46);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(chronology51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj55 = null;
        java.util.TimeZone timeZone56 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone57);
        org.joda.time.LocalDateTime localDateTime59 = new org.joda.time.LocalDateTime(obj55, dateTimeZone57);
        org.joda.time.DateTime dateTime60 = localDateTime52.toDateTime(dateTimeZone57);
        boolean boolean62 = dateTime60.equals((java.lang.Object) 10L);
        org.joda.time.DateTime.Property property63 = dateTime60.secondOfDay();
        int int64 = dateTime39.compareTo((org.joda.time.ReadableInstant) dateTime60);
        mutableDateTime2.setMillis((org.joda.time.ReadableInstant) dateTime60);
        org.joda.time.MutableDateTime.Property property66 = mutableDateTime2.minuteOfHour();
        org.joda.time.DurationField durationField67 = property66.getLeapDurationField();
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1644572355312L + "'", long40 == 1644572355312L);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNull(durationField67);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
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
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = mutableDateTime2.isSupported(dateTimeFieldType17);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime2.weekOfWeekyear();
        org.joda.time.MutableDateTime mutableDateTime21 = property19.set((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.setDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime6.minus(readablePeriod7);
        org.joda.time.Chronology chronology9 = localTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((int) '4', 12, 2000, (int) (byte) 10, 49, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((int) (byte) -1);
        boolean boolean15 = localDate6.equals((java.lang.Object) localDate14);
        org.joda.time.LocalDate localDate17 = localDate6.minusYears(20);
        int[] intArray18 = localDate17.getValues();
        int int19 = localDate17.getWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-21, 2, 12]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-21) + "'", int19 == (-21));
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.monthOfYear();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds((int) (byte) -1);
        boolean boolean16 = localDateTime8.isEqual((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime8.withMinuteOfHour(2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int5 = localDateTime4.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withDayOfWeek(625);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 625 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate5.getFieldType(0);
        int int8 = localDate5.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 40 + "'", int8 == 40);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.parse("2022-02-11T09:39:05.982Z", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology11 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.seconds();
        org.joda.time.DateTimeField dateTimeField13 = chronology11.weekyearOfCentury();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology11);
        org.joda.time.Chronology chronology15 = chronology11.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(35331916, (int) '4', 2, 580, 4044, 35351730, 6, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 580 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.secondOfDay();
        org.joda.time.DurationField durationField19 = chronology15.centuries();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = chronology15.get(readablePeriod20, (long) (short) -1, 1644572344241L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572356087L + "'", long14 == 1644572356087L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyear();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(chronology15);
        java.lang.Object obj20 = mutableDateTime19.clone();
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime19.toMutableDateTimeISO();
        mutableDateTime19.add(1644572332644L);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime19.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = property24.add(1644572329831L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 1644572329831");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572356130L + "'", long14 == 1644572356130L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "2022-02-11T09:49:16.130Z");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "2022-02-11T09:49:16.130Z");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "2022-02-11T09:49:16.130Z");
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) ' ');
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.LocalTime.Property property4 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime6 = property4.addNoWrapToCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withMillisOfSecond(4044);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4044 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.LocalTime localTime6 = localTime4.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime8 = localTime4.withMinuteOfHour(6);
        org.joda.time.LocalTime localTime10 = localTime4.withMillisOfSecond(5);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj15 = null;
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(obj15, dateTimeZone17);
        org.joda.time.DateTime dateTime20 = localDateTime12.toDateTime(dateTimeZone17);
        boolean boolean22 = dateTime20.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime24 = dateTime20.minusMinutes((int) (short) 10);
        long long25 = dateTime24.getMillis();
        java.lang.String str26 = dateTime24.toString();
        org.joda.time.DateTime.Property property27 = dateTime24.hourOfDay();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(chronology28);
        org.joda.time.LocalDateTime.Property property30 = localDateTime29.monthOfYear();
        org.joda.time.LocalDateTime localDateTime32 = property30.addWrapFieldToCopy((int) (short) 100);
        int int33 = localDateTime32.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = localDateTime32.getFieldType((int) (short) 1);
        boolean boolean36 = dateTime24.isSupported(dateTimeFieldType35);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = localTime4.get(dateTimeFieldType35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
// flaky:         org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1644572356192L + "'", long25 == 1644572356192L);
// flaky:         org.junit.Assert.assertEquals("'" + str26 + "' != '" + "2022-02-11T09:39:16.192Z" + "'", str26, "2022-02-11T09:39:16.192Z");
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(obj9, dateTimeZone11);
        org.joda.time.DateTime dateTime14 = localDateTime6.toDateTime(dateTimeZone11);
        boolean boolean16 = dateTime14.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime18 = dateTime14.minusMinutes((int) (short) 10);
        long long19 = dateTime18.getMillis();
        java.lang.String str20 = dateTime18.toString();
        org.joda.time.DateTime.Property property21 = dateTime18.hourOfDay();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime.Property property24 = localDateTime23.monthOfYear();
        org.joda.time.LocalDateTime localDateTime26 = property24.addWrapFieldToCopy((int) (short) 100);
        int int27 = localDateTime26.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = localDateTime26.getFieldType((int) (short) 1);
        boolean boolean30 = dateTime18.isSupported(dateTimeFieldType29);
        int int31 = dateTime3.get(dateTimeFieldType29);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime(chronology32);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj36 = null;
        java.util.TimeZone timeZone37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone38);
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime(obj36, dateTimeZone38);
        org.joda.time.DateTime dateTime41 = localDateTime33.toDateTime(dateTimeZone38);
        boolean boolean43 = dateTime41.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime45 = dateTime41.minusMinutes((int) (short) 10);
        long long46 = dateTime45.getMillis();
        org.joda.time.Chronology chronology47 = dateTime45.getChronology();
        org.joda.time.DateTime dateTime49 = dateTime45.plusHours((int) (short) 10);
        java.lang.Object obj50 = null;
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone52);
        org.joda.time.LocalDateTime localDateTime54 = new org.joda.time.LocalDateTime(obj50, dateTimeZone52);
        int int56 = dateTimeZone52.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime57 = dateTime45.toDateTime(dateTimeZone52);
        java.util.Locale locale59 = java.util.Locale.TAIWAN;
        java.lang.String str60 = locale59.getDisplayScript();
        java.lang.String str61 = dateTimeZone52.getName(0L, locale59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFieldType29, dateTimeZone52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1644572356206L + "'", long19 == 1644572356206L);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-11T09:39:16.206Z" + "'", str20, "2022-02-11T09:39:16.206Z");
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime45);
// flaky:         org.junit.Assert.assertTrue("'" + long46 + "' != '" + 1644572356207L + "'", long46 == 1644572356207L);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "+00:00" + "'", str61, "+00:00");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone6);
        long long10 = dateTimeZone6.convertUTCToLocal(1644572334850L);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(580, 3, 35351730, 22, 2022, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1644572334850L + "'", long10 == 1644572334850L);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = property16.addToCopy((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572356461L + "'", long14 == 1644572356461L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:16.461Z" + "'", str15, "2022-02-11T09:39:16.461Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology5 = localDateTime2.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.seconds();
        org.joda.time.DateTimeField dateTimeField7 = chronology5.weekyearOfCentury();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology5);
        org.joda.time.Chronology chronology9 = chronology5.withUTC();
        org.joda.time.DurationField durationField10 = chronology9.weeks();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 35347015, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        boolean boolean4 = charSet1.contains((java.lang.Object) chronology2);
        java.util.Iterator<java.lang.Character> charItor5 = charSet1.iterator();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
        org.joda.time.LocalDateTime localDateTime13 = property12.getLocalDateTime();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(chronology14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.LocalDateTime localDateTime18 = property16.addWrapFieldToCopy((int) (short) 100);
        int int19 = localDateTime18.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property22 = localDateTime13.property(dateTimeFieldType21);
        boolean boolean23 = charSet1.equals((java.lang.Object) property22);
        java.lang.String str24 = property22.getName();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(charItor5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "monthOfYear" + "'", str24, "monthOfYear");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        boolean boolean2 = timeZone0.hasSameRules(timeZone1);
        int int3 = timeZone0.getRawOffset();
        java.time.ZoneId zoneId4 = timeZone0.toZoneId();
        java.lang.Object obj5 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(zoneId4);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(70, 42, (-2), (-2), 48, 0, (-27403789));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.time.ZoneId zoneId6 = timeZone5.toZoneId();
        int int7 = timeZone5.getDSTSavings();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.yearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withPeriodAdded(readablePeriod7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfMonth(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology5 = dateTimeFormatter4.getChronolgy();
        boolean boolean6 = dateTimeFormatter4.isPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter4.withZoneUTC();
        java.util.Locale locale8 = dateTimeFormatter4.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeFormatter4.parseMillis("6");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(locale8);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withMonthOfYear(39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime4.withMillis((long) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTime4.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withDayOfMonth(35347060);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347060 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        java.lang.String str15 = dateTime13.toString();
        org.joda.time.DateTime.Property property16 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime17 = property16.roundCeilingCopy();
        org.joda.time.DateTime dateTime18 = property16.roundFloorCopy();
        org.joda.time.DateTime dateTime20 = property16.addToCopy((int) (short) 1);
        org.joda.time.DurationField durationField21 = property16.getRangeDurationField();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572357096L + "'", long14 == 1644572357096L);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "2022-02-11T09:39:17.096Z" + "'", str15, "2022-02-11T09:39:17.096Z");
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(1644572353199L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.LocalTime localTime4 = localTime2.minusHours((int) '#');
        org.joda.time.DurationFieldType durationFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime2.withFieldAdded(durationFieldType5, 35347060);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1644572334267L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalTime localTime2 = localTime0.plus(readablePeriod1);
        org.joda.time.LocalTime.Property property3 = localTime2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property3.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.minusYears(48);
        org.joda.time.LocalDate localDate8 = localDate2.minusMonths(23);
        org.joda.time.Interval interval9 = localDate8.toInterval();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime28 = dateTime25.plusHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime25.withHourOfDay(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572357582L + "'", long14 == 1644572357582L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        int int4 = localDate2.getYear();
        org.joda.time.LocalDate.Property property5 = localDate2.yearOfCentury();
        java.util.Locale locale7 = java.util.Locale.US;
        java.util.Locale locale8 = java.util.Locale.US;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property5.setCopy("java.io.IOException: 2022-02-11T09:38:49.281Z", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.io.IOException: 2022-02-11T09:38:49.281Z\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) "minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfHour\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("2022-02-11T09:38:57.813Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022-02-11T09:38:57.813Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.DateTime dateTime6 = dateTime3.minusYears((int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime19 = dateTime15.minusMinutes((int) (short) 10);
        long long20 = dateTime19.getMillis();
        org.joda.time.Chronology chronology21 = dateTime19.getChronology();
        org.joda.time.DateTime dateTime23 = dateTime19.plusHours((int) (short) 10);
        java.lang.Object obj24 = null;
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(obj24, dateTimeZone26);
        int int30 = dateTimeZone26.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime31 = dateTime19.toDateTime(dateTimeZone26);
        mutableDateTime2.setZoneRetainFields(dateTimeZone26);
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime2.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime34 = property33.roundHalfFloor();
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime34.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime36 = property35.roundHalfCeiling();
        int int37 = property35.get();
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
// flaky:         org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1644572358046L + "'", long20 == 1644572358046L);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(35347060, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35347060 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.DateTime dateTime16 = localDateTime8.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime16.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime20 = dateTime16.minusWeeks((int) (short) 1);
        boolean boolean21 = dateTime20.isAfterNow();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj26 = null;
        java.util.TimeZone timeZone27 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forTimeZone(timeZone27);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone28);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(obj26, dateTimeZone28);
        org.joda.time.DateTime dateTime31 = localDateTime23.toDateTime(dateTimeZone28);
        boolean boolean33 = dateTime31.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime35 = dateTime31.minusMinutes((int) (short) 10);
        long long36 = dateTime35.getMillis();
        org.joda.time.Chronology chronology37 = dateTime35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.era();
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfDay();
        org.joda.time.DateTime dateTime40 = dateTime20.withChronology(chronology37);
        org.joda.time.LocalDateTime localDateTime41 = new org.joda.time.LocalDateTime(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((int) (short) 10, 48, 52, 48, 241, 23, (int) (short) 10, chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(dateTime35);
// flaky:         org.junit.Assert.assertTrue("'" + long36 + "' != '" + 1644572358254L + "'", long36 == 1644572358254L);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.seconds();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.weekyearOfCentury();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(19, (int) (short) 100, 11, 2, 35341772, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 35351730);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime15.plusDays((int) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime15.minusWeeks((int) (short) 1);
        boolean boolean20 = dateTime19.isAfterNow();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(chronology21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj25 = null;
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(obj25, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = localDateTime22.toDateTime(dateTimeZone27);
        boolean boolean32 = dateTime30.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime34 = dateTime30.minusMinutes((int) (short) 10);
        long long35 = dateTime34.getMillis();
        org.joda.time.Chronology chronology36 = dateTime34.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = chronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfDay();
        org.joda.time.DateTime dateTime39 = dateTime19.withChronology(chronology36);
        org.joda.time.DateTimeField dateTimeField40 = chronology36.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime(49, 2000, 100, (int) 'u', (int) (short) 0, 600, chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
// flaky:         org.junit.Assert.assertTrue("'" + long35 + "' != '" + 1644572358442L + "'", long35 == 1644572358442L);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeField40);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        int int15 = dateTime13.getSecondOfMinute();
        org.joda.time.DurationFieldType durationFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime13.withFieldAdded(durationFieldType16, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572358529L + "'", long14 == 1644572358529L);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 18 + "'", int15 == 18);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        java.lang.String str14 = dateTime13.toString();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj19 = null;
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(obj19, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = localDateTime16.toDateTime(dateTimeZone21);
        boolean boolean26 = dateTime24.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime28 = dateTime24.minusMinutes((int) (short) 10);
        long long29 = dateTime28.getMillis();
        org.joda.time.Chronology chronology30 = dateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = chronology30.era();
        org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) dateTime13, chronology30);
        // The following exception was thrown during execution in test generation
        try {
            long long37 = chronology30.getDateTimeMillis(52, 11, 86399, 35350243);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-11T09:39:18.592Z" + "'", str14, "2022-02-11T09:39:18.592Z");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
// flaky:         org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1644572358592L + "'", long29 == 1644572358592L);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(chronology3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology7 = localDateTime4.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.centuries();
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(49, 35341772, 625, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getISO3Country();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str1, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "TWN" + "'", str2, "TWN");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withZoneUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeFormatter6.getZone();
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.parse("2022-02-11T09:38:52.644Z", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        int int5 = localDate4.getDayOfYear();
        org.joda.time.LocalDate.Property property6 = localDate4.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy(35341772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35341772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 49 + "'", int5 == 49);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtMidnight();
        org.joda.time.DurationFieldType durationFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate2.withFieldAdded(durationFieldType10, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property2.addWrapFieldToCopy((int) (short) 100);
        int int5 = property2.getMaximumValueOverall();
        org.joda.time.LocalDateTime localDateTime6 = property2.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime8 = property2.addToCopy((int) ' ');
        org.joda.time.DurationField durationField9 = property2.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property2.setCopy("2022-02-11T09:39:05.982Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:39:05.982Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        int int3 = timeZone0.getOffset(1644572333371L);
        boolean boolean4 = timeZone0.observesDaylightTime();
        timeZone0.setRawOffset((int) 'u');
        java.util.Locale locale9 = java.util.Locale.ROOT;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = locale9.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = timeZone0.getDisplayName(false, 100, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.lang.String str28 = locale27.getDisplayScript();
        java.lang.String str29 = dateTimeZone20.getName(0L, locale27);
        java.lang.Object obj30 = locale27.clone();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572359001L + "'", long14 == 1644572359001L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertEquals(obj30.toString(), "zh_TW");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj30), "zh_TW");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj30), "zh_TW");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        java.lang.String str4 = localDate2.toString();
        org.joda.time.Chronology chronology5 = localDate2.getChronology();
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(2022);
        int int8 = localDate2.getYear();
        org.joda.time.LocalDate localDate10 = localDate2.withYear(35331916);
        org.joda.time.LocalDate.Property property11 = localDate2.centuryOfEra();
        java.util.Locale locale13 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property11.setCopy("\u53f0\u7063", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"??\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("UTC");
        double double2 = languageRange1.getWeight();
        java.lang.String str3 = languageRange1.getRange();
        java.lang.String str4 = languageRange1.getRange();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology9);
        org.joda.time.LocalTime localTime12 = localTime10.minusHours((int) '#');
        org.joda.time.LocalTime localTime14 = localTime12.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime15 = localTime7.withFields((org.joda.time.ReadablePartial) localTime14);
        org.joda.time.LocalTime localTime17 = localTime7.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property18 = localTime7.millisOfSecond();
        org.joda.time.LocalTime.Property property19 = localTime7.minuteOfHour();
        org.joda.time.LocalTime localTime20 = property19.roundCeilingCopy();
        boolean boolean21 = languageRange1.equals((java.lang.Object) localTime20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "utc" + "'", str3, "utc");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "utc" + "'", str4, "utc");
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        mutableDateTime2.add(readableDuration3, (int) (byte) 10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj10 = null;
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(obj10, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = localDateTime7.toDateTime(dateTimeZone12);
        mutableDateTime2.setDate((org.joda.time.ReadableInstant) dateTime15);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime2.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime18 = property17.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime18.weekOfWeekyear();
        int int20 = property19.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = property19.set("2022-02-11T09:38:57.549Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:38:57.549Z\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.Locale locale0 = java.util.Locale.US;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.MIDNIGHT;
        boolean boolean3 = charSet1.equals((java.lang.Object) localTime2);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) (byte) 1);
        mutableDateTime5.setMillis(1644572329999L);
        mutableDateTime5.setMillis(0L);
        boolean boolean10 = charSet1.contains((java.lang.Object) 0L);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 10);
        org.joda.time.Chronology chronology16 = dateTimeFormatter15.getChronolgy();
        org.joda.time.format.DateTimePrinter dateTimePrinter17 = dateTimeFormatter15.getPrinter();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter15.withDefaultYear((int) (byte) 0);
        boolean boolean20 = charSet1.remove((java.lang.Object) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = charSet1.add((java.lang.Character) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNull(chronology16);
        org.junit.Assert.assertNull(dateTimePrinter17);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DurationField durationField18 = chronology15.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = chronology15.getDateTimeMillis((int) '4', 35350603, 409, 916, 2922789, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 916 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572359204L + "'", long14 == 1644572359204L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.Chronology chronology4 = localDateTime1.getChronology();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withCenturyOfEra(49);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.minus(readablePeriod7);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.addToCopy(1644572349262L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1644572349262 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(916, (-2), 279);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 916 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = dateTime3.toLocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear((int) ' ');
        org.joda.time.DurationFieldType durationFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight3 = localDate2.toDateMidnight();
        org.joda.time.LocalDate localDate5 = localDate2.withWeekyear((int) (short) 1);
        java.util.Date date6 = localDate5.toDate();
        org.joda.time.LocalDate localDate8 = localDate5.minusDays((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate5.withDayOfYear((-27403789));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27403789 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Feb 09 00:00:00 UTC 1");
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(zoneId1);
        timeZone2.setID("2022-02-11T09:39:04.430Z");
        int int5 = timeZone2.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay(1L, chronology4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) '#');
        org.joda.time.LocalTime localTime9 = localTime7.withMinuteOfHour(0);
        org.joda.time.LocalTime localTime10 = localTime2.withFields((org.joda.time.ReadablePartial) localTime9);
        org.joda.time.LocalTime localTime12 = localTime2.withHourOfDay((int) (byte) 0);
        org.joda.time.LocalTime.Property property13 = localTime2.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property13.setCopy(640);
        org.joda.time.LocalTime localTime16 = property13.getLocalTime();
        org.joda.time.LocalTime localTime17 = property13.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = property13.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime17);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(obj5, dateTimeZone7);
        org.joda.time.DateTime dateTime10 = localDateTime2.toDateTime(dateTimeZone7);
        boolean boolean12 = dateTime10.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime14 = dateTime10.minusMinutes((int) (short) 10);
        long long15 = dateTime14.getMillis();
        org.joda.time.Chronology chronology16 = dateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime((long) 'a', chronology16);
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime17.minuteOfHour();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime(chronology19);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj23 = null;
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(obj23, dateTimeZone25);
        org.joda.time.DateTime dateTime28 = localDateTime20.toDateTime(dateTimeZone25);
        boolean boolean30 = dateTime28.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime32 = dateTime28.minusMinutes((int) (short) 10);
        long long33 = dateTime32.getMillis();
        org.joda.time.Chronology chronology34 = dateTime32.getChronology();
        org.joda.time.DateTime dateTime36 = dateTime32.plusSeconds((int) (short) 100);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((long) (byte) 100, chronology38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        mutableDateTime39.add(readableDuration40, (int) (byte) 10);
        boolean boolean43 = dateTime32.isBefore((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.DateTimeZone dateTimeZone44 = mutableDateTime39.getZone();
        mutableDateTime39.addMonths((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod47 = null;
        mutableDateTime39.add(readablePeriod47);
        mutableDateTime17.setMillis((org.joda.time.ReadableInstant) mutableDateTime39);
        org.joda.time.ReadableDuration readableDuration50 = null;
        mutableDateTime39.add(readableDuration50, 59);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime39.setDayOfMonth((-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1644572359551L + "'", long15 == 1644572359551L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTime32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1644572359551L + "'", long33 == 1644572359551L);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.Object obj0 = null;
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(obj0, dateTimeZone2);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.time.ZoneId zoneId6 = timeZone5.toZoneId();
        boolean boolean7 = timeZone5.useDaylightTime();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj4 = null;
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(obj4, dateTimeZone6);
        org.joda.time.DateTime dateTime9 = localDateTime1.toDateTime(dateTimeZone6);
        boolean boolean11 = dateTime9.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime13 = dateTime9.minusMinutes((int) (short) 10);
        long long14 = dateTime13.getMillis();
        org.joda.time.Chronology chronology15 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime17 = dateTime13.plusHours((int) (short) 10);
        java.lang.Object obj18 = null;
        java.util.TimeZone timeZone19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(obj18, dateTimeZone20);
        int int24 = dateTimeZone20.getOffset((long) (byte) -1);
        org.joda.time.DateTime dateTime25 = dateTime13.toDateTime(dateTimeZone20);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTime25.getZone();
        org.joda.time.DateTime dateTime28 = dateTime25.plusHours((int) (byte) 10);
        org.joda.time.DateTime dateTime30 = dateTime25.minusMillis(916);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime30.withCenturyOfEra(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1644572359666L + "'", long14 == 1644572359666L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) -1);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfEra();
        org.joda.time.LocalDate localDate9 = localDate6.minusMonths((int) (byte) 10);
        int int10 = localDate9.getWeekyear();
        java.lang.Object obj11 = null;
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(obj11, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        int int17 = localDateTime15.getDayOfYear();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.monthOfYear();
        org.joda.time.LocalDateTime localDateTime22 = property20.addWrapFieldToCopy((int) (short) 100);
        int int23 = localDateTime22.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = localDateTime22.getFieldType((int) (short) 1);
        org.joda.time.LocalDateTime.Property property26 = localDateTime15.property(dateTimeFieldType25);
        int int27 = localDateTime15.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime29 = localDateTime15.minusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localDate9.compareTo((org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-2) + "'", int10 == (-2));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) (byte) 1);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.centuryOfEra();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
        org.joda.time.MutableDateTime mutableDateTime5 = property3.set(40);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone7);
        mutableDateTime5.setDate((org.joda.time.ReadableInstant) dateTime9);
        org.joda.time.format.DateTimePrinter dateTimePrinter11 = null;
        org.joda.time.format.DateTimeParser dateTimeParser12 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter11, dateTimeParser12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter13.withPivotYear((int) (short) 10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter17 = dateTimeFormatter15.withPivotYear((java.lang.Integer) 2022);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime9.toString(dateTimeFormatter15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
        org.junit.Assert.assertNotNull(dateTimeFormatter17);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (short) -1);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(chronology2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfWeek((int) (byte) 1);
        java.lang.Object obj6 = null;
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(obj6, dateTimeZone8);
        org.joda.time.DateTime dateTime11 = localDateTime3.toDateTime(dateTimeZone8);
        boolean boolean13 = dateTime11.equals((java.lang.Object) 10L);
        org.joda.time.DateTime dateTime15 = dateTime11.minusMinutes((int) (short) 10);
        long long16 = dateTime15.getMillis();
        org.joda.time.Chronology chronology17 = dateTime15.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.era();
        org.joda.time.DateTimeField dateTimeField19 = chronology17.yearOfCentury();
        org.joda.time.DurationField durationField20 = chronology17.days();
        org.joda.time.DurationField durationField21 = chronology17.hours();
        org.joda.time.DurationField durationField22 = chronology17.halfdays();
        org.joda.time.DateTime dateTime23 = dateTime1.toDateTime(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((-27403789));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27403789 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1644572359879L + "'", long16 == 1644572359879L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfMonth(12);
        int int6 = localDateTime5.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property7 = localDateTime5.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withHourOfDay((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime5.withDayOfMonth((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }
}
