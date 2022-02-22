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
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (byte) 100, (int) (byte) -1, 1, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) 'a', (int) (byte) 0, 16, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(8, 1, (int) (byte) 100, 0, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        boolean boolean2 = locale0.equals((java.lang.Object) "days");
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 100, (int) (byte) -1, (-1), (int) (byte) 1, 16, (int) 'u', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime5.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) ' ', 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = iSOChronology0.get(readablePeriod1, (long) 100, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        java.lang.Class<?> wildcardClass9 = property6.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.Locale locale1 = new java.util.Locale("days");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale1.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for days");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "days");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        boolean boolean2 = durationField1.isPrecise();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int8 = localTime5.compareTo((org.joda.time.ReadablePartial) localTime7);
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean11 = localTime7.isAfter((org.joda.time.ReadablePartial) localTime10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime7.withField(dateTimeFieldType12, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = iSOChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField((org.joda.time.Chronology) iSOChronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (byte) 10, (int) (byte) -1, 100, (int) '4', 8, (-1), (int) (short) 0, (org.joda.time.Chronology) iSOChronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        long long6 = java.util.Date.UTC((int) 'x', (int) (short) 1, (-1), 10, (int) (short) -1, 32770);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1580411110000L + "'", long6 == 1580411110000L);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) 'u', (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(8, (-1), 32770, (int) (byte) 0, (int) (short) 1, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long9 = dateTimeZone7.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) ' ', dateTimeZone7);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int13 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean16 = localTime12.isAfter((org.joda.time.ReadablePartial) localTime15);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDate2.isAfter((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant7 = date6.toInstant();
        java.util.Date date14 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant15 = date14.toInstant();
        boolean boolean16 = date6.equals((java.lang.Object) date14);
        org.junit.Assert.assertEquals(date6.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalTime.Property property14 = localTime13.minuteOfHour();
        java.util.Locale locale15 = java.util.Locale.ITALY;
        java.lang.String str16 = property14.getAsText(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property6.setCopy("", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0" + "'", str16, "0");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strSet0.remove((java.lang.Object) durationField3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((java.lang.Object) strArray0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: [Ljava.lang.String;");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.time.ZoneId zoneId0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone(zoneId0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long9 = dateTimeZone7.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((long) ' ', dateTimeZone7);
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int13 = localTime10.compareTo((org.joda.time.ReadablePartial) localTime12);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean16 = localTime12.isAfter((org.joda.time.ReadablePartial) localTime15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate4.compareTo((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime(0, (int) (byte) 0, (int) 'x', 0, (org.joda.time.Chronology) iSOChronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        long long6 = java.util.Date.UTC(14, 0, 2, 32770, (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1649167199000L) + "'", long6 == (-1649167199000L));
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getScript();
        java.lang.String str2 = locale0.getDisplayScript();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fr_CA" + "'", str3, "fr_CA");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField3.set((long) 0, "2022-02-25");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-25\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        long long6 = java.util.Date.UTC((int) (short) 1, 16, 10, 349200000, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1254985228960000L + "'", long6 == 1254985228960000L);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+97:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localTime10.getFieldType((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100, (int) (byte) 100, 15, 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        date6.setMonth((int) ' ');
        org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField10 = iSOChronology9.weekyears();
        org.joda.time.DateTimeZone dateTimeZone11 = iSOChronology9.getZone();
        org.joda.time.DurationField durationField12 = iSOChronology9.seconds();
        boolean boolean13 = date6.equals((java.lang.Object) iSOChronology9);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Sep 10 04:11:40 UTC 1902");
        org.junit.Assert.assertNotNull(iSOChronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = dateTimeField1.getRangeDurationField();
        java.util.Locale locale5 = java.util.Locale.ITALY;
        java.util.Locale locale7 = new java.util.Locale("days");
        java.lang.String str8 = locale5.getDisplayCountry(locale7);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField1.set((long) 1, "fr_CA", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fr_CA\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNull(durationField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale7.toString(), "days");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Italy" + "'", str8, "Italy");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant19 = instant16.withDurationAdded(readableDuration17, 14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant19);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology0.getDateTimeMillis((int) (short) 100, (int) (short) 1, (int) 'u', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property15.setCopy("DurationField[weekyears]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[weekyears]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DurationField durationField7 = iSOChronology5.halfdays();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (short) 100, (int) (short) 100, (int) 'a', (int) ' ', (int) (byte) 1, (org.joda.time.Chronology) iSOChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long5 = dateTimeZone3.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) ' ', dateTimeZone3);
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int9 = localTime6.compareTo((org.joda.time.ReadablePartial) localTime8);
        boolean boolean10 = locale0.equals((java.lang.Object) localTime8);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("fr-CA", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = iSOChronology3.weekyears();
        org.joda.time.DateTimeZone dateTimeZone5 = iSOChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) iSOChronology0, (org.joda.time.Chronology) iSOChronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        // The following exception was thrown during execution in test generation
        try {
            strSet0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) 'a');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) iSOChronology0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology13);
        int int16 = localTime10.get(dateTimeFieldType11);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.withEra(1);
        int int27 = localDate21.compareTo((org.joda.time.ReadablePartial) localDate24);
        org.joda.time.LocalDate localDate29 = localDate21.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate.Property property30 = localDate29.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localTime10.compareTo((org.joda.time.ReadablePartial) localDate29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTime13.toString("fr-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime11.minus(readablePeriod21);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime21.withDate((int) (byte) -1, 7, 45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        boolean boolean3 = strSet0.equals((java.lang.Object) durationField2);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strSet0.add("+97:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dateTimeField1.set((long) '4', "2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("21", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField11 = localDate9.getField((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long16 = dateTimeZone14.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) ' ', dateTimeZone14);
        org.joda.time.LocalTime.Property property18 = localTime17.minuteOfHour();
        java.util.Locale locale19 = java.util.Locale.ITALY;
        java.lang.String str20 = property18.getAsText(locale19);
        org.joda.time.LocalTime localTime21 = property18.withMinimumValue();
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localTime21, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) ' ', dateTimeZone16);
        org.joda.time.LocalTime.Property property20 = localTime19.minuteOfHour();
        java.util.Locale locale21 = java.util.Locale.ITALY;
        java.lang.String str22 = property20.getAsText(locale21);
        int int23 = property20.getLeapAmount();
        java.lang.String str24 = property20.getAsShortText();
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = property20.getAsText(locale25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeField7.getAsText((org.joda.time.ReadablePartial) localDate12, 30, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0" + "'", str22, "0");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0" + "'", str26, "0");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) durationField5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfCentury((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfYear();
        java.lang.String str9 = dateTimeField8.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "DateTimeField[dayOfYear]" + "'", str9, "DateTimeField[dayOfYear]");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime11.withEra(35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        org.joda.time.DateTime dateTime19 = instant16.toDateTime();
        org.joda.time.DateTime dateTime20 = instant16.toDateTimeISO();
        org.joda.time.Instant instant22 = instant16.minus((long) 45);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant16.plus(readableDuration23);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (short) 10);
        java.util.Locale locale12 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime8.toString("", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getScript();
        boolean boolean3 = locale0.equals((java.lang.Object) 10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = iSOChronology0.weeks();
        org.joda.time.DurationField durationField9 = iSOChronology0.eras();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.stream();
        boolean boolean2 = strSet0.isEmpty();
        java.lang.String[] strArray14 = new java.lang.String[] { "DurationField[weekyears]", "days", "fr_CA", "DurationField[weekyears]", "era", "+97:00", "10 Apr 1908 00:00:00 GMT", "2022", "ITA", "French", "fr_CA" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strSet0.retainAll((java.util.Collection<java.lang.String>) strList15);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DurationField durationField5 = iSOChronology0.weeks();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfDay();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.minusWeeks((int) (byte) 1);
        int int16 = localDateTime15.getDayOfYear();
        int[] intArray18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = dateTimeField6.set((org.joda.time.ReadablePartial) localDateTime15, 349200000, intArray18, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 45 + "'", int16 == 45);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) iSOChronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime4 = localTime1.withFieldAdded(durationFieldType2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime1.withSecondOfMinute(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime10.withDayOfWeek(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.Date date3 = new java.util.Date(8, 3, 10);
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Apr 10 00:00:00 UTC 1908");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Fri Apr 10 00:00:00 UTC 1908" + "'", str4, "Fri Apr 10 00:00:00 UTC 1908");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = iSOChronology0.getDateTimeMillis((long) 8, (int) 'a', 14, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.TimeZone timeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder4.setTimeZone(timeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property9.setCopy("Fri Apr 10 00:00:00 UTC 1908");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Apr 10 00:00:00 UTC 1908\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDayOfYear(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime8.toString("DateTimeField[halfdayOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        boolean boolean2 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455235083,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=55,MILLISECOND=83,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.getISO3Language();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleKeys();
        java.lang.String str3 = locale0.getISO3Language();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fra" + "'", str1, "fra");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "fra" + "'", str3, "fra");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int2 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.Interval interval4 = property3.toInterval();
        int int5 = property3.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property3.setCopy("10 Apr 1908 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"10 Apr 1908 00:00:00 GMT\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 86399999 + "'", int5 == 86399999);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property5.setCopy("21", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType5 = dateTimeFieldType4.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = iSOChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField((org.joda.time.Chronology) iSOChronology6);
        org.joda.time.DurationField durationField9 = dateTimeField8.getDurationField();
        int int12 = dateTimeField8.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        boolean boolean21 = localDate17.isSupported(durationFieldType20);
        int[] intArray23 = new int[] { (short) 10 };
        int int24 = dateTimeField8.getMaximumValue((org.joda.time.ReadablePartial) localDate17, intArray23);
        org.joda.time.LocalDate.Property property25 = localDate17.yearOfCentury();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType28 = dateTimeFieldType27.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType27.getField((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.DurationField durationField32 = dateTimeField31.getDurationField();
        int int35 = dateTimeField31.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(dateTimeZone37);
        org.joda.time.LocalDate localDate40 = localDate38.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate42 = localDate40.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        boolean boolean44 = localDate40.isSupported(durationFieldType43);
        int[] intArray46 = new int[] { (short) 10 };
        int int47 = dateTimeField31.getMaximumValue((org.joda.time.ReadablePartial) localDate40, intArray46);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray49 = dateTimeField3.addWrapField((org.joda.time.ReadablePartial) localDate17, 0, intArray46, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[10]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(durationField32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(intArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray46), "[6]");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withDayOfMonth(10);
        org.joda.time.DateTime dateTime24 = dateTime11.plus((long) 30);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime8.toString("10 Feb 1900 04:11:40 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.setCopy("fr_CA");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fr_CA\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455236120,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=56,MILLISECOND=120,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = iSOChronology0.getDateTimeMillis((long) 86399999, 99, 30, (int) '4', 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(12, 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Locale.Category category3 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale4 = java.util.Locale.getDefault(category3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = calendar0.getDisplayName(2021, (int) (short) -1, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455236584,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=56,MILLISECOND=584,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + category3 + "' != '" + java.util.Locale.Category.FORMAT + "'", category3.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Chronology chronology10 = iSOChronology7.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) -1, 16, 2, 918, 8, 1, 0, (org.joda.time.Chronology) iSOChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 918 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DurationField durationField9 = iSOChronology7.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(16, 1, 32772, (int) (byte) -1, 100, 3, (int) 'u', (org.joda.time.Chronology) iSOChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        int int9 = property6.getLeapAmount();
        java.lang.String str10 = property6.getAsShortText();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = property6.getAsText(locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property6.getDifference(readableInstant13);
        org.joda.time.LocalTime localTime16 = property6.addCopy((-29990L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = localTime16.withSecondOfMinute(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27424193) + "'", int14 == (-27424193));
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455237160,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=57,MILLISECOND=160,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = calendar0.getDisplayName((int) (short) -1, 5, locale3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455237204,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=57,MILLISECOND=204,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(charSet4);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(7);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("10 Apr 1908 00:00:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=10 apr 1908 00:00:00 gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        java.lang.String str6 = dateTimeField4.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfWeek((int) (byte) 1);
        int[] intArray19 = new int[] { 953, 100, (byte) 10, 23 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField4.set((org.joda.time.ReadablePartial) localDate13, 2, intArray19, 2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[halfdayOfDay]" + "'", str6, "DateTimeField[halfdayOfDay]");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[953, 100, 10, 23]");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) 'x', 12, 2, 45, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int2 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.Interval interval4 = property3.toInterval();
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology6.era();
        org.joda.time.DurationField durationField8 = dateTimeField7.getRangeDurationField();
        java.lang.String str9 = dateTimeField7.getName();
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = iSOChronology11.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology11.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime17.withDurationAdded(readableDuration18, (int) (byte) -1);
        java.util.Locale locale21 = java.util.Locale.ITALY;
        boolean boolean22 = localDateTime20.equals((java.lang.Object) locale21);
        java.lang.String str23 = dateTimeField7.getAsShortText(0L, locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = property3.setCopy("Fri Apr 10 00:00:00 UTC 1908", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Apr 10 00:00:00 UTC 1908\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "era" + "'", str9, "era");
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "dopo Cristo" + "'", str23, "dopo Cristo");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        boolean boolean3 = strSet0.equals((java.lang.Object) durationField2);
        java.util.Set<java.lang.String> strSet4 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        boolean boolean7 = strSet4.equals((java.lang.Object) durationField6);
        java.util.Iterator<java.lang.String> strItor8 = strSet4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        java.lang.String str5 = durationField4.getName();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "centuries" + "'", str5, "centuries");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withTime(32769, 30, 0, 999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = iSOChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType12.getField((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.DurationField durationField17 = iSOChronology14.hours();
        boolean boolean18 = localDate11.equals((java.lang.Object) durationField17);
        boolean boolean19 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate11.withMonthOfYear((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        java.util.Locale locale3 = null;
        int int4 = dateTimeField2.getMaximumTextLength(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) int4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, (int) (byte) -1);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        boolean boolean11 = localDateTime9.equals((java.lang.Object) locale10);
        java.util.Locale locale13 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime9.toString("era", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ja");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMinutes((int) 'a');
        boolean boolean14 = dateTimeZone6.isLocalDateTimeGap(localDateTime13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(9, 5, (int) (byte) 100, 32769, (int) (byte) 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.DateMidnight dateMidnight15 = localDate4.toDateMidnight();
        int int16 = dateMidnight15.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        long long6 = java.util.Date.UTC(32770, 35, 14, 35, 32770, 59);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1032007583459000L + "'", long6 == 1032007583459000L);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(0L, dateTimeZone10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean13 = localDate11.isSupported(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property14 = localDate8.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withDate((int) 'u', (-27424193), 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424193 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(918, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455239542,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=542,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1, 99, 15, 32772, 4, 789, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.lang.String str2 = timeZone1.getDisplayName();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455239635,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=635,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Coordinated Universal Time" + "'", str2, "Coordinated Universal Time");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = calendar0.isSet((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455239756,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=756,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DurationField durationField2 = dateTimeField1.getRangeDurationField();
        int int4 = dateTimeField1.getLeapAmount((long) '#');
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        org.joda.time.LocalTime.Property property7 = localTime6.millisOfSecond();
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getScript();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        java.lang.String str23 = locale20.getExtension('u');
        java.lang.String str24 = locale9.getDisplayVariant(locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeField1.getAsShortText((org.joda.time.ReadablePartial) localTime6, 35, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNull(durationField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349199880L) + "'", long18 == (-349199880L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Locale locale0 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime8.getFieldType(2021);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2021");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(1);
        int int11 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) 0);
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateMidnight dateMidnight27 = localDate5.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) "era", dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"era\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199880L) + "'", long23 == (-349199880L));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNotNull(dateMidnight27);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withMonthOfYear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(86399999, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455241025,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=25,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = localDate4.isSupported(durationFieldType7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        boolean boolean11 = dateTime9.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime9.withDayOfWeek(15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        int int2 = timeZone1.getRawOffset();
        java.lang.Object obj3 = timeZone1.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455241247,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=247,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertEquals(obj3.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("years");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'years' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455241349,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"years\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=349,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455241349,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"years\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=349,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        long long10 = dateTimeField4.remainder(1032007583459000L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 18659000L + "'", long10 == 18659000L);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        boolean boolean4 = calendar0.equals((java.lang.Object) (-62899199978L));
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455241426,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=1,MILLISECOND=426,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder8 = builder4.setDate(11, 11, 20);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder4.setCalendarType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withField(dateTimeFieldType5, 25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.REJECT_EXTENDED_RANGES));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis(1032007583459000L, (-292275054), (int) ' ', 2021, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder2.setTimeOfDay(1, 17, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        int int7 = localDateTime4.getEra();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.era();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.setCopy("2022");
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime26 = dateTime24.minusDays(35);
        boolean boolean27 = property7.equals((java.lang.Object) 35);
        java.util.Locale locale29 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = property7.setCopy("", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349199880L) + "'", long18 == (-349199880L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ja_JP");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = localDate0.withDayOfMonth(2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int2 = localTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((java.lang.Object) localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = iSOChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.yearOfCentury();
        boolean boolean10 = iSOChronology0.equals((java.lang.Object) iSOChronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology0.getDateTimeMillis(23, 17, 32770, 22, 17, 30, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        org.joda.time.LocalDateTime localDateTime8 = property5.addWrapFieldToCopy((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withTime((-292275054), (int) (byte) 10, 6, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        int int36 = dateTime33.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property37 = dateTime33.monthOfYear();
        org.joda.time.Instant instant38 = dateTime33.toInstant();
        boolean boolean40 = instant38.isEqual((long) 30);
        org.joda.time.DateTime dateTime41 = instant38.toDateTime();
        org.joda.time.DateTime dateTime42 = instant38.toDateTimeISO();
        org.joda.time.Instant instant44 = instant38.minus((long) 45);
        boolean boolean45 = dateTime15.equals((java.lang.Object) instant38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime47 = dateTime15.withWeekOfWeekyear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349199880L) + "'", long29 == (-349199880L));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        boolean boolean6 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455243841,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=3,MILLISECOND=841,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(918, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455243895,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=3,MILLISECOND=895,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Fri Apr 10 00:00:00 UTC 1908");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Fri Apr 10 00:00:00 UTC 1908' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(1L, (org.joda.time.Chronology) iSOChronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withSecondOfMinute((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) '4');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate12 = localDate4.withCenturyOfEra((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate4.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        int int2 = timeZone1.getRawOffset();
        boolean boolean3 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455244119,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=4,MILLISECOND=119,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean9 = localTime7.isSupported(dateTimeFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime7.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property10.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(40, 0, (int) '#', 54, 54);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField2 = dateTimeField1.getLeapDurationField();
        java.util.Locale locale5 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            long long6 = dateTimeField1.set((long) (byte) 0, "hourOfHalfday", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hourOfHalfday\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNull(durationField2);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField12 = iSOChronology11.weekyears();
        org.joda.time.DurationField durationField13 = iSOChronology11.halfdays();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology11.monthOfYear();
        boolean boolean15 = localDateTime10.equals((java.lang.Object) dateTimeField14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType17 = dateTimeFieldType16.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = iSOChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType16.getField((org.joda.time.Chronology) iSOChronology18);
        org.joda.time.DurationFieldType durationFieldType21 = dateTimeFieldType16.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime10.withField(dateTimeFieldType16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(iSOChronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(iSOChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.millis();
        org.joda.time.DurationField durationField4 = iSOChronology0.weeks();
        boolean boolean5 = durationField4.isPrecise();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(0, 11);
        java.util.Date date14 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant15 = date14.toInstant();
        date14.setDate(7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder7.setInstant(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertEquals(date14.toString(), "Wed Feb 07 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.secondOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology5.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) 'u', (-1), 1, 32770, 59, (org.joda.time.Chronology) iSOChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        long long19 = instant16.getMillis();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455245267L + "'", long19 == 1645455245267L);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusDays((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime12.withTime(2, (int) '#', 20, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"months\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder8 = builder0.setTimeOfDay(59, (int) (byte) 10, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        timeZone1.setRawOffset((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = timeZone1.getOffset(31, 30, 953, (-27424194), 31, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455245676,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-292275054,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=676,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, 23, 25, (int) (short) 10, 0, 99, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone1.getOffset(2, 25, 59, 32770, (-27424193), 99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455246201,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=6,MILLISECOND=201,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(6, 6, (int) 'x', 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        java.util.Locale locale6 = java.util.Locale.JAPANESE;
        java.lang.String str7 = locale6.getScript();
        java.lang.String str8 = locale6.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localTime4.toString("months", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        int int3 = dateTimeField1.getLeapAmount((long) 10);
        boolean boolean5 = dateTimeField1.isLeap((long) 2);
        org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField7 = iSOChronology6.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology6.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime10.getFields();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusHours((int) (short) 0);
        int[] intArray15 = new int[] { 32769 };
        int int16 = dateTimeField1.getMaximumValue((org.joda.time.ReadablePartial) localDateTime10, intArray15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField18 = localDateTime10.getField(28);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 28");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iSOChronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32769]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(1);
        int int18 = localDate12.compareTo((org.joda.time.ReadablePartial) localDate15);
        int[] intArray23 = new int[] { 2, (short) 100, (-1) };
        java.util.Locale locale25 = java.util.Locale.US;
        java.lang.String str26 = locale25.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = dateTimeField7.set((org.joda.time.ReadablePartial) localDate12, 59, intArray23, "", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2, 100, -1]");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "USA" + "'", str26, "USA");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology1.secondOfDay();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology1.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = iSOChronology1.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) "hi!", (org.joda.time.Chronology) iSOChronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(17, (int) ' ', (-1), 20, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        int[] intArray19 = new int[] { (short) 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localDate13, intArray19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDate13.toString("2022", locale22);
        org.joda.time.LocalDate localDate25 = localDate13.withYearOfEra(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate25.withWeekOfWeekyear(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertNotNull(localDate25);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        int[] intArray19 = new int[] { (short) 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localDate13, intArray19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDate13.toString("2022", locale22);
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long28 = dateTimeZone26.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long) ' ', dateTimeZone26);
        org.joda.time.LocalTime.Property property30 = localTime29.minuteOfHour();
        org.joda.time.LocalTime localTime31 = property30.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean33 = localTime31.isSupported(dateTimeFieldType32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate35 = localDate13.withField(dateTimeFieldType32, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Instant instant34 = instant15.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199880L) + "'", long24 == (-349199880L));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
// flaky:         org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(instant34);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        int int9 = property6.getLeapAmount();
        java.lang.String str10 = property6.getAsShortText();
        org.joda.time.LocalTime localTime11 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime11.getValue(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32772");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.Locale locale1 = new java.util.Locale("days");
        java.lang.String str2 = locale1.getDisplayName();
        java.util.Locale locale3 = locale1.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getUnicodeLocaleType("714");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 714");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "days");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "days" + "'", str2, "days");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "days");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField5 = iSOChronology0.weekyears();
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.hourOfDay();
        org.joda.time.DurationField durationField11 = iSOChronology7.centuries();
        org.joda.time.DurationField durationField12 = iSOChronology7.months();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((long) 12, (org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology7.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) iSOChronology0, (org.joda.time.Chronology) iSOChronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis(0, 0, 99, (-292275054), 59, 6, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond((int) (short) 10);
        long long24 = dateTime23.getMillis();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
// flaky:         org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1642071248010L + "'", long24 == 1642071248010L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(999, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 117");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"dayOfMonth\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        int int9 = localTime8.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = localTime8.toDateTimeToday();
        org.joda.time.Instant instant11 = dateTime10.toInstant();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Date date3 = new java.util.Date(8, 3, 10);
        int int4 = date3.getHours();
        java.util.Date date8 = new java.util.Date(1, 14, 5);
        boolean boolean9 = date3.after(date8);
        java.lang.Object obj10 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Apr 10 00:00:00 UTC 1908");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(date8.toString(), "Wed Mar 05 00:00:00 UTC 1902");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "Fri Apr 10 00:00:00 UTC 1908");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "Fri Apr 10 00:00:00 UTC 1908");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "Fri Apr 10 00:00:00 UTC 1908");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream1 = strSet0.parallelStream();
        java.lang.Object[] objArray2 = strSet0.toArray();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = strSet0.add("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strStream1);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[gregory, buddhist, japanese]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[gregory, buddhist, japanese]");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        long long8 = dateTimeZone2.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale10 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str11 = dateTimeZone2.getShortName((long) '#', locale10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DateTime dateTime14 = dateTime12.minusHours((int) (short) 100);
        int int15 = dateTime12.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property16 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime17 = property16.withMinimumValue();
        org.joda.time.DateTime dateTime18 = property16.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) dateTime18, dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) "hourOfHalfday", dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hourOfHalfday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-349199880L) + "'", long8 == (-349199880L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField4 = iSOChronology3.weekyears();
        org.joda.time.DurationField durationField5 = iSOChronology3.halfdays();
        org.joda.time.DurationField durationField6 = iSOChronology3.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((int) (short) 100, 789, 12, (org.joda.time.Chronology) iSOChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology5.secondOfDay();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology5.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology5.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((-27424194), (int) (byte) -1, 21, 5, 2022, (org.joda.time.Chronology) iSOChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField5 = iSOChronology0.eras();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        long long3 = dateTimeZone0.nextTransition((long) (short) 1);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale10 = new java.util.Locale("days");
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder0.setWeekDefinition((int) (short) 10, 54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "days");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis(10, 25, 0, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Feb", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.dayOfYear();
        int int10 = dateTimeField8.get((long) 407);
        org.joda.time.ReadablePartial readablePartial11 = null;
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.era();
        int int16 = dateTimeField14.getLeapAmount((long) 10);
        boolean boolean18 = dateTimeField14.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        int int27 = dateTimeField23.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        boolean boolean36 = localDate32.isSupported(durationFieldType35);
        int[] intArray38 = new int[] { (short) 10 };
        int int39 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDate32, intArray38);
        org.joda.time.LocalDate.Property property40 = localDate32.yearOfCentury();
        int[] intArray45 = new int[] { 'a', 22, (short) 1 };
        int[] intArray47 = dateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDate32, (int) (short) 100, intArray45, 0);
        java.util.Locale locale49 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray50 = dateTimeField8.set(readablePartial11, 20, intArray47, "", locale49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ja");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime5.getFieldType(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime30 = dateTime20.plus(readableDuration29);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology3);
        org.joda.time.DurationField durationField6 = iSOChronology3.months();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology3.hourOfHalfday();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long13 = dateTimeZone11.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) ' ', dateTimeZone11);
        org.joda.time.LocalTime.Property property15 = localTime14.minuteOfHour();
        java.util.Locale locale16 = java.util.Locale.ITALY;
        java.lang.String str17 = property15.getAsText(locale16);
        int int18 = property15.getLeapAmount();
        java.lang.String str19 = property15.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = property15.getAsText(locale20);
        java.lang.String str22 = dateTimeField7.getAsText(3, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = calendar0.getDisplayName(0, 30, locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455251711,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=711,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "3" + "'", str22, "3");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        java.lang.String str5 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455251828,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.util.GregorianCalendar[time=1645455251828,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str5, "java.util.GregorianCalendar[time=1645455251828,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.addWrapFieldToCopy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withMinuteOfHour((-27424193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424193 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(123086, 99, (int) (short) 1, 14, 15, (-1), 953);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.years();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis((long) (-1), 954, 53, 100, 2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Instant instant20 = instant16.toInstant();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(instant20);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long7 = dateTimeZone5.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) ' ', dateTimeZone5);
        org.joda.time.LocalTime.Property property9 = localTime8.minuteOfHour();
        java.util.Locale locale10 = java.util.Locale.ITALY;
        java.lang.String str11 = property9.getAsText(locale10);
        java.lang.String str12 = locale10.getISO3Country();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str14 = locale13.toLanguageTag();
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str18 = locale17.getScript();
        java.util.Locale locale19 = java.util.Locale.JAPANESE;
        java.lang.String str20 = locale19.getScript();
        java.util.Locale[] localeArray21 = new java.util.Locale[] { locale10, locale13, locale15, locale16, locale17, locale19 };
        java.util.ArrayList<java.util.Locale> localeList22 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList22, localeArray21);
        java.util.Locale.FilteringMode filteringMode24 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList25 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList22, filteringMode24);
        java.util.Set<java.lang.String> strSet26 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField28 = iSOChronology27.weekyears();
        boolean boolean29 = strSet26.equals((java.lang.Object) durationField28);
        java.util.Iterator<java.lang.String> strItor30 = strSet26.iterator();
        java.util.Locale.FilteringMode filteringMode31 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList32 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet26, filteringMode31);
        java.lang.Object obj33 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strSet26.remove(obj33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ITA" + "'", str12, "ITA");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "fr-CA" + "'", str14, "fr-CA");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(localeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + filteringMode24 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode24.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList25);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertNotNull(iSOChronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strItor30);
        org.junit.Assert.assertTrue("'" + filteringMode31 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode31.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList32);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.millisOfSecond();
        int int25 = dateTimeField22.getDifference(10L, 10L);
        int int27 = dateTimeField22.getLeapAmount(10L);
        int int28 = dateTime11.get(dateTimeField22);
        org.joda.time.chrono.ISOChronology iSOChronology29 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField30 = iSOChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology29.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology29.hourOfDay();
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology29);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int37 = localDateTime35.get(dateTimeFieldType36);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.LocalDateTime localDateTime39 = localDateTime35.plus(readablePeriod38);
        int int40 = localDateTime35.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime35.plusMonths(16);
        org.joda.time.chrono.ISOChronology iSOChronology44 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField45 = iSOChronology44.weekyears();
        org.joda.time.DateTimeField dateTimeField46 = iSOChronology44.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField47 = iSOChronology44.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.LocalDate localDate52 = localDate50.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate54 = localDate52.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property55 = localDate52.weekyear();
        org.joda.time.LocalDate localDate56 = property55.roundFloorCopy();
        org.joda.time.LocalDate localDate58 = property55.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDate localDate60 = localDate58.minus(readablePeriod59);
        org.joda.time.chrono.ISOChronology iSOChronology61 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology61.era();
        int int64 = dateTimeField62.getLeapAmount((long) 10);
        boolean boolean66 = dateTimeField62.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType67 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType68 = dateTimeFieldType67.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology69 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField70 = iSOChronology69.weekyears();
        org.joda.time.DateTimeField dateTimeField71 = dateTimeFieldType67.getField((org.joda.time.Chronology) iSOChronology69);
        org.joda.time.DurationField durationField72 = dateTimeField71.getDurationField();
        int int75 = dateTimeField71.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone77 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate78 = new org.joda.time.LocalDate(dateTimeZone77);
        org.joda.time.LocalDate localDate80 = localDate78.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate82 = localDate80.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType83 = org.joda.time.DurationFieldType.years();
        boolean boolean84 = localDate80.isSupported(durationFieldType83);
        int[] intArray86 = new int[] { (short) 10 };
        int int87 = dateTimeField71.getMaximumValue((org.joda.time.ReadablePartial) localDate80, intArray86);
        org.joda.time.LocalDate.Property property88 = localDate80.yearOfCentury();
        int[] intArray93 = new int[] { 'a', 22, (short) 1 };
        int[] intArray95 = dateTimeField62.addWrapPartial((org.joda.time.ReadablePartial) localDate80, (int) (short) 100, intArray93, 0);
        int int96 = dateTimeField47.getMaximumValue((org.joda.time.ReadablePartial) localDate60, intArray95);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray98 = dateTimeField22.addWrapField((org.joda.time.ReadablePartial) localDateTime35, 21, intArray95, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 450 + "'", int28 == 450);
        org.junit.Assert.assertNotNull(iSOChronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTimeFieldType36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 31 + "'", int37 == 31);
        org.junit.Assert.assertNotNull(localDateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + int40 + "' != '" + 450 + "'", int40 == 450);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(iSOChronology44);
        org.junit.Assert.assertNotNull(durationField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(localDate52);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertNotNull(localDate60);
        org.junit.Assert.assertNotNull(iSOChronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType67);
        org.junit.Assert.assertNotNull(durationFieldType68);
        org.junit.Assert.assertNotNull(iSOChronology69);
        org.junit.Assert.assertNotNull(durationField70);
        org.junit.Assert.assertNotNull(dateTimeField71);
        org.junit.Assert.assertNotNull(durationField72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone77);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(durationFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[10]");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(property88);
        org.junit.Assert.assertNotNull(intArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray93), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(intArray95);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray95), "[97, 22, 1]");
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 23 + "'", int96 == 23);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology0.days();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfWeek((int) (byte) 1);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology13.era();
        int int16 = dateTimeField14.getLeapAmount((long) 10);
        boolean boolean18 = dateTimeField14.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType20 = dateTimeFieldType19.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField22 = iSOChronology21.weekyears();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField((org.joda.time.Chronology) iSOChronology21);
        org.joda.time.DurationField durationField24 = dateTimeField23.getDurationField();
        int int27 = dateTimeField23.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate30.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate34 = localDate32.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType35 = org.joda.time.DurationFieldType.years();
        boolean boolean36 = localDate32.isSupported(durationFieldType35);
        int[] intArray38 = new int[] { (short) 10 };
        int int39 = dateTimeField23.getMaximumValue((org.joda.time.ReadablePartial) localDate32, intArray38);
        org.joda.time.LocalDate.Property property40 = localDate32.yearOfCentury();
        int[] intArray45 = new int[] { 'a', 22, (short) 1 };
        int[] intArray47 = dateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDate32, (int) (short) 100, intArray45, 0);
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology0.validate((org.joda.time.ReadablePartial) localDate10, intArray47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(iSOChronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[10]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(intArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray47), "[97, 22, 1]");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        long long7 = durationField4.subtract(10L, 30);
        long long8 = durationField4.getUnitMillis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-29990L) + "'", long7 == (-29990L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1000L + "'", long8 == 1000L);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        int int4 = localDate2.getYearOfCentury();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 32770);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) localDate1);
        org.joda.time.LocalDate.Property property3 = localDate2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withDayOfWeek(789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 789 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis((int) ' ', (int) (byte) 1, 32769, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'fra' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.yearOfEra();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = iSOChronology0.get(readablePeriod6, (-1947974400000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(0, 11);
        java.util.TimeZone timeZone8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder0.setTimeZone(timeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        int int11 = localDateTime6.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime6.withDayOfMonth(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 49 + "'", int11 == 49);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime.Property property14 = dateTime11.weekyear();
        int int15 = dateTime11.getWeekOfWeekyear();
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology16.millisOfSecond();
        int int25 = dateTimeField22.getDifference(10L, 10L);
        int int27 = dateTimeField22.getLeapAmount(10L);
        int int28 = dateTime11.get(dateTimeField22);
        java.util.Locale locale31 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            long long32 = dateTimeField22.set((long) (byte) 100, "+97:00", locale31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"+97:00\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 317 + "'", int28 == 317);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        timeZone1.setID("years");
        java.util.Locale.Category category7 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale8 = java.util.Locale.getDefault(category7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone1.getDisplayName(true, 657, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 657");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455253487,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"years\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=487,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455253487,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"years\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=13,MILLISECOND=487,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + category7 + "' != '" + java.util.Locale.Category.FORMAT + "'", category7.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale8);
// flaky:         org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("DateTimeField[dayOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long9 = dateTimeZone7.previousTransition((long) (-1));
        long long13 = dateTimeZone7.convertLocalToUTC((long) 'x', true, (long) 10);
        int int15 = dateTimeZone7.getOffset((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(52, (int) (byte) 0, 9, (int) (byte) 10, 4, 12, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-349199880L) + "'", long13 == (-349199880L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 349200000 + "'", int15 == 349200000);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate2.plus(readablePeriod5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate2.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(dateTimeZone0);
        long long4 = dateTimeZone0.previousTransition((long) 657);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 657L + "'", long4 == 657L);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("21", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime13.withHourOfDay((-27424194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424194 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.year();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.year();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = iSOChronology0.getDateTimeMillis(0, 953, 918, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 953 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.parse("dopo Cristo", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(0L, dateTimeZone11);
        boolean boolean13 = localDate9.equals((java.lang.Object) dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime.Property property17 = dateTime16.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property17.setCopy("years");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"years\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 100);
        org.joda.time.Chronology chronology9 = localDateTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withDayOfWeek((-27424194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424194 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        int int8 = dateTimeField6.getLeapAmount((long) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        java.util.Locale locale21 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str22 = dateTimeField19.getAsText((int) (byte) 1, locale21);
        java.lang.String str23 = locale21.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) localDate13, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekyearOfCentury();
        long long7 = dateTimeField5.roundFloor((long) 20);
        long long10 = dateTimeField5.addWrapField((long) (short) -1, 22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant11 = new org.joda.time.Instant((java.lang.Object) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 694223999999L + "'", long10 == 694223999999L);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMonths(16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withYearOfCentury(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, 0, 14, (int) (byte) 10, (int) 'a', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.roll(11, false);
        java.util.TimeZone timeZone6 = calendar2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar2.getMaximum(657);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 657");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455254899,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=14,MILLISECOND=899,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645451654899,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=54,SECOND=14,MILLISECOND=899,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(23);
        org.joda.time.LocalDateTime localDateTime14 = property10.addToCopy((long) 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withDayOfYear((-27424194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424194 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        org.joda.time.DateTime.Property property17 = dateTime11.dayOfWeek();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        boolean boolean8 = localDate4.isSupported(durationFieldType7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property10 = dateTime9.yearOfEra();
        org.joda.time.DateTime.Property property11 = dateTime9.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        int[] intArray19 = new int[] { (short) 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localDate13, intArray19);
        java.util.Locale locale22 = null;
        java.lang.String str23 = localDate13.toString("2022", locale22);
        org.joda.time.LocalDate localDate25 = localDate13.withYearOfEra(40);
        int int26 = localDate13.getWeekyear();
        int int27 = localDate13.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 56 + "'", int27 == 56);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((long) 22);
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = property6.setCopy("714");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 714 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime21 = dateTime11.toLocalDateTime();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.DateTime dateTime23 = dateTime11.plus(readablePeriod22);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        java.lang.StringBuffer stringBuffer22 = null;
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property30 = localDateTime27.yearOfCentury();
        org.joda.time.LocalDateTime.Property property31 = localDateTime27.era();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer22, (org.joda.time.ReadablePartial) localDateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e0a\u5348", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[monthOfYear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone3 = calendar2.getTimeZone();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone3);
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        java.lang.Object obj6 = timeZone1.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455256237,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=237,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455256237,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=237,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645455256238,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=16,MILLISECOND=238,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.hourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = property7.compareTo(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(2021, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(0, 11);
        int[] intArray11 = new int[] { '4', 86399999, 99 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder7.setFields(intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 86399999, 99]");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DurationField durationField3 = iSOChronology1.halfdays();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.dayOfMonth();
        org.joda.time.DurationField durationField5 = iSOChronology1.seconds();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) (short) 1, (org.joda.time.Chronology) iSOChronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withTime(349200000, 86399999, 4, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349200000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(9, 10, 86399999, 8, 953, 0, (-27424193));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 953 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate4.getFieldType(56);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 56");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfWeek();
        long long12 = dateTimeField10.roundHalfFloor((long) 45);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMinutes((int) (short) 100);
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withWeekOfWeekyear(407);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 407 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime23 = dateTimeFormatter2.parseMutableDateTime("2022-02-21T14:54:18.307");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        long long8 = iSOChronology0.add((long) 100, (long) 15, (int) '4');
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.minuteOfHour();
        int int10 = dateTimeField9.getMinimumValue();
        int int12 = dateTimeField9.get((-1L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 880L + "'", long8 == 880L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 59 + "'", int12 == 59);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property10.setCopy("Fri Apr 10 00:00:00 UTC 1908");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Fri Apr 10 00:00:00 UTC 1908\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = property8.getAsText(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale1);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.addUnicodeLocaleAttribute("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ISOChronology[UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "USA" + "'", str15, "USA");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.addWrapFieldToCopy(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute(77);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 77 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTime dateTime16 = dateTime13.withDurationAdded(readableDuration14, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withCenturyOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology1.add(readablePeriod4, (long) (short) 1, 954);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) "A", (org.joda.time.Chronology) iSOChronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"A\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.hourOfDay();
        org.joda.time.DurationField durationField5 = iSOChronology1.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology1.months();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 12, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.weekOfWeekyear();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("Fri Apr 10 00:00:00 UTC 1908");
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField8.set((long) 781, "0", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(17, 14, 32772, 2021, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        org.joda.time.DurationField durationField4 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField5 = iSOChronology0.centuries();
        org.joda.time.DurationField durationField6 = iSOChronology0.seconds();
        java.lang.Class<?> wildcardClass7 = durationField6.getClass();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate23 = localDate2.withYearOfEra(15);
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(1);
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfMonth(25);
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withDayOfYear(15);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int38 = localDateTime36.get(dateTimeFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property39 = localDate27.property(dateTimeFieldType37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 31 + "'", int38 == 31);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Locale locale0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Can't set default locale to NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfSecond();
        java.lang.String str6 = dateTimeField5.toString();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[millisOfSecond]" + "'", str6, "DateTimeField[millisOfSecond]");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withDurationAdded(readableDuration8, 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime4.withMonthOfYear(53655688);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655688 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = instant16.isEqual((long) 30);
        boolean boolean19 = instant16.isBeforeNow();
        org.joda.time.Chronology chronology20 = instant16.getChronology();
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = chronology20.get(readablePeriod21, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.setLenient(false);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = calendar0.getDisplayName(0, 32772, locale9);
        boolean boolean12 = calendar0.isWeekDateSupported();
        boolean boolean13 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455259715,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=19,MILLISECOND=715,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = property8.getAsText(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale1);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder18 = builder13.setLanguageTag("A");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: A [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "USA" + "'", str15, "USA");
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.secondOfDay();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        boolean boolean4 = dateTimeFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.parse("months", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 123086);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        boolean boolean18 = dateTime11.isBefore(1L);
        org.joda.time.DateTime dateTime20 = dateTime11.plusWeeks((int) (short) 10);
        org.joda.time.DateTime dateTime22 = dateTime11.withYearOfCentury(3);
        int int23 = dateTime11.getMonthOfYear();
        org.joda.time.DateTime dateTime25 = dateTime11.plusMonths((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime25.withTime(2021, 23, 32772, (-27424194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime dateTime23 = dateTime20.withMillisOfSecond((int) (short) 10);
        org.joda.time.DateTime dateTime25 = dateTime20.withMillisOfSecond(100);
        org.joda.time.DateTime dateTime27 = dateTime20.plusDays(53648693);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime20.withTime(20, 53655688, 40, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53655688 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField17 = iSOChronology0.seconds();
        long long19 = durationField17.getValueAsLong(1L);
        int int22 = durationField17.getDifference((long) 'a', (long) 35);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate12 = localDate4.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate.Property property13 = localDate12.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((-27424194));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424194 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) '#');
        int int2 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = localTime1.isEqual(readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = strSet0.add("\u4e0a\u5348");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Set<java.lang.String> strSet1 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.stream.Stream<java.lang.String> strStream2 = strSet1.stream();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strStream2);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        int int8 = dateTimeField4.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        org.joda.time.LocalDate localDate13 = localDate11.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate15 = localDate13.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.years();
        boolean boolean17 = localDate13.isSupported(durationFieldType16);
        int[] intArray19 = new int[] { (short) 10 };
        int int20 = dateTimeField4.getMaximumValue((org.joda.time.ReadablePartial) localDate13, intArray19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate22 = localDate13.minus(readablePeriod21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DateTimeField dateTimeField25 = iSOChronology23.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.hourOfDay();
        org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.DateTimeField[] dateTimeFieldArray28 = localDateTime27.getFields();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.plusHours((int) (short) 0);
        int int31 = localDateTime27.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.secondOfDay();
        boolean boolean33 = localDateTime27.isSupported(dateTimeFieldType32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate35 = localDate13.withField(dateTimeFieldType32, 2021);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 4 + "'", int31 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("days");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"days\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withMinuteOfHour(53658491);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53658491 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DurationField durationField9 = iSOChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology7.monthOfYear();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology7);
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField13 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology7.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(20, (int) '4', 56, 70, 45, 35, 781, (org.joda.time.Chronology) iSOChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate9 = localDate4.minusYears(25);
        int int10 = localDate9.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = property8.getAsText(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale1);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        java.util.Locale locale17 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long21 = dateTimeZone19.previousTransition((long) (-1));
        long long25 = dateTimeZone19.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale27 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str28 = dateTimeZone19.getShortName((long) '#', locale27);
        java.lang.String str29 = locale17.getDisplayScript(locale27);
        java.util.Locale.Builder builder30 = builder16.setLocale(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder32 = builder30.setLanguage("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: Property[monthOfYear] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "USA" + "'", str15, "USA");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-349199880L) + "'", long25 == (-349199880L));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+97:00" + "'", str28, "+97:00");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(builder30);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        date6.setMonth(16);
        int int9 = date6.getSeconds();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromDateFields(date6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withSecondOfMinute((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date6.toString(), "Fri May 10 04:11:40 UTC 1901");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.lang.String str6 = calendar0.getCalendarType();
        int int7 = calendar0.getWeeksInWeekYear();
        boolean boolean8 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455261044,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=44,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gregory" + "'", str6, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = dateTimeFormatter21.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('u', "gioved\354");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: giovedi? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        long long5 = durationField3.getMillis((long) 2022);
        long long8 = durationField3.getValueAsLong((long) (byte) 10, (long) 349200000);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) durationField3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 5317346412000L + "'", long5 == 5317346412000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        java.util.Locale locale2 = new java.util.Locale("2022-02-25", "+97:00");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet4 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        boolean boolean7 = strSet4.equals((java.lang.Object) durationField6);
        java.util.Iterator<java.lang.String> strItor8 = strSet4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strSet3.addAll((java.util.Collection<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "2022-02-25_+97:00");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strItor8);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setTime(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455261652,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=21,MILLISECOND=652,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundHalfCeilingCopy();
        org.joda.time.DateTimeField dateTimeField11 = localDate9.getField((int) (byte) 0);
        java.util.Locale locale12 = null;
        int int13 = dateTimeField11.getMaximumShortTextLength(locale12);
        boolean boolean14 = dateTimeField11.isLenient();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType16 = dateTimeFieldType15.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField18 = iSOChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType15.getField((org.joda.time.Chronology) iSOChronology17);
        org.joda.time.DurationField durationField20 = dateTimeField19.getDurationField();
        int int23 = dateTimeField19.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate30 = localDate28.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        boolean boolean32 = localDate28.isSupported(durationFieldType31);
        int[] intArray34 = new int[] { (short) 10 };
        int int35 = dateTimeField19.getMaximumValue((org.joda.time.ReadablePartial) localDate28, intArray34);
        java.util.Locale locale37 = null;
        java.lang.String str38 = localDate28.toString("2022", locale37);
        org.joda.time.LocalDate localDate40 = localDate28.plusYears((int) (byte) -1);
        int[] intArray42 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField11.addWrapField((org.joda.time.ReadablePartial) localDate40, (int) 'a', intArray42, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(iSOChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[10]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "2022" + "'", str38, "2022");
        org.junit.Assert.assertNotNull(localDate40);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withCenturyOfEra((-2285347));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2285347 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("\u4e0a\u5348");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.minutes();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.minuteOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.years();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusMinutes(52);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withFieldAdded(durationFieldType4, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'months' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DurationField durationField4 = iSOChronology2.halfdays();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.DurationField durationField8 = iSOChronology5.months();
        long long11 = durationField8.subtract(0L, (long) 40);
        int int12 = durationField4.compareTo(durationField8);
        org.joda.time.DurationFieldType durationFieldType13 = durationField4.getType();
        org.joda.time.LocalTime localTime15 = localTime1.withFieldAdded(durationFieldType13, (int) 'x');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property17 = localTime1.property(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-105235200000L) + "'", long11 == (-105235200000L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfDay();
        org.joda.time.Chronology chronology9 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = iSOChronology0.getDateTimeMillis(21, (int) (byte) -1, 32772, 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale10 = new java.util.Locale("days");
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder0.setWeekDefinition(31, 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "days");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder4 = builder0.setCalendarType("100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder2.setDate((int) (byte) 0, 10, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDate7.getFieldType(54);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 54");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.util.Date date3 = new java.util.Date(1, 14, 5);
        date3.setYear(53648693);
        java.util.Date date12 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant13 = date12.toInstant();
        java.util.Date date14 = java.util.Date.from(instant13);
        date14.setYear((int) 'u');
        int int17 = date3.compareTo(date14);
        org.junit.Assert.assertEquals(date3.toString(), "Tue Mar 05 00:00:00 UTC 53650593");
        org.junit.Assert.assertEquals(date12.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Feb 10 04:11:40 UTC 2017");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.roll(11, false);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar2.getGreatestMinimum(459);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 459");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455262478,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=478,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645451662478,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=54,SECOND=22,MILLISECOND=478,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime9 = property6.addWrapFieldToCopy(35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property6.setCopy((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = iSOChronology0.getDateTimeMillis(53, (int) (byte) 0, 59, (int) 'u', 0, 10, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (long) 349200000);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.setLenient(false);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = calendar0.getDisplayName(0, 32772, locale9);
        boolean boolean12 = calendar0.isWeekDateSupported();
        int int13 = calendar0.getWeekYear();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        java.lang.String str28 = locale25.getExtension('u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = calendar0.getDisplayName(40, 15, locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455262924,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=22,MILLISECOND=924,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199880L) + "'", long23 == (-349199880L));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate10 = property7.setCopy("2022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        int int7 = localDateTime4.getMillisOfDay();
        int int8 = localDateTime4.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minusMillis(53648693);
        java.util.Locale locale12 = java.util.Locale.US;
        java.lang.String str13 = locale12.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime10.toString("dayOfMonth", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 53663074 + "'", int7 == 53663074);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, 4752000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = iSOChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField((org.joda.time.Chronology) iSOChronology20);
        org.joda.time.DurationField durationField23 = iSOChronology20.hours();
        boolean boolean24 = localDate17.equals((java.lang.Object) durationField23);
        boolean boolean25 = localDate12.isBefore((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long29 = dateTimeZone27.previousTransition((long) (-1));
        long long33 = dateTimeZone27.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale35 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str36 = dateTimeZone27.getShortName((long) '#', locale35);
        java.lang.String str37 = dateTimeZone27.getID();
        org.joda.time.DateTime dateTime38 = localDate12.toDateTimeAtMidnight(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-349199880L) + "'", long33 == (-349199880L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+97:00" + "'", str36, "+97:00");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        boolean boolean17 = dateTime15.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime20 = dateTime15.withDurationAdded((long) 11, 16);
        org.joda.time.DateTime.Property property21 = dateTime20.minuteOfDay();
        org.joda.time.DateTime dateTime22 = property21.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime22.withSecondOfMinute(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTimeFormatter4.parseDateTime("11 Apr 1903 09:41:00 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", (double) 42856587);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=4.2856587E7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        org.joda.time.LocalDate localDate8 = property7.roundFloorCopy();
        org.joda.time.LocalDate localDate9 = property7.roundHalfCeilingCopy();
        org.joda.time.LocalDate localDate11 = property7.setCopy(6);
        org.joda.time.LocalDate.Property property12 = localDate11.year();
        org.joda.time.LocalDate localDate14 = localDate11.minusDays((int) ' ');
        java.lang.Class<?> wildcardClass15 = localDate11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        long long6 = java.util.Date.UTC(0, 32769, (-2285347), 20, 407, (int) ' ');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-113486044348000L) + "'", long6 == (-113486044348000L));
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.parse("und", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.hourOfHalfday();
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Chronology chronology8 = iSOChronology5.withZone(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology5.yearOfCentury();
        boolean boolean10 = iSOChronology0.equals((java.lang.Object) iSOChronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = iSOChronology0.getDateTimeMillis((int) (short) 10, 2022, 741, (int) (short) 0, 53648693, 31, 116);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53648693 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.Date date3 = new java.util.Date(8, 3, 10);
        long long4 = date3.getTime();
        java.lang.Class<?> wildcardClass5 = date3.getClass();
        org.junit.Assert.assertEquals(date3.toString(), "Fri Apr 10 00:00:00 UTC 1908");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1947974400000L) + "'", long4 == (-1947974400000L));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Date date8 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.lang.String str9 = date8.toGMTString();
        boolean boolean10 = timeZone1.inDaylightTime(date8);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455264052,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=24,MILLISECOND=52,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(date8.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10 Feb 1900 04:11:40 GMT" + "'", str9, "10 Feb 1900 04:11:40 GMT");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        int int11 = localDateTime6.getMillisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime6.plusMonths(16);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusSeconds(45);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.minusDays(25);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDateTime13.toString("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 246 + "'", int11 == 246);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int2 = localTime1.getMillisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone0);
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 57264284 + "'", int2 == 57264284);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundCeilingCopy();
        int int7 = localDateTime6.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withTime(70, (-27424193), 16, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Locale locale3 = new java.util.Locale("ITA", "\u6cd5\u6587\u52a0\u62ff\u5927)", "fra");
// flaky:         org.junit.Assert.assertEquals(locale3.toString(), "\u6cd5\u6587\u52a0\u62ff\u5927)_fra");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.Chronology chronology34 = instant15.getChronology();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199880L) + "'", long24 == (-349199880L));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        long long6 = durationField3.getValueAsLong((long) 54, 302432772L);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((-292275054), 116, 30, 13, 17, 954);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 954 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology2.dayOfYear();
        int int8 = dateTimeField6.get(0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.yearOfCentury();
        org.joda.time.DurationField durationField3 = iSOChronology0.months();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis((long) 13, (int) (byte) 100, 23, 8, 657);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.MIDNIGHT;
        org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField8 = iSOChronology7.weekyears();
        org.joda.time.DateTimeZone dateTimeZone9 = iSOChronology7.getZone();
        org.joda.time.DurationField durationField10 = iSOChronology7.seconds();
        org.joda.time.DurationField durationField11 = iSOChronology7.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology7.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withEra((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType19 = dateTimeFieldType18.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology20 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField21 = iSOChronology20.weekyears();
        org.joda.time.DateTimeField dateTimeField22 = dateTimeFieldType18.getField((org.joda.time.Chronology) iSOChronology20);
        org.joda.time.DurationField durationField23 = dateTimeField22.getDurationField();
        int int26 = dateTimeField22.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(dateTimeZone28);
        org.joda.time.LocalDate localDate31 = localDate29.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate33 = localDate31.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType34 = org.joda.time.DurationFieldType.years();
        boolean boolean35 = localDate31.isSupported(durationFieldType34);
        int[] intArray37 = new int[] { (short) 10 };
        int int38 = dateTimeField22.getMaximumValue((org.joda.time.ReadablePartial) localDate31, intArray37);
        int int39 = dateTimeField12.getMaximumValue((org.joda.time.ReadablePartial) localDate15, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = dateTimeField4.addWrapField((org.joda.time.ReadablePartial) localTime5, 789, intArray37, 53655688);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 789");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(iSOChronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(iSOChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[10]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 999 + "'", int39 == 999);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = iSOChronology2.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) iSOChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        java.util.Locale locale5 = dateTimeFormatter3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("English", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNull(locale5);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        org.joda.time.LocalDate.Property property27 = localDate19.yearOfCentury();
        int int28 = localDate19.size();
        org.joda.time.LocalDate localDate30 = localDate19.minusWeeks((int) (short) -1);
        int int31 = localDate19.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(dateTimeZone32);
        int[] intArray34 = localTime33.getValues();
        // The following exception was thrown during execution in test generation
        try {
            iSOChronology0.validate((org.joda.time.ReadablePartial) localDate19, intArray34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 25 + "'", int31 == 25);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[15, 54, 25, 491]");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(23);
        org.joda.time.LocalDateTime localDateTime14 = property10.addToCopy((long) 59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property10.setCopy(77);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 77 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) ' ', dateTimeZone24);
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int30 = localTime27.compareTo((org.joda.time.ReadablePartial) localTime29);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long35 = dateTimeZone33.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime36 = new org.joda.time.LocalTime((long) ' ', dateTimeZone33);
        java.lang.String str37 = dateTimeZone33.getID();
        org.joda.time.DateTime dateTime38 = localTime27.toDateTimeToday(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+97:00" + "'", str37, "+97:00");
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate6.dayOfMonth();
        int int8 = property7.getMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property7.setCopy("100");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 28 + "'", int8 == 28);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (long) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.centuryOfEra();
        org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField5 = iSOChronology4.weekyears();
        org.joda.time.DateTimeZone dateTimeZone6 = iSOChronology4.getZone();
        long long8 = dateTimeZone6.nextTransition((long) (byte) 100);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.Chronology chronology10 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = iSOChronology0.get(readablePeriod11, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(iSOChronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.Date date3 = new java.util.Date(1, 14, 5);
        int int4 = date3.getDate();
        java.util.Date date5 = new java.util.Date();
        boolean boolean6 = date3.after(date5);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromDateFields(date3);
        java.lang.Object obj8 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Wed Mar 05 00:00:00 UTC 1902");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Mon Feb 21 14:54:26 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Wed Mar 05 00:00:00 UTC 1902");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Wed Mar 05 00:00:00 UTC 1902");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Wed Mar 05 00:00:00 UTC 1902");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long12 = dateTimeZone10.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) ' ', dateTimeZone10);
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        int int16 = localTime13.compareTo((org.joda.time.ReadablePartial) localTime15);
        org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        boolean boolean19 = localTime15.isAfter((org.joda.time.ReadablePartial) localTime18);
        org.joda.time.LocalTime localTime21 = localTime18.plusSeconds(99);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.minutes();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.era();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.yearOfEra();
        org.joda.time.DateTimeField dateTimeField28 = iSOChronology23.minuteOfHour();
        org.joda.time.chrono.ISOChronology iSOChronology30 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology30.era();
        org.joda.time.DateTimeField dateTimeField32 = iSOChronology30.yearOfCentury();
        org.joda.time.DurationField durationField33 = iSOChronology30.months();
        org.joda.time.DateTimeField dateTimeField34 = iSOChronology30.clockhourOfHalfday();
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (-27424193), (org.joda.time.Chronology) iSOChronology30);
        org.joda.time.chrono.ISOChronology iSOChronology36 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField37 = iSOChronology36.era();
        org.joda.time.DateTimeField dateTimeField38 = iSOChronology36.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology36.year();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long44 = dateTimeZone42.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime45 = new org.joda.time.LocalTime((long) ' ', dateTimeZone42);
        org.joda.time.LocalTime.Property property46 = localTime45.minuteOfHour();
        java.util.Locale locale47 = java.util.Locale.ITALY;
        java.lang.String str48 = property46.getAsText(locale47);
        int int49 = property46.getLeapAmount();
        java.lang.String str50 = property46.getAsShortText();
        java.util.Locale locale51 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str52 = property46.getAsText(locale51);
        org.joda.time.ReadableInstant readableInstant53 = null;
        int int54 = property46.getDifference(readableInstant53);
        org.joda.time.LocalTime localTime56 = property46.addCopy((-29990L));
        java.lang.String str57 = localTime56.toString();
        int[] intArray59 = iSOChronology36.get((org.joda.time.ReadablePartial) localTime56, (long) 3);
        int int60 = dateTimeField28.getMinimumValue((org.joda.time.ReadablePartial) localTime35, intArray59);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField7.add((org.joda.time.ReadablePartial) localTime21, 0, intArray59, 357);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(iSOChronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(iSOChronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "0" + "'", str48, "0");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "0" + "'", str50, "0");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "0" + "'", str52, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-27424194) + "'", int54 == (-27424194));
        org.junit.Assert.assertNotNull(localTime56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "05:10:00.032" + "'", str57, "05:10:00.032");
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[0, 0, 0, 3]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        calendar0.set(0, 2021, 407, 15, 23);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = calendar0.getDisplayName(86399999, (int) 'u', locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=0,MONTH=2021,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=407,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=15,MINUTE=23,SECOND=26,MILLISECOND=177,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.monthOfYear();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.clockhourOfHalfday();
        org.joda.time.Chronology chronology7 = iSOChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = iSOChronology0.getDateTimeMillis((-62899199978L), 32769, 12, 53658491, 998);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType7 = dateTimeFieldType6.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.DurationField durationField11 = dateTimeField10.getDurationField();
        int int14 = dateTimeField10.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        int[] intArray25 = new int[] { (short) 10 };
        int int26 = dateTimeField10.getMaximumValue((org.joda.time.ReadablePartial) localDate19, intArray25);
        java.util.Locale locale28 = null;
        java.lang.String str29 = localDate19.toString("2022", locale28);
        org.joda.time.LocalDate localDate31 = localDate19.withYearOfEra(40);
        int int32 = localDate19.getWeekyear();
        org.joda.time.LocalDate localDate33 = localDate2.withFields((org.joda.time.ReadablePartial) localDate19);
        int int34 = localDate2.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate36 = localDate2.minusWeeks(21);
        org.joda.time.chrono.ISOChronology iSOChronology37 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField38 = iSOChronology37.weekyears();
        org.joda.time.DateTimeField dateTimeField39 = iSOChronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField40 = iSOChronology37.hourOfDay();
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology37);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int45 = localDateTime43.get(dateTimeFieldType44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate47 = localDate36.withField(dateTimeFieldType44, 53655688);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "2022" + "'", str29, "2022");
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(iSOChronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
// flaky:         org.junit.Assert.assertTrue("'" + int45 + "' != '" + 31 + "'", int45 == 31);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean13 = dateTimeZone11.isStandardOffset((long) 0);
        org.joda.time.Interval interval14 = localDate4.toInterval(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long18 = dateTimeZone16.previousTransition((long) (-1));
        long long22 = dateTimeZone16.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale24 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str25 = dateTimeZone16.getShortName((long) '#', locale24);
        org.joda.time.DateMidnight dateMidnight26 = localDate4.toDateMidnight(dateTimeZone16);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        boolean boolean29 = dateTimeZone16.isStandardOffset((long) 32772);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-349199880L) + "'", long22 == (-349199880L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+97:00" + "'", str25, "+97:00");
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField11 = iSOChronology10.weekyears();
        org.joda.time.DateTimeZone dateTimeZone12 = iSOChronology10.getZone();
        org.joda.time.DurationField durationField13 = iSOChronology10.seconds();
        org.joda.time.DurationField durationField14 = iSOChronology10.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) property7, (org.joda.time.Chronology) iSOChronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        java.lang.String str3 = calendar0.getCalendarType();
        calendar0.setTimeInMillis((long) 349200000);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(367, 11, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=349200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=5,DAY_OF_YEAR=5,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gregory" + "'", str3, "gregory");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1970, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long11 = dateTimeZone9.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) ' ', dateTimeZone9);
        org.joda.time.LocalTime.Property property13 = localTime12.minuteOfHour();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        java.lang.String str15 = property13.getAsText(locale14);
        int int16 = property13.getLeapAmount();
        java.lang.String str17 = property13.getAsShortText();
        java.util.Locale locale18 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str19 = property13.getAsText(locale18);
        org.joda.time.ReadableInstant readableInstant20 = null;
        int int21 = property13.getDifference(readableInstant20);
        org.joda.time.LocalTime localTime23 = property13.addCopy((-29990L));
        java.lang.String str24 = localTime23.toString();
        int[] intArray26 = iSOChronology3.get((org.joda.time.ReadablePartial) localTime23, (long) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(14, 0, 3, (org.joda.time.Chronology) iSOChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0" + "'", str15, "0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0" + "'", str17, "0");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0" + "'", str19, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-27424194) + "'", int21 == (-27424194));
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "05:10:00.032" + "'", str24, "05:10:00.032");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[0, 0, 0, 3]");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.io.Writer writer4 = null;
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField6 = iSOChronology5.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology5.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology5);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.monthOfYear();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long15 = dateTimeZone13.previousTransition((long) (-1));
        long long19 = dateTimeZone13.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale21 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str22 = dateTimeZone13.getShortName((long) '#', locale21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime25 = dateTime23.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays(35);
        boolean boolean28 = localDateTime9.equals((java.lang.Object) dateTime25);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.DateTime dateTime30 = dateTime25.plus(readablePeriod29);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadableInstant) dateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-349199880L) + "'", long19 == (-349199880L));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+97:00" + "'", str22, "+97:00");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("3");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        java.lang.String str12 = locale9.getExtension('u');
        java.util.Locale locale13 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str14 = locale9.getDisplayName(locale13);
        boolean boolean15 = locale9.hasExtensions();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u6cd5\u6587\u52a0\u62ff\u5927)" + "'", str14, "\u6cd5\u6587\u52a0\u62ff\u5927)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.dayOfMonth();
        int int5 = dateTimeField3.get((-16586152531200000L));
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("24", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=24");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime.Property property6 = localDateTime4.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((long) 22);
        org.joda.time.DateTimeField dateTimeField9 = property6.getField();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long13 = dateTimeZone11.previousTransition((long) (-1));
        long long17 = dateTimeZone11.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale19 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str20 = dateTimeZone11.getShortName((long) '#', locale19);
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(dateTimeZone11);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime25 = dateTime23.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology26 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology26.era();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology26);
        org.joda.time.DateTimeField dateTimeField29 = iSOChronology26.weekyearOfCentury();
        int int30 = dateTime25.get(dateTimeField29);
        org.joda.time.DateTime dateTime32 = dateTime25.withYearOfCentury(45);
        org.joda.time.DateTime dateTime34 = dateTime25.minusDays(10);
        org.joda.time.DateTime dateTime36 = dateTime25.withYear(32772);
        int int37 = dateTime36.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int38 = property6.getDifference((org.joda.time.ReadableInstant) dateTime36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -16172880240");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-349199880L) + "'", long17 == (-349199880L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+97:00" + "'", str20, "+97:00");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(iSOChronology26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 22 + "'", int30 == 22);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
// flaky:         org.junit.Assert.assertTrue("'" + int37 + "' != '" + 42867988 + "'", int37 == 42867988);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("dopo Cristo");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"dopo Cristo\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withEra(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType13 = dateTimeFieldType12.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField15 = iSOChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField16 = dateTimeFieldType12.getField((org.joda.time.Chronology) iSOChronology14);
        org.joda.time.DurationField durationField17 = iSOChronology14.hours();
        boolean boolean18 = localDate11.equals((java.lang.Object) durationField17);
        boolean boolean19 = localDate6.isBefore((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.DateTime dateTime20 = localDate6.toDateTimeAtCurrentTime();
        java.util.GregorianCalendar gregorianCalendar21 = dateTime20.toGregorianCalendar();
        java.util.Locale locale24 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = gregorianCalendar21.getDisplayName(53648693, (-27424193), locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(iSOChronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(gregorianCalendar21);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh_CN");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        boolean boolean23 = dateTime21.isAfter(1645750800000L);
        org.joda.time.YearMonthDay yearMonthDay24 = dateTime21.toYearMonthDay();
        int int25 = dateTime21.getYearOfCentury();
        org.joda.time.DateTime.Property property26 = dateTime21.secondOfDay();
        java.util.Locale locale27 = java.util.Locale.TRADITIONAL_CHINESE;
        int int28 = property26.getMaximumTextLength(locale27);
        java.lang.String str29 = locale27.getCountry();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "TW" + "'", str29, "TW");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = property8.getAsText(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale1);
        java.util.Locale locale14 = java.util.Locale.US;
        java.lang.String str15 = locale14.getISO3Country();
        java.util.Locale.Builder builder16 = builder13.setLocale(locale14);
        java.util.Locale locale17 = builder13.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder13.setExtension('#', "era");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "USA" + "'", str15, "USA");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.setTimeInMillis((long) 28);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        int int7 = calendar5.getMinimum(10);
        int int9 = calendar5.getActualMinimum(0);
        calendar5.set(0, (-27424193), 918, 918, 25);
        calendar5.setMinimalDaysInFirstWeek(459);
        int int19 = calendar5.getMaximum(0);
        int int20 = calendar2.compareTo(calendar5);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455268388,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=28,MILLISECOND=388,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=28,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=459,ERA=1,YEAR=0,MONTH=-27424193,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=918,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=918,MINUTE=25,SECOND=28,MILLISECOND=388,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateMidnight dateMidnight21 = dateTime15.toDateMidnight();
        int int22 = dateMidnight21.getYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        java.io.Writer writer22 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.years();
        boolean boolean31 = localDate27.isSupported(durationFieldType30);
        org.joda.time.DateTime dateTime32 = localDate27.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property33 = dateTime32.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter21.printTo(writer22, (org.joda.time.ReadableInstant) dateTime32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property33);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(86399999, 999, 2023, (int) (short) 100, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.DurationField durationField4 = iSOChronology0.centuries();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.Chronology chronology16 = iSOChronology0.withZone(dateTimeZone6);
        org.joda.time.DurationField durationField17 = iSOChronology0.seconds();
        long long19 = durationField17.getValueAsLong(1L);
        long long20 = durationField17.getUnitMillis();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1000L + "'", long20 == 1000L);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        calendar0.setLenient(false);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = locale9.getISO3Language();
        java.lang.String str11 = calendar0.getDisplayName(0, 32772, locale9);
        calendar0.set(25, 77, 998, (int) (short) -1, 23);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 116");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=25,MONTH=77,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=998,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=-1,MINUTE=23,SECOND=29,MILLISECOND=40,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "fra" + "'", str10, "fra");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "A" + "'", str11, "A");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        org.joda.time.DurationField durationField25 = iSOChronology23.halfdays();
        org.joda.time.DateTimeField dateTimeField26 = iSOChronology23.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = iSOChronology23.dayOfYear();
        org.joda.time.DateTime dateTime28 = dateTime20.toDateTime((org.joda.time.Chronology) iSOChronology23);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray32 = iSOChronology23.get(readablePeriod29, 1645750800000L, 657L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.Chronology chronology3 = iSOChronology0.withZone(dateTimeZone2);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = iSOChronology0.getDateTimeMillis((-62899199978L), (-27424194), 954, (int) 'u', 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -27424194 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(0L, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.year();
        org.joda.time.LocalDate localDate5 = localDate2.withYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean8 = dateTimeZone6.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long12 = dateTimeZone6.getMillisKeepLocal(dateTimeZone10, (-1947974400000L));
        org.joda.time.DateMidnight dateMidnight13 = localDate2.toDateMidnight(dateTimeZone6);
        org.joda.time.LocalDate.Property property14 = localDate2.yearOfEra();
        java.util.Locale locale16 = java.util.Locale.JAPANESE;
        java.lang.String str17 = locale16.getScript();
        java.lang.String str18 = locale16.getDisplayScript();
        java.lang.String str19 = locale16.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property14.setCopy("DurationField[weekyears]", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DurationField[weekyears]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1947625200001L) + "'", long12 == (-1947625200001L));
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Japanese" + "'", str19, "Japanese");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withZone(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.parse("Italy", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int8 = localDateTime6.get(dateTimeFieldType7);
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readablePeriod9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime20.getDayOfWeek();
        org.joda.time.DateTime dateTime24 = dateTime20.withMillisOfSecond(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withCenturyOfEra(349200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349200000 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALY;
        java.util.Locale locale3 = new java.util.Locale("days");
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.util.Locale.Builder builder5 = builder0.setLocale(locale3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setRegion("centuries");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: centuries [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale3.toString(), "days");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Italy" + "'", str4, "Italy");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("DateTimeField[halfdayOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=datetimefield[halfdayofday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale10 = new java.util.Locale("days");
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale10);
        java.util.Calendar.Builder builder17 = builder0.setTimeOfDay(12, 407, 0);
        org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField19 = iSOChronology18.weekyears();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology18.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField21 = iSOChronology18.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property29 = localDate26.weekyear();
        org.joda.time.LocalDate localDate30 = property29.roundFloorCopy();
        org.joda.time.LocalDate localDate32 = property29.addWrapFieldToCopy((int) (byte) -1);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDate localDate34 = localDate32.minus(readablePeriod33);
        org.joda.time.chrono.ISOChronology iSOChronology35 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField36 = iSOChronology35.era();
        int int38 = dateTimeField36.getLeapAmount((long) 10);
        boolean boolean40 = dateTimeField36.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType42 = dateTimeFieldType41.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology43 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField44 = iSOChronology43.weekyears();
        org.joda.time.DateTimeField dateTimeField45 = dateTimeFieldType41.getField((org.joda.time.Chronology) iSOChronology43);
        org.joda.time.DurationField durationField46 = dateTimeField45.getDurationField();
        int int49 = dateTimeField45.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate52 = new org.joda.time.LocalDate(dateTimeZone51);
        org.joda.time.LocalDate localDate54 = localDate52.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate56 = localDate54.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType57 = org.joda.time.DurationFieldType.years();
        boolean boolean58 = localDate54.isSupported(durationFieldType57);
        int[] intArray60 = new int[] { (short) 10 };
        int int61 = dateTimeField45.getMaximumValue((org.joda.time.ReadablePartial) localDate54, intArray60);
        org.joda.time.LocalDate.Property property62 = localDate54.yearOfCentury();
        int[] intArray67 = new int[] { 'a', 22, (short) 1 };
        int[] intArray69 = dateTimeField36.addWrapPartial((org.joda.time.ReadablePartial) localDate54, (int) (short) 100, intArray67, 0);
        int int70 = dateTimeField21.getMaximumValue((org.joda.time.ReadablePartial) localDate34, intArray69);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder71 = builder17.setFields(intArray69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "days");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(iSOChronology18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(iSOChronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(durationFieldType42);
        org.junit.Assert.assertNotNull(iSOChronology43);
        org.junit.Assert.assertNotNull(durationField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(durationField46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(localDate56);
        org.junit.Assert.assertNotNull(durationFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(intArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray60), "[10]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(intArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray69), "[97, 22, 1]");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 23 + "'", int70 == 23);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.Instant instant16 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime11.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime11.withDayOfWeek((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks((int) (byte) 1);
        int int9 = localDateTime8.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withEra(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("DateTimeField[millisOfSecond]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[millisOfSecond]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(953, 21, 53, 116, 918, 339);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 116 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        int int22 = dateTime21.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = dateTime21.withEra(3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.LocalTime localTime9 = property6.withMinimumValue();
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.joda.time.DurationField durationField11 = property10.getDurationField();
        long long14 = durationField11.add((long) 42856587, 53);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 233656587L + "'", long14 == 233656587L);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate4.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property7 = localDate4.weekyear();
        java.lang.String str8 = property7.getAsString();
        org.joda.time.LocalDate localDate9 = property7.getLocalDate();
        org.joda.time.LocalDate localDate11 = property7.addToCopy(999);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property7.setCopy("11 Apr 1903 09:41:00 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"11 Apr 1903 09:41:00 GMT\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.era();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology1.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        long long7 = iSOChronology1.add(readablePeriod4, (long) (short) 1, 954);
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology1.clockhourOfDay();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) 56, (org.joda.time.Chronology) iSOChronology1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime9.toString("21 Jan 2022 14:54:23 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.lang.String[] strArray6 = new java.lang.String[] { "fr-CA", "days", "0", "hi!", "2022-02-25", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray15 = new java.lang.String[] { "", "hi!", "days" };
        java.util.ArrayList<java.lang.String> strList16 = new java.util.ArrayList<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList16, strArray15);
        java.util.Locale.FilteringMode filteringMode18 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList19 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList16, filteringMode18);
        boolean boolean20 = strSet7.addAll((java.util.Collection<java.lang.String>) strList16);
        java.lang.Object[] objArray21 = strSet7.toArray();
        java.util.Set<java.lang.String> strSet22 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField24 = iSOChronology23.weekyears();
        boolean boolean25 = strSet22.equals((java.lang.Object) durationField24);
        boolean boolean26 = strSet7.removeAll((java.util.Collection<java.lang.String>) strSet22);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long34 = dateTimeZone32.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime((long) ' ', dateTimeZone32);
        org.joda.time.LocalTime.Property property36 = localTime35.minuteOfHour();
        java.util.Locale locale37 = java.util.Locale.ITALY;
        java.lang.String str38 = property36.getAsText(locale37);
        java.lang.String str39 = locale37.getISO3Country();
        java.util.Locale locale40 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str41 = locale40.toLanguageTag();
        java.util.Locale locale42 = java.util.Locale.CANADA_FRENCH;
        java.util.Locale locale43 = java.util.Locale.KOREA;
        java.util.Locale locale44 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str45 = locale44.getScript();
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.lang.String str47 = locale46.getScript();
        java.util.Locale[] localeArray48 = new java.util.Locale[] { locale37, locale40, locale42, locale43, locale44, locale46 };
        java.util.ArrayList<java.util.Locale> localeList49 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList49, localeArray48);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList52 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList49, filteringMode51);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap53 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList54 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, strMap53);
        java.util.Set<java.lang.String> strSet55 = java.util.Calendar.getAvailableCalendarTypes();
        org.joda.time.chrono.ISOChronology iSOChronology56 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField57 = iSOChronology56.weekyears();
        boolean boolean58 = strSet55.equals((java.lang.Object) durationField57);
        java.util.Iterator<java.lang.String> strItor59 = strSet55.iterator();
        java.lang.String str60 = java.util.Locale.lookupTag(languageRangeList54, (java.util.Collection<java.lang.String>) strSet55);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = strSet22.removeAll((java.util.Collection<java.lang.String>) strSet55);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + filteringMode18 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode18.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[fr-CA, days, 0, hi!, 2022-02-25, ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[fr-CA, days, 0, hi!, 2022-02-25, ]");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "0" + "'", str38, "0");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ITA" + "'", str39, "ITA");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "fr-CA" + "'", str41, "fr-CA");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(localeArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode51.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList52);
        org.junit.Assert.assertNotNull(languageRangeList54);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(iSOChronology56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strItor59);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withEra(1);
        int int10 = localDate4.compareTo((org.joda.time.ReadablePartial) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.plusWeeks(2);
        org.joda.time.LocalDate localDate14 = localDate7.plusDays(56);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.years();
        boolean boolean23 = localDate19.isSupported(durationFieldType22);
        org.joda.time.DateTime dateTime24 = localDate19.toDateTimeAtCurrentTime();
        org.joda.time.DateTime.Property property25 = dateTime24.yearOfEra();
        org.joda.time.DateTime dateTime27 = dateTime24.withSecondOfMinute((int) ' ');
        org.joda.time.DateTime dateTime28 = localDate7.toDateTime((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.LocalDate localDate29 = dateTime24.toLocalDate();
        java.util.Date date36 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        date36.setMonth(16);
        int int39 = date36.getSeconds();
        org.joda.time.LocalTime localTime40 = org.joda.time.LocalTime.fromDateFields(date36);
        org.joda.time.LocalTime localTime42 = localTime40.plusMinutes(21);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = localDate29.isBefore((org.joda.time.ReadablePartial) localTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertEquals(date36.toString(), "Fri May 10 04:11:40 UTC 1901");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 40 + "'", int39 == 40);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime42);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime15 = dateTime13.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology16.era();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology16);
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology16.weekyearOfCentury();
        int int20 = dateTime15.get(dateTimeField19);
        org.joda.time.DateTime dateTime22 = dateTime15.withYearOfCentury(45);
        java.util.Locale locale24 = java.util.Locale.ITALY;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.lang.String str27 = locale24.getExtension('x');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTime15.toString("21 Jan 2022 14:54:23 GMT", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(iSOChronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 22 + "'", int20 == 22);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "it_IT");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.hourOfDay();
        int int8 = property7.getLeapAmount();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime5.getFieldType(123086);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 123086");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        java.lang.String str11 = dateTimeZone1.getID();
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+97:00" + "'", str11, "+97:00");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.DateTime.Property property22 = dateTime20.dayOfMonth();
        org.joda.time.DateTime dateTime24 = dateTime20.plusSeconds(21);
        org.joda.time.DateTime dateTime26 = dateTime20.minusDays((int) (byte) 0);
        org.joda.time.DateTime dateTime28 = dateTime20.withYearOfEra(954);
        org.joda.time.DateTime dateTime30 = dateTime28.minus(0L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.Instant instant15 = dateTime11.toInstant();
        org.joda.time.MutableDateTime mutableDateTime16 = instant15.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long20 = dateTimeZone18.previousTransition((long) (-1));
        long long24 = dateTimeZone18.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale26 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str27 = dateTimeZone18.getShortName((long) '#', locale26);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime30 = dateTime28.withWeekyear(1);
        org.joda.time.Chronology chronology31 = dateTime28.getChronology();
        boolean boolean32 = instant15.isBefore((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime33 = instant15.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant36 = instant15.withDurationAdded(readableDuration34, 16);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-349199880L) + "'", long24 == (-349199880L));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+97:00" + "'", str27, "+97:00");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(instant36);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar0.getLeastMaximum(104);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455271143,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=31,MILLISECOND=143,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.withEra(1);
        int int22 = localDate16.compareTo((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean25 = dateTimeZone23.isStandardOffset((long) 0);
        org.joda.time.Interval interval26 = localDate16.toInterval(dateTimeZone23);
        boolean boolean27 = dateTime11.equals((java.lang.Object) dateTimeZone23);
        org.joda.time.DateTime.Property property28 = dateTime11.year();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        org.joda.time.LocalTime localTime8 = localTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.LocalTime localTime10 = localTime8.plusSeconds((int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology13);
        int int16 = localTime10.get(dateTimeFieldType11);
        org.joda.time.LocalTime localTime18 = localTime10.plusSeconds((int) (short) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localTime18.toString("java.util.GregorianCalendar[time=1645455251828,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=11,MILLISECOND=828,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusWeeks(100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusMinutes(100);
        int int11 = localDateTime10.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.minusMillis((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) localDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        java.lang.String str7 = iSOChronology0.toString();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = iSOChronology0.dayOfMonth();
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ISOChronology[UTC]" + "'", str7, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.Interval interval9 = property6.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property6.setCopy(337);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 337 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertNotNull(interval9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.yearOfCentury();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property8.setCopy(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) ' ', dateTimeZone4);
        org.joda.time.LocalTime.Property property8 = localTime7.minuteOfHour();
        java.util.Locale locale9 = java.util.Locale.ITALY;
        java.lang.String str10 = property8.getAsText(locale9);
        java.lang.String str11 = locale9.getISO3Country();
        java.lang.String str12 = locale1.getDisplayLanguage(locale9);
        java.util.Locale.Builder builder13 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder0.setUnicodeLocaleKeyword("2022-03-01T00:00:00.000", "English");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-03-01T00:00:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ITA" + "'", str11, "ITA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "italiano" + "'", str12, "italiano");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeZone dateTimeZone2 = iSOChronology0.getZone();
        org.joda.time.DurationField durationField3 = iSOChronology0.seconds();
        org.joda.time.DurationField durationField4 = iSOChronology0.halfdays();
        org.joda.time.DurationFieldType durationFieldType5 = durationField4.getType();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = durationField4.add((long) 86399999, (-2205517700000L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: -2205517700000 * 43200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationFieldType5);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        java.lang.String str17 = property15.getAsShortText();
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = property15.setCopy("23:59:38.016", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"23:59:38.016\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Feb" + "'", str17, "Feb");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(40, 1, (int) (byte) 1, 357, 52, 789, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 357 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        java.util.Calendar.Builder builder7 = builder0.set(2, (int) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.ITALY;
        java.util.Locale locale10 = new java.util.Locale("days");
        java.lang.String str11 = locale8.getDisplayCountry(locale10);
        java.lang.String str12 = locale10.getCountry();
        java.util.Calendar.Builder builder13 = builder0.setLocale(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder13.set((-27424193), 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
        org.junit.Assert.assertEquals(locale10.toString(), "days");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Italy" + "'", str11, "Italy");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.DateTime dateTime17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = dateTime17.plusDays(2021);
        org.joda.time.format.DateTimePrinter dateTimePrinter20 = null;
        org.joda.time.format.DateTimeParser dateTimeParser21 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter20, dateTimeParser21);
        org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField24 = iSOChronology23.era();
        org.joda.time.DurationField durationField25 = dateTimeField24.getRangeDurationField();
        java.lang.String str26 = dateTimeField24.getName();
        org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField29 = iSOChronology28.weekyears();
        org.joda.time.DateTimeField dateTimeField30 = iSOChronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField31 = iSOChronology28.hourOfDay();
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology28);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withDurationAdded(readableDuration35, (int) (byte) -1);
        java.util.Locale locale38 = java.util.Locale.ITALY;
        boolean boolean39 = localDateTime37.equals((java.lang.Object) locale38);
        java.lang.String str40 = dateTimeField24.getAsShortText(0L, locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter22.withLocale(locale38);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter43 = dateTimeFormatter41.withDefaultYear(23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTime17.toString(dateTimeFormatter41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(iSOChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNull(durationField25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "era" + "'", str26, "era");
        org.junit.Assert.assertNotNull(iSOChronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "dopo Cristo" + "'", str40, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeFormatter43);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long25 = dateTimeZone23.previousTransition((long) (-1));
        long long29 = dateTimeZone23.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale31 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str32 = dateTimeZone23.getShortName((long) '#', locale31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(dateTimeZone23);
        org.joda.time.DateTime dateTime35 = dateTime33.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime37 = dateTime35.minusDays(35);
        boolean boolean39 = dateTime37.equals((java.lang.Object) 12);
        org.joda.time.DateTime dateTime42 = dateTime37.withDurationAdded((long) 11, 16);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long46 = dateTimeZone44.previousTransition((long) (-1));
        long long50 = dateTimeZone44.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale52 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str53 = dateTimeZone44.getShortName((long) '#', locale52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime(dateTimeZone44);
        org.joda.time.DateTime dateTime56 = dateTime54.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime58 = dateTime56.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology59 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField60 = iSOChronology59.era();
        org.joda.time.LocalTime localTime61 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology59);
        org.joda.time.DateTimeField dateTimeField62 = iSOChronology59.weekyearOfCentury();
        int int63 = dateTime58.get(dateTimeField62);
        org.joda.time.DateMidnight dateMidnight64 = dateTime58.toDateMidnight();
        org.joda.time.MutableDateTime mutableDateTime65 = dateMidnight64.toMutableDateTime();
        boolean boolean66 = dateTime37.isAfter((org.joda.time.ReadableInstant) mutableDateTime65);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime65, "italiano", 953);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-349199880L) + "'", long29 == (-349199880L));
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+97:00" + "'", str32, "+97:00");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + (-349199880L) + "'", long50 == (-349199880L));
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "+97:00" + "'", str53, "+97:00");
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(iSOChronology59);
        org.junit.Assert.assertNotNull(dateTimeField60);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 22 + "'", int63 == 22);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertNotNull(mutableDateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.setTimeInMillis((long) 28);
        org.joda.time.chrono.ISOChronology iSOChronology5 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology5.era();
        int int8 = dateTimeField6.getLeapAmount((long) 10);
        boolean boolean10 = dateTimeField6.isLeap((long) 2);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField((org.joda.time.Chronology) iSOChronology13);
        org.joda.time.DurationField durationField16 = dateTimeField15.getDurationField();
        int int19 = dateTimeField15.getDifference((long) 15, (long) 'x');
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfWeek((int) (byte) 1);
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.years();
        boolean boolean28 = localDate24.isSupported(durationFieldType27);
        int[] intArray30 = new int[] { (short) 10 };
        int int31 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDate24, intArray30);
        org.joda.time.LocalDate.Property property32 = localDate24.yearOfCentury();
        int[] intArray37 = new int[] { 'a', 22, (short) 1 };
        int[] intArray39 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDate24, (int) (short) 100, intArray37, 0);
        boolean boolean40 = calendar2.equals((java.lang.Object) localDate24);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455272812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=32,MILLISECOND=812,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=28,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(iSOChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[10]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[97, 22, 1]");
        org.junit.Assert.assertNotNull(intArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray39), "[97, 22, 1]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekOfWeekyear(35);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.hourOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withDurationAdded(readableDuration8, 4);
        org.joda.time.Chronology chronology11 = localDateTime10.getChronology();
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology12.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField15 = iSOChronology12.hourOfDay();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMinutes((int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int20 = localDateTime18.get(dateTimeFieldType19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.plus(readablePeriod21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusDays((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType26 = dateTimeFieldType25.getDurationType();
        int int27 = localDateTime22.get(dateTimeFieldType25);
        int int28 = localDateTime10.get(dateTimeFieldType25);
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(dateTimeZone30);
        org.joda.time.LocalDate localDate33 = localDate31.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate35 = localDate33.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property36 = localDate33.weekyear();
        org.joda.time.LocalDate localDate38 = property36.addWrapFieldToCopy((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            int int39 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDate38);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusSeconds((int) (short) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.minus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DurationField durationField2 = iSOChronology0.halfdays();
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology3);
        org.joda.time.DurationField durationField6 = iSOChronology3.months();
        long long9 = durationField6.subtract(0L, (long) 40);
        int int10 = durationField2.compareTo(durationField6);
        long long12 = durationField6.getValueAsLong((long) 953);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = durationField6.getMillis(4752000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 4752000000 * 2629746000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-105235200000L) + "'", long9 == (-105235200000L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        java.lang.String str9 = dateTimeField7.getAsShortText((long) 123086);
        boolean boolean11 = dateTimeField7.isLeap((long) 57264284);
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AM" + "'", str9, "AM");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField1 = iSOChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField2 = iSOChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withDurationAdded(readableDuration7, (int) (byte) -1);
        java.util.Locale locale10 = java.util.Locale.ITALY;
        boolean boolean11 = localDateTime9.equals((java.lang.Object) locale10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withEra(741);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 741 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone1 = calendar0.getTimeZone();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        calendar2.roll(11, false);
        java.util.TimeZone timeZone6 = calendar2.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate(8, 31, (-27424193));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -27424193");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455273558,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=33,MILLISECOND=558,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645451673558,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=54,SECOND=33,MILLISECOND=558,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(741, 30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 741 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        java.util.Locale locale4 = dateTimeFormatter2.getLocale();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (long) 29);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNull(locale4);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra(1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long8 = dateTimeZone6.previousTransition((long) (-1));
        long long12 = dateTimeZone6.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = dateTimeZone6.getShortName((long) '#', locale14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime20 = dateTime18.minusDays(35);
        org.joda.time.DateTime dateTime21 = localDate2.toDateTime((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate23 = localDate2.withYearOfEra(15);
        org.joda.time.LocalDate localDate25 = localDate23.plusWeeks(1);
        org.joda.time.LocalDate localDate27 = localDate23.minusWeeks(10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-349199880L) + "'", long12 == (-349199880L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+97:00" + "'", str15, "+97:00");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(localDate27);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 16);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime4 = localTime1.withFieldAdded(durationFieldType2, (int) (byte) -1);
        org.joda.time.Chronology chronology5 = localTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.util.Date date7 = calendar0.getTime();
        org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology10.era();
        org.joda.time.DateTimeField dateTimeField12 = iSOChronology10.yearOfCentury();
        org.joda.time.DurationField durationField13 = iSOChronology10.months();
        org.joda.time.DateTimeField dateTimeField14 = iSOChronology10.halfdayOfDay();
        java.util.Locale locale15 = java.util.Locale.ROOT;
        int int16 = dateTimeField14.getMaximumShortTextLength(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap17 = calendar0.getDisplayNames(6, 13, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455273911,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=33,MILLISECOND=911,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 14:54:33 UTC 2022");
        org.junit.Assert.assertNotNull(iSOChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withDefaultYear((int) (short) 1);
        boolean boolean5 = dateTimeFormatter4.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = dateTimeFormatter4.parseLocalDate("21");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology0.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = iSOChronology0.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = iSOChronology0.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = iSOChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = iSOChronology0.secondOfDay();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withYearOfEra(11);
        org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField14 = iSOChronology13.weekyears();
        org.joda.time.DurationField durationField15 = iSOChronology13.minutes();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology13.era();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology13.yearOfEra();
        org.joda.time.DateTimeField dateTimeField18 = iSOChronology13.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology13.weekyear();
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((org.joda.time.Chronology) iSOChronology13);
        int[] intArray21 = localDate20.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = dateTimeField8.set((org.joda.time.ReadablePartial) localDateTime11, 0, intArray21, 407);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(iSOChronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[407, 2, 21]");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField2 = iSOChronology1.weekyears();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(1L, (org.joda.time.Chronology) iSOChronology1);
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology1.weekOfWeekyear();
        org.junit.Assert.assertNotNull(iSOChronology1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate9 = localDate7.withDayOfWeek((int) (byte) 1);
        org.joda.time.LocalDate.Property property10 = localDate7.weekyear();
        java.lang.String str11 = property10.getAsString();
        org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField13 = iSOChronology12.weekyears();
        org.joda.time.DateTimeZone dateTimeZone14 = iSOChronology12.getZone();
        boolean boolean15 = property10.equals((java.lang.Object) iSOChronology12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter2.withChronology((org.joda.time.Chronology) iSOChronology12);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.LocalDate localDate21 = localDate19.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate23 = localDate21.withDayOfWeek((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(iSOChronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Date date3 = new java.util.Date(8, 3, 10);
        java.lang.String str4 = date3.toGMTString();
        date3.setHours((int) (short) 0);
        date3.setHours((int) ' ');
        java.lang.String str9 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 11 08:00:00 UTC 1908");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10 Apr 1908 00:00:00 GMT" + "'", str4, "10 Apr 1908 00:00:00 GMT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Sat Apr 11 08:00:00 UTC 1908" + "'", str9, "Sat Apr 11 08:00:00 UTC 1908");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Date date7 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        java.time.Instant instant8 = date7.toInstant();
        java.util.Date date9 = java.util.Date.from(instant8);
        java.util.Calendar.Builder builder10 = builder0.setInstant(date9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        java.util.TimeZone timeZone12 = calendar11.getTimeZone();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone12);
        java.util.Calendar.Builder builder14 = builder0.setTimeZone(timeZone12);
        boolean boolean15 = timeZone12.useDaylightTime();
        org.junit.Assert.assertEquals(date7.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Sat Feb 10 04:11:40 UTC 1900");
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455274925,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=925,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455274925,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=925,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long6 = dateTimeZone4.previousTransition((long) (-1));
        long long10 = dateTimeZone4.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale12 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str13 = dateTimeZone4.getShortName((long) '#', locale12);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone4);
        org.joda.time.DateTime dateTime16 = dateTime14.minusHours((int) (short) 100);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays(35);
        org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField20 = iSOChronology19.era();
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology19);
        org.joda.time.DateTimeField dateTimeField22 = iSOChronology19.weekyearOfCentury();
        int int23 = dateTime18.get(dateTimeField22);
        org.joda.time.DateMidnight dateMidnight24 = dateTime18.toDateMidnight();
        boolean boolean25 = calendar0.after((java.lang.Object) dateTime18);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calendar0.get(757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 757");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455274995,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=34,MILLISECOND=995,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-349199880L) + "'", long10 == (-349199880L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+97:00" + "'", str13, "+97:00");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(iSOChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 22 + "'", int23 == 22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        int int4 = calendar0.getActualMinimum(0);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        int int7 = calendar5.getMinimum(10);
        int int9 = calendar5.getActualMinimum(0);
        calendar5.setLenient(false);
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str15 = locale14.getISO3Language();
        java.lang.String str16 = calendar5.getDisplayName(0, 32772, locale14);
        int int17 = calendar0.compareTo(calendar5);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455275031,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=35,MILLISECOND=31,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645455275031,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=35,MILLISECOND=31,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fra" + "'", str15, "fra");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A" + "'", str16, "A");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
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
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long4 = dateTimeZone2.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        org.joda.time.LocalTime.Property property6 = localTime5.minuteOfHour();
        java.util.Locale locale7 = java.util.Locale.ITALY;
        java.lang.String str8 = property6.getAsText(locale7);
        int int9 = property6.getLeapAmount();
        java.lang.String str10 = property6.getAsShortText();
        java.util.Locale locale11 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str12 = property6.getAsText(locale11);
        org.joda.time.ReadableInstant readableInstant13 = null;
        int int14 = property6.getDifference(readableInstant13);
        org.joda.time.LocalTime localTime16 = property6.addCopy((-29990L));
        org.joda.time.LocalTime localTime18 = property6.addCopy(56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = property6.setCopy("Italy");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Italy\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0" + "'", str8, "0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0" + "'", str12, "0");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-27424194) + "'", int14 == (-27424194));
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = iSOChronology0.era();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeField dateTimeField3 = iSOChronology0.weekyearOfCentury();
        org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now((org.joda.time.Chronology) iSOChronology0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 337);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 337 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(dateTimeZone2);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withEra(1);
        int int11 = localDate5.compareTo((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean14 = dateTimeZone12.isStandardOffset((long) 0);
        org.joda.time.Interval interval15 = localDate5.toInterval(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long19 = dateTimeZone17.previousTransition((long) (-1));
        long long23 = dateTimeZone17.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale25 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str26 = dateTimeZone17.getShortName((long) '#', locale25);
        org.joda.time.DateMidnight dateMidnight27 = localDate5.toDateMidnight(dateTimeZone17);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone17);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime((java.lang.Object) durationFieldType0, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-349199880L) + "'", long23 == (-349199880L));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+97:00" + "'", str26, "+97:00");
        org.junit.Assert.assertNotNull(dateMidnight27);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withZone(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.parse("3", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withEra((int) (byte) 1);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear(30);
        org.joda.time.LocalDate localDate9 = localDate4.withDayOfYear(3);
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long14 = dateTimeZone12.previousTransition((long) (-1));
        long long18 = dateTimeZone12.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale20 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str21 = dateTimeZone12.getShortName((long) '#', locale20);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime24 = dateTime22.minusHours((int) (short) 100);
        int int25 = dateTime22.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property26 = dateTime22.monthOfYear();
        org.joda.time.Instant instant27 = dateTime22.toInstant();
        boolean boolean29 = instant27.isEqual((long) 30);
        boolean boolean30 = instant27.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime31 = instant27.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean33 = instant27.isSupported(dateTimeFieldType32);
        boolean boolean34 = dateTime10.isEqual((org.joda.time.ReadableInstant) instant27);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-349199880L) + "'", long18 == (-349199880L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+97:00" + "'", str21, "+97:00");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(mutableDateTime31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.GERMANY;
        java.lang.String str2 = timeZone0.getDisplayName(locale1);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Koordinierte Universalzeit" + "'", str2, "Koordinierte Universalzeit");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField4 = iSOChronology3.era();
        org.joda.time.DurationField durationField5 = dateTimeField4.getRangeDurationField();
        java.lang.String str6 = dateTimeField4.getName();
        org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField9 = iSOChronology8.weekyears();
        org.joda.time.DateTimeField dateTimeField10 = iSOChronology8.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField11 = iSOChronology8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology) iSOChronology8);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusMinutes((int) 'a');
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withDurationAdded(readableDuration15, (int) (byte) -1);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        boolean boolean19 = localDateTime17.equals((java.lang.Object) locale18);
        java.lang.String str20 = dateTimeField4.getAsShortText(0L, locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter2.withLocale(locale18);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = dateTimeFormatter21.withDefaultYear(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = dateTimeFormatter21.parseLocalDate("24");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iSOChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "era" + "'", str6, "era");
        org.junit.Assert.assertNotNull(iSOChronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dopo Cristo" + "'", str20, "dopo Cristo");
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertNotNull(dateTimeFormatter23);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) '4');
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone2);
        long long6 = dateTimeZone1.getMillisKeepLocal(dateTimeZone2, (long) 22);
        int int8 = dateTimeZone1.getOffsetFromLocal((-2205517700000L));
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-349199926L) + "'", long6 == (-349199926L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Date date6 = new java.util.Date((int) (short) -1, 10, 100, (int) '4', (int) (byte) 10, (int) (byte) 100);
        date6.setMonth(16);
        int int9 = date6.getSeconds();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromDateFields(date6);
        java.lang.String str11 = date6.toString();
        org.junit.Assert.assertEquals(date6.toString(), "Fri May 10 04:11:40 UTC 1901");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 40 + "'", int9 == 40);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Fri May 10 04:11:40 UTC 1901" + "'", str11, "Fri May 10 04:11:40 UTC 1901");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale0);
        java.lang.Object obj3 = calendar2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr-CA" + "'", str1, "fr-CA");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455276047,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=36,MILLISECOND=47,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "java.util.GregorianCalendar[time=1645455276047,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=36,MILLISECOND=47,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.GregorianCalendar[time=1645455276047,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=36,MILLISECOND=47,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.GregorianCalendar[time=1645455276047,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=36,MILLISECOND=47,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        calendar0.setFirstDayOfWeek(100);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar0);
        java.lang.String str6 = calendar0.getCalendarType();
        int int7 = calendar0.getWeeksInWeekYear();
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(56, 14, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=100,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "gregory" + "'", str6, "gregory");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setWeekDate((int) (short) 100, 16, 12);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder0.setCalendarType("Koordinierte Universalzeit");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Koordinierte Universalzeit");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DurationField durationField3 = iSOChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField((org.joda.time.Chronology) iSOChronology2);
        org.joda.time.DurationField durationField5 = dateTimeField4.getDurationField();
        java.lang.String str6 = dateTimeField4.toString();
        int int8 = dateTimeField4.get((long) (byte) 100);
        int int10 = dateTimeField4.get((-349199880L));
        long long13 = dateTimeField4.add((long) 77, 292278993);
        org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.era();
        org.joda.time.DateTimeField dateTimeField17 = iSOChronology15.yearOfCentury();
        org.joda.time.DurationField durationField18 = iSOChronology15.months();
        org.joda.time.DateTimeField dateTimeField19 = iSOChronology15.halfdayOfDay();
        java.util.Locale locale20 = java.util.Locale.ROOT;
        int int21 = dateTimeField19.getMaximumShortTextLength(locale20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long26 = dateTimeZone24.previousTransition((long) (-1));
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((long) ' ', dateTimeZone24);
        org.joda.time.LocalTime.Property property28 = localTime27.minuteOfHour();
        java.util.Locale locale29 = java.util.Locale.ITALY;
        java.lang.String str30 = property28.getAsText(locale29);
        java.lang.String str31 = locale29.getISO3Country();
        java.lang.String str32 = locale29.getISO3Country();
        java.lang.String str33 = locale20.getDisplayCountry(locale29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = dateTimeField4.getAsText(53648693, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53648693");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(iSOChronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DateTimeField[halfdayOfDay]" + "'", str6, "DateTimeField[halfdayOfDay]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 12626452497600077L + "'", long13 == 12626452497600077L);
        org.junit.Assert.assertNotNull(iSOChronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "0" + "'", str30, "0");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ITA" + "'", str31, "ITA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ITA" + "'", str32, "ITA");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getMinimum(10);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar0.getMaximum(757);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 757");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455276424,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=36,MILLISECOND=424,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        long long3 = dateTimeZone1.previousTransition((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 'x', true, (long) 10);
        java.util.Locale locale9 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str10 = dateTimeZone1.getShortName((long) '#', locale9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone1);
        org.joda.time.DateTime dateTime13 = dateTime11.minusHours((int) (short) 100);
        int int14 = dateTime11.getWeekOfWeekyear();
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.joda.time.DateTime dateTime16 = property15.getDateTime();
        int int17 = dateTime16.getCenturyOfEra();
        org.joda.time.DateTime.Property property18 = dateTime16.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.LocalDate localDate23 = localDate21.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) 'a');
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withEra(1);
        int int29 = localDate23.compareTo((org.joda.time.ReadablePartial) localDate26);
        org.joda.time.LocalDate localDate31 = localDate23.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate.Property property32 = localDate31.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean35 = dateTimeZone33.isStandardOffset((long) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        long long39 = dateTimeZone33.getMillisKeepLocal(dateTimeZone37, (-1947974400000L));
        org.joda.time.DateMidnight dateMidnight40 = localDate31.toDateMidnight(dateTimeZone33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime41 = new org.joda.time.LocalTime((java.lang.Object) property18, dateTimeZone33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-349199880L) + "'", long7 == (-349199880L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+97:00" + "'", str10, "+97:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1947625200001L) + "'", long39 == (-1947625200001L));
        org.junit.Assert.assertNotNull(dateMidnight40);
    }
}
