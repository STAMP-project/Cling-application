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
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) "hi!", dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((-1), 6, 0, 1, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        long long6 = java.util.Date.UTC((int) (byte) 10, (int) ' ', (int) ' ', (int) (byte) 10, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1806581999000L) + "'", long6 == (-1806581999000L));
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) -1, 0, 0, 6, (int) (byte) 10, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        boolean boolean2 = locale0.equals((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((int) ' ', 9, (int) (short) 0, (int) (short) 10, (int) (short) -1, (int) 'a', (int) (short) 1, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(1, (int) ' ', 2022, (int) (short) 10, 6, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone7.nextTransition((long) 893);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(17, (int) (byte) 1, (int) (byte) 0, 11, (int) (short) 0, 53, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 893L + "'", long9 == 893L);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((-1), (int) (byte) 0, 893, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dateTime6.get(dateTimeField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime4.getFieldType(893);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 893");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 10, 0, 9, 15, (int) 'a', 11, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withEra(5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) int5, chronology6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 893 + "'", int2 == 893);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 773 + "'", int5 == 773);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.lang.Object obj2 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.weekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusMillis((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(chronology4);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(1);
        int int8 = localDateTime1.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime1.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Locale locale5 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(false, 21, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime3.withDayOfMonth((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455222708,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=42,MILLISECOND=708,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 893 + "'", int12 == 893);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455222708,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=42,MILLISECOND=708,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset(17, 43, 100, 17, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 10, 10, 21, (int) ' ', 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime2.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        timeZone0.setID("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.time.ZoneId zoneId5 = timeZone0.toZoneId();
            org.junit.Assert.fail("Expected exception of type java.time.DateTimeException; message: Invalid ID for region-based ZoneId, invalid format: hi!");
        } catch (java.time.DateTimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int8 = calendar7.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(0, 272, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455223213,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=43,MILLISECOND=213,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=43.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("dayOfMonth");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=dayofmonth");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.roll(16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455224074,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=44,MILLISECOND=74,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        java.util.Locale locale21 = new java.util.Locale("hi!", "");
        boolean boolean22 = locale21.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap23 = calendar7.getDisplayNames(0, 10, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455224349,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=44,MILLISECOND=349,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals(locale21.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale6.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455224451,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=44,MILLISECOND=451,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(dateTimeZone3);
        int int5 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.plusWeeks(10);
        org.joda.time.DateTime.Property property8 = dateTime4.minuteOfDay();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        org.joda.time.Instant instant13 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone14 = instant13.getZone();
        long long16 = dateTimeZone10.getMillisKeepLocal(dateTimeZone14, 0L);
        org.joda.time.MutableDateTime mutableDateTime17 = dateTime4.toMutableDateTime(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime17, "UTC", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 893 + "'", int5 == 893);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 893L + "'", long12 == 893L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime17);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (short) 1, 100, 13, (int) '#', chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.set((int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455225176,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=45,MILLISECOND=176,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar7.getMaximum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455225208,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=45,MILLISECOND=208,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("Property[secondOfMinute]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((java.lang.Object) (short) 10, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        long long13 = dateTimeZone11.nextTransition((long) 893);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        long long17 = dateTimeZone11.getMillisKeepLocal(dateTimeZone15, 0L);
        long long20 = dateTimeZone11.convertLocalToUTC((long) 11, false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) locale8, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 893L + "'", long13 == 893L);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 11L + "'", long20 == 11L);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withDate((int) (short) -1, 20, 272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate7.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property7.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        int int3 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime3.withDayOfWeek((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455226085,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=46,MILLISECOND=85,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 893 + "'", int12 == 893);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455226085,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=46,MILLISECOND=85,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        long long12 = dateTimeField9.roundCeiling((long) (byte) -1);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        long long13 = dateTimeZone11.nextTransition((long) 893);
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = dateTimeZone11.getName((long) (short) 0, locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap17 = calendar7.getDisplayNames(20, 0, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455226386,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=46,MILLISECOND=386,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 893L + "'", long13 == 893L);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+00:00" + "'", str16, "+00:00");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(22, (int) (short) -1, (int) (short) 10, 0, 2, (int) (byte) 0, 893, (org.joda.time.Chronology) copticChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology7);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = dateTimeFormatter2.parseLocalDate("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localDateTime3.isBefore(readablePartial8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1), 16, 22, (int) (byte) 1, 100, (int) (byte) 100, 272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.util.Date date4 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setTime(date4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455227050,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=47,MILLISECOND=50,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder2.set(538, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField12 = copticChronology5.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(12, (int) (short) -1, 1, (int) '4', (-1), (org.joda.time.Chronology) copticChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 57635003L + "'", long11 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = localDate20.withEra(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) -1);
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable8, (long) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localDateTime2, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withMinuteOfHour(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePeriod8, (long) 43, (long) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("dayOfMonth", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=dayofmonth");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        long long10 = durationField7.getDifferenceAsLong((long) 12, (long) 10);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTimeFormatter5.parseDateTime("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.parse("0", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        java.util.Locale locale5 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTime3.toString("UTC", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_US");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.util.Date date3 = new java.util.Date((long) (byte) 0);
        int int4 = date3.getMinutes();
        int int5 = date3.getMinutes();
        boolean boolean6 = date1.before(date3);
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromDateFields(date1);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        org.joda.time.LocalDate localDate15 = localDate13.withYear((-1));
        org.joda.time.LocalDate localDate17 = localDate15.plusWeeks(13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime7.compareTo((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) localDateTime2, chronology5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        int int9 = localDateTime8.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = localTime6.isAfter((org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.DateTime dateTime8 = dateTime1.withMillisOfSecond(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 893 + "'", int2 == 893);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(chronology17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withEra(1);
        int int21 = localDateTime20.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = localDateTime20.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusSeconds((int) (short) 1);
        int int26 = localDateTime25.getHourOfDay();
        int int28 = localDateTime25.getValue(1);
        int int29 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime25);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime3.plusYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime33 = localDateTime3.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(localDateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 14 + "'", int26 == 14);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(localDateTime31);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone3.getDisplayName(true, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 15");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale2.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = copticChronology0.get(readablePeriod8, 10L, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        long long10 = dateTimeZone1.convertLocalToUTC((long) 11, false);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField12 = copticChronology11.secondOfMinute();
        org.joda.time.DurationField durationField13 = copticChronology11.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) 11, (org.joda.time.Chronology) copticChronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 11L + "'", long10 == 11L);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime dateTime6 = dateTime1.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTime.Property property7 = dateTime1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.hours();
        org.joda.time.DurationField durationField9 = copticChronology0.minutes();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        int[] intArray27 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate((org.joda.time.ReadablePartial) localDate15, intArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar6.roll((int) (byte) 100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 893 + "'", int2 == 893);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate localDate9 = localDate7.plusWeeks(13);
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now(dateTimeZone11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int14 = localDateTime12.get(dateTimeFieldType13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) localDateTime12, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDate9.compareTo((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology1.getDateTimeMillis(43, 0, 13, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        int int7 = dateTime4.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withMonthOfYear(510);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 510 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 893 + "'", int2 == 893);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 307 + "'", int5 == 307);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:53:50 UTC 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField10 = localDateTime3.getField(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("CAN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CAN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
        int int9 = property7.get();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDurationAdded(readableDuration5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withEra(538);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        java.util.Locale locale5 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property3.setCopy("minutes", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minutes\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(11, (int) (short) -1, (int) (short) 10, 13, (int) (short) 1, 292278993, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone1.getMillisKeepLocal(dateTimeZone5, 0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology9 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5, 272);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 272");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("+00:00");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDate8.toString("hi!", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone7);
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = timeZone7.inDaylightTime(date10);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455231499,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=51,MILLISECOND=499,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField9.set((-61788528000000L), "Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter7.print((long) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.Chronology chronology14 = localTime11.getChronology();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusHours(893);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localTime11.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) -1, 669, 510, 16, 20, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 669 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        int int12 = dateTime11.getMinuteOfDay();
        int int13 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale locale14 = java.util.Locale.CANADA;
        java.util.Calendar calendar15 = dateTime11.toCalendar(locale14);
        boolean boolean16 = dateTime3.isBefore((org.joda.time.ReadableInstant) dateTime11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime11.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455232204,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=204,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 893 + "'", int12 == 893);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455232204,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=52,MILLISECOND=204,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology7.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 0, 7, 3, 8, 22, 241, 9, (org.joda.time.Chronology) copticChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 57635003L + "'", long13 == 57635003L);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate5.toString("CopticChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(53, (int) '4', (-1), 538, 17, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis((-61788528000000L), (int) '#', 8, 8, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.plus(readableDuration11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime3.withHourOfDay((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = copticChronology0.getDateTimeMillis(2, 5, 100, 53, 15, 15, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withDate(14, 5, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property3.setCopy("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"minuteOfDay\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localTime5.toString("gregory");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        java.lang.String str8 = copticChronology0.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = copticChronology0.get(readablePeriod9, 1645455224272L, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str8, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property4.setCopy("CAN");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"CAN\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks(10);
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime2.toString("UTC", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: U");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        int int11 = dateTime10.getMinuteOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.plusWeeks(10);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone16 = instant15.getZone();
        long long18 = dateTimeZone16.nextTransition((long) 893);
        org.joda.time.Instant instant19 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone20 = instant19.getZone();
        long long22 = dateTimeZone16.getMillisKeepLocal(dateTimeZone20, 0L);
        org.joda.time.MutableDateTime mutableDateTime23 = dateTime10.toMutableDateTime(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = dateTimeFormatter7.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime23, "gregory", 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 893 + "'", int11 == 893);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 893L + "'", long18 == 893L);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        java.io.Writer writer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(writer10, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Date date6 = new java.util.Date((int) '#', (int) (byte) 0, 20, 2, 12, 100);
        java.lang.Object obj7 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 20 02:13:40 UTC 1935");
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "Sun Jan 20 02:13:40 UTC 1935");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Sun Jan 20 02:13:40 UTC 1935");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Sun Jan 20 02:13:40 UTC 1935");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.LocalDate localDate13 = localDate9.withFieldAdded(durationFieldType11, 16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate13.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withDayOfWeek(2);
        boolean boolean21 = dateTime6.isBefore((org.joda.time.ReadableInstant) dateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime6.withDate(5, 21, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime1.getFieldType(879);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 879");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, 0, 669, (int) (short) 1, 918);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 918 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(17, 893, 6, 5, 12, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime4 = dateTime1.toDateTime();
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths(241);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.DateTime dateTime8 = dateTime4.plus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime8.withTime(32772, (int) (byte) 1, 15, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        int int11 = calendar9.get(15);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter7.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime13, "minutes", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 893 + "'", int10 == 893);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = property5.compareTo(readablePartial7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The partial must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(32769);
        java.util.Date date12 = new java.util.Date((long) (byte) 0);
        int int13 = date12.getMinutes();
        int int14 = date12.getDay();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((java.lang.Object) date12, chronology15);
        org.joda.time.LocalDate localDate18 = localDate16.withYear((-1));
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(13);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDate20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals(date12.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet1 = provider0.getAvailableIDs();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime6 = dateTime3.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay9 = dateTime8.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime14 = dateTime11.withFieldAdded(durationFieldType12, 0);
        org.joda.time.DateTime.Property property15 = dateTime11.minuteOfDay();
        org.joda.time.DateTime dateTime16 = property15.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay17 = dateTime16.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime22 = dateTime19.withFieldAdded(durationFieldType20, 0);
        org.joda.time.DateTime.Property property23 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime24 = property23.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay25 = dateTime24.toYearMonthDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(dateTimeZone26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime30 = dateTime27.withFieldAdded(durationFieldType28, 0);
        org.joda.time.DateTime.Property property31 = dateTime27.minuteOfDay();
        org.joda.time.DateTime dateTime32 = property31.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay33 = dateTime32.toYearMonthDay();
        org.joda.time.YearMonthDay[] yearMonthDayArray34 = new org.joda.time.YearMonthDay[] { yearMonthDay9, yearMonthDay17, yearMonthDay25, yearMonthDay33 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay[] yearMonthDayArray35 = strSet1.toArray(yearMonthDayArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(provider0);
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(yearMonthDayArray34);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property20 = localDate5.property(dateTimeFieldType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.withMinuteOfHour(15);
        org.joda.time.DateTime dateTime14 = localTime13.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime13.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate.Property property6 = localDate5.dayOfWeek();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = property6.setCopy("gregory", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.lang.String str5 = dateTimeZone1.getName((long) 100);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(272);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate6.toString("2022-02-21T14:53:54.648");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withEra(1);
        int int9 = localDateTime8.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDateTime8.getFieldType(2);
        java.lang.String str12 = dateTimeFieldType11.getName();
        int int13 = localDateTime4.get(dateTimeFieldType11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDateTime4.toString("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "dayOfMonth" + "'", str12, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 21 + "'", int13 == 21);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        java.lang.StringBuffer stringBuffer12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime16.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType(2);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(chronology20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withEra(1);
        int int24 = localDateTime23.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = localDateTime23.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = localDateTime23.getFields();
        org.joda.time.LocalDateTime.Property property28 = localDateTime23.year();
        int int29 = localDateTime16.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.LocalDateTime.Property property30 = localDateTime23.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer12, (org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(14, 17, 0, 43, (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean21 = localDateTime16.isSupported(dateTimeFieldType20);
        boolean boolean22 = localDateTime3.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.withEra((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime3.withDayOfWeek((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusSeconds((int) (short) 1);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        long long25 = copticChronology19.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField26 = copticChronology19.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField27 = copticChronology19.clockhourOfDay();
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.Instant instant30 = instant28.withMillis((long) 1);
        org.joda.time.Instant instant31 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone32 = instant31.getZone();
        long long34 = dateTimeZone32.nextTransition((long) 893);
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        long long38 = dateTimeZone32.getMillisKeepLocal(dateTimeZone36, 0L);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime((java.lang.Object) instant28, dateTimeZone36);
        org.joda.time.LocalTime localTime41 = localTime39.minusMillis(12);
        org.joda.time.LocalTime localTime43 = localTime39.plusMillis((int) (short) 10);
        int[] intArray45 = copticChronology19.get((org.joda.time.ReadablePartial) localTime43, (long) 17);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray47 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDateTime17, 893, intArray45, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 893");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 57635003L + "'", long25 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 893L + "'", long34 == 893L);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[0, 0, 0, 17]");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusWeeks(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        int int6 = localDate5.getDayOfWeek();
        org.joda.time.LocalDate localDate8 = localDate5.minusWeeks(272);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime12.plusSeconds((int) (short) 1);
        int int18 = localDateTime17.getHourOfDay();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minus(readablePeriod20);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime17.withDurationAdded(readableDuration22, 292278993);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localDate8.isBefore((org.joda.time.ReadablePartial) localDateTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localDateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology7.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology7.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology7.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(16, 12, (int) ' ', 510, (int) '#', 2, 538, (org.joda.time.Chronology) copticChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 510 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 57635003L + "'", long13 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology10.secondOfMinute();
        org.joda.time.DurationField durationField12 = copticChronology10.months();
        org.joda.time.DateTimeZone dateTimeZone13 = copticChronology10.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) property8, (org.joda.time.Chronology) copticChronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(copticChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime6.getValue(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 292278993");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((int) 'u');
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'a', 879, 53637233, 0, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 879 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime6.withDate((int) (byte) 10, 53, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar calendar9 = builder6.build();
        java.lang.String str10 = calendar9.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str10, "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property15.addToCopy(20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455238028,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=58,MILLISECOND=28,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTimeFormatter2.print((long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.Instant instant3 = instant1.withMillis((long) 1);
        org.joda.time.Instant instant4 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        long long7 = dateTimeZone5.nextTransition((long) 893);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone5.getMillisKeepLocal(dateTimeZone9, 0L);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) instant1, dateTimeZone9);
        org.joda.time.LocalTime localTime14 = localTime12.minusMillis(12);
        org.joda.time.Chronology chronology15 = localTime12.getChronology();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay(1630547712000008L, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localTime16.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 893L + "'", long7 == 893L);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime10 = property5.addWrapFieldToCopy(616);
        boolean boolean11 = property5.isLeap();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property5.setCopy("53640", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.util.Date date3 = new java.util.Date((long) (byte) 0);
        int int4 = date3.getMinutes();
        int int5 = date3.getMinutes();
        boolean boolean6 = date1.before(date3);
        java.lang.String str7 = date3.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str7, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder6.setCalendarType("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: minuteOfDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((java.lang.Object) 1645455234217L);
        org.joda.time.chrono.CopticChronology copticChronology11 = org.joda.time.chrono.CopticChronology.getInstance();
        long long17 = copticChronology11.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField18 = copticChronology11.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology11.clockhourOfDay();
        org.joda.time.Instant instant20 = org.joda.time.Instant.now();
        org.joda.time.Instant instant22 = instant20.withMillis((long) 1);
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone24 = instant23.getZone();
        long long26 = dateTimeZone24.nextTransition((long) 893);
        org.joda.time.Instant instant27 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone28 = instant27.getZone();
        long long30 = dateTimeZone24.getMillisKeepLocal(dateTimeZone28, 0L);
        org.joda.time.LocalTime localTime31 = new org.joda.time.LocalTime((java.lang.Object) instant20, dateTimeZone28);
        org.joda.time.LocalTime localTime33 = localTime31.minusMillis(12);
        org.joda.time.LocalTime localTime35 = localTime31.plusMillis((int) (short) 10);
        int[] intArray37 = copticChronology11.get((org.joda.time.ReadablePartial) localTime35, (long) 17);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField7.addWrapField((org.joda.time.ReadablePartial) localDate9, 57, intArray37, 53631987);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(copticChronology11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 57635003L + "'", long17 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 893L + "'", long26 == 893L);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 17]");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology7.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(52, 16, 100, (int) '4', 54, 32772, 22, (org.joda.time.Chronology) copticChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = timeZone7.getID();
        boolean boolean9 = timeZone7.observesDaylightTime();
        boolean boolean10 = timeZone7.observesDaylightTime();
        java.lang.String str11 = timeZone7.getDisplayName();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Coordinated Universal Time" + "'", str11, "Coordinated Universal Time");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.monthOfYear();
        long long6 = dateTimeField4.roundHalfCeiling((long) (short) 100);
        long long8 = dateTimeField4.roundHalfCeiling(691200000L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 691200000L + "'", long6 == 691200000L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 691200000L + "'", long8 == 691200000L);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate18.withFieldAdded(durationFieldType19, 849);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = dateTime20.toDateTimeISO();
        int int22 = dateTime21.getHourOfDay();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 14 + "'", int22 == 14);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField8.set(0L, 43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.Chronology chronology8 = copticChronology0.withUTC();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology8.get(readablePeriod9, (long) 54, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withDurationAdded(readableDuration13, 292278993);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime8.withDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime12 = dateTime9.withFieldAdded(durationFieldType10, 0);
        org.joda.time.DateTime.Property property13 = dateTime9.minuteOfDay();
        org.joda.time.DateTime dateTime14 = property13.withMinimumValue();
        org.joda.time.DateTime.Property property15 = dateTime14.era();
        boolean boolean16 = calendar7.after((java.lang.Object) property15);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calendar7.getMaximum(849);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 849");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 893 + "'", int4 == 893);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455239574,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=53,SECOND=59,MILLISECOND=574,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 510);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = copticChronology0.getDateTimeMillis((long) 16, 20, 18, 32772, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(dateTimeZone13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime17 = dateTime14.withFieldAdded(durationFieldType15, 0);
        org.joda.time.DateTime.Property property18 = dateTime14.minuteOfDay();
        org.joda.time.DateTime dateTime19 = property18.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property20 = dateTime19.secondOfMinute();
        java.lang.String str21 = property20.toString();
        java.util.Locale locale23 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str24 = property20.getAsShortText(locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = property8.setCopy("Coordinated Universal Time", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Coordinated Universal Time\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Property[secondOfMinute]" + "'", str21, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0" + "'", str24, "0");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(dateTimeZone8);
        int int10 = dateTime9.getMinuteOfDay();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime9.toMutableDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime13, "DateTimeField[yearOfEra]", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 893 + "'", int10 == 893);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        boolean boolean9 = dateTimeFormatter8.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant10 = org.joda.time.Instant.parse("100", dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        // The following exception was thrown during execution in test generation
        try {
            calendar16.set(900000, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 900000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone8.getOffset(100, (int) (short) 100, 14, (int) (short) 1, 20, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        java.lang.String str10 = dateTimeZone2.getName((long) 12);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime11.withMinuteOfHour(272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 272 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
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
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = localDate0.getValue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        java.util.Date date6 = new java.util.Date(0, (int) (short) 10, 52, (int) (short) 100, 53, 670);
        org.junit.Assert.assertEquals(date6.toString(), "Wed Dec 26 05:04:10 UTC 1900");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter7.parseMillis("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        java.lang.StringBuffer stringBuffer11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(chronology12);
        int int14 = localTime13.getHourOfDay();
        org.joda.time.LocalTime.Property property15 = localTime13.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property15.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter9.printTo(stringBuffer11, (org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime dateTime10 = dateTime6.withDurationAdded(0L, 52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime6.withDate(20, 43, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = copticChronology0.getDateTimeMillis((-2), 15, (int) (byte) 100, 53640129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime3.withDate(15, 893, 21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant3 = new org.joda.time.Instant((java.lang.Object) dateTimeField2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property3.addNoWrapToCopy(53642140);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = dateTimeFormatter7.parseLocalDate("DateTimeField[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        org.joda.time.DurationField durationField11 = dateTimeField9.getRangeDurationField();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.getMaximumValueOverall();
        org.joda.time.LocalDate localDate23 = property20.roundCeilingCopy();
        int int24 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDate23);
        long long26 = dateTimeField9.roundHalfFloor(1645455236761L);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 292278993 + "'", int22 == 292278993);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1640995200000L + "'", long26 == 1640995200000L);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 240000L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=240000.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime13.toString("2022-02-21T14:54:11.392");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.Instant instant13 = instant0.withMillis((long) 6);
        long long14 = instant0.getMillis();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(instant13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645455242295L + "'", long14 == 1645455242295L);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.withMaximumValue();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292278992 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.parse("CopticChronology[Etc/UTC]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(616);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.weekOfWeekyear();
        java.util.Locale locale18 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str19 = locale18.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = property15.setCopy("100", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = dateTimeFormatter9.print((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        java.util.Locale locale8 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str9 = locale8.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property6.setCopy("gregory", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.lang.String str5 = dateTimeZone1.getName((long) 100);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate localDate8 = localDate6.withCenturyOfEra(272);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate6.withYearOfCentury(616);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 616 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        java.lang.String str5 = property4.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property4.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfSecond" + "'", str5, "millisOfSecond");
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(893L);
        org.joda.time.LocalDateTime localDateTime8 = property5.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.millisOfSecond();
        int int4 = dateTimeField2.getMinimumValue((long) 510);
        long long7 = dateTimeField2.set((long) 11, "23");
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 23L + "'", long7 == 23L);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        int int7 = dateTime4.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = dateTime4.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime4.withEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 597 + "'", int5 == 597);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:54:03 UTC 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime4 = dateTime1.withDurationAdded((long) (byte) 10, (int) 'a');
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 16, 22);
        int int8 = dateTime4.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        boolean boolean1 = timeZone0.observesDaylightTime();
        java.lang.Object obj2 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.Date date6 = new java.util.Date((int) (byte) 0, 849, 900000, 893, (int) ' ', 52);
        org.junit.Assert.assertEquals(date6.toString(), "Mon Dec 18 05:32:52 UTC 4434");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = timeZone8.getDisplayName(true, (int) (short) 10, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withFieldAdded(durationFieldType6, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 232 + "'", int5 == 232);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        gregorianCalendar6.clear();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        boolean boolean12 = gregorianCalendar6.after((java.lang.Object) locale10);
        boolean boolean13 = gregorianCalendar6.isLenient();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(900000);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        int int3 = localDateTime2.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusMillis(538);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.minus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDateTime7.getValue(43);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 43");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(0, 9, (int) (byte) 1, 0, 15);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate5.compareTo((org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder13 = builder11.setCalendarType("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: French");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone0.getDisplayName(true, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(zoneId1);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = dateTimeFormatter11.parseLocalDateTime("Thu Jan 01 00:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar calendar9 = builder6.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder6.setWeekDefinition(900000, 894);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        java.lang.Object obj17 = calendar16.clone();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(241, 879);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Calendar calendar3 = dateTime1.toCalendar(locale2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar3.getLeastMaximum(893);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 893");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455245219,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=5,MILLISECOND=219,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology1.secondOfMinute();
        org.joda.time.DurationField durationField3 = copticChronology1.months();
        org.joda.time.DateTimeZone dateTimeZone4 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology1.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((java.lang.Object) false, (org.joda.time.Chronology) copticChronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeZone0.getOffset(10, 0, 22, 289, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = copticChronology0.getDateTimeMillis(8, 669, 53642140, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 669 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((int) '#');
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(stringBuffer14, (long) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType10.getDurationType();
        org.joda.time.LocalDate localDate13 = localDate9.withFieldAdded(durationFieldType11, 16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate9.withDayOfWeek(437);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 437 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("23");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=23");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        java.lang.Object obj4 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime10.withMillisOfSecond(53631987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631987 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance();
        long long9 = copticChronology3.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField10 = copticChronology3.months();
        java.lang.String str11 = copticChronology3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((int) (byte) 10, 32772, 879, (org.joda.time.Chronology) copticChronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology3);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 57635003L + "'", long9 == 57635003L);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str11, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime8.withDurationAdded(readableDuration13, 292278993);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.LocalDateTime.Property property17 = localDateTime8.property(dateTimeFieldType16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime(chronology19);
        int int21 = localTime20.getHourOfDay();
        org.joda.time.LocalTime.Property property22 = localTime20.secondOfMinute();
        org.joda.time.LocalTime localTime23 = property22.withMaximumValue();
        java.util.Locale locale26 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str27 = locale26.getISO3Language();
        java.lang.String str28 = localTime23.toString("+00:00", locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = property17.setCopy("", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "+00:00" + "'", str28, "+00:00");
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        java.io.Writer writer8 = null;
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        org.joda.time.Instant instant21 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long24 = dateTimeZone18.getMillisKeepLocal(dateTimeZone22, 0L);
        org.joda.time.DateTime dateTime25 = localDate14.toDateTimeAtMidnight(dateTimeZone18);
        org.joda.time.LocalDate localDate27 = localDate14.minusDays(20);
        org.joda.time.LocalDate localDate29 = localDate27.plusWeeks(53);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer8, (org.joda.time.ReadablePartial) localDate27);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 893L + "'", long20 == 893L);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        int int5 = copticChronology0.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = copticChronology0.get(readablePeriod6, (long) 'u', 31536900000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        java.io.Writer writer8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.withMinimumValue();
        org.joda.time.DateTime dateTime17 = property14.addWrapFieldToCopy(0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer8, (org.joda.time.ReadableInstant) dateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+00:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+00:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology1.get(readablePeriod11, 1645455242295L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        long long11 = copticChronology5.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField12 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType4.getField((org.joda.time.Chronology) copticChronology5);
        org.joda.time.DateTimeField dateTimeField14 = copticChronology5.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology5.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(241, 100, 510, 348, (org.joda.time.Chronology) copticChronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 57635003L + "'", long11 == 57635003L);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.mapEquivalents(languageRangeList0, strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        timeZone8.setID("Property[secondOfMinute]");
        java.util.Calendar.Builder builder11 = builder0.setTimeZone(timeZone8);
        timeZone8.setRawOffset(0);
        java.util.Date date17 = new java.util.Date((long) (byte) 0);
        int int18 = date17.getMinutes();
        int int19 = date17.getDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((java.lang.Object) date17, chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        long long27 = dateTimeZone25.nextTransition((long) 893);
        org.joda.time.Instant instant28 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone29 = instant28.getZone();
        long long31 = dateTimeZone25.getMillisKeepLocal(dateTimeZone29, 0L);
        org.joda.time.DateTime dateTime32 = localDate21.toDateTimeAtMidnight(dateTimeZone25);
        org.joda.time.LocalDate localDate34 = localDate21.withCenturyOfEra(14);
        java.util.Locale locale38 = new java.util.Locale("hi!", "");
        boolean boolean39 = locale38.hasExtensions();
        java.lang.String str40 = locale38.getISO3Language();
        java.lang.String str41 = localDate21.toString("14:54:04.005", locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = timeZone8.getDisplayName(true, 893, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 893");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertEquals(date17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 893L + "'", long27 == 893L);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals(locale38.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "14:54:04.005" + "'", str41, "14:54:04.005");
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 117");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        long long23 = copticChronology17.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField24 = copticChronology17.months();
        java.lang.String str25 = copticChronology17.toString();
        int int26 = copticChronology17.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField27 = copticChronology17.weekyears();
        org.joda.time.DateTimeField dateTimeField28 = copticChronology17.dayOfYear();
        java.lang.String str29 = copticChronology17.toString();
        boolean boolean30 = dateTimeFieldType14.isSupported((org.joda.time.Chronology) copticChronology17);
        org.joda.time.DurationField durationField31 = copticChronology17.weeks();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = copticChronology17.get(readablePeriod32, 0L, (long) 258);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 57635003L + "'", long23 == 57635003L);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str25, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str29, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(durationField31);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localTime1.compareTo(readablePartial3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int8 = timeZone7.getRawOffset();
        boolean boolean9 = timeZone7.useDaylightTime();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        int int0 = org.joda.time.chrono.CopticChronology.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime6.withEra(57);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withMonthOfYear(598);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 598 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.format.DateTimePrinter dateTimePrinter2 = null;
        org.joda.time.format.DateTimeParser dateTimeParser3 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter2, dateTimeParser3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localTime1.toString(dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        date1.setMonth(8);
        java.lang.Object obj4 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Tue Sep 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Tue Sep 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Tue Sep 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Tue Sep 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        int int9 = localDateTime8.getHourOfDay();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.minus(readablePeriod11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(616);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField(289);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 289");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = localDateTime1.getFieldTypes();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime1.plusMillis((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime1.withWeekOfWeekyear(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = calendar0.getActualMaximum(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455248011,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=8,MILLISECOND=11,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(893);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.addToCopy((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        java.lang.String str11 = dateTimeField10.toString();
        long long13 = dateTimeField10.roundHalfFloor((long) 510);
        boolean boolean14 = dateTimeField10.isLenient();
        java.lang.String str15 = dateTimeField10.toString();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DateTimeField[yearOfCentury]" + "'", str11, "DateTimeField[yearOfCentury]");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-9676800000L) + "'", long13 == (-9676800000L));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DateTimeField[yearOfCentury]" + "'", str15, "DateTimeField[yearOfCentury]");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime13.plusWeeks(10);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        long long24 = copticChronology18.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField25 = copticChronology18.months();
        java.util.Date date27 = new java.util.Date((long) (byte) 0);
        int int28 = date27.getMinutes();
        int int29 = date27.getDay();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate((java.lang.Object) date27, chronology30);
        int int32 = localDate31.getDayOfWeek();
        org.joda.time.LocalDate localDate34 = localDate31.minusWeeks(272);
        int[] intArray36 = copticChronology18.get((org.joda.time.ReadablePartial) localDate34, (long) 21);
        // The following exception was thrown during execution in test generation
        try {
            copticChronology1.validate((org.joda.time.ReadablePartial) localDateTime17, intArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 57635003L + "'", long24 == 57635003L);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertEquals(date27.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[1686, 4, 23]");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("DateTimeField[yearOfEra]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"DateTimeField[yearOfEra]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.chrono.CopticChronology copticChronology7 = org.joda.time.chrono.CopticChronology.getInstance();
        long long13 = copticChronology7.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField14 = copticChronology7.months();
        java.lang.String str15 = copticChronology7.toString();
        int int16 = copticChronology7.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField17 = copticChronology7.weekyears();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology7.dayOfYear();
        java.lang.String str19 = copticChronology7.toString();
        java.lang.String str20 = copticChronology7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(0, 849, 122, (int) (short) 0, 17, 0, 6, (org.joda.time.Chronology) copticChronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 849 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology7);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 57635003L + "'", long13 == 57635003L);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str15, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str19, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str20, "CopticChronology[Etc/UTC]");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 2000);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        java.io.Writer writer8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(writer8, readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.LocalTime localTime13 = localTime11.minusMillis(12);
        org.joda.time.LocalTime localTime15 = localTime11.plusMillis((int) (short) 10);
        org.joda.time.Chronology chronology16 = localTime11.getChronology();
        org.joda.time.LocalTime localTime18 = localTime11.withMillisOfSecond(122);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localTime18.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = copticChronology0.get(readablePeriod1, (long) 57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfHalfday();
        org.joda.time.Instant instant10 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone11 = instant10.getZone();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 16, dateTimeZone11);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime16.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType(2);
        int int20 = localDateTime16.getWeekyear();
        int int21 = localDateTime16.getHourOfDay();
        boolean boolean22 = dateTimeZone11.isLocalDateTimeGap(localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) dateTimeField8, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        org.joda.time.YearMonthDay yearMonthDay10 = dateTime6.toYearMonthDay();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay10);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime dateTime8 = property5.addWrapFieldToCopy(0);
        org.joda.time.DateTime dateTime9 = property5.roundCeilingCopy();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        int int13 = date11.getDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) date11, chronology14);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.DateTime dateTime26 = localDate15.toDateTimeAtMidnight(dateTimeZone19);
        org.joda.time.LocalDate localDate28 = localDate15.minusDays(20);
        org.joda.time.LocalDate localDate30 = localDate28.plusWeeks(53);
        org.joda.time.LocalDate localDate32 = localDate28.plusWeeks(20);
        org.joda.time.LocalDate localDate34 = localDate28.withYearOfCentury(6);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = property5.compareTo((org.joda.time.ReadablePartial) localDate34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = copticChronology0.getDateTimeMillis(849, 32772, 32772, (int) '4', 670, 15, 879);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        java.io.Writer writer6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(chronology7);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property10.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer6, (org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withHourOfDay(272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 272 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 14);
        int int13 = dateTimeFormatter8.getDefaultYear();
        java.util.Locale locale14 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter8.withLocale(locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.parse("2022-02-21T14:54:11.392", dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.LocalDateTime localDateTime2 = property1.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localDateTime2.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder2.setDate((int) (short) 0, 616, (-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        timeZone0.setID("hi!");
        java.lang.String str5 = timeZone0.getID();
        java.lang.Object obj6 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("16");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '16' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getFirstDayOfWeek();
        int int5 = calendar3.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar3.roll(32772, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455249769,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=9,MILLISECOND=769,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 53 + "'", int5 == 53);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks(20);
        org.joda.time.LocalDate localDate24 = localDate18.withYearOfCentury(6);
        org.joda.time.LocalDate localDate26 = localDate18.plusMonths(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate18.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime5 = property3.addCopy((long) 52);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        long long9 = dateTimeField6.addWrapField((long) 12, (int) 'u');
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 57012L + "'", long9 == 57012L);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis(510, (int) (short) -1, 258, 292278993, 849, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(241, 18, 867);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 241 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.LocalDate localDate22 = property21.getLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDate22.get(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        java.lang.String str17 = property16.toString();
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str20 = property16.getAsShortText(locale19);
        java.lang.String str21 = property8.getAsShortText(locale19);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = property8.getAsText(locale22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = locale22.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[secondOfMinute]" + "'", str17, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "53640" + "'", str21, "53640");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "53640" + "'", str23, "53640");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category0, locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: English (Canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.util.Calendar calendar7 = dateTime3.toCalendar(locale6);
        int int8 = calendar7.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            calendar7.set(849, 53642140);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 849");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 894 + "'", int4 == 894);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455250373,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=10,MILLISECOND=373,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53 + "'", int8 == 53);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Date date8 = dateTime6.toDate();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        date10.setHours(893);
        boolean boolean14 = date8.before(date10);
        java.lang.String str15 = date10.toString();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 14:54:00 UTC 2022");
        org.junit.Assert.assertEquals(date10.toString(), "Sat Feb 07 05:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Sat Feb 07 05:00:00 UTC 1970" + "'", str15, "Sat Feb 07 05:00:00 UTC 1970");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getRangeDurationField();
        long long17 = durationField14.getMillis(879, (long) '4');
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 75945600000L + "'", long17 == 75945600000L);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(16);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.centuryOfEra();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray5 = copticChronology0.get(readablePeriod3, (long) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now(dateTimeZone7);
        boolean boolean10 = dateTimeZone7.isStandardOffset((long) '#');
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 3);
        boolean boolean13 = dateTimeZone7.equals((java.lang.Object) 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(122, 13, 53642140, (int) (byte) 100, 669, (int) (byte) 10, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        int int4 = date1.getDay();
        date1.setYear(0);
        date1.setMinutes(21);
        java.util.Calendar.Builder builder9 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder11 = builder9.setInstant((long) 6);
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        timeZone12.setID("hi!");
        java.util.Calendar.Builder builder15 = builder11.setTimeZone(timeZone12);
        java.util.Calendar.Builder builder17 = builder15.setLenient(true);
        java.util.Calendar calendar18 = builder15.build();
        boolean boolean19 = date1.equals((java.lang.Object) calendar18);
        org.junit.Assert.assertEquals(date1.toString(), "Mon Jan 01 00:21:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(calendar18);
        org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.Locale locale0 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("87");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withTime(292278993, 289, 57, 272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter11.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear((int) '#');
        org.joda.time.format.DateTimePrinter dateTimePrinter15 = dateTimeFormatter12.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.parse("UTC", dateTimeFormatter12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNull(dateTimePrinter15);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        java.lang.Appendable appendable12 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime(chronology13);
        int int15 = localTime14.getHourOfDay();
        org.joda.time.LocalTime.Property property16 = localTime14.secondOfMinute();
        org.joda.time.LocalTime localTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalTime localTime18 = property16.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable12, (org.joda.time.ReadablePartial) localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Date date6 = new java.util.Date((int) '#', (int) (byte) 0, 20, 2, 12, 100);
        long long7 = date6.getTime();
        int int8 = date6.getYear();
        org.junit.Assert.assertEquals(date6.toString(), "Sun Jan 20 02:13:40 UTC 1935");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1102887980000L) + "'", long7 == (-1102887980000L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate.Property property21 = localDate20.year();
        org.joda.time.LocalDate localDate23 = property21.addWrapFieldToCopy((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = property21.setCopy("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[yearOfCentury]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        java.util.Locale locale6 = java.util.Locale.CANADA;
        java.lang.String str7 = dateTimeZone2.getName((long) (short) 0, locale6);
        java.util.TimeZone timeZone8 = dateTimeZone2.toTimeZone();
        java.lang.String str10 = dateTimeZone2.getName((long) 12);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) ' ', dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime11.withHourOfDay(56770311);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56770311 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
        org.junit.Assert.assertNotNull(timeZone8);
// flaky:         org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime1.toMutableDateTime(dateTimeZone4);
        int int6 = dateTime1.getCenturyOfEra();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTime dateTime8 = dateTime1.plus(readableDuration7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime1.withDate(918, 122, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        int int8 = timeZone7.getRawOffset();
        timeZone7.setID("Property[secondOfMinute]");
        java.lang.String str13 = timeZone7.getDisplayName(false, (int) (byte) 0);
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GMT+00:00" + "'", str13, "GMT+00:00");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 16, dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((-1806581999000L), false, (long) 21);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        long long14 = copticChronology8.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.halfdayOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusSeconds((int) (byte) 10);
        int int25 = localDateTime24.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusYears(0);
        boolean boolean28 = copticChronology8.equals((java.lang.Object) localDateTime27);
        boolean boolean29 = dateTimeZone2.isLocalDateTimeGap(localDateTime27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime27.withDayOfMonth(43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1806581999000L) + "'", long7 == (-1806581999000L));
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 57635003L + "'", long14 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeField3.getAsShortText(100, locale5);
        java.util.Date date8 = new java.util.Date((long) (byte) 0);
        int int9 = date8.getMinutes();
        int int10 = date8.getDay();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) date8, chronology11);
        int int13 = localDate12.getDayOfWeek();
        org.joda.time.LocalDate localDate15 = localDate12.minusWeeks(272);
        org.joda.time.Instant instant17 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone18 = instant17.getZone();
        long long20 = dateTimeZone18.nextTransition((long) 893);
        java.util.Locale locale22 = java.util.Locale.CANADA;
        java.lang.String str23 = dateTimeZone18.getName((long) (short) 0, locale22);
        java.lang.String str24 = localDate12.toString("+00:00", locale22);
        int int25 = dateTimeField3.getMaximumShortTextLength(locale22);
        int int27 = dateTimeField3.getMinimumValue((long) (short) -1);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 893L + "'", long20 == 893L);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "+00:00" + "'", str23, "+00:00");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        int int7 = dateTime4.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 20);
        int int11 = dateTime4.getYear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 934 + "'", int5 == 934);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:54:11 UTC 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter3.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 14);
        int int13 = dateTimeFormatter8.getDefaultYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant14 = org.joda.time.Instant.parse("Thu Jan 01 00:00:00 UTC 1970", dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Calendar calendar3 = dateTime1.toCalendar(locale2);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields(calendar3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localDate4.toString("2022-02-21T14:54:11.392");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455252097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=12,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DurationField durationField8 = copticChronology0.halfdays();
        long long12 = copticChronology0.add((long) 272, 40140000L, 538);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = copticChronology0.get(readablePeriod13, (long) 670);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 21595320272L + "'", long12 == 21595320272L);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate18.plusWeeks(20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate22.withDayOfMonth(893);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        long long12 = dateTimeZone10.nextTransition((long) 893);
        java.lang.String str14 = dateTimeZone10.getName((long) 100);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(dateTimeZone10);
        org.joda.time.LocalDate localDate17 = localDate15.withCenturyOfEra(272);
        int int18 = dateTimeField8.getMinimumValue((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology19.secondOfMinute();
        org.joda.time.DurationField durationField21 = copticChronology19.months();
        org.joda.time.DateTimeZone dateTimeZone22 = copticChronology19.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((java.lang.Object) int18, (org.joda.time.Chronology) copticChronology19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 893L + "'", long12 == 893L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(copticChronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        boolean boolean17 = calendar16.isWeekDateSupported();
        java.lang.String str18 = calendar16.toString();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str18, "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        int int3 = localDateTime2.getMonthOfYear();
        int int4 = localDateTime2.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfMonth(53631987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631987 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Locale.Category category0 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.lang.String str3 = locale1.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.FORMAT + "'", category0.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "zh_CN" + "'", str3, "zh_CN");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        int int9 = localDateTime8.getYearOfCentury();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundHalfFloorCopy();
        boolean boolean19 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withField(dateTimeFieldType20, 53637233);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53637233 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T14:54:22.937" + "'", str10, "2022-02-21T14:54:22.937");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        gregorianCalendar6.clear();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        boolean boolean12 = gregorianCalendar6.after((java.lang.Object) locale10);
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar6.clear(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(57, 616, 9, 2000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '4', (int) (short) -1, 53, 100, (-1), 5, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = copticChronology0.getDateTimeMillis((long) 935, (int) '4', 900000, 276, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder6.setDate(21, 56770311, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        int int5 = localDateTime4.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime4.getFieldType(2);
        java.lang.String str8 = dateTimeFieldType7.getName();
        org.joda.time.DateTime dateTime10 = dateTime0.withField(dateTimeFieldType7, (int) (byte) 10);
        org.joda.time.DateTime.Property property11 = dateTime10.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfMonth" + "'", str8, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        calendar9.set(2, 0);
        calendar9.add(1, 11);
        // The following exception was thrown during execution in test generation
        try {
            calendar9.clear(879);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 879");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2033,MONTH=0,WEEK_OF_YEAR=4,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=21,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(289, (int) (short) 100, 13, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 289 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField3 = copticChronology0.yearOfCentury();
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeField3.getAsShortText(100, locale5);
        java.lang.String str7 = locale5.toString();
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "en_CA" + "'", str7, "en_CA");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(14, 3, (int) '4', 650, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 650 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter7.withDefaultYear(3);
        java.io.Writer writer17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime22 = dateTime19.withFieldAdded(durationFieldType20, 0);
        org.joda.time.DateTime.Property property23 = dateTime19.minuteOfDay();
        org.joda.time.DateTime dateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property25 = dateTime24.secondOfMinute();
        java.lang.String str26 = property25.toString();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(dateTimeZone27);
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime31 = dateTime28.withFieldAdded(durationFieldType29, 0);
        org.joda.time.DateTime.Property property32 = dateTime28.minuteOfDay();
        org.joda.time.DateTime dateTime33 = property32.roundHalfEvenCopy();
        int int34 = dateTime33.getYearOfCentury();
        long long35 = property25.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime33);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.withDayOfWeek(2);
        long long40 = dateTime37.getMillis();
        org.joda.time.ReadablePeriod readablePeriod41 = null;
        org.joda.time.DateTime dateTime43 = dateTime37.withPeriodAdded(readablePeriod41, 9);
        int int44 = dateTime33.compareTo((org.joda.time.ReadableInstant) dateTime43);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter16.printTo(writer17, (org.joda.time.ReadableInstant) dateTime33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Property[secondOfMinute]" + "'", str26, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 22 + "'", int34 == 22);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertNotNull(dateTime39);
// flaky:         org.junit.Assert.assertTrue("'" + long40 + "' != '" + 1645455254419L + "'", long40 == 1645455254419L);
        org.junit.Assert.assertNotNull(dateTime43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.lang.String str16 = timeZone15.getID();
        java.util.Calendar.Builder builder17 = builder2.setTimeZone(timeZone15);
        java.util.Locale locale18 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder19 = builder2.setLocale(locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear(0);
        java.io.Writer writer14 = null;
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime18.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime18.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray22 = localDateTime18.getFields();
        org.joda.time.LocalDateTime.Property property23 = localDateTime18.year();
        org.joda.time.LocalDateTime localDateTime24 = property23.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(dateTimeZone25);
        org.joda.time.DateTime dateTime27 = localDateTime24.toDateTime((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime26.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(writer14, (org.joda.time.ReadableInstant) dateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getRangeDurationField();
        long long17 = durationField14.getMillis(1L, 0L);
        int int20 = durationField14.getValue((long) 56770311, (long) 44);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 86400000L + "'", long17 == 86400000L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder0.setWeekDefinition(53637233, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.minusWeeks(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType13.getDurationType();
        org.joda.time.DurationFieldType durationFieldType15 = dateTimeFieldType13.getDurationType();
        boolean boolean16 = localDateTime12.isSupported(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withYearOfCentury(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (short) -1);
        java.util.Date date9 = new java.util.Date((long) (byte) 0);
        int int10 = date9.getMinutes();
        int int11 = date9.getDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate((java.lang.Object) date9, chronology12);
        int int14 = localDate13.getDayOfWeek();
        org.joda.time.LocalDate localDate16 = localDate13.minusWeeks(272);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        boolean boolean8 = dateTimeFormatter7.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 53638);
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.Instant instant13 = instant11.withMillis((long) 1);
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        long long17 = dateTimeZone15.nextTransition((long) 893);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone15.getMillisKeepLocal(dateTimeZone19, 0L);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) instant11, dateTimeZone19);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant11.minus(readableDuration23);
        org.joda.time.MutableDateTime mutableDateTime25 = instant11.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int28 = dateTimeFormatter7.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime25, "Property[monthOfYear]", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 893L + "'", long17 == 893L);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(893, (int) (short) 10, 53640129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        boolean boolean10 = localDateTime3.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean21 = localDateTime16.isSupported(dateTimeFieldType20);
        boolean boolean22 = localDateTime3.isSupported(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime3.withEra((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime3.withEra((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DurationField durationField8 = property7.getRangeDurationField();
        int int9 = property7.getMinimumValue();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.util.Calendar calendar3 = dateTime1.toCalendar(locale2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withDate((int) (short) -1, 292278993, 272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455255724,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=15,MILLISECOND=724,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        int int10 = localDate9.getDayOfMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusHours(32769);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMonthOfYear(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
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
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter3.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.parse("23", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'minutes' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        int int2 = localDateTime1.getWeekyear();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime1.plusHours((int) (byte) -1);
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withYearOfEra((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2022 + "'", int2 == 2022);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(510, 912, 272, (int) (byte) 10, 308, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 308 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(chronology7);
        int int9 = localTime8.getHourOfDay();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property10.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(stringBuffer6, (org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        int int4 = date1.getDay();
        date1.setYear(0);
        date1.setMinutes(21);
        date1.setYear(437);
        int int11 = date1.getMonth();
        org.junit.Assert.assertEquals(date1.toString(), "Fri Jan 01 00:21:00 UTC 2337");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1964-10-15", (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter7.printTo(stringBuffer15, 1630547712000008L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        int int9 = localDateTime8.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.plusYears(0);
        org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance();
        long long18 = copticChronology12.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField19 = copticChronology12.months();
        org.joda.time.DateTimeField dateTimeField20 = copticChronology12.weekyearOfCentury();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalTime localTime24 = localTime22.minus(readablePeriod23);
        int int25 = dateTimeField20.getMinimumValue((org.joda.time.ReadablePartial) localTime24);
        org.joda.time.LocalTime.Property property26 = localTime24.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean27 = localDateTime11.isAfter((org.joda.time.ReadablePartial) localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(copticChronology12);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 57635003L + "'", long18 == 57635003L);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getMinutes();
        java.lang.Object obj4 = date1.clone();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property8.setCopy("DateTimeField[yearOfCentury]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[yearOfCentury]\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) chronology0);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMonthOfYear(8);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(chronology5);
        int int7 = localDateTime6.getWeekOfWeekyear();
        boolean boolean8 = localDateTime2.isEqual((org.joda.time.ReadablePartial) localDateTime6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDayOfMonth(43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        java.util.Date date10 = new java.util.Date((long) (byte) 0);
        int int11 = date10.getMinutes();
        int int12 = date10.getDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) date10, chronology13);
        boolean boolean15 = property8.equals((java.lang.Object) chronology13);
        org.joda.time.DurationField durationField16 = property8.getDurationField();
        org.joda.time.DateTime dateTime17 = property8.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property8.addToCopy(0L);
        org.joda.time.DateTime dateTime20 = property8.getDateTime();
        org.joda.time.DateTime dateTime22 = property8.setCopy(11);
        int int23 = dateTime22.getDayOfMonth();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals(date10.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21 + "'", int23 == 21);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField2 = copticChronology0.weekOfWeekyear();
        int int5 = dateTimeField2.getDifference(0L, 1645455252458L);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-2720) + "'", int5 == (-2720));
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.weekyearOfCentury();
        int int9 = dateTimeField8.getMaximumValue();
        long long11 = dateTimeField8.roundFloor((long) 918);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-9936000000L) + "'", long11 == (-9936000000L));
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (short) 10, 879, 53, 53638, 12, 538, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53638 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("\u52a0\u62ff\u5927");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=???");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        int int16 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime3.withEra(5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withDayOfYear(510);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 510 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 547 + "'", int5 == 547);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:54:19 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2, 276, 0, 4, 816, 816, 53642140);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 816 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone0);
        int int4 = calendar3.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar3.getActualMinimum(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455260087,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=20,MILLISECOND=87,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        calendar9.set(2, 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar9.roll(227, 900000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime6.withDurationAdded(readableDuration9, 6);
        int int12 = dateTime11.getMinuteOfHour();
        org.joda.time.DateTime.Property property13 = dateTime11.millisOfDay();
        java.util.Date date15 = new java.util.Date((long) (byte) 0);
        int int16 = date15.getMinutes();
        int int17 = date15.getDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((java.lang.Object) date15, chronology18);
        int int20 = localDate19.getDayOfWeek();
        org.joda.time.LocalDate localDate22 = localDate19.minusWeeks(272);
        int int23 = localDate22.getDayOfYear();
        java.lang.String str24 = localDate22.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = property13.compareTo((org.joda.time.ReadablePartial) localDate22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 54 + "'", int12 == 54);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 289 + "'", int23 == 289);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1964-10-15" + "'", str24, "1964-10-15");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = dateTimeZone13.getName((long) (short) 0, locale17);
        java.util.TimeZone timeZone19 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime20 = localDate11.toDateTimeAtCurrentTime(dateTimeZone13);
        org.joda.time.DateTime dateTime21 = localDate11.toDateTimeAtMidnight();
        org.joda.time.LocalDate.Property property22 = localDate11.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate11.withDayOfMonth(44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertNotNull(timeZone19);
// flaky:         org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withSecondOfMinute(670);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 670 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withEra(1);
        int int5 = localDateTime4.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDateTime4.getFieldType(2);
        java.lang.String str8 = dateTimeFieldType7.getName();
        org.joda.time.DateTime dateTime10 = dateTime0.withField(dateTimeFieldType7, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone11);
        int int13 = dateTime12.getMinuteOfDay();
        org.joda.time.Instant instant14 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone15 = instant14.getZone();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime12.toMutableDateTime(dateTimeZone15);
        int int17 = dateTime12.getCenturyOfEra();
        org.joda.time.ReadableInstant readableInstant18 = null;
        boolean boolean19 = dateTime12.isEqual(readableInstant18);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = dateTime10.compareTo(readableInstant18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "dayOfMonth" + "'", str8, "dayOfMonth");
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 894 + "'", int13 == 894);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 20 + "'", int17 == 20);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate5.withDayOfYear(53631987);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53631987 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        long long4 = dateTimeZone2.nextTransition((long) 893);
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone2.getMillisKeepLocal(dateTimeZone6, 0L);
        java.lang.String str10 = dateTimeZone6.getName((long) 5);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(0L, dateTimeZone6);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        long long15 = dateTimeZone6.getMillisKeepLocal(dateTimeZone13, (long) 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 893L + "'", long4 == 893L);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+00:00" + "'", str10, "+00:00");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 6L + "'", long15 == 6L);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = copticChronology0.years();
        long long13 = durationField10.add((long) (byte) 100, 616);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 19439481600100L + "'", long13 == 19439481600100L);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.LocalDate.Property property40 = localDate37.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate42 = property40.setCopy(136);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 136 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.lang.String str16 = timeZone15.getID();
        java.util.Calendar.Builder builder17 = builder2.setTimeZone(timeZone15);
        java.lang.String str18 = timeZone15.getID();
        int int19 = timeZone15.getDSTSavings();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "UTC" + "'", str18, "UTC");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        int int10 = property8.getMaximumValueOverall();
        org.joda.time.LocalDate localDate11 = property8.roundCeilingCopy();
        java.util.Locale locale15 = new java.util.Locale("hi!", "");
        boolean boolean16 = locale15.hasExtensions();
        java.lang.String str17 = locale15.getScript();
        java.lang.String str18 = locale15.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDate11.toString("CopticChronology[Etc/UTC]", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals(locale15.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(53700, 53659644);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53700 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        int int13 = dateTimeFormatter7.getDefaultYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(dateTimeZone14);
        int int16 = dateTime15.getMinuteOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.plusWeeks(10);
        int int19 = dateTime18.getMillisOfSecond();
        java.util.Date date20 = dateTime18.toDate();
        org.joda.time.DateTime dateTime21 = dateTime18.withLaterOffsetAtOverlap();
        org.joda.time.LocalTime localTime22 = dateTime21.toLocalTime();
        org.joda.time.LocalTime localTime24 = localTime22.plusSeconds((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = dateTimeFormatter7.print((org.joda.time.ReadablePartial) localTime24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2000 + "'", int13 == 2000);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 894 + "'", int16 == 894);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 280 + "'", int19 == 280);
        org.junit.Assert.assertNotNull(date20);
// flaky:         org.junit.Assert.assertEquals(date20.toString(), "Mon May 02 14:54:21 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((int) '#');
        java.lang.Appendable appendable14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, 0);
        org.joda.time.DateTime.Property property20 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property22 = dateTime21.secondOfMinute();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfDay();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTime dateTime26 = dateTime21.withDurationAdded(readableDuration24, 6);
        org.joda.time.LocalDate localDate27 = dateTime26.toLocalDate();
        org.joda.time.DateTime dateTime28 = dateTime26.toDateTime();
        org.joda.time.DateTime dateTime29 = dateTime28.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter11.printTo(appendable14, (org.joda.time.ReadableInstant) dateTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        int int4 = dateTime3.getMinuteOfDay();
        int int5 = instant0.compareTo((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime6 = instant0.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withYearOfCentury(935);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 935 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 894 + "'", int4 == 894);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(227);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(dateTimeZone12);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime16 = dateTime13.withFieldAdded(durationFieldType14, 0);
        org.joda.time.DateTime.Property property17 = dateTime13.minuteOfDay();
        org.joda.time.DateTime dateTime18 = property17.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property19 = dateTime18.secondOfMinute();
        org.joda.time.DateTime.Property property20 = dateTime18.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(dateTimeZone21);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime25 = dateTime22.withFieldAdded(durationFieldType23, 0);
        org.joda.time.DateTime.Property property26 = dateTime22.minuteOfDay();
        org.joda.time.DateTime dateTime27 = property26.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property28 = dateTime27.secondOfMinute();
        java.lang.String str29 = property28.toString();
        java.util.Locale locale31 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str32 = property28.getAsShortText(locale31);
        java.lang.String str33 = property20.getAsShortText(locale31);
        java.lang.String str34 = dateTimeField10.getAsText(2, locale31);
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now(dateTimeZone36);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int39 = localDateTime37.get(dateTimeFieldType38);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime42 = property40.addToCopy(893L);
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfCeilingCopy();
        int int44 = localDateTime43.getWeekyear();
        int[] intArray50 = new int[] { 53659, 10, 'u', 16 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField10.add((org.joda.time.ReadablePartial) localDateTime43, 867, intArray50, 53637233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 867");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Property[secondOfMinute]" + "'", str29, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "0" + "'", str32, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "53640" + "'", str33, "53640");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "2" + "'", str34, "2");
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2022 + "'", int44 == 2022);
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[53659, 10, 117, 16]");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(53637233, 670, 52, 879, 430, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 879 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.secondOfMinute();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.withMaximumValue();
        int int6 = localTime5.getMillisOfSecond();
        org.joda.time.LocalTime.Property property7 = localTime5.secondOfMinute();
        org.joda.time.LocalTime localTime8 = property7.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localTime8.getFieldType(740);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 740");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 390 + "'", int6 == 390);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.withMillis((long) 1);
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        long long6 = dateTimeZone4.nextTransition((long) 893);
        org.joda.time.Instant instant7 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone8 = instant7.getZone();
        long long10 = dateTimeZone4.getMillisKeepLocal(dateTimeZone8, 0L);
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) instant0, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant0.minus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant13.toDateTime();
        org.joda.time.DateTime dateTime15 = dateTime14.withEarlierOffsetAtOverlap();
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 893L + "'", long6 == 893L);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance();
        long long12 = copticChronology6.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField13 = copticChronology6.months();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType5.getField((org.joda.time.Chronology) copticChronology6);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology6.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = copticChronology6.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(0, (int) (short) 1, 6, 100, 669, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(copticChronology6);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 57635003L + "'", long12 == 57635003L);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType1 = dateTimeFieldType0.getDurationType();
        org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance();
        long long8 = copticChronology2.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField9 = copticChronology2.months();
        java.lang.String str10 = copticChronology2.toString();
        int int11 = copticChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField12 = copticChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology2.dayOfYear();
        org.joda.time.DurationField durationField14 = durationFieldType1.getField((org.joda.time.Chronology) copticChronology2);
        org.joda.time.Instant instant15 = org.joda.time.Instant.now();
        org.joda.time.Instant instant17 = instant15.withMillis((long) 1);
        org.joda.time.Instant instant18 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone19 = instant18.getZone();
        long long21 = dateTimeZone19.nextTransition((long) 893);
        org.joda.time.Instant instant22 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone23 = instant22.getZone();
        long long25 = dateTimeZone19.getMillisKeepLocal(dateTimeZone23, 0L);
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime((java.lang.Object) instant15, dateTimeZone23);
        org.joda.time.LocalTime localTime28 = localTime26.minusMillis(12);
        org.joda.time.LocalTime localTime30 = localTime26.plusMillis((int) (short) 10);
        org.joda.time.Chronology chronology31 = localTime26.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((java.lang.Object) durationField14, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(copticChronology2);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 57635003L + "'", long8 == 57635003L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str10, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 893L + "'", long21 == 893L);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(localTime28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalTime localTime3 = localTime1.minus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withField(dateTimeFieldType4, 56770311);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withYear((-1));
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.DateTimeField dateTimeField9 = property8.getField();
        org.joda.time.DurationField durationField10 = dateTimeField9.getRangeDurationField();
        org.joda.time.DurationField durationField11 = dateTimeField9.getRangeDurationField();
        java.util.Date date13 = new java.util.Date((long) (byte) 0);
        int int14 = date13.getMinutes();
        int int15 = date13.getDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) date13, chronology16);
        org.joda.time.LocalDate localDate19 = localDate17.withYear((-1));
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfEra();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        int int22 = property20.getMaximumValueOverall();
        org.joda.time.LocalDate localDate23 = property20.roundCeilingCopy();
        int int24 = dateTimeField9.getMinimumValue((org.joda.time.ReadablePartial) localDate23);
        org.joda.time.LocalDate localDate26 = localDate23.plusDays(53637233);
        java.util.Date date28 = new java.util.Date((long) (byte) 0);
        int int29 = date28.getMinutes();
        int int30 = date28.getDay();
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate((java.lang.Object) date28, chronology31);
        org.joda.time.LocalDate localDate34 = localDate32.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant35 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone36 = instant35.getZone();
        long long38 = dateTimeZone36.nextTransition((long) 893);
        org.joda.time.Instant instant39 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone40 = instant39.getZone();
        long long42 = dateTimeZone36.getMillisKeepLocal(dateTimeZone40, 0L);
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtMidnight(dateTimeZone36);
        org.joda.time.LocalDate localDate45 = localDate32.minusDays(20);
        org.joda.time.LocalDate localDate47 = localDate45.plusWeeks(53);
        int int48 = localDate23.compareTo((org.joda.time.ReadablePartial) localDate45);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate50 = localDate23.withDayOfWeek((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNull(durationField10);
        org.junit.Assert.assertNull(durationField11);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 292278993 + "'", int22 == 292278993);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertEquals(date28.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 4 + "'", int30 == 4);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 893L + "'", long38 == 893L);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Instant instant1 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) 16, dateTimeZone2);
        long long7 = dateTimeZone2.convertLocalToUTC((-1806581999000L), false, (long) 21);
        org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance();
        long long14 = copticChronology8.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField15 = copticChronology8.halfdayOfDay();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(chronology16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withEra(1);
        int int20 = localDateTime19.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = localDateTime19.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusSeconds((int) (byte) 10);
        int int25 = localDateTime24.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.plusYears(0);
        boolean boolean28 = copticChronology8.equals((java.lang.Object) localDateTime27);
        boolean boolean29 = dateTimeZone2.isLocalDateTimeGap(localDateTime27);
        org.joda.time.format.DateTimePrinter dateTimePrinter30 = null;
        org.joda.time.format.DateTimeParser dateTimeParser31 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter30, dateTimeParser31);
        org.joda.time.format.DateTimeParser dateTimeParser33 = dateTimeFormatter32.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter35 = dateTimeFormatter32.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter37 = dateTimeFormatter32.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter39 = dateTimeFormatter37.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter37.withPivotYear((java.lang.Integer) 14);
        int int42 = dateTimeFormatter37.getDefaultYear();
        java.util.Locale locale43 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter44 = dateTimeFormatter37.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter46 = dateTimeFormatter37.withDefaultYear(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str47 = localDateTime27.toString(dateTimeFormatter46);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1806581999000L) + "'", long7 == (-1806581999000L));
        org.junit.Assert.assertNotNull(copticChronology8);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 57635003L + "'", long14 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 22 + "'", int25 == 22);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(dateTimeParser33);
        org.junit.Assert.assertNotNull(dateTimeFormatter35);
        org.junit.Assert.assertNotNull(dateTimeFormatter37);
        org.junit.Assert.assertNotNull(dateTimeFormatter39);
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2000 + "'", int42 == 2000);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter44);
        org.junit.Assert.assertNotNull(dateTimeFormatter46);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstanceUTC();
        org.joda.time.Instant instant2 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone3 = instant2.getZone();
        long long5 = dateTimeZone3.nextTransition((long) 893);
        org.joda.time.Instant instant6 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long9 = dateTimeZone3.getMillisKeepLocal(dateTimeZone7, 0L);
        java.lang.String str11 = dateTimeZone7.getName((long) 5);
        java.lang.String str12 = dateTimeZone7.toString();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) 57635003L, dateTimeZone7);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField15 = copticChronology14.secondOfMinute();
        org.joda.time.DurationField durationField16 = copticChronology14.months();
        org.joda.time.DateTimeZone dateTimeZone17 = copticChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology14.hourOfHalfday();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology14);
        org.joda.time.DurationField durationField20 = copticChronology14.weekyears();
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.weekyearOfCentury();
        java.util.Date date23 = new java.util.Date((long) (byte) 0);
        int int24 = date23.getMinutes();
        int int25 = date23.getDay();
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((java.lang.Object) date23, chronology26);
        org.joda.time.LocalDate localDate29 = localDate27.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone31.nextTransition((long) 893);
        org.joda.time.Instant instant34 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone35 = instant34.getZone();
        long long37 = dateTimeZone31.getMillisKeepLocal(dateTimeZone35, 0L);
        org.joda.time.DateTime dateTime38 = localDate27.toDateTimeAtMidnight(dateTimeZone31);
        org.joda.time.LocalDate localDate40 = localDate27.minusDays(20);
        org.joda.time.LocalDate localDate42 = localDate40.plusWeeks(53);
        org.joda.time.LocalDate localDate44 = localDate40.plusWeeks(20);
        org.joda.time.LocalDate localDate46 = localDate40.withYearOfCentury(6);
        org.joda.time.LocalDate localDate48 = localDate40.plusMonths(5);
        org.joda.time.chrono.CopticChronology copticChronology49 = org.joda.time.chrono.CopticChronology.getInstance();
        long long55 = copticChronology49.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField56 = copticChronology49.months();
        java.util.Date date58 = new java.util.Date((long) (byte) 0);
        int int59 = date58.getMinutes();
        int int60 = date58.getDay();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.LocalDate localDate62 = new org.joda.time.LocalDate((java.lang.Object) date58, chronology61);
        int int63 = localDate62.getDayOfWeek();
        org.joda.time.LocalDate localDate65 = localDate62.minusWeeks(272);
        int[] intArray67 = copticChronology49.get((org.joda.time.ReadablePartial) localDate65, (long) 21);
        copticChronology14.validate((org.joda.time.ReadablePartial) localDate40, intArray67);
        // The following exception was thrown during execution in test generation
        try {
            copticChronology0.validate((org.joda.time.ReadablePartial) localDateTime13, intArray67);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 893L + "'", long5 == 893L);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "UTC" + "'", str12, "UTC");
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertEquals(date23.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 893L + "'", long33 == 893L);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(copticChronology49);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 57635003L + "'", long55 == 57635003L);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertEquals(date58.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 4 + "'", int60 == 4);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 4 + "'", int63 == 4);
        org.junit.Assert.assertNotNull(localDate65);
        org.junit.Assert.assertNotNull(intArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray67), "[1686, 4, 23]");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.DateTimeField dateTimeField14 = copticChronology1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = copticChronology1.getDateTimeMillis(691200000L, 7, 430, 69, 18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 430 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        org.joda.time.DateTime.Property property8 = dateTime6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime13 = dateTime10.withFieldAdded(durationFieldType11, 0);
        org.joda.time.DateTime.Property property14 = dateTime10.minuteOfDay();
        org.joda.time.DateTime dateTime15 = property14.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property16 = dateTime15.secondOfMinute();
        java.lang.String str17 = property16.toString();
        java.util.Locale locale19 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str20 = property16.getAsShortText(locale19);
        java.lang.String str21 = property8.getAsShortText(locale19);
        java.util.Locale locale22 = java.util.Locale.GERMANY;
        java.lang.String str23 = property8.getAsText(locale22);
        org.joda.time.DateTime dateTime24 = property8.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withDayOfWeek(53640129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640129 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Property[secondOfMinute]" + "'", str17, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0" + "'", str20, "0");
// flaky:         org.junit.Assert.assertEquals("'" + str21 + "' != '" + "53640" + "'", str21, "53640");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de_DE");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "53640" + "'", str23, "53640");
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        int int11 = dateTimeField10.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        org.joda.time.LocalDate localDate41 = property40.roundHalfCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetMillis(650);
        java.util.Locale locale46 = java.util.Locale.getDefault();
        java.lang.String str47 = dateTimeZone44.getName((long) 32769, locale46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate48 = property40.setCopy("UTC", locale46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(locale46);
// flaky:         org.junit.Assert.assertEquals(locale46.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00:00.650" + "'", str47, "+00:00:00.650");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        int int9 = localDateTime8.getYearOfCentury();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundHalfFloorCopy();
        boolean boolean19 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T14:54:33.741" + "'", str10, "2022-02-21T14:54:33.741");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.util.Calendar calendar9 = dateTime6.toCalendar(locale8);
        java.lang.String str10 = locale8.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = locale8.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455240000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\u52a0\u62ff\u5927" + "'", str10, "\u52a0\u62ff\u5927");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        int int5 = dateTime4.getEra();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime4.toTimeOfDay();
        org.joda.time.DateTime dateTime8 = dateTime4.plusSeconds(21);
        int int9 = dateTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeOfDay6);
        org.junit.Assert.assertNotNull(dateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 897 + "'", int9 == 897);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withDayOfWeek(2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) dateTime1);
        int int5 = dateTime4.getEra();
        org.joda.time.TimeOfDay timeOfDay6 = dateTime4.toTimeOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime4.withDate(734, 1, 816);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 816 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(timeOfDay6);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(dateTimeZone17);
        int int19 = dateTime18.getMinuteOfDay();
        int int20 = dateTime6.compareTo((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.format.DateTimePrinter dateTimePrinter21 = null;
        org.joda.time.format.DateTimeParser dateTimeParser22 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter23 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter21, dateTimeParser22);
        org.joda.time.format.DateTimeParser dateTimeParser24 = dateTimeFormatter23.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter26 = dateTimeFormatter23.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = dateTimeFormatter26.withPivotYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTime18.toString(dateTimeFormatter26);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 894 + "'", int19 == 894);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(dateTimeParser24);
        org.junit.Assert.assertNotNull(dateTimeFormatter26);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("+00:00:00.650");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.650\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField8.remainder((long) 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        java.util.Date date18 = new java.util.Date((long) (byte) 0);
        int int19 = date18.getMinutes();
        int int20 = date18.getDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate((java.lang.Object) date18, chronology21);
        org.joda.time.LocalDate localDate24 = localDate22.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant25 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone26 = instant25.getZone();
        long long28 = dateTimeZone26.nextTransition((long) 893);
        org.joda.time.Instant instant29 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone30 = instant29.getZone();
        long long32 = dateTimeZone26.getMillisKeepLocal(dateTimeZone30, 0L);
        org.joda.time.DateTime dateTime33 = localDate22.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTime dateTime34 = localDate5.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate5.withPeriodAdded(readablePeriod35, 122);
        org.joda.time.LocalDate localDate39 = localDate37.withYearOfEra(21);
        org.joda.time.LocalDate.Property property40 = localDate39.monthOfYear();
        org.joda.time.Instant instant41 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone42 = instant41.getZone();
        long long44 = dateTimeZone42.nextTransition((long) 893);
        java.util.Locale locale46 = java.util.Locale.CANADA;
        java.lang.String str47 = dateTimeZone42.getName((long) (short) 0, locale46);
        java.util.TimeZone timeZone48 = dateTimeZone42.toTimeZone();
        org.joda.time.format.DateTimePrinter dateTimePrinter50 = null;
        org.joda.time.format.DateTimeParser dateTimeParser51 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter52 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter50, dateTimeParser51);
        org.joda.time.format.DateTimeParser dateTimeParser53 = dateTimeFormatter52.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter55 = dateTimeFormatter52.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter57 = dateTimeFormatter52.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter59 = dateTimeFormatter57.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter61 = dateTimeFormatter57.withPivotYear((java.lang.Integer) 14);
        int int62 = dateTimeFormatter57.getDefaultYear();
        java.util.Locale locale63 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter64 = dateTimeFormatter57.withLocale(locale63);
        java.util.Locale locale65 = java.util.Locale.getDefault();
        java.lang.String str66 = locale63.getDisplayScript(locale65);
        java.lang.String str67 = dateTimeZone42.getName((-61788528000000L), locale63);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((java.lang.Object) localDate39, dateTimeZone42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals(date18.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 893L + "'", long28 == 893L);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 0L + "'", long32 == 0L);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 893L + "'", long44 == 893L);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "+00:00" + "'", str47, "+00:00");
        org.junit.Assert.assertNotNull(timeZone48);
// flaky:         org.junit.Assert.assertEquals(timeZone48.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNull(dateTimeParser53);
        org.junit.Assert.assertNotNull(dateTimeFormatter55);
        org.junit.Assert.assertNotNull(dateTimeFormatter57);
        org.junit.Assert.assertNotNull(dateTimeFormatter59);
        org.junit.Assert.assertNotNull(dateTimeFormatter61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2000 + "'", int62 == 2000);
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter64);
        org.junit.Assert.assertNotNull(locale65);
// flaky:         org.junit.Assert.assertEquals(locale65.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "+00:00" + "'", str67, "+00:00");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        java.lang.String str9 = copticChronology1.toString();
        int int10 = copticChronology1.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.monthOfYear();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 43);
        org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance();
        long long20 = copticChronology14.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField21 = copticChronology14.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology14.clockhourOfDay();
        org.joda.time.Instant instant23 = org.joda.time.Instant.now();
        org.joda.time.Instant instant25 = instant23.withMillis((long) 1);
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        org.joda.time.Instant instant30 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone31 = instant30.getZone();
        long long33 = dateTimeZone27.getMillisKeepLocal(dateTimeZone31, 0L);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) instant23, dateTimeZone31);
        org.joda.time.LocalTime localTime36 = localTime34.minusMillis(12);
        org.joda.time.LocalTime localTime38 = localTime34.plusMillis((int) (short) 10);
        int[] intArray40 = copticChronology14.get((org.joda.time.ReadablePartial) localTime38, (long) 17);
        int int41 = dateTimeField11.getMaximumValue((org.joda.time.ReadablePartial) localTime13, intArray40);
        java.util.Calendar.Builder builder42 = builder0.setFields(intArray40);
        java.util.Calendar.Builder builder46 = builder42.setTimeOfDay(670, (int) (short) 100, 437);
        java.util.Calendar.Builder builder50 = builder46.setTimeOfDay(894, 510, 53631987);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder52 = builder50.setInstant((long) 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CopticChronology[Etc/UTC]" + "'", str9, "CopticChronology[Etc/UTC]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(copticChronology14);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 57635003L + "'", long20 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 893L + "'", long29 == 893L);
        org.junit.Assert.assertNotNull(instant30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(intArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray40), "[0, 0, 0, 17]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 13 + "'", int41 == 13);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder50);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, 9, (int) (byte) 1, 0, 15);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(chronology7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withEra(1);
        int int11 = localDateTime10.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = localDateTime10.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray14 = localDateTime10.getFields();
        org.joda.time.LocalDateTime.Property property15 = localDateTime10.year();
        boolean boolean17 = localDateTime10.equals((java.lang.Object) (byte) 0);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withEra(1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime(chronology22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withEra(1);
        int int26 = localDateTime19.compareTo((org.joda.time.ReadablePartial) localDateTime23);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean28 = localDateTime23.isSupported(dateTimeFieldType27);
        boolean boolean29 = localDateTime10.isSupported(dateTimeFieldType27);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime10.withEra((int) (byte) 1);
        org.joda.time.tz.Provider provider32 = org.joda.time.DateTimeZone.getProvider();
        java.util.Set<java.lang.String> strSet33 = provider32.getAvailableIDs();
        boolean boolean34 = strSet33.isEmpty();
        boolean boolean35 = localDateTime10.equals((java.lang.Object) boolean34);
        int int36 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime38 = localDateTime5.withDayOfYear(538);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 900000 + "'", int6 == 900000);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(provider32);
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = copticChronology0.get(readablePeriod9, 0L, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = dateTimeFormatter2.parseLocalTime("Property[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("100");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(dateTimeZone2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime6 = dateTime3.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateTime.Property property7 = dateTime3.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMinimumValue();
        org.joda.time.DateTime.Property property9 = dateTime8.era();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(chronology10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withEra(1);
        int int14 = localDateTime13.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = localDateTime13.getFieldType(2);
        java.lang.String str17 = dateTimeFieldType16.getName();
        int int18 = dateTime8.get(dateTimeFieldType16);
        org.joda.time.DateTime dateTime20 = dateTime8.plusMinutes(53631987);
        org.joda.time.DateTime dateTime21 = dateTime20.withEarlierOffsetAtOverlap();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DurationFieldType durationFieldType23 = dateTimeFieldType22.getDurationType();
        boolean boolean24 = dateTime21.isSupported(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = localDate1.withField(dateTimeFieldType22, 934);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 934 for weekyearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "dayOfMonth" + "'", str17, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 21 + "'", int18 == 21);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(6, 3, 650, (int) (short) -1, 57, 934, 53659644);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        long long6 = java.util.Date.UTC((int) (short) 1, (int) (byte) 100, 796, (int) (short) 100, 902, 401);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1845521479000L) + "'", long6 == (-1845521479000L));
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) instant9, dateTimeZone17);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(12);
        boolean boolean23 = copticChronology0.equals((java.lang.Object) localTime22);
        org.joda.time.LocalTime localTime25 = localTime22.plusHours((-2));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime22.withMinuteOfHour(272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 272 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localTime25);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.withMinimumValue();
        org.joda.time.DateTime.Property property7 = dateTime6.era();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        int int12 = localDateTime11.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = localDateTime11.getFieldType(2);
        java.lang.String str15 = dateTimeFieldType14.getName();
        int int16 = dateTime6.get(dateTimeFieldType14);
        org.joda.time.DateTime.Property property17 = dateTime6.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.withWeekyear(9);
        int int22 = dateTime21.getMonthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology23 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField24 = copticChronology23.secondOfMinute();
        org.joda.time.DurationField durationField25 = copticChronology23.months();
        org.joda.time.DateTimeField dateTimeField26 = copticChronology23.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime21.toMutableDateTime((org.joda.time.Chronology) copticChronology23);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = property17.getDifference((org.joda.time.ReadableInstant) dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 63524509560");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "dayOfMonth" + "'", str15, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 21 + "'", int16 == 21);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(copticChronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(mutableDateTime27);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(dateTimeZone5);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime9 = dateTime6.withFieldAdded(durationFieldType7, 0);
        org.joda.time.DateTime.Property property10 = dateTime6.minuteOfDay();
        org.joda.time.DateTime dateTime11 = property10.withMinimumValue();
        org.joda.time.DateTime.Property property12 = dateTime11.era();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(chronology13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withEra(1);
        int int17 = localDateTime16.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDateTime16.getFieldType(2);
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = dateTime11.get(dateTimeFieldType19);
        boolean boolean22 = localDateTime3.isSupported(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "dayOfMonth" + "'", str20, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField8 = copticChronology1.months();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType0.getField((org.joda.time.Chronology) copticChronology1);
        org.joda.time.DateTimeField dateTimeField10 = copticChronology1.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = copticChronology1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone12 = copticChronology1.getZone();
        org.joda.time.DateTimeField dateTimeField13 = copticChronology1.weekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = copticChronology1.get(readablePeriod14, (long) 918);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) "minutes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minutes\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setID("hi!");
        timeZone0.setID("hi!");
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = timeZone0.getDisplayName(locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Instant instant3 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone4 = instant3.getZone();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int7 = localDateTime5.get(dateTimeFieldType6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime10 = property8.addToCopy(893L);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withEra(1);
        int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        int int20 = localDateTime10.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        org.joda.time.Chronology chronology21 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.dayOfMonth();
        org.joda.time.Instant instant24 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone25 = instant24.getZone();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) 16, dateTimeZone25);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(chronology27);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withEra(1);
        int int31 = localDateTime30.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = localDateTime30.getFieldType(2);
        int int34 = localDateTime30.getWeekyear();
        int int35 = localDateTime30.getHourOfDay();
        boolean boolean36 = dateTimeZone25.isLocalDateTimeGap(localDateTime30);
        org.joda.time.Chronology chronology37 = chronology21.withZone(dateTimeZone25);
        org.joda.time.DurationField durationField38 = chronology21.weeks();
        java.lang.String str39 = chronology21.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate(53663, 897, 53664488, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 897 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
// flaky:         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 14 + "'", int35 == 14);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "ISOChronology[UTC]" + "'", str39, "ISOChronology[UTC]");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        java.util.GregorianCalendar gregorianCalendar6 = dateTime1.toGregorianCalendar();
        gregorianCalendar6.clear();
        java.util.Locale locale10 = new java.util.Locale("hi!", "");
        boolean boolean11 = locale10.hasExtensions();
        boolean boolean12 = gregorianCalendar6.after((java.lang.Object) locale10);
        java.time.Instant instant13 = gregorianCalendar6.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar6.setWeekDate(122, (int) (byte) 0, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(gregorianCalendar6);
        org.junit.Assert.assertEquals(locale10.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale locale0 = java.util.Locale.KOREAN;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko" + "'", str1, "ko");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        long long7 = dateTimeField5.remainder((long) 12);
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 9936000012L + "'", long7 == 9936000012L);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        java.lang.String str7 = dateTime4.toString();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 993 + "'", int5 == 993);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:54:26 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-05-02T14:54:26.993Z" + "'", str7, "2022-05-02T14:54:26.993Z");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.time.ZoneId zoneId1 = timeZone0.toZoneId();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone(zoneId1);
        int int4 = timeZone2.getOffset((-1L));
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId1);
        org.junit.Assert.assertNotNull(timeZone2);
// flaky:         org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Canada", strMap1);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream3 = languageRangeList2.parallelStream();
        org.junit.Assert.assertNotNull(languageRangeList2);
        org.junit.Assert.assertNotNull(languageRangeStream3);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.clockhourOfDay();
        org.joda.time.DurationField durationField9 = copticChronology0.eras();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = durationField9.getValue((long) 272);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar calendar7 = builder2.build();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeZone9.getName((long) (short) 0, locale13);
        java.util.TimeZone timeZone15 = dateTimeZone9.toTimeZone();
        java.lang.String str16 = timeZone15.getID();
        java.util.Calendar.Builder builder17 = builder2.setTimeZone(timeZone15);
        org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology18.secondOfMinute();
        org.joda.time.DurationField durationField20 = copticChronology18.months();
        org.joda.time.DateTimeZone dateTimeZone21 = copticChronology18.getZone();
        org.joda.time.DateTimeField dateTimeField22 = copticChronology18.hourOfHalfday();
        org.joda.time.DurationField durationField23 = dateTimeField22.getLeapDurationField();
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = dateTimeField22.getAsText((long) 292278993, locale25);
        java.lang.String str27 = timeZone15.getDisplayName(locale25);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(calendar7);
        org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(timeZone15);
// flaky:         org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "UTC" + "'", str16, "UTC");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(copticChronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNull(durationField23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "9" + "'", str26, "9");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Coordinated Universal Time" + "'", str27, "Coordinated Universal Time");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        int int7 = dateTime6.getYearOfCentury();
        org.joda.time.DateTime dateTime8 = dateTime6.withTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTime6.toString("French");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 22 + "'", int7 == 22);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(chronology6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withEra(1);
        int int10 = localDateTime9.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = localDateTime9.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = localDateTime9.getFields();
        int int14 = property5.compareTo((org.joda.time.ReadablePartial) localDateTime9);
        java.lang.String str15 = property5.getAsString();
        org.joda.time.DateTime dateTime17 = property5.addToCopy((long) (short) 10);
        org.joda.time.DateTime dateTime19 = dateTime17.withCenturyOfEra(53);
        int int20 = dateTime17.getHourOfDay();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "894" + "'", str15, "894");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter9.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter10.withOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter11.withPivotYear((int) '#');
        java.lang.StringBuffer stringBuffer14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(stringBuffer14, 34128000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = copticChronology0.getDateTimeMillis(1645455234217L, 53659, 6, 0, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53659 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDateTime3.getFields();
        org.joda.time.LocalDateTime.Property property8 = localDateTime3.year();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime12 = localDateTime9.toDateTime((org.joda.time.ReadableInstant) dateTime11);
        java.util.Locale.Category category13 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale.setDefault(category13, locale14);
        java.util.Calendar calendar16 = dateTime12.toCalendar(locale14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calendar16.get(53661050);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53661050");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + category13 + "' != '" + java.util.Locale.Category.FORMAT + "'", category13.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1640995200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        long long4 = calendar3.getTimeInMillis();
        java.lang.String str5 = calendar3.toString();
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455267912,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=27,MILLISECOND=912,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645455267912L + "'", long4 == 1645455267912L);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.util.GregorianCalendar[time=1645455267912,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=27,MILLISECOND=912,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str5, "java.util.GregorianCalendar[time=1645455267912,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=54,SECOND=27,MILLISECOND=912,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        long long3 = dateTimeZone1.nextTransition((long) 893);
        java.util.Locale locale5 = java.util.Locale.CANADA;
        java.lang.String str6 = dateTimeZone1.getName((long) (short) 0, locale5);
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        java.lang.String str8 = timeZone7.getID();
        boolean boolean9 = timeZone7.observesDaylightTime();
        boolean boolean10 = timeZone7.observesDaylightTime();
        boolean boolean11 = timeZone7.observesDaylightTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = timeZone7.getDisplayName(false, 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 893L + "'", long3 == 893L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+00:00" + "'", str6, "+00:00");
        org.junit.Assert.assertNotNull(timeZone7);
// flaky:         org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "UTC" + "'", str8, "UTC");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DurationField durationField7 = copticChronology0.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.yearOfCentury();
        org.joda.time.Instant instant9 = org.joda.time.Instant.now();
        org.joda.time.Instant instant11 = instant9.withMillis((long) 1);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone13.nextTransition((long) 893);
        org.joda.time.Instant instant16 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone17 = instant16.getZone();
        long long19 = dateTimeZone13.getMillisKeepLocal(dateTimeZone17, 0L);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) instant9, dateTimeZone17);
        org.joda.time.LocalTime localTime22 = localTime20.minusMillis(12);
        boolean boolean23 = copticChronology0.equals((java.lang.Object) localTime22);
        org.joda.time.DurationField durationField24 = copticChronology0.days();
        org.joda.time.DurationField durationField25 = copticChronology0.hours();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = durationField25.subtract((long) 16, (long) 56770311);
            org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException; message: The resulting instant is below the supported minimum of 0001-01-01T00:00:00.000Z (CopticChronology[UTC])");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 893L + "'", long15 == 893L);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(durationField25);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 510);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withDayOfMonth(2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(558, 993, 849, 2000, 136, 227);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime4 = dateTime1.withFieldAdded(durationFieldType2, 0);
        org.joda.time.DateTime.Property property5 = dateTime1.minuteOfDay();
        org.joda.time.DateTime dateTime6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property7 = dateTime6.secondOfMinute();
        java.lang.String str8 = property7.toString();
        java.util.Locale locale10 = java.util.Locale.forLanguageTag("+00:00");
        java.lang.String str11 = property7.getAsShortText(locale10);
        org.joda.time.DateTime dateTime12 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property13 = dateTime12.millisOfDay();
        int int14 = dateTime12.getMillisOfDay();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[secondOfMinute]" + "'", str8, "Property[secondOfMinute]");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0" + "'", str11, "0");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 53640000 + "'", int14 == 53640000);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = copticChronology0.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField5.getMillis(1645455250946L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1645455250946 * 604800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter2.withPivotYear((int) (byte) -1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter7.withDefaultYear(5);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 14);
        int int12 = dateTimeFormatter7.getDefaultYear();
        java.util.Locale locale13 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter7.withLocale(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTimeFormatter7.parseDateTime("en-CA");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2000 + "'", int12 == 2000);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2.withOffsetParsed();
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(writer4, (long) 740);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance();
        long long7 = copticChronology1.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField8 = copticChronology1.halfdayOfDay();
        org.joda.time.DurationField durationField9 = copticChronology1.months();
        boolean boolean10 = durationFieldType0.isSupported((org.joda.time.Chronology) copticChronology1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = copticChronology1.getDateTimeMillis(0L, 9, 2124, 136, 35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2124 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(copticChronology1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 57635003L + "'", long7 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        int int4 = dateTime3.getMonthOfYear();
        org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField6 = copticChronology5.secondOfMinute();
        org.joda.time.DurationField durationField7 = copticChronology5.months();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology5.millisOfDay();
        org.joda.time.MutableDateTime mutableDateTime9 = dateTime3.toMutableDateTime((org.joda.time.Chronology) copticChronology5);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.DateTime dateTime11 = dateTime3.minus(readablePeriod10);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(copticChronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Instant instant5 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone6 = instant5.getZone();
        long long8 = dateTimeZone6.nextTransition((long) 893);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = dateTimeZone6.getName((long) (short) 0, locale10);
        java.util.TimeZone timeZone12 = dateTimeZone6.toTimeZone();
        java.lang.String str14 = dateTimeZone6.getName((long) 12);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) ' ', dateTimeZone6);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) 17, dateTimeZone6);
        org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField18 = copticChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = copticChronology17.millisOfSecond();
        boolean boolean20 = dateTimeZone6.equals((java.lang.Object) copticChronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(54, 339, (int) (byte) 1, (org.joda.time.Chronology) copticChronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 339 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 893L + "'", long8 == 893L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "+00:00" + "'", str11, "+00:00");
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(copticChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (byte) 10);
        int int9 = localDateTime8.getYearOfCentury();
        java.lang.String str10 = localDateTime8.toString();
        org.joda.time.Instant instant11 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone12 = instant11.getZone();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int15 = localDateTime13.get(dateTimeFieldType14);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime18 = property16.roundHalfFloorCopy();
        boolean boolean19 = localDateTime8.isBefore((org.joda.time.ReadablePartial) localDateTime18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withDayOfMonth(22);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime21.withYearOfCentury(902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 902 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 22 + "'", int9 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-02-21T14:54:38.695" + "'", str10, "2022-02-21T14:54:38.695");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.plusMinutes(11);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime1.getValue(796);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 796");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        java.util.Calendar calendar9 = builder6.build();
        java.util.Date date11 = new java.util.Date((long) (byte) 0);
        int int12 = date11.getMinutes();
        date11.setHours(893);
        java.util.Calendar.Builder builder15 = builder6.setInstant(date11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder15.setWeekDefinition(57, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=6,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"hi!\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Sat Feb 07 05:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(chronology0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withEra(1);
        int int4 = localDateTime3.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localDateTime3.getFieldType(2);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusSeconds((int) (short) 1);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(chronology9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra(1);
        int int13 = localDateTime12.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType(2);
        org.joda.time.DateTimeField[] dateTimeFieldArray16 = localDateTime12.getFields();
        org.joda.time.LocalDateTime.Property property17 = localDateTime12.year();
        boolean boolean19 = localDateTime12.equals((java.lang.Object) (byte) 0);
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.plus(readableDuration20);
        int int22 = localDateTime8.compareTo((org.joda.time.ReadablePartial) localDateTime21);
        java.util.Date date23 = localDateTime8.toDate();
        org.joda.time.LocalDateTime.Property property24 = localDateTime8.yearOfCentury();
        org.joda.time.Instant instant26 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone27 = instant26.getZone();
        long long29 = dateTimeZone27.nextTransition((long) 893);
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(11L, dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) localDateTime8, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(dateTimeFieldArray16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(date23);
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Mon Feb 21 14:54:29 UTC 2022");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 893L + "'", long29 == 893L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale locale2 = new java.util.Locale("hi!", "");
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        java.lang.String str4 = calendar3.getCalendarType();
        calendar3.setTimeInMillis((long) 437);
        boolean boolean8 = calendar3.equals((java.lang.Object) 32769);
        org.junit.Assert.assertEquals(locale2.toString(), "hi!");
        org.junit.Assert.assertNotNull(calendar3);
        org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=437,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=437,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "gregory" + "'", str4, "gregory");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) copticChronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.CopticChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'u', 670, 912, 796, 53640129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 796 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withDefaultYear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter5.withPivotYear((int) (short) -1);
        org.joda.time.Chronology chronology8 = dateTimeFormatter7.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter7.withPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeFormatter10.parseMillis("1964-10-15");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        int int2 = date1.getMinutes();
        int int3 = date1.getDay();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) date1, chronology4);
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear((int) (byte) 100);
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone9 = instant8.getZone();
        long long11 = dateTimeZone9.nextTransition((long) 893);
        org.joda.time.Instant instant12 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone13 = instant12.getZone();
        long long15 = dateTimeZone9.getMillisKeepLocal(dateTimeZone13, 0L);
        org.joda.time.DateTime dateTime16 = localDate5.toDateTimeAtMidnight(dateTimeZone9);
        org.joda.time.LocalDate localDate18 = localDate5.minusDays(20);
        org.joda.time.LocalDate localDate20 = localDate18.plusWeeks(53);
        org.joda.time.LocalDate localDate22 = localDate20.withYearOfCentury(10);
        org.joda.time.LocalDate localDate24 = localDate22.withCenturyOfEra(4);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localDate24.getValue(796);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 796");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 893L + "'", long11 == 893L);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = copticChronology0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((java.lang.Object) copticChronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.CopticChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = localTime0.withMinuteOfHour(650);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 650 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Chinese (China)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=chinese(china)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (byte) 10, (int) (byte) 10, 650, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 650 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("English (Canada)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=english(canada)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        long long6 = copticChronology0.getDateTimeMillis((long) (byte) 0, 16, 0, (int) '#', 3);
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = copticChronology0.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = copticChronology0.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField10 = copticChronology0.year();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = copticChronology0.get(readablePeriod11, (-61788528000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 57635003L + "'", long6 == 57635003L);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant((long) 6);
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        timeZone3.setID("hi!");
        java.util.Calendar.Builder builder6 = builder2.setTimeZone(timeZone3);
        java.util.Calendar.Builder builder8 = builder6.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder8.set(669, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.DateTimeZone dateTimeZone1 = instant0.getZone();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfYear();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(893L);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(chronology8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withEra(1);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime(chronology12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withEra(1);
        int int16 = localDateTime9.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        int int17 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime13);
        org.joda.time.Chronology chronology18 = localDateTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((java.lang.Object) chronology18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.hourOfDay();
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes(53);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.days();
        boolean boolean9 = localTime5.isSupported(durationFieldType8);
        org.joda.time.LocalTime.Property property10 = localTime5.millisOfDay();
        int int11 = localTime5.getSecondOfMinute();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalTime localTime14 = localTime5.withPeriodAdded(readablePeriod12, 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(dateTimeZone15);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.minutes();
        org.joda.time.DateTime dateTime19 = dateTime16.withFieldAdded(durationFieldType17, 0);
        org.joda.time.DateTime.Property property20 = dateTime16.minuteOfDay();
        org.joda.time.DateTime dateTime21 = property20.roundHalfEvenCopy();
        org.joda.time.DateTime.Property property22 = dateTime21.secondOfMinute();
        org.joda.time.DateTime.Property property23 = dateTime21.secondOfDay();
        org.joda.time.DateTime dateTime25 = dateTime21.minusMonths((int) (byte) 10);
        org.joda.time.DateTime dateTime28 = dateTime21.withDurationAdded((long) 11, 52);
        org.joda.time.DateTime dateTime29 = localTime5.toDateTime((org.joda.time.ReadableInstant) dateTime28);
        int int30 = localTime5.getMillisOfDay();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 53670619 + "'", int30 == 53670619);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.chrono.CopticChronology copticChronology0 = org.joda.time.chrono.CopticChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = copticChronology0.secondOfMinute();
        org.joda.time.DurationField durationField2 = copticChronology0.months();
        org.joda.time.DateTimeZone dateTimeZone3 = copticChronology0.getZone();
        org.joda.time.DateTimeField dateTimeField4 = copticChronology0.hourOfHalfday();
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((org.joda.time.Chronology) copticChronology0);
        org.joda.time.DurationField durationField6 = copticChronology0.weekyears();
        org.joda.time.DateTimeField dateTimeField7 = copticChronology0.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = copticChronology0.getDateTimeMillis(20, (-1), 879, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,13]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(copticChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertNotNull(durationField2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.withWeekyear(9);
        org.joda.time.DateTime dateTime5 = dateTime3.minusDays((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime3.withYearOfCentury(53640129);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53640129 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(dateTimeZone0);
        int int2 = dateTime1.getMinuteOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.plusWeeks(10);
        int int5 = dateTime4.getMillisOfSecond();
        java.util.Date date6 = dateTime4.toDate();
        org.joda.time.DateTime dateTime7 = dateTime4.withLaterOffsetAtOverlap();
        int int8 = dateTime7.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withEra(616);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 616 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 894 + "'", int2 == 894);
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 804 + "'", int5 == 804);
        org.junit.Assert.assertNotNull(date6);
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon May 02 14:54:30 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 54 + "'", int8 == 54);
    }
}
