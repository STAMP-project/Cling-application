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
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) 10.0f, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) false, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((java.lang.Object) (byte) 0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dateMidnight2.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        boolean boolean4 = locale0.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime4.toString("gen");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateMidnight9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) duration12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withYearOfCentury((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(1970, (int) (short) 100, (int) (short) -1, 52, (int) (short) 1, (int) 'a', chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '#', (int) (short) -1, (int) (short) 0, 17, (int) (byte) 100, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        int int8 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate14.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localDate14.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime7.toDateTime(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((int) (short) 10, (int) (byte) 10, (int) (byte) -1, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withDayOfMonth((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(13, (int) 'a', chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 10, (int) '#', (int) (byte) -1, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localDate6.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = chronology10.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object) 17, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withDate(11, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        long long6 = java.util.Date.UTC(0, 1, (int) (byte) 0, (int) (short) 1, 100, 4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2206387196000L) + "'", long6 == (-2206387196000L));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay((int) (byte) 1, (int) (short) 0, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.DateTime dateTime9 = localDate2.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate2.withEra((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(1961, 10, 8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1961 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.joda.time.Period period8 = new org.joda.time.Period(1970, (int) (byte) 0, 0, 1, 100, (int) '4', (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str2, "java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(1961, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDate localDate14 = localDate8.withDayOfMonth(13);
        org.joda.time.Chronology chronology15 = localDate14.getChronology();
        mutablePeriod4.add((long) ' ', chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(10, 52, (int) (byte) 10, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "weekyear", "weekyear" };
        java.util.LinkedHashSet<java.lang.String> strSet6 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet6, strArray5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = localDate9.getField(1);
        boolean boolean12 = strSet6.remove((java.lang.Object) 1);
        java.lang.Object obj13 = null;
        boolean boolean14 = strSet6.contains(obj13);
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet6);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone28 = dateMidnight27.getZone();
        org.joda.time.DateTime dateTime29 = localDate21.toDateTimeAtMidnight(dateTimeZone28);
        boolean boolean31 = dateTimeZone28.isStandardOffset((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) strList15, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = calendar1.getCalendarType();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate11 = localDate5.withDayOfMonth(13);
        org.joda.time.Chronology chronology12 = localDate11.getChronology();
        boolean boolean13 = calendar1.equals((java.lang.Object) chronology12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454832797,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=797,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gregory" + "'", str2, "gregory");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property17.addToCopy(53221161);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime4.withEra(53221515);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221515 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) dateTime4, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime0.getField(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.Duration duration12 = period6.toDurationTo((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.ReadableDuration readableDuration13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = duration12.compareTo(readableDuration13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration12);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.Date date3 = new java.util.Date(2, (int) '#', (int) '#');
        date3.setSeconds(11);
        java.lang.String str6 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Wed Jan 04 00:00:11 UTC 1905");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Wed Jan 04 00:00:11 UTC 1905" + "'", str6, "Wed Jan 04 00:00:11 UTC 1905");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight12.getZone();
        org.joda.time.DateTime dateTime14 = localDate6.toDateTimeAtMidnight(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((java.lang.Object) 2022, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        java.lang.Object obj7 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        calendar1.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.set(53221515, 53221161);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221515");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(53221161, (int) (short) 100, 4, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate5.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 32769);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = dateTimeZone6.getShortName((long) 1970, locale10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone6);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime13.withMillisOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(chronology4);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDate5.toDateTimeAtCurrentTime(dateTimeZone6);
        int int8 = instant3.compareTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        boolean boolean17 = localDate14.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = localDate14.getChronology();
        org.joda.time.DateTime dateTime19 = dateTime7.toDateTime(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(53221161, 0, (-1), chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221161 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime11.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.minusSeconds(0);
        int[] intArray11 = new int[] { (short) -1, 2 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = dateTimeField3.addWrapField((org.joda.time.ReadablePartial) timeOfDay7, 17, intArray11, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 2]");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454835220,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=220,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localTime11.toString("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.util.Date date3 = new java.util.Date(53221515, (int) (byte) 1, (int) 'a');
        date3.setTime((long) 1);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("gen");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"gen\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute(0);
        org.joda.time.Instant instant16 = dateTime12.toInstant();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) dateTime12, periodType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime4.withMonthOfYear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        int[] intArray2 = new int[] { 1970 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setFields(intArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1970]");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar1.getActualMinimum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454835876,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=15,MILLISECOND=876,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        int int7 = calendar1.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Etc/UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withFieldAdded(durationFieldType2, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withYearOfCentury(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withMinuteOfHour(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType(53221161);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221161");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.dayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) dateMidnight5, periodType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateMidnight");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(periodType7);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusMonths((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds3 = period2.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.util.Date date3 = new java.util.Date(2, (int) '#', (int) '#');
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone16 = dateMidnight15.getZone();
        org.joda.time.DateTime dateTime17 = localDate9.toDateTimeAtMidnight(dateTimeZone16);
        boolean boolean18 = date3.equals((java.lang.Object) dateTime17);
        org.junit.Assert.assertEquals(date3.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.withMonthOfYear(709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(100);
        java.lang.Class<?> wildcardClass19 = localTime16.getClass();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate9.withDayOfMonth(13);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.DateTime dateTime17 = dateMidnight5.toDateTime(chronology16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((java.lang.Object) 100.0d, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("-0033-08-30T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: -0033-08-30T00:00:00.000Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale7.toLanguageTag();
        java.lang.String str9 = dateMidnight2.toString("+00:00", locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = dateMidnight2.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en" + "'", str8, "en");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.parse("weekyear", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight5.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight7.getZone();
        int int10 = dateTimeZone8.getStandardOffset((long) 32769);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = dateTimeZone8.getShortName((long) 1970, locale12);
        org.joda.time.DateTime dateTime14 = dateMidnight2.toDateTime(dateTimeZone8);
        int int15 = dateTime14.getHourOfDay();
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight5 = dateTime4.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        org.joda.time.DateTime dateTime12 = dateTime4.toDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((java.lang.Object) 100, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate12 = localDate6.withDayOfMonth(13);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        mutablePeriod1.setPeriod((long) 10, (-599990L), chronology13);
        mutablePeriod1.addMonths(15);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = dateTimeFormatter3.parseMillis("DurationField[days]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\ubbf8\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, (int) (short) 10, 0, 1961);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1961 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        calendar1.set((int) (short) -1, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 17);
        boolean boolean14 = calendar1.equals((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=-1,MONTH=100,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=-1,MINUTE=17,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight2.year();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minus((org.joda.time.ReadablePeriod) period17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime12.minusDays((int) '4');
        int int21 = property11.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime12.withHourOfDay(596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 596 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.lang.Appendable appendable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (long) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Wed Jan 04 00:00:11 UTC 1905");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Wed Jan 04 00:00:11 UTC 1905\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay((java.lang.Object) timeOfDay1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval33 = interval31.withEndMillis((long) 47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        java.util.Locale locale0 = java.util.Locale.US;
        java.lang.String str1 = locale0.getDisplayName();
        java.lang.String str2 = locale0.getVariant();
        java.lang.String str3 = locale0.getLanguage();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "inglese (Stati Uniti)" + "'", str1, "inglese (Stati Uniti)");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "en" + "'", str3, "en");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime.Property property17 = dateTime4.era();
        org.joda.time.DateTime dateTime18 = dateTime4.withTimeAtStartOfDay();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        int int21 = calendar20.getFirstDayOfWeek();
        boolean boolean22 = dateTime4.equals((java.lang.Object) calendar20);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1645454838095,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=18,MILLISECOND=95,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate16.isSupported(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        org.joda.time.LocalDate localDate22 = localDate16.minusDays(100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight5.withFields((org.joda.time.ReadablePartial) localDate16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.withMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateMidnight23);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.parse("1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeOfDay3.toString("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("\ubbf8\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) 'a');
        org.joda.time.Period period8 = new org.joda.time.Period();
        org.joda.time.Period period10 = period8.minusYears(10);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType14 = period10.getFieldType(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(4);
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.Period period13 = period11.minusMonths((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period13, 1);
        org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay19 = timeOfDay17.minusMillis(10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDateTime8.compareTo((org.joda.time.ReadablePartial) timeOfDay17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(timeOfDay19);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = org.joda.time.Instant.parse("Etc/UTC", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate2.getYear();
        org.joda.time.LocalDate localDate9 = localDate2.withYearOfCentury((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        mutablePeriod1.setDays(53221655);
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(100);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(11);
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = localTime20.toString("weekyear-gregory", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        java.util.Locale locale9 = new java.util.Locale("weekyear", "java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]", "gregory");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property4.setCopy("weekyear", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyear\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals(locale9.toString(), "weekyear_JAVA.UTIL.GREGORIANCALENDAR[TIME=1645454832420,AREFIELDSSET=TRUE,AREALLFIELDSSET=TRUE,LENIENT=TRUE,ZONE=SUN.UTIL.CALENDAR.ZONEINFO[ID=\"ETC/UTC\",OFFSET=0,DSTSAVINGS=0,USEDAYLIGHT=FALSE,TRANSITIONS=0,LASTRULE=NULL],FIRSTDAYOFWEEK=2,MINIMALDAYSINFIRSTWEEK=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]_gregory");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withDayOfWeek((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        int int4 = mutableDateTime1.getMillisOfDay();
        mutableDateTime1.setDayOfYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.Duration duration19 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration19);
        java.lang.String str21 = mutableDateTime1.toString();
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53221180 + "'", int4 == 53221180);
        org.junit.Assert.assertNotNull(duration19);
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "2022-04-10T14:47:01.180Z" + "'", str21, "2022-04-10T14:47:01.180Z");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateMidnight.Property property11 = dateMidnight2.year();
        int int12 = dateMidnight2.getYearOfCentury();
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 70 + "'", int12 == 70);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("DurationField[days]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DurationField[days] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.hourOfHalfday();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(0);
        int[] intArray21 = new int[] {};
        java.util.Locale locale23 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField10.set((org.joda.time.ReadablePartial) localDateTime17, 6, intArray21, "gregory", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        int int13 = dateTimeZone11.getStandardOffset((long) 32769);
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = dateTimeZone11.getShortName((long) 1970, locale15);
        org.joda.time.DateTime dateTime17 = dateMidnight5.toDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(10, 366, (int) '#', dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) 'a', 2, (int) ' ', 14, 53221180);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221180 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = yearMonthDay19.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = dateMidnight9.withDayOfWeek(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.withWeeks(709);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = period8.withField(durationFieldType9, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withMonthOfYear(1961);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1961 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454839918,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=19,MILLISECOND=918,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException" + "'", str2, "java.io.IOException");
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer4 = null;
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        int int11 = instant6.compareTo((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute(0);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, readableDuration25);
        org.joda.time.Duration duration27 = period21.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Instant instant28 = instant14.minus((org.joda.time.ReadableDuration) duration27);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime10, (org.joda.time.ReadableDuration) duration27);
        org.joda.time.Period period30 = new org.joda.time.Period(readableDuration5, (org.joda.time.ReadableInstant) dateTime10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadableInstant) dateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(instant28);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("gen");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"gen\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 10, (int) (byte) 0, 366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 32769);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = dateTimeZone6.getShortName((long) 1970, locale10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone6);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField15 = localTime13.getField((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) (byte) 10, 32769, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, readableInstant5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '4', 53221147, 32769, (int) '#', (int) (short) 10, 1961, 53221655);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) (byte) -1, 234);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.withHourOfDay(53221394);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221394 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("ISOChronology[UTC]", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime16 = property12.addCopy(366);
        org.joda.time.LocalTime localTime18 = property12.addWrapFieldToCopy(11);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime18.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight13.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.minusDays((int) 'a');
        java.util.Locale locale18 = java.util.Locale.ENGLISH;
        java.lang.String str19 = locale18.toLanguageTag();
        java.lang.String str20 = dateMidnight13.toString("+00:00", locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateMidnight2.toString("DurationField[days]", locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "en" + "'", str19, "en");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (byte) 100);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay7.minusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localDate5.isEqual((org.joda.time.ReadablePartial) timeOfDay7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("en");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: en [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay5 = property4.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.dayOfMonth();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(chronology13);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = localDate14.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) 'a');
        org.joda.time.DateTime dateTime26 = dateTime16.withField(dateTimeFieldType22, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight8.withField(dateTimeFieldType22, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property29 = timeOfDay5.property(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateMidnight28);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property3.setCopy("gregory");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfEvenCopy();
        java.util.Locale locale6 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        int int8 = property3.getMaximumShortTextLength(locale6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeField dateTimeField12 = localDate10.getField(1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate18);
        boolean boolean20 = localDate10.isEqual((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate26, (org.joda.time.ReadablePartial) localDate29);
        org.joda.time.LocalDate localDate32 = localDate26.withDayOfMonth(13);
        org.joda.time.Chronology chronology33 = localDate32.getChronology();
        mutablePeriod22.add((long) ' ', chronology33);
        org.joda.time.LocalDate localDate35 = localDate10.minus((org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 'a', dateTimeZone39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) 'a', dateTimeZone42);
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate40, (org.joda.time.ReadablePartial) localDate43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = localDate43.isSupported(dateTimeFieldType45);
        org.joda.time.Chronology chronology47 = localDate43.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.dayOfYear();
        mutablePeriod22.setPeriod((long) 11, (long) '4', chronology47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period50 = new org.joda.time.Period((java.lang.Object) locale6, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTimeFormatter2.parseDateTime("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('#', "1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        java.lang.String str4 = dateTimeField3.getName();
        int int5 = dateTimeField3.getMaximumValue();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (short) 10);
        int[] intArray13 = new int[] { 15, 15, 6, 1 };
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        java.util.Locale locale25 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale25);
        java.util.Set<java.lang.String> strSet27 = locale25.getUnicodeLocaleAttributes();
        java.lang.String str28 = localDate17.toString("+00:00", locale25);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField3.set((org.joda.time.ReadablePartial) localTime7, 3, intArray13, "hi!", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "monthOfYear" + "'", str4, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[15, 15, 6, 1]");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "it");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(366, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.Object obj1 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds(0);
        org.joda.time.Chronology chronology13 = localDateTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(3, 53221394, (int) '#', 120, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221394 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZone0.getOffset(53221550, (int) (byte) 10, 53221550, (int) (byte) -1, 70, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        long long5 = dateTimeField3.roundHalfEven((-53221620L));
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        int int33 = dateTimeZone31.getStandardOffset((long) 32769);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = dateTimeZone31.getShortName((long) 1970, locale35);
        org.joda.time.DateTime dateTime37 = dateMidnight25.toDateTime(dateTimeZone31);
        boolean boolean38 = instant7.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime37.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime41 = dateTime37.withYearOfCentury(366);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateMidnight9.getZone();
        org.joda.time.DateTime dateTime11 = dateTime3.toDateTime(dateTimeZone10);
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTime3.toString("PT0S", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate16.isSupported(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        org.joda.time.LocalDate localDate22 = localDate16.minusDays(100);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight5.withFields((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plus(readablePeriod24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = dateMidnight23.withMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone4.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone4);
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale7);
        java.util.Set<java.lang.String> strSet9 = locale7.getUnicodeLocaleAttributes();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(timeZone4, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap11 = calendar1.getDisplayNames(14, 7, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454841784,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=21,MILLISECOND=784,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1645454841784,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=21,MILLISECOND=784,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(100);
        java.lang.String str19 = localTime16.toString();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "05:34:23.314" + "'", str19, "05:34:23.314");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        int int12 = localDate9.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDate9.getFieldType(596);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 596");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((-1));
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusYears(13);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withSecondOfMinute(3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeOfDay1.compareTo((org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-1), 3, 0, 234, 709, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 234 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withField(dateTimeFieldType10, (int) 'a');
        org.joda.time.DateTime dateTime14 = dateTime4.withField(dateTimeFieldType10, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.DateTime dateTime21 = dateTime14.withZoneRetainFields(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 53221161, dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = localDate23.withEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Etc/UTC" + "'", str22, "Etc/UTC");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime(dateTimeZone5);
        org.joda.time.LocalDate localDate7 = dateTime6.toLocalDate();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = localDate9.toDateTimeAtCurrentTime(dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = dateTime11.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = dateTime6.withZoneRetainFields(dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(53221161, 13, (int) (short) 10, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withSecondOfMinute(3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusWeeks((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withTime(1, 53221, (int) (byte) 10, 53221197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("ISOChronology[UTC]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(53221550, (int) (short) 100, 53221180);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221550 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.lang.String str1 = locale0.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(53221147, 366, (int) 'a', 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (long) 53221550);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        int int5 = property4.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = property4.setCopy("java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 59 + "'", int5 == 59);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str3 = dateTimeFieldType2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withField(dateTimeFieldType2, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "weekyear" + "'", str3, "weekyear");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.withDayOfMonth((int) (short) 1);
        int int12 = dateMidnight9.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.plusDays((int) (short) 10);
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar16 = java.util.Calendar.getInstance(locale15);
        java.util.Calendar calendar17 = dateMidnight14.toCalendar(locale15);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer4, (org.joda.time.ReadableInstant) dateMidnight14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645454843275,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=23,MILLISECOND=275,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1646265600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=62,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property4.setCopy((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight6.getZone();
        int int9 = dateTimeZone7.getStandardOffset((long) 32769);
        java.util.Locale locale11 = java.util.Locale.US;
        java.lang.String str12 = dateTimeZone7.getShortName((long) 1970, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 366, (long) (byte) -1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+00:00" + "'", str12, "+00:00");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime3.withField(dateTimeFieldType9, (int) (short) 0);
        org.joda.time.DateTime.Property property14 = dateTime3.hourOfDay();
        org.joda.time.DateTime dateTime15 = property14.getDateTime();
        int int16 = dateTime15.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        java.io.Writer writer4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadablePartial) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        java.lang.String str4 = dateTimeField3.getName();
        long long6 = dateTimeField3.roundCeiling((long) (byte) 100);
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField3.set((long) 178, "coreano", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"coreano\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "monthOfYear" + "'", str4, "monthOfYear");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2678400000L + "'", long6 == 2678400000L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.TimeOfDay.Property property4 = timeOfDay3.minuteOfHour();
        org.joda.time.TimeOfDay timeOfDay5 = property4.withMaximumValue();
        java.lang.String str6 = property4.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = property4.setCopy(53221161);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221161 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0" + "'", str6, "0");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        int int3 = localDateTime2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str5 = dateTimeFieldType4.toString();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withWeekOfWeekyear(47);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.plusYears((int) (short) -1);
        int int11 = localDateTime10.getMonthOfYear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weekyear" + "'", str5, "weekyear");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateMidnight17.getZone();
        org.joda.time.DateTime dateTime19 = localDate11.toDateTimeAtMidnight(dateTimeZone18);
        boolean boolean21 = dateTimeZone18.isStandardOffset((long) (byte) 10);
        mutableDateTime1.setZone(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime1.millisOfSecond();
        org.joda.time.Instant instant24 = mutableDateTime1.toInstant();
        boolean boolean26 = instant24.isEqual((long) (byte) 1);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate9.withField(dateTimeFieldType13, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguage("2035-02-21T14:47:22.387");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2035-02-21T14:47:22.387 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        long long13 = durationField10.subtract((long) 4, (-2206387196000L));
        int int16 = durationField10.getDifference((long) 53221, 8640000000L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 132383231760000004L + "'", long13 == 132383231760000004L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-143999) + "'", int16 == (-143999));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.DateTime dateTime9 = localDate8.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withMonthOfYear(596);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 596 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate13 = localDate7.withDayOfMonth(13);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        mutablePeriod2.setPeriod((long) 10, (-599990L), chronology14);
        mutablePeriod2.addSeconds(13);
        mutablePeriod2.clear();
        org.joda.time.Period period19 = period0.minus((org.joda.time.ReadablePeriod) mutablePeriod2);
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 'a', dateTimeZone26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate24, (org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate24.withDayOfMonth(13);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 0, periodType21, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay((java.lang.Object) period0, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay3.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.plusMillis(2022);
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeOfDay6.toString("-0033-08-30T00:00:00.000Z", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        boolean boolean4 = property3.isLeap();
        org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfEvenCopy();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateMidnight5);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3);
        int int5 = period4.size();
        java.lang.String str6 = period4.toString();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period9 = period4.withField(durationFieldType7, 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate12, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate12.withDayOfMonth(13);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.DateTimeField dateTimeField20 = chronology19.hourOfHalfday();
        org.joda.time.DurationField durationField21 = durationFieldType7.getField(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology19.getDateTimeMillis((long) 12, 23, 12, 804, 53221161);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 804 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0S" + "'", str6, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate12 = localDate6.withDayOfMonth(13);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        mutablePeriod1.setPeriod((long) 10, (-599990L), chronology13);
        mutablePeriod1.setWeeks(2022);
        org.joda.time.Period period17 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod18 = period17.toMutablePeriod();
        mutablePeriod18.setPeriod((-1L));
        mutablePeriod1.add((org.joda.time.ReadablePeriod) mutablePeriod18);
        mutablePeriod18.clear();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(mutablePeriod18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        mutableDateTime8.setSecondOfMinute((int) (byte) 1);
        int int11 = mutableDateTime8.getMillisOfDay();
        int int12 = mutableDateTime8.getHourOfDay();
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate20, (org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate26 = localDate20.withDayOfMonth(13);
        org.joda.time.Chronology chronology27 = localDate26.getChronology();
        mutablePeriod15.setPeriod((long) 10, (-599990L), chronology27);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((-1968L), chronology27);
        org.joda.time.DateTimeZone dateTimeZone30 = chronology27.getZone();
        mutableDateTime8.setZoneRetainFields(dateTimeZone30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime((int) (short) 100, 53221407, 47, 97, 4, 4, 53221550, dateTimeZone30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53221116 + "'", int11 == 53221116);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(366, 11, 53221, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate2.getYear();
        org.joda.time.LocalDate localDate9 = localDate2.withYearOfCentury((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withDayOfMonth(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.PeriodType periodType10 = periodType8.withDaysRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period(8, 685, 1, 721437, 7, 53221147, 23, (int) (short) 0, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.Object obj2 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454845456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=25,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "java.util.GregorianCalendar[time=1645454845456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=25,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "java.util.GregorianCalendar[time=1645454845456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=25,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "java.util.GregorianCalendar[time=1645454845456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=25,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.util.Date date6 = new java.util.Date((int) (byte) -1, 32769, 4, (int) (byte) 1, (int) (short) 10, 11);
        date6.setHours((int) (short) -1);
        date6.setYear(14);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Oct 03 23:10:11 UTC 1914");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType16 = periodType15.withSecondsRemoved();
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, (org.joda.time.ReadableInstant) dateMidnight12, periodType16);
        org.joda.time.DateMidnight.Property property18 = dateMidnight9.year();
        java.util.Locale locale19 = java.util.Locale.ITALIAN;
        java.lang.String str20 = property18.getAsText(locale19);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime22 = instant21.toMutableDateTime();
        mutableDateTime22.setSecondOfMinute((int) (byte) 1);
        mutableDateTime22.setSecondOfMinute(52);
        mutableDateTime22.setMillisOfSecond((int) ' ');
        long long29 = property18.getDifferenceAsLong((org.joda.time.ReadableInstant) mutableDateTime22);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone35 = dateMidnight34.getZone();
        mutableDateTime22.setZoneRetainFields(dateTimeZone35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(234, 0, 0, 3, 53221197, (int) '#', 53221098, dateTimeZone35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221197 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-52L) + "'", long29 == (-52L));
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths((int) (byte) 10);
        boolean boolean7 = dateMidnight6.isEqualNow();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.minusWeeks(53221032);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(chronology32);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = localDate33.toDateTimeAtCurrentTime(dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight36 = dateTime35.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone42 = dateMidnight41.getZone();
        org.joda.time.DateTime dateTime43 = dateTime35.toDateTime(dateTimeZone42);
        org.joda.time.Interval interval44 = interval31.withEnd((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration45 = interval31.toDuration();
        org.joda.time.Period period46 = new org.joda.time.Period();
        org.joda.time.Period period48 = period46.minusMonths((int) '#');
        boolean boolean49 = interval31.equals((java.lang.Object) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval51 = interval31.withEndMillis((long) 53221098);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.util.Calendar calendar12 = dateMidnight9.toCalendar(locale10);
        int int14 = calendar12.get(14);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645454846250,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=26,MILLISECOND=250,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1646265600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=62,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType2 = periodType1.withSecondsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) 59, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.plusDays((int) (byte) 1);
        org.joda.time.Period period10 = period5.plusHours(11);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusSeconds(0);
        org.joda.time.Chronology chronology20 = localDateTime17.getChronology();
        org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) 11, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        int int11 = dateTimeZone9.getStandardOffset((long) 32769);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = dateTimeZone9.getShortName((long) 1970, locale13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale13.getDisplayCountry(locale15);
        java.util.Calendar.Builder builder17 = builder0.setLocale(locale15);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder19 = builder17.setTimeZone(timeZone18);
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime20.minus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusSeconds(0);
        org.joda.time.Chronology chronology29 = localDateTime26.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) builder17, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Calendar$Builder");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ubbf8\uad6d" + "'", str16, "\ubbf8\uad6d");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(chronology29);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((java.lang.Object) instant0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Instant");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime6 = mutableDateTime1.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.Duration duration19 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration19, 53221515);
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration19, readableInstant22);
        mutablePeriod23.setPeriod((long) 938);
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod23.set(durationFieldType26, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(durationFieldType26);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType3 = periodType2.withSecondsRemoved();
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) 53221197, (long) (byte) 100, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.addSeconds((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime4 = instant3.toMutableDateTime();
        mutableDateTime4.setSecondOfMinute((int) (byte) 1);
        int int7 = mutableDateTime4.getMillisOfDay();
        int int8 = mutableDateTime4.getHourOfDay();
        org.joda.time.Period period10 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod11 = period10.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate16, (org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate22 = localDate16.withDayOfMonth(13);
        org.joda.time.Chronology chronology23 = localDate22.getChronology();
        mutablePeriod11.setPeriod((long) 10, (-599990L), chronology23);
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight((-1968L), chronology23);
        org.joda.time.DateTimeZone dateTimeZone26 = chronology23.getZone();
        mutableDateTime4.setZoneRetainFields(dateTimeZone26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((int) 'a', (-143999), 100, dateTimeZone26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -143999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53221872 + "'", int7 == 53221872);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(mutablePeriod11);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 32769);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = dateTimeZone6.getShortName((long) 1970, locale10);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.now(dateTimeZone6);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone6);
        long long16 = dateTimeZone6.convertLocalToUTC((long) 1961, false);
        java.lang.String str17 = dateTimeZone6.toString();
        long long19 = dateTimeZone6.nextTransition((long) (byte) 1);
        long long23 = dateTimeZone6.convertLocalToUTC((long) 4, true, (long) 53221550);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1961L + "'", long16 == 1961L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 4L + "'", long23 == 4L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.plusDays((int) (byte) 1);
        org.joda.time.MutablePeriod mutablePeriod9 = period5.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = mutablePeriod9.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime4.withYearOfCentury(53221394);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221394 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        boolean boolean4 = dateTimeFormatter3.isParser();
        java.lang.Appendable appendable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable5, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        long long6 = java.util.Date.UTC((int) (short) 100, (int) (short) 10, 2022, 70, 18, 42);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1147904322000L + "'", long6 == 1147904322000L);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (byte) 0, 17, (-143999), 42, 6, 685, 26, 53221655);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("-0033-08-30T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        calendar1.set((int) (short) -1, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar1.get(721437);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 721437");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-61936101780000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=7,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=17,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("coreano", "ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: coreano [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType15 = periodType14.withSecondsRemoved();
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, (org.joda.time.ReadableInstant) dateMidnight11, periodType15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate19, (org.joda.time.ReadablePartial) localDate22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        boolean boolean25 = localDate22.isSupported(dateTimeFieldType24);
        org.joda.time.Chronology chronology26 = localDate22.getChronology();
        org.joda.time.LocalDate localDate28 = localDate22.minusDays(100);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localDate22);
        java.util.Locale locale31 = java.util.Locale.US;
        java.lang.String str32 = locale31.getDisplayName();
        java.lang.String str33 = dateMidnight29.toString("52", locale31);
        // The following exception was thrown during execution in test generation
        try {
            long long34 = dateTimeField3.set((long) 2, "inglese (Stati Uniti)", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"inglese (Stati Uniti)\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "inglese (Stati Uniti)" + "'", str32, "inglese (Stati Uniti)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "52" + "'", str33, "52");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) filteringMode0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode0.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.size();
        int int5 = timeOfDay3.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        boolean boolean21 = localDate18.isSupported(dateTimeFieldType20);
        org.joda.time.Chronology chronology22 = localDate18.getChronology();
        org.joda.time.LocalDate localDate24 = localDate18.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDate24.getFieldType(1);
        org.joda.time.DateMidnight.Property property27 = dateMidnight8.property(dateTimeFieldType26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay29 = timeOfDay3.withField(dateTimeFieldType26, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, readableDuration6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType9 = periodType8.withSecondsRemoved();
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight2, (org.joda.time.ReadableInstant) dateMidnight5, periodType9);
        org.joda.time.LocalDate localDate11 = dateMidnight5.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight13 = dateMidnight5.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusMillis(4);
        org.joda.time.Period period15 = new org.joda.time.Period();
        org.joda.time.Period period17 = period15.minusMonths((int) '#');
        org.joda.time.LocalDateTime localDateTime19 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 1);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withWeekOfWeekyear((int) (byte) 1);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate(3, 11, 2);
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((long) 'a', dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 'a', dateTimeZone31);
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate29, (org.joda.time.ReadablePartial) localDate32);
        org.joda.time.LocalDate localDate35 = localDate29.withDayOfMonth(13);
        org.joda.time.Chronology chronology36 = localDate35.getChronology();
        long long40 = chronology36.add((long) (short) -1, (long) 1961, 15);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 'a', dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 'a', dateTimeZone47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate45, (org.joda.time.ReadablePartial) localDate48);
        org.joda.time.LocalDate localDate51 = localDate45.withDayOfMonth(13);
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 0, periodType42, chronology52);
        int[] intArray56 = chronology36.get((org.joda.time.ReadablePeriod) mutablePeriod53, (long) 596, (long) 53221161);
        java.util.Locale locale58 = java.util.Locale.GERMANY;
        java.lang.String str59 = locale58.getScript();
        java.util.Locale locale60 = locale58.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray61 = dateTimeField3.set((org.joda.time.ReadablePartial) localDateTime25, (int) '4', intArray56, "inglese (Stati Uniti)", locale58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"inglese (Stati Uniti)\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 29414L + "'", long40 == 29414L);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[0, 0, 0, 0, 14, 47, 0, 565]");
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "de_DE");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.minus((org.joda.time.ReadablePeriod) period8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
        org.joda.time.Chronology chronology12 = localDateTime9.getChronology();
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(938, (int) '4', (int) '#', chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        java.util.Locale locale5 = dateTimeFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.parse("", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay21 = property20.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay23 = property20.setCopy("+00:00");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+00:00\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology5 = timeOfDay4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(100, 8, (int) (byte) 0, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        java.util.Date date10 = new java.util.Date((int) (byte) -1, 32769, 4, (int) (byte) 1, (int) (short) 10, 11);
        date10.setHours((int) (short) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.fromDateFields(date10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder3.setInstant(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertEquals(date10.toString(), "Sat Oct 03 23:10:11 UTC 4629");
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        boolean boolean15 = dateMidnight9.equals((java.lang.Object) dateMidnight14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight17 = dateMidnight9.withDayOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale3);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = calendar6.isSet(685);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 685");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454848141,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=28,MILLISECOND=141,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight8.getZone();
        int int11 = dateTimeZone9.getStandardOffset((long) 32769);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = dateTimeZone9.getShortName((long) 1970, locale13);
        java.util.Locale locale15 = java.util.Locale.KOREAN;
        java.lang.String str16 = locale13.getDisplayCountry(locale15);
        java.util.Calendar.Builder builder17 = builder0.setLocale(locale15);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder19 = builder17.setTimeZone(timeZone18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder21 = builder17.setInstant((long) 42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\ubbf8\uad6d" + "'", str16, "\ubbf8\uad6d");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(100);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(11);
        org.joda.time.LocalTime.Property property21 = localTime16.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = property21.setCopy(709);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withDayOfWeek(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("coreano");
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 10);
        int int4 = mutablePeriod3.getWeeks();
        org.joda.time.PeriodType periodType5 = mutablePeriod3.getPeriodType();
        boolean boolean6 = languageRange1.equals((java.lang.Object) periodType5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.LocalDate.Property property9 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withCenturyOfEra(53221394);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221394 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = property3.setCopy(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(12, (int) (byte) 0, 366, 12, 53221, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusMillis(10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = timeOfDay6.getFieldTypes();
        org.joda.time.LocalTime localTime8 = timeOfDay6.toLocalTime();
        org.joda.time.LocalTime localTime10 = localTime8.plusMinutes(17);
        boolean boolean11 = calendar1.before((java.lang.Object) 17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454848591,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=28,MILLISECOND=591,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.util.Date date0 = new java.util.Date();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 14:47:28 UTC 2022");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate1.toString("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay3.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay3.getFieldType((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType14 = periodType13.withSecondsRemoved();
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, (org.joda.time.ReadableInstant) dateMidnight10, periodType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        boolean boolean24 = localDate21.isSupported(dateTimeFieldType23);
        org.joda.time.Chronology chronology25 = localDate21.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.dayOfYear();
        org.joda.time.DateTimeField dateTimeField27 = chronology25.minuteOfDay();
        org.joda.time.Period period28 = new org.joda.time.Period((long) 11, (long) 59, periodType14, chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(53221161, 32769, 5, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(4);
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.Period period13 = period11.minusMonths((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period13, 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = localDateTime15.getFieldType(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        int int2 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DurationField durationField11 = chronology9.millis();
        long long14 = durationField11.subtract((long) 2, (long) 1970);
        org.joda.time.DurationFieldType durationFieldType15 = durationField11.getType();
        long long18 = durationField11.add((long) 53221235, (long) 2022);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1968L) + "'", long14 == (-1968L));
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 53223257L + "'", long18 == 53223257L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Instant instant14 = instant0.minus((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant16 = instant14.plus(139958329852800006L);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property4.setCopy("weekyear-gregory");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyear-gregory\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DurationField[days]", 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.secondOfDay();
        java.lang.String str8 = property7.toString();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfDay]" + "'", str8, "Property[secondOfDay]");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        long long6 = dateTimeField3.addWrapField((long) 17, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone20 = dateMidnight19.getZone();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = dateTime24.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withDayOfMonth((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime28 = dateMidnight27.toMutableDateTimeISO();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight27);
        int[] intArray30 = mutablePeriod29.getValues();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate((long) 'a', dateTimeZone33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) 'a', dateTimeZone36);
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate34, (org.joda.time.ReadablePartial) localDate37);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = null;
        boolean boolean40 = localDate37.isSupported(dateTimeFieldType39);
        org.joda.time.Chronology chronology41 = localDate37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.dayOfYear();
        org.joda.time.DateTimeField dateTimeField43 = chronology41.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = dateTimeField43.getType();
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime47 = instant46.toMutableDateTime();
        mutableDateTime47.setSecondOfMinute((int) (byte) 1);
        mutableDateTime47.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime47.year();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime47.era();
        org.joda.time.Chronology chronology54 = null;
        org.joda.time.LocalDate localDate55 = new org.joda.time.LocalDate(chronology54);
        org.joda.time.DateTimeField dateTimeField57 = localDate55.getField(1);
        java.lang.String str59 = dateTimeField57.getAsShortText((long) '4');
        int int60 = mutableDateTime47.get(dateTimeField57);
        java.util.Locale locale62 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(1L, dateTimeZone64);
        org.joda.time.DateMidnight.Property property66 = dateMidnight65.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight68 = dateMidnight65.minusDays((int) 'a');
        java.util.Locale locale70 = java.util.Locale.ENGLISH;
        java.lang.String str71 = locale70.toLanguageTag();
        java.lang.String str72 = dateMidnight65.toString("+00:00", locale70);
        java.lang.String str73 = locale62.getDisplayVariant(locale70);
        java.lang.String str74 = dateTimeField57.getAsText((int) (short) 10, locale70);
        java.lang.String str75 = dateTimeField43.getAsShortText((long) 8, locale70);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray76 = dateTimeField3.set((org.joda.time.ReadablePartial) localDate12, 938, intArray30, "Wed Jan 04 00:00:11 UTC 1905", locale70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Wed Jan 04 00:00:11 UTC 1905\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 28857600017L + "'", long6 == 28857600017L);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[60, 5, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(mutableDateTime47);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "gen" + "'", str59, "gen");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "it");
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateMidnight68);
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "en" + "'", str71, "en");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "+00:00" + "'", str72, "+00:00");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "October" + "'", str74, "October");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "0" + "'", str75, "0");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = calendar1.getCalendarType();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar1.getLeastMaximum(954);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 954");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454849477,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=29,MILLISECOND=477,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "gregory" + "'", str2, "gregory");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        int int7 = localDateTime6.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDateTime6.toString("Wed Jan 04 00:00:11 UTC 1905");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: W");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute(0);
        int int14 = localTime11.getSecondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property16 = localTime11.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        java.lang.Appendable appendable4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable4, (org.joda.time.ReadableInstant) dateMidnight11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.LocalDate localDate6 = property4.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate7 = property4.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withWeekOfWeekyear(53221098);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221098 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        int int7 = localDate2.getYear();
        org.joda.time.LocalDate localDate9 = localDate2.withYearOfCentury((int) ' ');
        int int10 = localDate9.getDayOfWeek();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone4.observesDaylightTime();
        java.util.Calendar.Builder builder6 = builder3.setTimeZone(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate9.withDayOfMonth(13);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        org.joda.time.LocalDate localDate17 = org.joda.time.LocalDate.now(chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.monthOfYear();
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod20 = period19.toMutablePeriod();
        org.joda.time.Weeks weeks21 = period19.toStandardWeeks();
        int[] intArray24 = chronology16.get((org.joda.time.ReadablePeriod) period19, (long) 53221394, 29414L);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder25 = builder3.setFields(intArray24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(mutablePeriod20);
        org.junit.Assert.assertNotNull(weeks21);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0, -14, -46, -31, -980]");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setLanguageTag("1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 1970 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology2 = timeOfDay1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = timeOfDay1.getField((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = org.joda.time.Instant.parse("\ubbf8\uad6d", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        int int4 = calendar1.getActualMinimum(4);
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields(calendar1);
        calendar1.setLenient(true);
        long long8 = calendar1.getTimeInMillis();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        boolean boolean10 = timeZone9.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone9);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(timeZone9);
        int int13 = calendar1.compareTo(calendar12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454850073,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=30,MILLISECOND=73,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1645454850073L + "'", long8 == 1645454850073L);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1645454850073,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=30,MILLISECOND=73,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone4.observesDaylightTime();
        java.util.Calendar.Builder builder6 = builder3.setTimeZone(timeZone4);
        java.util.Calendar.Builder builder10 = builder6.setTimeOfDay(100, 0, 53221161);
        int[] intArray15 = new int[] { 53221848, 53221197, 18, 178 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder6.setFields(intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[53221848, 53221197, 18, 178]");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) '4', (int) ' ', (int) (byte) 0, (int) (short) -1, (-1), 15, 1, 709);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((java.lang.Object) 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate9.withDayOfMonth(13);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate.Property property18 = localDate5.yearOfEra();
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology21 = timeOfDay20.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.millisOfSecond();
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval24 = new org.joda.time.Interval((java.lang.Object) property18, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType18 = periodType17.withSecondsRemoved();
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight11, (org.joda.time.ReadableInstant) dateMidnight14, periodType18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((long) 'a', dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate22, (org.joda.time.ReadablePartial) localDate25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        boolean boolean28 = localDate25.isSupported(dateTimeFieldType27);
        org.joda.time.Chronology chronology29 = localDate25.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.dayOfYear();
        org.joda.time.DateTimeField dateTimeField31 = chronology29.minuteOfDay();
        org.joda.time.Period period32 = new org.joda.time.Period((long) 11, (long) 59, periodType18, chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime((int) '#', (int) 'a', 0, 804, 14, 0, (int) '#', chronology29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 804 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 53221504);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate11 = localDate5.withDayOfMonth(13);
        org.joda.time.LocalDate localDate13 = localDate5.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter3.parseMutableDateTime("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = localDate8.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withField(dateTimeFieldType16, (int) 'a');
        org.joda.time.DateTime dateTime20 = dateTime10.withField(dateTimeFieldType16, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight2.withField(dateTimeFieldType16, 7);
        int int23 = dateMidnight22.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27);
        int int29 = period28.size();
        java.lang.String str30 = period28.toString();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period33 = period28.withField(durationFieldType31, 0);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight39, readableDuration40);
        org.joda.time.PeriodType periodType42 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType43 = periodType42.withSecondsRemoved();
        org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight36, (org.joda.time.ReadableInstant) dateMidnight39, periodType43);
        org.joda.time.PeriodType periodType45 = periodType43.withWeeksRemoved();
        org.joda.time.PeriodType periodType46 = periodType43.withMillisRemoved();
        org.joda.time.PeriodType periodType47 = periodType43.withWeeksRemoved();
        org.joda.time.Period period48 = period33.normalizedStandard(periodType43);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 'a', dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 'a', dateTimeZone53);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate51, (org.joda.time.ReadablePartial) localDate54);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        boolean boolean57 = localDate54.isSupported(dateTimeFieldType56);
        org.joda.time.Chronology chronology58 = localDate54.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) int23, periodType43, chronology58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "PT0S" + "'", str30, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(periodType43);
        org.junit.Assert.assertNotNull(periodType45);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(chronology58);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) dateTimeFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        int int13 = durationField10.getDifference(86400010L, (long) 27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1439 + "'", int13 == 1439);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        mutableDateTime6.setSecondOfMinute((int) (byte) 1);
        mutableDateTime6.setSecondOfMinute(52);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.DateTime dateTime24 = localDate16.toDateTimeAtMidnight(dateTimeZone23);
        boolean boolean26 = dateTimeZone23.isStandardOffset((long) (byte) 10);
        mutableDateTime6.setZone(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime6.millisOfSecond();
        org.joda.time.Instant instant29 = mutableDateTime6.toInstant();
        org.joda.time.Period period30 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod31 = period30.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate localDate42 = localDate36.withDayOfMonth(13);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        mutablePeriod31.setPeriod((long) 10, (-599990L), chronology43);
        mutableDateTime6.setChronology(chronology43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = new org.joda.time.DateTime((int) (short) -1, 0, 32769, 47, 53221660, chronology43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime6);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(period30);
        org.junit.Assert.assertNotNull(mutablePeriod31);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.parse("dayOfYear", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.Period period4 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod5 = period4.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.LocalDate localDate16 = localDate10.withDayOfMonth(13);
        org.joda.time.Chronology chronology17 = localDate16.getChronology();
        mutablePeriod5.setPeriod((long) 10, (-599990L), chronology17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((-1968L), chronology17);
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object) localDate1, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.joda.time.Period period1 = new org.joda.time.Period((-53221620L));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekyear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, 1679506596172800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate8, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        boolean boolean14 = localDate11.isSupported(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = localDate11.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime4.toDateTime(chronology15);
        org.joda.time.DateTime dateTime18 = dateTime4.plusWeeks(70);
        int int19 = dateTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 914 + "'", int19 == 914);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = new org.joda.time.Period((java.lang.Object) dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        java.lang.String str4 = dateTimeField3.getName();
        int int5 = dateTimeField3.getMaximumValue();
        org.joda.time.DurationField durationField6 = dateTimeField3.getRangeDurationField();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 'a', dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate11, (org.joda.time.ReadablePartial) localDate14);
        org.joda.time.LocalDate localDate17 = localDate11.withDayOfMonth(13);
        org.joda.time.Chronology chronology18 = localDate17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 0, periodType8, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeField3, chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GJMonthOfYearDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "monthOfYear" + "'", str4, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        java.util.Locale locale10 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.util.Calendar calendar12 = dateMidnight9.toCalendar(locale10);
        org.joda.time.DateMidnight.Property property13 = dateMidnight9.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645454853305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=33,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar12);
        org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1646265600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=62,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((java.lang.Object) interval31);
        org.joda.time.Period period36 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod37 = period36.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate((long) 'a', dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 'a', dateTimeZone44);
        org.joda.time.Period period46 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate42, (org.joda.time.ReadablePartial) localDate45);
        org.joda.time.LocalDate localDate48 = localDate42.withDayOfMonth(13);
        org.joda.time.Chronology chronology49 = localDate48.getChronology();
        mutablePeriod37.setPeriod((long) 10, (-599990L), chronology49);
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight((-1968L), chronology49);
        org.joda.time.DateTimeZone dateTimeZone52 = chronology49.getZone();
        mutablePeriod33.setPeriod((long) 13, chronology49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType55 = mutablePeriod33.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(mutablePeriod37);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime16 = property12.addCopy(366);
        org.joda.time.LocalTime localTime18 = localTime16.withHourOfDay(0);
        int int19 = localTime18.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 53221690);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localTime18.compareTo((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("dayOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"dayOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.LocalDate localDate18 = localDate12.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = localDate18.getFieldType(1);
        org.joda.time.DateMidnight.Property property21 = dateMidnight2.property(dateTimeFieldType20);
        int int22 = dateMidnight2.getDayOfYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight2.withMillis((-599990L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight26 = dateMidnight2.withDayOfWeek((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateMidnight24);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology2 = timeOfDay1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfEra();
        org.joda.time.ReadablePartial readablePartial4 = null;
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeField3.getAsText(readablePartial4, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        boolean boolean15 = localDate12.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology16 = localDate12.getChronology();
        org.joda.time.LocalDate localDate18 = localDate12.minusDays(100);
        org.joda.time.LocalDate localDate20 = localDate12.withYear((int) (byte) 0);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(chronology21);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = localDate22.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = dateTime24.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        org.joda.time.DateTime dateTime32 = dateTime24.toDateTime(dateTimeZone31);
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone31);
        org.joda.time.DateMidnight dateMidnight34 = localDate12.toDateMidnight(dateTimeZone31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(4, 53221147, (int) ' ', 53221555, 13, 0, 23, dateTimeZone31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221555 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateMidnight34);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.Instant instant8 = dateTime4.toInstant();
        org.joda.time.DateTime dateTime10 = dateTime4.plusMonths((int) '4');
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime4.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setMonthOfYear(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.plusDays((int) (byte) 1);
        org.joda.time.Weeks weeks9 = period5.toStandardWeeks();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(weeks9);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 10);
        int int3 = mutablePeriod2.getWeeks();
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay4.getFieldType(53221660);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221660");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.plusDays((int) (byte) 1);
        org.joda.time.Period period10 = period5.plusHours(11);
        int int11 = period5.getHours();
        org.joda.time.Hours hours12 = period5.toStandardHours();
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) 'a');
        org.joda.time.Period period8 = new org.joda.time.Period();
        org.joda.time.Period period10 = period8.minusYears(10);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 13);
        java.lang.String str13 = dateMidnight12.toString();
        int int14 = dateMidnight12.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-0033-08-30T00:00:00.000Z" + "'", str13, "-0033-08-30T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(70, (int) 'x', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField2 = timeOfDay0.getField(53221235);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53221235");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        java.lang.String str5 = durationField4.getName();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "days" + "'", str5, "days");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType10 = periodType9.withSecondsRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableInstant) dateMidnight6, periodType10);
        org.joda.time.PeriodType periodType12 = periodType10.withWeeksRemoved();
        org.joda.time.PeriodType periodType13 = periodType10.withMillisRemoved();
        org.joda.time.PeriodType periodType14 = periodType10.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 32769);
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = dateTimeZone21.getShortName((long) 1970, locale25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(dateTimeZone21);
        org.joda.time.LocalTime localTime29 = localTime27.withSecondOfMinute(0);
        int int30 = localTime27.getSecondOfMinute();
        org.joda.time.Chronology chronology31 = localTime27.getChronology();
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) '#', chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.minuteOfDay();
        org.joda.time.Period period34 = new org.joda.time.Period((long) 11, periodType14, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType36 = periodType14.getFieldType(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(localTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 34 + "'", int30 == 34);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(17, 11, 53221515, 1931, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1931 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        java.lang.String str4 = dateTimeField3.getName();
        long long6 = dateTimeField3.roundCeiling((long) 59);
        long long8 = dateTimeField3.remainder((long) 234);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        int int10 = localDateTime9.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.minus((org.joda.time.ReadablePeriod) period17);
        int int19 = localDateTime18.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.minusMillis(17);
        java.util.Date date22 = localDateTime21.toDate();
        int[] intArray23 = localDateTime21.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField3.addWrapField((org.joda.time.ReadablePartial) localDateTime9, 938, intArray23, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "monthOfYear" + "'", str4, "monthOfYear");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2678400000L + "'", long6 == 2678400000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 234L + "'", long8 == 234L);
        org.junit.Assert.assertNotNull(localDateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 775 + "'", int10 == 775);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(date22);
// flaky:         org.junit.Assert.assertEquals(date22.toString(), "Mon Feb 21 14:47:34 UTC 2022");
        org.junit.Assert.assertNotNull(intArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2022, 2, 21, 53254758]");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale3);
        java.util.Date date10 = new java.util.Date(2, (int) '#', (int) '#');
        date10.setSeconds(11);
        boolean boolean13 = timeZone0.inDaylightTime(date10);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454854871,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=34,MILLISECOND=871,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date10.toString(), "Wed Jan 04 00:00:11 UTC 1905");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('4', "");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray4 = timeOfDay3.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.plusMillis(2022);
        org.joda.time.TimeOfDay.Property property7 = timeOfDay6.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = property7.setCopy(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray4);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(chronology9);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate10.toDateTimeAtCurrentTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate15, (org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.Duration duration25 = period19.toDurationTo((org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.ReadableDuration readableDuration32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight31, readableDuration32);
        org.joda.time.PeriodType periodType34 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType35 = periodType34.withSecondsRemoved();
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight28, (org.joda.time.ReadableInstant) dateMidnight31, periodType35);
        org.joda.time.PeriodType periodType37 = periodType35.withWeeksRemoved();
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime12, (org.joda.time.ReadableDuration) duration25, periodType35);
        org.joda.time.Interval interval39 = new org.joda.time.Interval(readableInstant8, (org.joda.time.ReadableDuration) duration25);
        long long40 = interval39.getEndMillis();
        org.joda.time.Period period41 = interval39.toPeriod();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(chronology42);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = localDate43.toDateTimeAtCurrentTime(dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 'a', dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 'a', dateTimeZone50);
        org.joda.time.Period period52 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate48, (org.joda.time.ReadablePartial) localDate51);
        org.joda.time.DateTimeZone dateTimeZone54 = null;
        org.joda.time.DateMidnight dateMidnight55 = new org.joda.time.DateMidnight(1L, dateTimeZone54);
        org.joda.time.ReadableDuration readableDuration56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight55, readableDuration56);
        org.joda.time.Duration duration58 = period52.toDurationTo((org.joda.time.ReadableInstant) dateMidnight55);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(1L, dateTimeZone60);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.DateMidnight dateMidnight64 = new org.joda.time.DateMidnight(1L, dateTimeZone63);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight64, readableDuration65);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType68 = periodType67.withSecondsRemoved();
        org.joda.time.Period period69 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight61, (org.joda.time.ReadableInstant) dateMidnight64, periodType68);
        org.joda.time.PeriodType periodType70 = periodType68.withWeeksRemoved();
        org.joda.time.Period period71 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableDuration) duration58, periodType68);
        org.joda.time.Period period72 = interval39.toPeriod(periodType68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod(721437, 464, 53221147, 53221161, 14, 4, 14, 5, periodType68);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'seconds'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(periodType34);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(periodType37);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1645454854997L + "'", long40 == 1645454854997L);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(duration58);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(periodType68);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(period72);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withMillisOfSecond(5);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime0.withMonthOfYear(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.weeks();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = localDate8.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localDate8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.dayOfYear();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.millisOfDay();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 493, (long) 53221161, periodType2, chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.millisOfSecond();
        org.joda.time.DurationField durationField18 = dateTimeField17.getLeapDurationField();
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNull(durationField18);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMillis(4);
        org.joda.time.Period period11 = new org.joda.time.Period();
        org.joda.time.Period period13 = period11.minusMonths((int) '#');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withPeriodAdded((org.joda.time.ReadablePeriod) period13, 1);
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property16.setCopy("weekyearOfCentury");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyearOfCentury\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay21 = property20.withMaximumValue();
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime23 = instant22.toMutableDateTime();
        mutableDateTime23.setSecondOfMinute((int) (byte) 1);
        mutableDateTime23.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime23.year();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime23.era();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.DateTimeField dateTimeField33 = localDate31.getField(1);
        java.lang.String str35 = dateTimeField33.getAsShortText((long) '4');
        int int36 = mutableDateTime23.get(dateTimeField33);
        java.util.Locale locale38 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.minusDays((int) 'a');
        java.util.Locale locale46 = java.util.Locale.ENGLISH;
        java.lang.String str47 = locale46.toLanguageTag();
        java.lang.String str48 = dateMidnight41.toString("+00:00", locale46);
        java.lang.String str49 = locale38.getDisplayVariant(locale46);
        java.lang.String str50 = dateTimeField33.getAsText((int) (short) 10, locale46);
        int int51 = property20.getMaximumShortTextLength(locale46);
        java.lang.String str52 = locale46.getDisplayVariant();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "gen" + "'", str35, "gen");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it");
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "en" + "'", str47, "en");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "+00:00" + "'", str48, "+00:00");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "October" + "'", str50, "October");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.minusHours(100);
        org.joda.time.LocalTime localTime20 = localTime16.minusSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localTime20.getValue(53221660);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53221660");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime20);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        long long33 = interval31.getStartMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval35 = interval31.withEndMillis((long) 53221555);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(chronology32);
// flaky:         org.junit.Assert.assertTrue("'" + long33 + "' != '" + 1645454855403L + "'", long33 == 1645454855403L);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        int int9 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.minusMonths(53221660);
        int int12 = localDate11.getDayOfYear();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 244 + "'", int12 == 244);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1961L);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime15 = property12.getLocalTime();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight18.dayOfMonth();
        org.joda.time.DurationField durationField20 = property19.getDurationField();
        long long23 = durationField20.getDifferenceAsLong(100L, (long) 100);
        long long26 = durationField20.add((long) (byte) 100, 53221515);
        org.joda.time.DurationFieldType durationFieldType27 = durationField20.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = localTime15.withFieldAdded(durationFieldType27, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'days' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 4598338896000100L + "'", long26 == 4598338896000100L);
        org.junit.Assert.assertNotNull(durationFieldType27);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = localDate6.isSupported(dateTimeFieldType8);
        org.joda.time.Chronology chronology10 = localDate6.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.minutes();
        java.lang.String str12 = chronology10.toString();
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 6, chronology10);
        org.joda.time.DateTimeField dateTimeField14 = chronology10.era();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeField14.getAsText(53221394, locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221394");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[UTC]" + "'", str12, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.joda.time.Period period1 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod2 = period1.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate13 = localDate7.withDayOfMonth(13);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        mutablePeriod2.setPeriod((long) 10, (-599990L), chronology14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((-1968L), chronology14);
        org.joda.time.DateTimeZone dateTimeZone17 = chronology14.getZone();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.year();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeField18.set(1645454854107L, "05:34:23.314");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"05:34:23.314\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(mutablePeriod2);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.LocalDate.Property property4 = localDate1.dayOfYear();
        org.joda.time.LocalDate localDate5 = property4.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate7 = localDate5.withDayOfYear((int) 'a');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        int int10 = localDate9.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTimeAtStartOfDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        int int18 = period17.size();
        java.lang.String str19 = period17.toString();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period22 = period17.withField(durationFieldType20, 0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate25, (org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate31 = localDate25.withDayOfMonth(13);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.hourOfHalfday();
        org.joda.time.DurationField durationField34 = durationFieldType20.getField(chronology32);
        boolean boolean35 = localDate9.isSupported(durationFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate37 = localDate7.withFieldAdded(durationFieldType20, 596);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalTime localTime18 = localTime16.plusSeconds(2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getFirstDayOfWeek();
        java.util.Date date3 = calendar1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar1.getMaximum(1931);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1931");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454856128,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=36,MILLISECOND=128,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 14:47:36 UTC 2022");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusYears(13);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime11.minus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight.Property property21 = dateMidnight20.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property24 = dateMidnight20.dayOfMonth();
        org.joda.time.Period period25 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod26 = period25.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight20.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.withField(dateTimeFieldType33, (int) 'a');
        boolean boolean36 = dateMidnight27.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime17.withField(dateTimeFieldType33, (int) (byte) 100);
        org.joda.time.LocalDateTime.Property property39 = localDateTime10.property(dateTimeFieldType33);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(mutablePeriod26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime3.withField(dateTimeFieldType9, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        org.joda.time.DateTime dateTime20 = dateTime13.withZoneRetainFields(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((long) 'a', dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((long) 'a', dateTimeZone25);
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate23, (org.joda.time.ReadablePartial) localDate26);
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = null;
        boolean boolean29 = localDate26.isSupported(dateTimeFieldType28);
        org.joda.time.Chronology chronology30 = localDate26.getChronology();
        org.joda.time.LocalDate localDate32 = localDate26.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = localDate32.getFieldType(1);
        boolean boolean35 = dateTime13.isSupported(dateTimeFieldType34);
        org.joda.time.DateTime dateTime37 = dateTime13.minusDays(1961);
        org.joda.time.DateTime.Property property38 = dateTime37.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.DateMidnight.Property property42 = dateMidnight41.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight41.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property45 = dateMidnight41.dayOfMonth();
        org.joda.time.Period period46 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod47 = period46.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight41.plus((org.joda.time.ReadablePeriod) period46);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(1L, dateTimeZone50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight53.withField(dateTimeFieldType54, (int) 'a');
        boolean boolean57 = dateMidnight48.isSupported(dateTimeFieldType54);
        boolean boolean58 = dateTime37.isEqual((org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight48.withDurationAdded((long) 53221032, 24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.withDayOfMonth(53221147);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221147 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(mutablePeriod47);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(dateMidnight61);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setSecondOfMinute(52);
        mutableDateTime1.setMillisOfSecond((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        mutableDateTime1.add(readablePeriod8);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate(685, 53221593, 53221917);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221593 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        boolean boolean15 = dateMidnight9.equals((java.lang.Object) dateMidnight14);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(1679506596172800000L);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.withFields((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight21, readableDuration22);
        int int24 = period23.size();
        java.lang.String str25 = period23.toString();
        org.joda.time.DurationFieldType durationFieldType26 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period28 = period23.withField(durationFieldType26, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay17.withFieldAdded(durationFieldType26, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0S" + "'", str25, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        java.util.Locale locale13 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight.Property property17 = dateMidnight16.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight16.minusDays((int) 'a');
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.lang.String str22 = locale21.toLanguageTag();
        java.lang.String str23 = dateMidnight16.toString("+00:00", locale21);
        java.lang.String str24 = locale13.getDisplayVariant(locale21);
        java.lang.String str25 = locale13.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localTime11.toString("-0033-08-30T00:00:00.000Z", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "it");
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "en" + "'", str22, "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, readableDuration7);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = period8.normalizedStandard(periodType9);
        boolean boolean11 = property3.equals((java.lang.Object) periodType9);
        org.joda.time.LocalDateTime localDateTime12 = property3.getLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime12.toString("inglese (Stati Uniti)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setLanguage("Wed Jan 04 00:00:11 UTC 1905");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Wed Jan 04 00:00:11 UTC 1905 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        int int3 = localDateTime2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str5 = dateTimeFieldType4.toString();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withWeekOfWeekyear(47);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusDays((int) (short) 0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weekyear" + "'", str5, "weekyear");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod1 = period0.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.LocalDate localDate12 = localDate6.withDayOfMonth(13);
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        mutablePeriod1.setPeriod((long) 10, (-599990L), chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone21 = dateMidnight20.getZone();
        int int23 = dateTimeZone21.getStandardOffset((long) 32769);
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = dateTimeZone21.getShortName((long) 1970, locale25);
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.now(dateTimeZone21);
        org.joda.time.LocalTime.Property property28 = localTime27.millisOfDay();
        org.joda.time.LocalTime localTime30 = localTime27.withMillisOfDay(18);
        java.util.Calendar.Builder builder32 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder35 = builder32.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone41 = dateMidnight40.getZone();
        int int43 = dateTimeZone41.getStandardOffset((long) 32769);
        java.util.Locale locale45 = java.util.Locale.US;
        java.lang.String str46 = dateTimeZone41.getShortName((long) 1970, locale45);
        java.util.Locale locale47 = java.util.Locale.KOREAN;
        java.lang.String str48 = locale45.getDisplayCountry(locale47);
        java.util.Calendar.Builder builder49 = builder32.setLocale(locale47);
        java.util.TimeZone timeZone50 = java.util.TimeZone.getDefault();
        java.util.Calendar.Builder builder51 = builder49.setTimeZone(timeZone50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 'a', dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone56 = null;
        org.joda.time.LocalDate localDate57 = new org.joda.time.LocalDate((long) 'a', dateTimeZone56);
        org.joda.time.Period period58 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate54, (org.joda.time.ReadablePartial) localDate57);
        org.joda.time.LocalDate localDate60 = localDate54.withDayOfMonth(13);
        org.joda.time.Chronology chronology61 = localDate60.getChronology();
        long long65 = chronology61.add((long) (short) -1, (long) 1961, 15);
        org.joda.time.PeriodType periodType67 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone69 = null;
        org.joda.time.LocalDate localDate70 = new org.joda.time.LocalDate((long) 'a', dateTimeZone69);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDate localDate73 = new org.joda.time.LocalDate((long) 'a', dateTimeZone72);
        org.joda.time.Period period74 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate70, (org.joda.time.ReadablePartial) localDate73);
        org.joda.time.LocalDate localDate76 = localDate70.withDayOfMonth(13);
        org.joda.time.Chronology chronology77 = localDate76.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 0, periodType67, chronology77);
        int[] intArray81 = chronology61.get((org.joda.time.ReadablePeriod) mutablePeriod78, (long) 596, (long) 53221161);
        java.util.Calendar.Builder builder82 = builder49.setFields(intArray81);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray84 = dateTimeField15.set((org.joda.time.ReadablePartial) localTime27, 27, intArray81, 53221212);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(mutablePeriod1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "+00:00" + "'", str46, "+00:00");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "\ubbf8\uad6d" + "'", str48, "\ubbf8\uad6d");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(timeZone50);
        org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 29414L + "'", long65 == 29414L);
        org.junit.Assert.assertNotNull(periodType67);
        org.junit.Assert.assertNotNull(localDate76);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[0, 0, 0, 0, 14, 47, 0, 565]");
        org.junit.Assert.assertNotNull(builder82);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = property12.compareTo((org.joda.time.ReadablePartial) timeOfDay18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(timeOfDay18);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime5 = instant4.toMutableDateTime();
        mutableDateTime5.setSecondOfMinute((int) (byte) 1);
        mutableDateTime5.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime5.year();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType20 = periodType19.withSecondsRemoved();
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight13, (org.joda.time.ReadableInstant) dateMidnight16, periodType20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight13.year();
        java.util.Locale locale23 = java.util.Locale.ITALIAN;
        java.lang.String str24 = property22.getAsText(locale23);
        int int25 = property10.getMaximumShortTextLength(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = timeZone0.getDisplayName(true, 33, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 33");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(periodType20);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "it");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970" + "'", str24, "1970");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate13 = localDate7.withDayOfMonth(13);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        long long18 = chronology14.add((long) (short) -1, (long) 1961, 15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((java.lang.Object) int4, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42 + "'", int4 == 42);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 29414L + "'", long18 == 29414L);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields(calendar1);
        java.util.Locale locale6 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str7 = locale6.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap8 = calendar1.getDisplayNames(53221917, 15, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454857581,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=37,MILLISECOND=581,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "cinese" + "'", str7, "cinese");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        calendar1.set((int) (short) -1, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar1.get(53253508);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53253508");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-61936101780000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=7,MONTH=3,WEEK_OF_YEAR=17,WEEK_OF_MONTH=4,DAY_OF_MONTH=30,DAY_OF_YEAR=120,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=17,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar1.getLeastMaximum(366);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 366");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454857720,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=37,MILLISECOND=720,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((-1));
        int int4 = timeOfDay1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("October");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"October\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime6 = instant5.toMutableDateTime();
        mutableDateTime6.addWeeks(938);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime6, "2022-02-21T00:00:00.000Z", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(chronology9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalDate localDate19 = localDate13.withDayOfMonth(13);
        org.joda.time.Chronology chronology20 = localDate19.getChronology();
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(chronology20);
        int int22 = localDate21.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((long) 'a', dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate25, (org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate31 = localDate25.withDayOfMonth(13);
        org.joda.time.Chronology chronology32 = localDate31.getChronology();
        long long36 = chronology32.add((long) (short) -1, (long) 1961, 15);
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.standard();
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((long) 'a', dateTimeZone40);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.LocalDate localDate44 = new org.joda.time.LocalDate((long) 'a', dateTimeZone43);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate41, (org.joda.time.ReadablePartial) localDate44);
        org.joda.time.LocalDate localDate47 = localDate41.withDayOfMonth(13);
        org.joda.time.Chronology chronology48 = localDate47.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 0, periodType38, chronology48);
        int[] intArray52 = chronology32.get((org.joda.time.ReadablePeriod) mutablePeriod49, (long) 596, (long) 53221161);
        // The following exception was thrown during execution in test generation
        try {
            chronology9.validate((org.joda.time.ReadablePartial) localDate21, intArray52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 22 + "'", int22 == 22);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 29414L + "'", long36 == 29414L);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[0, 0, 0, 0, 14, 47, 0, 565]");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withField(dateTimeFieldType9, (int) 'a');
        org.joda.time.DateTime dateTime13 = dateTime3.withField(dateTimeFieldType9, (int) (short) 0);
        org.joda.time.DateTime dateTime15 = dateTime3.plusHours((int) (short) 1);
        int int16 = dateTime15.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property17 = dateTime15.millisOfSecond();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getDefault();
        boolean boolean20 = timeZone19.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Locale locale22 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale22);
        java.util.Set<java.lang.String> strSet24 = locale22.getUnicodeLocaleAttributes();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(timeZone19, locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = property17.setCopy("weekyear-gregory", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"weekyear-gregory\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "it");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645454857892,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=37,MILLISECOND=892,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.year();
        org.joda.time.Interval interval10 = property9.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = interval10.withEndMillis(10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.util.Calendar.Builder builder5 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder8 = builder5.set(0, (int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight13.getZone();
        int int16 = dateTimeZone14.getStandardOffset((long) 32769);
        java.util.Locale locale18 = java.util.Locale.US;
        java.lang.String str19 = dateTimeZone14.getShortName((long) 1970, locale18);
        java.util.Locale locale20 = java.util.Locale.KOREAN;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.util.Calendar.Builder builder22 = builder5.setLocale(locale20);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter2.withLocale(locale20);
        java.lang.Appendable appendable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable24, (long) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
        org.junit.Assert.assertNull(locale4);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ubbf8\uad6d" + "'", str21, "\ubbf8\uad6d");
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.DateTimeField dateTimeField9 = localDate7.getField(1);
        java.lang.String str10 = dateTimeField9.getName();
        int int11 = instant0.get(dateTimeField9);
        org.joda.time.DateTime dateTime12 = instant0.toDateTimeISO();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "monthOfYear" + "'", str10, "monthOfYear");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = dateMidnight5.getZone();
        int int8 = dateTimeZone6.getStandardOffset((long) 32769);
        java.util.Locale locale10 = java.util.Locale.US;
        java.lang.String str11 = dateTimeZone6.getShortName((long) 1970, locale10);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) 53221660, dateTimeZone6);
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        int int14 = period13.getYears();
        org.joda.time.LocalTime localTime15 = localTime12.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((long) 'a', dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 'a', dateTimeZone20);
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate18, (org.joda.time.ReadablePartial) localDate21);
        org.joda.time.LocalDate localDate24 = localDate18.withDayOfMonth(13);
        org.joda.time.Chronology chronology25 = localDate24.getChronology();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.monthOfYear();
        org.joda.time.Period period28 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod29 = period28.toMutablePeriod();
        org.joda.time.Weeks weeks30 = period28.toStandardWeeks();
        int[] intArray33 = chronology25.get((org.joda.time.ReadablePeriod) period28, (long) 53221394, 29414L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) period13, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(mutablePeriod29);
        org.junit.Assert.assertNotNull(weeks30);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 0, -14, -46, -31, -980]");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        int int3 = localDateTime2.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str5 = dateTimeFieldType4.toString();
        int int6 = localDateTime2.get(dateTimeFieldType4);
        boolean boolean7 = periodType1.equals((java.lang.Object) int6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 'a', dateTimeZone14);
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate12, (org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate12.withDayOfMonth(13);
        org.joda.time.Chronology chronology19 = localDate18.getChronology();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.monthOfYear();
        org.joda.time.DurationField durationField22 = chronology19.millis();
        org.joda.time.DateTimeField dateTimeField23 = chronology19.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object) periodType1, periodType8, chronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 105 + "'", int3 == 105);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weekyear" + "'", str5, "weekyear");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType3 = periodType1.getFieldType(493);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 493");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay21 = property20.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay23 = property20.addToCopy((-143999));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = property20.setCopy("2022-02-21T14:47:50.386");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:47:50.386\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.minutes();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = new org.joda.time.Period((long) 97, 139958329852800006L, periodType2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 2332638830879");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.Period period0 = new org.joda.time.Period();
        org.joda.time.Period period2 = period0.minusYears(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration3 = period2.toStandardDuration();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Duration as this period contains years and years vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53221394, 33, 9, (-143999), 53221161, (int) (short) -1, 53221032);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -143999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime5 = dateTimeFormatter2.parseMutableDateTime("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.joda.time.MutableDateTime mutableDateTime0 = new org.joda.time.MutableDateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Period period31 = duration17.toPeriod();
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration17, 366);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((long) 'a', dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((long) 'a', dateTimeZone38);
        org.joda.time.Period period40 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate36, (org.joda.time.ReadablePartial) localDate39);
        org.joda.time.LocalDate localDate42 = localDate36.withDayOfMonth(13);
        org.joda.time.Chronology chronology43 = localDate42.getChronology();
        org.joda.time.DateTimeField dateTimeField44 = chronology43.hourOfHalfday();
        boolean boolean45 = duration17.equals((java.lang.Object) dateTimeField44);
        int int46 = dateTimeField44.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 11 + "'", int46 == 11);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        int int3 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withMillisOfSecond(3);
        int int6 = localDateTime2.size();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.secondOfMinute();
        java.util.Locale locale9 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.minusDays((int) 'a');
        java.util.Locale locale17 = java.util.Locale.ENGLISH;
        java.lang.String str18 = locale17.toLanguageTag();
        java.lang.String str19 = dateMidnight12.toString("+00:00", locale17);
        java.lang.String str20 = locale9.getDisplayVariant(locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = property7.setCopy("ISOChronology[UTC]", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ISOChronology[UTC]\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "en" + "'", str18, "en");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+00:00" + "'", str19, "+00:00");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight.Property property9 = dateMidnight8.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property12 = dateMidnight8.dayOfMonth();
        org.joda.time.Period period13 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod14 = period13.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight8.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight20.withField(dateTimeFieldType21, (int) 'a');
        boolean boolean24 = dateMidnight15.isSupported(dateTimeFieldType21);
        org.joda.time.YearMonthDay yearMonthDay25 = dateMidnight15.toYearMonthDay();
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay25.dayOfMonth();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(chronology27);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = localDate28.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight31 = dateTime30.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(1L, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone37 = dateMidnight36.getZone();
        org.joda.time.DateTime dateTime38 = dateTime30.toDateTime(dateTimeZone37);
        org.joda.time.DateTime dateTime39 = yearMonthDay25.toDateTimeAtMidnight(dateTimeZone37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(464, 2, 53221243, 27, 53221, 14, dateTimeZone37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(mutablePeriod14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property13 = dateMidnight9.dayOfMonth();
        org.joda.time.Period period14 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod15 = period14.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight9.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.withField(dateTimeFieldType22, (int) 'a');
        boolean boolean25 = dateMidnight16.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime6.withField(dateTimeFieldType22, (int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withYear(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime27.withDate((int) (byte) 100, 954, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(mutablePeriod15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar1.getActualMaximum(25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454859073,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=39,MILLISECOND=73,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(yearMonthDay3);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime16 = property12.addCopy(366);
        org.joda.time.LocalTime localTime18 = localTime16.withHourOfDay(0);
        int int19 = localTime18.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = localTime18.withHourOfDay(25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 39 + "'", int19 == 39);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay3.withHourOfDay(53221);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        calendar1.clear();
        java.lang.String str8 = calendar1.getCalendarType();
        java.lang.String str9 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "gregory" + "'", str8, "gregory");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]" + "'", str9, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = dateTimeFormatter2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = dateTimeFormatter2.print(1645454850073L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone3);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight24, readableDuration25);
        org.joda.time.Duration duration27 = period21.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime30 = instant29.toMutableDateTime();
        mutableDateTime30.setSecondOfMinute((int) (byte) 1);
        mutableDateTime30.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime30.year();
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime30.secondOfDay();
        mutableDateTime14.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        org.joda.time.DateTime dateTime38 = localDate5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime30);
        int int39 = dateTime38.getYear();
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53221515, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221515 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight14, readableDuration15);
        org.joda.time.Duration duration17 = period11.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight23, readableDuration24);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType27 = periodType26.withSecondsRemoved();
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) dateMidnight23, periodType27);
        org.joda.time.PeriodType periodType29 = periodType27.withWeeksRemoved();
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableDuration) duration17, periodType27);
        org.joda.time.Interval interval31 = new org.joda.time.Interval(readableInstant0, (org.joda.time.ReadableDuration) duration17);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 'a', dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate((long) 'a', dateTimeZone37);
        org.joda.time.Period period39 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate35, (org.joda.time.ReadablePartial) localDate38);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        boolean boolean41 = localDate38.isSupported(dateTimeFieldType40);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.Interval interval43 = localDate38.toInterval(dateTimeZone42);
        java.lang.String str44 = interval43.toString();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate((long) 'a', dateTimeZone46);
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate((long) 'a', dateTimeZone49);
        org.joda.time.Period period51 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate47, (org.joda.time.ReadablePartial) localDate50);
        org.joda.time.Period period53 = period51.plusYears(8);
        org.joda.time.Interval interval54 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period53);
        boolean boolean55 = interval31.isAfter((org.joda.time.ReadableInterval) interval54);
        boolean boolean56 = interval54.isBeforeNow();
        boolean boolean58 = interval54.contains(2678400000L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(periodType29);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str44, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay19.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay21 = property20.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay23 = property20.addToCopy((-143999));
        java.util.Locale locale25 = java.util.Locale.GERMANY;
        java.lang.String str26 = locale25.getScript();
        java.util.Locale locale27 = locale25.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay28 = property20.setCopy("en", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime4.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property6 = dateTime4.weekyear();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = property6.compareTo(readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.era();
        mutableDateTime1.setYear(34);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter4.parseLocalTime("weekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusSeconds(0);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plusMillis(13);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight16.getZone();
        int int19 = dateTimeZone17.getStandardOffset((long) 32769);
        java.util.Locale locale21 = java.util.Locale.US;
        java.lang.String str22 = dateTimeZone17.getShortName((long) 1970, locale21);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(dateTimeZone17);
        org.joda.time.LocalTime localTime25 = localTime23.withSecondOfMinute(0);
        int int26 = localTime23.getSecondOfMinute();
        org.joda.time.Chronology chronology27 = localTime23.getChronology();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((long) '#', chronology27);
        int int29 = localTime28.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(1L, dateTimeZone32);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Period period35 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight33, readableDuration34);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime30.minus((org.joda.time.ReadablePeriod) period35);
        int int37 = localDateTime36.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime40 = localDateTime38.plusYears(13);
        int int41 = localDateTime40.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str43 = dateTimeFieldType42.toString();
        org.joda.time.LocalDateTime.Property property44 = localDateTime40.property(dateTimeFieldType42);
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withWeekOfWeekyear(47);
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.weeks();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime36, (org.joda.time.ReadablePartial) localDateTime40, periodType47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime6, (org.joda.time.ReadablePartial) localTime28, periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 40 + "'", int26 == 40);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "weekyear" + "'", str43, "weekyear");
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(periodType47);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("German");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'German' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) 'a');
        org.joda.time.Period period8 = new org.joda.time.Period();
        org.joda.time.Period period10 = period8.minusYears(10);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 13);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withYearOfEra(47);
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.hours();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(periodType15);
        org.joda.time.Period period18 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod19 = period18.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) 'a', dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 'a', dateTimeZone26);
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate24, (org.joda.time.ReadablePartial) localDate27);
        org.joda.time.LocalDate localDate30 = localDate24.withDayOfMonth(13);
        org.joda.time.Chronology chronology31 = localDate30.getChronology();
        mutablePeriod19.setPeriod((long) 10, (-599990L), chronology31);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((-1968L), chronology31);
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) 47, periodType15, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(mutablePeriod19);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((-1));
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusMillis(18);
        int int6 = timeOfDay5.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((java.lang.Object) int6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((-1968L));
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.DateMidnight.Property property14 = dateMidnight5.year();
        java.util.Locale locale15 = java.util.Locale.ITALIAN;
        java.lang.String str16 = property14.getAsText(locale15);
        java.util.Locale locale17 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale17);
        java.lang.String str19 = locale15.getDisplayVariant(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime1.toString("8 May 53223415 00:00:00 GMT", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "it");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.size();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.withField(dateTimeFieldType14, (int) 'a');
        org.joda.time.DateTime dateTime18 = dateTime8.withField(dateTimeFieldType14, (int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        org.joda.time.DateTime dateTime25 = dateTime18.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((long) 'a', dateTimeZone27);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((long) 'a', dateTimeZone30);
        org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate28, (org.joda.time.ReadablePartial) localDate31);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = localDate31.isSupported(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localDate31.getChronology();
        org.joda.time.LocalDate localDate37 = localDate31.minusDays(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = localDate37.getFieldType(1);
        boolean boolean40 = dateTime18.isSupported(dateTimeFieldType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property41 = timeOfDay3.property(dateTimeFieldType39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        java.lang.String str1 = dateMidnight0.toString();
        org.joda.time.LocalDate localDate2 = dateMidnight0.toLocalDate();
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2022-02-21T00:00:00.000Z" + "'", str1, "2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = calendar1.isSet(53221);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454861534,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=41,MILLISECOND=534,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate7, (org.joda.time.ReadablePartial) localDate10);
        org.joda.time.LocalDate localDate13 = localDate7.withDayOfMonth(13);
        org.joda.time.Chronology chronology14 = localDate13.getChronology();
        long long18 = chronology14.add((long) (short) -1, (long) 1961, 15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(53221243, 0, (-143999), 35, (int) (short) 0, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 29414L + "'", long18 == 29414L);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 100);
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology7 = timeOfDay6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter4.withChronology(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = dateTimeFormatter8.parseMutableDateTime("Cina");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Italian");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Italian\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType12 = periodType11.withSecondsRemoved();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight5, (org.joda.time.ReadableInstant) dateMidnight8, periodType12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 'a', dateTimeZone18);
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate16, (org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        boolean boolean22 = localDate19.isSupported(dateTimeFieldType21);
        org.joda.time.Chronology chronology23 = localDate19.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.dayOfYear();
        org.joda.time.DateTimeField dateTimeField25 = chronology23.minuteOfDay();
        org.joda.time.Period period26 = new org.joda.time.Period((long) 11, (long) 59, periodType12, chronology23);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((-2050963200000L), chronology23);
        org.joda.time.LocalDate.Property property28 = localDate27.dayOfWeek();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(chronology29);
        int int31 = localDate30.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate30.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Period period38 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight36, readableDuration37);
        int int39 = period38.size();
        java.lang.String str40 = period38.toString();
        org.joda.time.DurationFieldType durationFieldType41 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period43 = period38.withField(durationFieldType41, 0);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((long) 'a', dateTimeZone45);
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate((long) 'a', dateTimeZone48);
        org.joda.time.Period period50 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate46, (org.joda.time.ReadablePartial) localDate49);
        org.joda.time.LocalDate localDate52 = localDate46.withDayOfMonth(13);
        org.joda.time.Chronology chronology53 = localDate52.getChronology();
        org.joda.time.DateTimeField dateTimeField54 = chronology53.hourOfHalfday();
        org.joda.time.DurationField durationField55 = durationFieldType41.getField(chronology53);
        boolean boolean56 = localDate30.isSupported(durationFieldType41);
        boolean boolean57 = localDate27.isSupported(durationFieldType41);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0S" + "'", str40, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 804);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 804 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale0);
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "it" + "'", str3, "it");
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withField(dateTimeFieldType5, (int) 'a');
        org.joda.time.Period period8 = new org.joda.time.Period();
        org.joda.time.Period period10 = period8.minusYears(10);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withPeriodAdded((org.joda.time.ReadablePeriod) period10, 13);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight7.plusYears(5);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate9.withDayOfMonth(13);
        org.joda.time.Chronology chronology16 = localDate15.getChronology();
        int int17 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate.Property property18 = localDate15.dayOfMonth();
        org.joda.time.LocalDate localDate19 = property18.roundFloorCopy();
        int int20 = property18.getMaximumValue();
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate5.toInterval(dateTimeZone9);
        java.lang.String str11 = interval10.toString();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) 'a', dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate14, (org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period20 = period18.plusYears(8);
        org.joda.time.Interval interval21 = interval10.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period20);
        long long22 = interval10.getStartMillis();
        long long23 = interval10.getEndMillis();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z" + "'", str11, "1970-01-01T00:00:00.000Z/1970-01-02T00:00:00.000Z");
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 86400000L + "'", long23 == 86400000L);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtCurrentTime(dateTimeZone3);
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute(0);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(938, 304, (int) (short) 10, 304, 244);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 304 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        org.joda.time.Chronology chronology9 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = chronology9.dayOfYear();
        org.joda.time.DateTimeField dateTimeField11 = chronology9.minuteOfDay();
        boolean boolean13 = dateTimeField11.isLeap((long) 53221032);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.LocalDate.Property property9 = localDate2.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.getLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDate16.isSupported(dateTimeFieldType18);
        org.joda.time.Chronology chronology20 = localDate16.getChronology();
        org.joda.time.LocalDate localDate22 = localDate16.minusDays(100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.centuries();
        boolean boolean24 = localDate16.isSupported(durationFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = localDate10.withFieldAdded(durationFieldType23, 53221098);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 5322109800");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableInstant) dateMidnight9, periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = periodType13.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        int int26 = dateTimeZone24.getStandardOffset((long) 32769);
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = dateTimeZone24.getShortName((long) 1970, locale28);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(dateTimeZone24);
        org.joda.time.LocalTime localTime32 = localTime30.withSecondOfMinute(0);
        int int33 = localTime30.getSecondOfMinute();
        org.joda.time.Chronology chronology34 = localTime30.getChronology();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) '#', chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.Period period37 = new org.joda.time.Period((long) 11, periodType17, chronology34);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(4, 12, 59, chronology34);
        org.joda.time.Period period39 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod40 = period39.toMutablePeriod();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate((long) 'a', dateTimeZone44);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate((long) 'a', dateTimeZone47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate45, (org.joda.time.ReadablePartial) localDate48);
        org.joda.time.LocalDate localDate51 = localDate45.withDayOfMonth(13);
        org.joda.time.Chronology chronology52 = localDate51.getChronology();
        mutablePeriod40.setPeriod((long) 10, (-599990L), chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime((java.lang.Object) chronology34, chronology52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 43 + "'", int33 == 43);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutablePeriod40);
        org.junit.Assert.assertNotNull(localDate51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField54);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DurationField durationField4 = property3.getDurationField();
        int int7 = durationField4.getValue((long) ' ', (long) 52);
        long long9 = durationField4.getMillis(100);
        int int12 = durationField4.getValue((long) 1439, 0L);
        long long15 = durationField4.add(3193290900000L, 244);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 8640000000L + "'", long9 == 8640000000L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3214372500000L + "'", long15 == 3214372500000L);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeFormatter3.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = dateMidnight10.getZone();
        int int13 = dateTimeZone11.getStandardOffset((long) 32769);
        java.util.Locale locale15 = java.util.Locale.US;
        java.lang.String str16 = dateTimeZone11.getShortName((long) 1970, locale15);
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.now(dateTimeZone11);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone11);
        long long21 = dateTimeZone11.convertLocalToUTC((long) 1961, false);
        java.lang.String str22 = dateTimeZone11.toString();
        long long24 = dateTimeZone11.nextTransition((long) (byte) 1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter25 = dateTimeFormatter3.withZone(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.parse("halfdays", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1961L + "'", long21 == 1961L);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Etc/UTC" + "'", str22, "Etc/UTC");
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1L + "'", long24 == 1L);
        org.junit.Assert.assertNotNull(dateTimeFormatter25);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime15 = property12.getLocalTime();
        org.joda.time.LocalTime localTime17 = localTime15.plusMillis(12);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfMonth((int) (short) 1);
        int int7 = dateMidnight4.getWeekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.plusDays((int) (short) 10);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = localDate11.toDateTimeAtCurrentTime(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = dateTime13.toDateMidnight();
        boolean boolean15 = dateMidnight9.equals((java.lang.Object) dateMidnight14);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(1679506596172800000L);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.withFields((org.joda.time.ReadablePartial) yearMonthDay17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay17.withDayOfMonth(53261499);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53261499 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 53221796, (long) 18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) 'a', dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight10, readableDuration11);
        org.joda.time.Duration duration13 = period7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        mutableDateTime0.add((org.joda.time.ReadableDuration) duration13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTime();
        mutableDateTime16.setSecondOfMinute((int) (byte) 1);
        mutableDateTime16.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime16.year();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime16.secondOfDay();
        mutableDateTime0.setMillis((org.joda.time.ReadableInstant) mutableDateTime16);
        java.util.Locale locale24 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        java.lang.String str26 = calendar25.getCalendarType();
        boolean boolean27 = mutableDateTime0.equals((java.lang.Object) str26);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setSecondOfMinute(2035);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2035 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645454863317,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=43,MILLISECOND=317,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "gregory" + "'", str26, "gregory");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTimeFormatter2.print(1645454835796L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.LocalTime localTime16 = localTime14.plusSeconds(53221515);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime14.withSecondOfMinute(1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(596);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime17.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime18.setDayOfWeek(1931);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1931 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfWeek(53221917);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221917 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withZoneUTC();
        boolean boolean5 = dateTimeFormatter4.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("en", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 100);
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology8 = timeOfDay7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withChronology(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.parse("halfdays", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.dayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(53221515, 862, 14, 709, 938, 19, 70, 10, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate5.isSupported(dateTimeFieldType7);
        int int9 = localDate5.getWeekyear();
        org.joda.time.LocalDate localDate11 = localDate5.plusYears(53221555);
        org.joda.time.LocalDate.Property property12 = localDate5.yearOfCentury();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime localTime13 = localTime11.withSecondOfMinute(0);
        org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = new org.joda.time.Period((java.lang.Object) localTime11, periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(periodType14);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableInstant) dateMidnight9, periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = periodType13.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        int int26 = dateTimeZone24.getStandardOffset((long) 32769);
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = dateTimeZone24.getShortName((long) 1970, locale28);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(dateTimeZone24);
        org.joda.time.LocalTime localTime32 = localTime30.withSecondOfMinute(0);
        int int33 = localTime30.getSecondOfMinute();
        org.joda.time.Chronology chronology34 = localTime30.getChronology();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) '#', chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.Period period37 = new org.joda.time.Period((long) 11, periodType17, chronology34);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(4, 12, 59, chronology34);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateMidnight dateMidnight41 = new org.joda.time.DateMidnight(1L, dateTimeZone40);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Period period43 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight41, readableDuration42);
        int int44 = period43.size();
        java.lang.String str45 = period43.toString();
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period48 = period43.withField(durationFieldType46, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay50 = timeOfDay38.withFieldAdded(durationFieldType46, 53261499);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 44 + "'", int33 == 44);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 8 + "'", int44 == 8);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "PT0S" + "'", str45, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(period48);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField13 = localDate9.getField(53221161);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 53221161");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("Property[secondOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: Property[secondOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 'a', dateTimeZone7);
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate5, (org.joda.time.ReadablePartial) localDate8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        boolean boolean11 = localDate8.isSupported(dateTimeFieldType10);
        org.joda.time.Chronology chronology12 = localDate8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        java.lang.String str14 = chronology12.toString();
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) 6, chronology12);
        org.joda.time.DateTimeField dateTimeField16 = chronology12.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 53221032, (long) 9, chronology12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[UTC]" + "'", str14, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        int int2 = calendar1.getWeeksInWeekYear();
        int int4 = calendar1.getActualMinimum(4);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar1.getGreatestMinimum(938);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 938");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645454864472,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=44,MILLISECOND=472,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        boolean boolean11 = localDate1.isEqual((org.joda.time.ReadablePartial) localDate9);
        int int12 = localDate9.getWeekOfWeekyear();
        org.joda.time.LocalDate.Property property13 = localDate9.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = property13.setCopy("secondOfMinute");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"secondOfMinute\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        int int20 = yearMonthDay19.getYear();
        org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay19.withYear(2022);
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight26, readableDuration27);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime23.minus((org.joda.time.ReadablePeriod) period28);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight32.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight32.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property36 = dateMidnight32.dayOfMonth();
        org.joda.time.Period period37 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod38 = period37.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight32.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(1L, dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight44.withField(dateTimeFieldType45, (int) 'a');
        boolean boolean48 = dateMidnight39.isSupported(dateTimeFieldType45);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime29.withField(dateTimeFieldType45, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay52 = yearMonthDay19.withField(dateTimeFieldType45, 1931);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(yearMonthDay22);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(mutablePeriod38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(localDateTime50);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.LocalTime.Property property12 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime14 = property12.setCopy(53221515);
        org.joda.time.LocalTime localTime16 = property12.addCopy(53221515);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusYears(13);
        int int20 = localDateTime19.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime19.withMillisOfSecond(3);
        int int23 = localDateTime19.size();
        org.joda.time.LocalDateTime.Property property24 = localDateTime19.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localTime16.compareTo((org.joda.time.ReadablePartial) localDateTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths((int) (byte) 10);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime8 = instant7.toMutableDateTime();
        mutableDateTime8.setSecondOfMinute((int) (byte) 1);
        int int11 = mutableDateTime8.getMillisOfDay();
        int int12 = mutableDateTime8.getHourOfDay();
        int int13 = dateMidnight6.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        boolean boolean15 = dateMidnight6.isAfter((long) 13);
        org.joda.time.DateMidnight.Property property16 = dateMidnight6.dayOfYear();
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime17.minus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Period period25 = period22.plusDays((int) (byte) 1);
        org.joda.time.Period period27 = period22.minusMillis((int) (short) 100);
        org.joda.time.Weeks weeks28 = period27.toStandardWeeks();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight6.withPeriodAdded((org.joda.time.ReadablePeriod) weeks28, 43);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53221327 + "'", int11 == 53221327);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(weeks28);
        org.junit.Assert.assertNotNull(dateMidnight30);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        int int3 = localDateTime2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str5 = dateTimeFieldType4.toString();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.Chronology chronology7 = localDateTime2.getChronology();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withYearOfCentury(39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime2.withHourOfDay(938);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 938 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weekyear" + "'", str5, "weekyear");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = dateMidnight11.getZone();
        org.joda.time.DateTime dateTime13 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        boolean boolean15 = dateTimeZone12.isStandardOffset((long) (byte) 10);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone12);
        int int19 = dateTimeZone12.getOffset((long) 53221655);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"gregory\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.Chronology chronology2 = timeOfDay1.getChronology();
        org.joda.time.DateTimeField dateTimeField3 = chronology2.yearOfEra();
        int int5 = dateTimeField3.getMinimumValue((long) 9);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10);
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType13 = periodType12.withSecondsRemoved();
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableInstant) dateMidnight9, periodType13);
        org.joda.time.PeriodType periodType15 = periodType13.withWeeksRemoved();
        org.joda.time.PeriodType periodType16 = periodType13.withMillisRemoved();
        org.joda.time.PeriodType periodType17 = periodType13.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(1L, dateTimeZone20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = dateMidnight23.getZone();
        int int26 = dateTimeZone24.getStandardOffset((long) 32769);
        java.util.Locale locale28 = java.util.Locale.US;
        java.lang.String str29 = dateTimeZone24.getShortName((long) 1970, locale28);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.now(dateTimeZone24);
        org.joda.time.LocalTime localTime32 = localTime30.withSecondOfMinute(0);
        int int33 = localTime30.getSecondOfMinute();
        org.joda.time.Chronology chronology34 = localTime30.getChronology();
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) '#', chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.minuteOfDay();
        org.joda.time.Period period37 = new org.joda.time.Period((long) 11, periodType17, chronology34);
        org.joda.time.TimeOfDay timeOfDay38 = new org.joda.time.TimeOfDay(4, 12, 59, chronology34);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(chronology39);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = localDate40.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.DateMidnight dateMidnight43 = dateTime42.toDateMidnight();
        org.joda.time.DateTime dateTime45 = dateTime42.minus(2678400000L);
        org.joda.time.DateTime.Property property46 = dateTime45.weekOfWeekyear();
        org.joda.time.DateTime dateTime47 = property46.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str49 = dateTimeFieldType48.toString();
        org.joda.time.DateTime dateTime51 = dateTime47.withField(dateTimeFieldType48, 53221550);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay53 = timeOfDay38.withField(dateTimeFieldType48, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(periodType16);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+00:00" + "'", str29, "+00:00");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
// flaky:         org.junit.Assert.assertTrue("'" + int33 + "' != '" + 45 + "'", int33 == 45);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "weekyear" + "'", str49, "weekyear");
        org.junit.Assert.assertNotNull(dateTime51);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate1.toDateTimeAtStartOfDay(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight7, readableDuration8);
        int int10 = period9.size();
        java.lang.String str11 = period9.toString();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.Period period14 = period9.withField(durationFieldType12, 0);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) 'a', dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 'a', dateTimeZone19);
        org.joda.time.Period period21 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate17, (org.joda.time.ReadablePartial) localDate20);
        org.joda.time.LocalDate localDate23 = localDate17.withDayOfMonth(13);
        org.joda.time.Chronology chronology24 = localDate23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.hourOfHalfday();
        org.joda.time.DurationField durationField26 = durationFieldType12.getField(chronology24);
        boolean boolean27 = localDate1.isSupported(durationFieldType12);
        org.joda.time.LocalDate.Property property28 = localDate1.monthOfYear();
        java.util.Date date29 = localDate1.toDate();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(chronology30);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = localDate31.toDateTimeAtCurrentTime(dateTimeZone32);
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(1L, dateTimeZone35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.withField(dateTimeFieldType39, (int) 'a');
        org.joda.time.DateTime dateTime43 = dateTime33.withField(dateTimeFieldType39, (int) (short) 0);
        org.joda.time.DateTime dateTime45 = dateTime33.plusHours((int) (short) 1);
        int int46 = dateTime45.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property47 = dateTime45.millisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int49 = dateTime45.get(dateTimeFieldType48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property50 = localDate1.property(dateTimeFieldType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "PT0S" + "'", str11, "PT0S");
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
// flaky:         org.junit.Assert.assertTrue("'" + int49 + "' != '" + 45 + "'", int49 == 45);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateTime dateTime6 = dateMidnight5.toDateTimeISO();
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 'a', dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.Period period14 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate13);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        org.joda.time.Duration duration20 = period14.toDurationTo((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.Instant instant21 = instant7.minus((org.joda.time.ReadableDuration) duration20);
        boolean boolean22 = dateMidnight5.isAfter((org.joda.time.ReadableInstant) instant7);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(1L, dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = dateMidnight30.getZone();
        int int33 = dateTimeZone31.getStandardOffset((long) 32769);
        java.util.Locale locale35 = java.util.Locale.US;
        java.lang.String str36 = dateTimeZone31.getShortName((long) 1970, locale35);
        org.joda.time.DateTime dateTime37 = dateMidnight25.toDateTime(dateTimeZone31);
        boolean boolean38 = instant7.isEqual((org.joda.time.ReadableInstant) dateTime37);
        org.joda.time.DateTime.Property property39 = dateTime37.era();
        int int40 = dateTime37.getDayOfYear();
        org.joda.time.DateTime.Property property41 = dateTime37.minuteOfDay();
        org.joda.time.Instant instant42 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime43 = instant42.toMutableDateTime();
        mutableDateTime43.setSecondOfMinute((int) (byte) 1);
        mutableDateTime43.setSecondOfMinute(52);
        org.joda.time.DateTime dateTime48 = mutableDateTime43.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate((long) 'a', dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate((long) 'a', dateTimeZone53);
        org.joda.time.Period period55 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate51, (org.joda.time.ReadablePartial) localDate54);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight58, readableDuration59);
        org.joda.time.Duration duration61 = period55.toDurationTo((org.joda.time.ReadableInstant) dateMidnight58);
        mutableDateTime43.add((org.joda.time.ReadableDuration) duration61, 53221515);
        org.joda.time.ReadableInstant readableInstant64 = null;
        org.joda.time.MutablePeriod mutablePeriod65 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration61, readableInstant64);
        org.joda.time.Period period66 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime37, (org.joda.time.ReadableDuration) duration61);
        org.joda.time.Period period67 = period66.normalizedStandard();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(duration61);
        org.junit.Assert.assertNotNull(period67);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("Cina", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        java.util.Locale locale0 = java.util.Locale.GERMANY;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 'a', dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 'a', dateTimeZone6);
        org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate4, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate10 = localDate4.withDayOfMonth(13);
        org.joda.time.Chronology chronology11 = localDate10.getChronology();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.monthOfYear();
        org.joda.time.DurationField durationField14 = chronology11.millis();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) strSet1, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de_DE");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) 97, dateTimeZone1);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 53221180, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("4582910-11-03", (double) 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=8.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) 'a', dateTimeZone4);
        org.joda.time.Period period6 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate5);
        org.joda.time.LocalDate localDate8 = localDate2.withDayOfMonth(13);
        org.joda.time.Chronology chronology9 = localDate8.getChronology();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.monthOfYear();
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod13 = period12.toMutablePeriod();
        org.joda.time.Weeks weeks14 = period12.toStandardWeeks();
        int[] intArray17 = chronology9.get((org.joda.time.ReadablePeriod) period12, (long) 53221394, 29414L);
        org.joda.time.DateTimeField dateTimeField18 = chronology9.hourOfHalfday();
        long long20 = dateTimeField18.roundFloor((long) 304);
        java.util.Locale locale23 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField18.set(98727290679120000L, "java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"java.util.GregorianCalendar[time=1645454832420,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=12,MILLISECOND=420,ZONE_OFFSET=0,DST_OFFSET=0]\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(mutablePeriod13);
        org.junit.Assert.assertNotNull(weeks14);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 0, 0, 0, -14, -46, -31, -980]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeField dateTimeField3 = localDate1.getField(1);
        java.lang.String str4 = dateTimeField3.getName();
        long long6 = dateTimeField3.roundCeiling((long) (byte) 100);
        long long9 = dateTimeField3.add((long) 6, (long) 53221235);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField3.set((long) 22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "monthOfYear" + "'", str4, "monthOfYear");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 2678400000L + "'", long6 == 2678400000L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 139958329852800006L + "'", long9 == 139958329852800006L);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(0, (int) (short) -1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        boolean boolean5 = timeZone4.observesDaylightTime();
        java.util.Calendar.Builder builder6 = builder3.setTimeZone(timeZone4);
        java.util.Calendar.Builder builder9 = builder6.set((int) (short) 0, 53221394);
        java.util.TimeZone timeZone10 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone10);
        java.util.Calendar.Builder builder12 = builder6.setTimeZone(timeZone10);
        java.lang.Object obj13 = timeZone10.clone();
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusYears(13);
        int int3 = localDateTime2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.weekyear();
        java.lang.String str5 = dateTimeFieldType4.toString();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.property(dateTimeFieldType4);
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        int int9 = dateTimeField7.getLeapAmount((long) 44);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "weekyear" + "'", str5, "weekyear");
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = localDate6.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.LocalDate.Property property9 = localDate6.dayOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear((int) 'a');
        org.joda.time.Chronology chronology13 = localDate12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(6, 25, (int) 'x', 709, 685, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 709 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime6 = property4.set(26);
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone(zoneId2);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Tempo universale coordinato");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateMidnight18.getZone();
        org.joda.time.DateTime dateTime20 = localDate12.toDateTimeAtMidnight(dateTimeZone19);
        boolean boolean22 = dateTimeZone19.isStandardOffset((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(53221098, 2035, 34, (int) (byte) 1, 53221660, 721437, 366, dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221660 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.Locale locale0 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.util.Date date5 = new java.util.Date(2, (int) '#', (int) '#');
        calendar1.setTime(date5);
        int int7 = calendar1.getWeeksInWeekYear();
        java.lang.Object obj8 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date5.toString(), "Wed Jan 04 00:00:00 UTC 1905");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "java.util.GregorianCalendar[time=-2050963200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1905,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=4,DAY_OF_YEAR=4,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) '4');
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis(10);
        int int4 = timeOfDay3.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = timeOfDay3.getFieldType(804);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 804");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 42 + "'", int4 == 42);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = null;
        org.joda.time.format.DateTimeParser dateTimeParser8 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter7, dateTimeParser8);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter9.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 'a', dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 'a', dateTimeZone15);
        org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate13, (org.joda.time.ReadablePartial) localDate16);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone23 = dateMidnight22.getZone();
        org.joda.time.DateTime dateTime24 = localDate16.toDateTimeAtMidnight(dateTimeZone23);
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter9.withZone(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(234, 605, (int) (short) -1, 53221394, 32769, 53221796, 673, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53221394 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(53221550, 721437, 971, (-1), 14, 53221440, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        int int4 = mutableDateTime1.getMillisOfDay();
        mutableDateTime1.setDayOfYear((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) 'a', dateTimeZone11);
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate12);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight16, readableDuration17);
        org.joda.time.Duration duration19 = period13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight16);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration19);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = property21.set("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 53221888 + "'", int4 == 53221888);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale3 = java.util.Locale.ITALIAN;
        java.util.Locale.setDefault(locale3);
        java.util.Set<java.lang.String> strSet5 = locale3.getUnicodeLocaleAttributes();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone0, locale3);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.fromCalendarFields(calendar6);
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.millis();
        org.joda.time.PeriodType periodType9 = periodType8.withMonthsRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = new org.joda.time.Period((java.lang.Object) localDateTime7, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Tempo universale coordinato");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it");
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454867936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=47,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight.Property property3 = dateMidnight2.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight2.minusDays((int) 'a');
        org.joda.time.DateMidnight.Property property6 = dateMidnight2.dayOfMonth();
        org.joda.time.Period period7 = org.joda.time.Period.ZERO;
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusMonths((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.withField(dateTimeFieldType15, (int) 'a');
        boolean boolean18 = dateMidnight9.isSupported(dateTimeFieldType15);
        org.joda.time.YearMonthDay yearMonthDay19 = dateMidnight9.toYearMonthDay();
        org.joda.time.DateMidnight.Property property20 = dateMidnight9.weekyear();
        org.joda.time.DateMidnight dateMidnight22 = property20.addToCopy(17);
        org.joda.time.DateMidnight dateMidnight24 = property20.addToCopy(954);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight26 = property20.setCopy("tedesco");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"tedesco\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(dateMidnight24);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(31, 8, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) 'a', 53221147, 1931);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.Period period8 = period5.minusWeeks(709);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale locale2 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.addUnicodeLocaleAttribute("0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTime();
        mutableDateTime1.setSecondOfMinute((int) (byte) 1);
        mutableDateTime1.setTime((long) 11);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.year();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.DateTimeField dateTimeField11 = localDate9.getField(1);
        java.lang.String str13 = dateTimeField11.getAsShortText((long) '4');
        int int14 = mutableDateTime1.get(dateTimeField11);
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight19.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight19.minusDays((int) 'a');
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        java.lang.String str25 = locale24.toLanguageTag();
        java.lang.String str26 = dateMidnight19.toString("+00:00", locale24);
        java.lang.String str27 = locale16.getDisplayVariant(locale24);
        java.lang.String str28 = dateTimeField11.getAsText((int) (short) 10, locale24);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(1L, dateTimeZone31);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight32, readableDuration33);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime29.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime29.minusDays((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.millisOfSecond();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.property(dateTimeFieldType38);
        int[] intArray44 = new int[] { 53221310, 13, 971 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray46 = dateTimeField11.add((org.joda.time.ReadablePartial) localDateTime37, 493, intArray44, 53221235);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "gen" + "'", str13, "gen");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "en" + "'", str25, "en");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "October" + "'", str28, "October");
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(intArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray44), "[53221310, 13, 971]");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minus((org.joda.time.ReadablePeriod) period5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusDays((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime0.getField(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = dateTimeFormatter2.parseLocalTime("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = localDate1.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 'a', dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 'a', dateTimeZone8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight13, readableDuration14);
        org.joda.time.Duration duration16 = period10.toDurationTo((org.joda.time.ReadableInstant) dateMidnight13);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight22, readableDuration23);
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.standard();
        org.joda.time.PeriodType periodType26 = periodType25.withSecondsRemoved();
        org.joda.time.Period period27 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight19, (org.joda.time.ReadableInstant) dateMidnight22, periodType26);
        org.joda.time.PeriodType periodType28 = periodType26.withWeeksRemoved();
        org.joda.time.Period period29 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration16, periodType26);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((long) 'a', dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 'a', dateTimeZone34);
        org.joda.time.Period period36 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate32, (org.joda.time.ReadablePartial) localDate35);
        org.joda.time.Period period37 = period29.plus((org.joda.time.ReadablePeriod) period36);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = period29.getValue(53221796);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53221796");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(period37);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusMonths((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = dateMidnight4.getZone();
        int int7 = dateTimeZone5.getStandardOffset((long) 32769);
        java.util.Locale locale9 = java.util.Locale.US;
        java.lang.String str10 = dateTimeZone5.getShortName((long) 1970, locale9);
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone5);
        int int13 = dateTime12.getHourOfDay();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
    }
}
